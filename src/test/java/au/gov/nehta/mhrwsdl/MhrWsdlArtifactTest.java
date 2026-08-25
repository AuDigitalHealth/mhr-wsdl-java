package au.gov.nehta.mhrwsdl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jakarta.jws.WebMethod;
import jakarta.xml.ws.WebServiceClient;
import org.junit.Test;

/**
 * Offline checks for packaged WSDL and JAX-WS {@link WebServiceClient} stubs
 * only. Counts and operations match the third-party B2B set documented by
 * mhr-b2b-client-dotnet (does/gain, upload/retrieve/metadata/find, remove,
 * audit/changeHistory/getView+7 views, templates, individualDetails,
 * representativeList, register).
 */
public class MhrWsdlArtifactTest {

    private static final List<String> PRIMARY_SERVICE_WSDL = List.of(
            "wsdl/B2B_DocumentRegistry.wsdl",
            "wsdl/B2B_DocumentRepository.wsdl",
            "wsdl/B2B_GetAuditView.wsdl",
            "wsdl/B2B_GetChangeHistoryView.wsdl",
            "wsdl/B2B_GetIndividualDetailsView.wsdl",
            "wsdl/B2B_GetRepresentativeList.wsdl",
            "wsdl/B2B_GetTemplate.wsdl",
            "wsdl/B2B_GetView.wsdl",
            "wsdl/B2B_MHRProfile.wsdl",
            "wsdl/B2B_RegisterMHR.wsdl",
            "wsdl/B2B_RemoveDocument.wsdl",
            "wsdl/B2B_SearchTemplate.wsdl");

    private static final List<String> INTERFACE_WSDL = List.of(
            "wsdl/B2B_GetAuditViewInterface.wsdl",
            "wsdl/B2B_GetChangeHistoryViewInterface.wsdl",
            "wsdl/B2B_GetIndividualDetailsViewInterface.wsdl",
            "wsdl/B2B_GetRepresentativeListInterface.wsdl",
            "wsdl/B2B_GetTemplateInterface.wsdl",
            "wsdl/B2B_GetViewInterface.wsdl",
            "wsdl/B2B_MHRProfileInterface.wsdl",
            "wsdl/B2B_RegisterMHRInterface.wsdl",
            "wsdl/B2B_RemoveDocumentInterface.wsdl",
            "wsdl/B2B_SearchTemplateInterface.wsdl");

    /** SOAP operationName values that implement the .NET README logical B2B set. */
    private static final Map<String, String> PORT_TYPE_WIRE_OPS = Map.ofEntries(
            Map.entry(
                    "au.net.electronichealth.ns.mhr.b2b.svc.mhrprofile._1.MHRProfilePortType",
                    "doesPCEHRExist,gainPCEHRAccess"),
            Map.entry(
                    "ihe.iti.xds_b._2007.DocumentRegistryPortType",
                    "DocumentRegistry_RegisterDocumentSet-b,DocumentRegistry_RegistryStoredQuery"),
            Map.entry(
                    "ihe.iti.xds_b._2007.DocumentRepositoryPortType",
                    "DocumentRepository_ProvideAndRegisterDocumentSet-b,DocumentRepository_RetrieveDocumentSet"),
            Map.entry(
                    "au.net.electronichealth.ns.mhr.svc.removedocument._1.RemoveDocumentPortType",
                    "removeDocument"),
            Map.entry(
                    "au.net.electronichealth.ns.mhr.svc.getauditview._1.GetAuditViewPortType",
                    "getAuditView"),
            Map.entry(
                    "au.net.electronichealth.ns.mhr.svc.getchangehistoryview._1.GetChangeHistoryViewPortType",
                    "getChangeHistoryView"),
            Map.entry(
                    "au.net.electronichealth.ns.mhr.svc.getview._1.GetViewPortType",
                    "getView"),
            Map.entry(
                    "au.net.electronichealth.ns.tplt.svc.gettemplate._1.GetTemplatePortType",
                    "getTemplate"),
            Map.entry(
                    "au.net.electronichealth.ns.tplt.svc.searchtemplate._1.SearchTemplatePortType",
                    "searchTemplate"),
            Map.entry(
                    "au.net.electronichealth.ns.mhr.svc.getindividualdetailsview._2.GetIndividualDetailsViewPortType",
                    "getIndividualDetailsView"),
            Map.entry(
                    "au.net.electronichealth.ns.mhr.svc.getrepresentativelist._1.GetRepresentativeListPortType",
                    "getRepresentativeList"),
            Map.entry(
                    "au.net.electronichealth.ns.mhr.svc.registermhr._2.RegisterMHRPortType",
                    "registerPCEHR"));

    private static final List<String> GET_VIEW_REQUEST_TYPES = List.of(
            "au.net.electronichealth.ns.mhr.xsd.interfaces.healthcheckscheduleview._1.HealthCheckScheduleView",
            "au.net.electronichealth.ns.mhr.xsd.interfaces.medicareoverview._1.MedicareOverview",
            "au.net.electronichealth.ns.mhr.xsd.interfaces.observationview._1.ObservationView",
            "au.net.electronichealth.ns.mhr.xsd.interfaces.prescriptionanddispenseview._1.PrescriptionAndDispenseView",
            "au.net.electronichealth.ns.mhr.xsd.interfaces.healthrecordoverview._1.HealthRecordOverView",
            "au.net.electronichealth.ns.mhr.xsd.interfaces.diagnosticimagingreportview._1.DiagnosticImagingReportView",
            "au.net.electronichealth.ns.mhr.xsd.interfaces.pathologyreportview._1.PathologyReportView");

    @Test
    public void primaryServiceWsdlOnClasspath() {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        for (String wsdl : PRIMARY_SERVICE_WSDL) {
            assertNotNull(wsdl, loader.getResource(wsdl));
        }
    }

    @Test
    public void interfaceWsdlOnClasspath() {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        assertEquals(10, INTERFACE_WSDL.size());
        for (String wsdl : INTERFACE_WSDL) {
            assertNotNull(wsdl, loader.getResource(wsdl));
        }
    }

    @Test
    public void serviceStubCount() throws Exception {
        int serviceStubs = 0;
        for (Class<?> type : serviceClassesOnClasspath()) {
            if (type.getAnnotation(WebServiceClient.class) != null) {
                serviceStubs++;
            }
        }
        assertEquals(12, serviceStubs);
    }

    @Test
    public void serviceStubsReferencePackagedWsdl() throws Exception {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        for (Class<?> type : serviceClassesOnClasspath()) {
            WebServiceClient client = type.getAnnotation(WebServiceClient.class);
            if (client == null) {
                continue;
            }
            URL wsdl = type.getResource(client.wsdlLocation());
            if (wsdl == null) {
                wsdl = loader.getResource(client.wsdlLocation());
            }
            assertNotNull(type.getName() + " wsdlLocation=" + client.wsdlLocation(), wsdl);
        }
    }

    @Test
    public void portTypesExposeDotNetLogicalWireOperations() throws Exception {
        assertEquals(12, PORT_TYPE_WIRE_OPS.size());
        for (Map.Entry<String, String> entry : PORT_TYPE_WIRE_OPS.entrySet()) {
            Class<?> portType = Class.forName(entry.getKey());
            Map<String, Method> byOp = new LinkedHashMap<>();
            for (Method method : portType.getDeclaredMethods()) {
                WebMethod webMethod = method.getAnnotation(WebMethod.class);
                if (webMethod == null) {
                    continue;
                }
                String op = webMethod.operationName();
                if (op == null || op.isEmpty()) {
                    op = method.getName();
                }
                byOp.put(op, method);
            }
            for (String expected : entry.getValue().split(",")) {
                assertTrue(entry.getKey() + " missing wire op " + expected,
                        byOp.containsKey(expected));
            }
        }
    }

    @Test
    public void getViewSupportsSevenClinicalViewRequestTypes() throws Exception {
        assertEquals(7, GET_VIEW_REQUEST_TYPES.size());
        for (String typeName : GET_VIEW_REQUEST_TYPES) {
            assertNotNull(typeName, Class.forName(typeName));
        }
    }

    private static List<Class<?>> serviceClassesOnClasspath() throws Exception {
        List<Class<?>> classes = new ArrayList<>();
        classes.addAll(classesInPackage("au.net.electronichealth"));
        classes.addAll(classesInPackage("ihe.iti"));
        return classes;
    }

    private static List<Class<?>> classesInPackage(String packageName) throws Exception {
        String path = packageName.replace('.', '/');
        List<Class<?>> classes = new ArrayList<>();
        for (URL resource : Collections.list(
                Thread.currentThread().getContextClassLoader().getResources(path))) {
            if ("file".equals(resource.getProtocol())) {
                File directory = new File(URLDecoder.decode(resource.getFile(), StandardCharsets.UTF_8));
                addClasses(directory, packageName, classes);
            }
        }
        return classes;
    }

    private static void addClasses(File directory, String packageName, List<Class<?>> classes) throws Exception {
        File[] files = directory.listFiles();
        if (files == null) {
            return;
        }

        for (File file : files) {
            if (file.isDirectory()) {
                addClasses(file, packageName + "." + file.getName(), classes);
            } else if (file.getName().endsWith(".class")
                    && !file.getName().contains("$")
                    && !"package-info.class".equals(file.getName())) {
                String className = packageName + "."
                        + file.getName().substring(0, file.getName().length() - ".class".length());
                classes.add(Class.forName(className));
            }
        }
    }
}
