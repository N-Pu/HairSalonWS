
package webservice.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddNewService_QNAME = new QName("http://server/", "AddNewService");
    private final static QName _AddNewServiceResponse_QNAME = new QName("http://server/", "AddNewServiceResponse");
    private final static QName _DeleteBooking_QNAME = new QName("http://server/", "DeleteBooking");
    private final static QName _DeleteBookingResponse_QNAME = new QName("http://server/", "DeleteBookingResponse");
    private final static QName _DeleteService_QNAME = new QName("http://server/", "DeleteService");
    private final static QName _DeleteServiceResponse_QNAME = new QName("http://server/", "DeleteServiceResponse");
    private final static QName _Exception_QNAME = new QName("http://server/", "Exception");
    private final static QName _GetAHairCut_QNAME = new QName("http://server/", "GetAHairCut");
    private final static QName _GetAHairCutResponse_QNAME = new QName("http://server/", "GetAHairCutResponse");
    private final static QName _GetFreeTime_QNAME = new QName("http://server/", "GetFreeTime");
    private final static QName _GetFreeTimeResponse_QNAME = new QName("http://server/", "GetFreeTimeResponse");
    private final static QName _GetServiceList_QNAME = new QName("http://server/", "GetServiceList");
    private final static QName _GetServiceListResponse_QNAME = new QName("http://server/", "GetServiceListResponse");
    private final static QName _IdMakerForClient_QNAME = new QName("http://server/", "IdMakerForClient");
    private final static QName _IdMakerForClientResponse_QNAME = new QName("http://server/", "IdMakerForClientResponse");
    private final static QName _IdMakerForStaff_QNAME = new QName("http://server/", "IdMakerForStaff");
    private final static QName _IdMakerForStaffResponse_QNAME = new QName("http://server/", "IdMakerForStaffResponse");
    private final static QName _TimeChecker_QNAME = new QName("http://server/", "TimeChecker");
    private final static QName _TimeCheckerResponse_QNAME = new QName("http://server/", "TimeCheckerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddNewService }
     * 
     */
    public AddNewService createAddNewService() {
        return new AddNewService();
    }

    /**
     * Create an instance of {@link AddNewServiceResponse }
     * 
     */
    public AddNewServiceResponse createAddNewServiceResponse() {
        return new AddNewServiceResponse();
    }

    /**
     * Create an instance of {@link DeleteBooking }
     * 
     */
    public DeleteBooking createDeleteBooking() {
        return new DeleteBooking();
    }

    /**
     * Create an instance of {@link DeleteBookingResponse }
     * 
     */
    public DeleteBookingResponse createDeleteBookingResponse() {
        return new DeleteBookingResponse();
    }

    /**
     * Create an instance of {@link DeleteService }
     * 
     */
    public DeleteService createDeleteService() {
        return new DeleteService();
    }

    /**
     * Create an instance of {@link DeleteServiceResponse }
     * 
     */
    public DeleteServiceResponse createDeleteServiceResponse() {
        return new DeleteServiceResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link GetAHairCut }
     * 
     */
    public GetAHairCut createGetAHairCut() {
        return new GetAHairCut();
    }

    /**
     * Create an instance of {@link GetAHairCutResponse }
     * 
     */
    public GetAHairCutResponse createGetAHairCutResponse() {
        return new GetAHairCutResponse();
    }

    /**
     * Create an instance of {@link GetFreeTime }
     * 
     */
    public GetFreeTime createGetFreeTime() {
        return new GetFreeTime();
    }

    /**
     * Create an instance of {@link GetFreeTimeResponse }
     * 
     */
    public GetFreeTimeResponse createGetFreeTimeResponse() {
        return new GetFreeTimeResponse();
    }

    /**
     * Create an instance of {@link GetServiceList }
     * 
     */
    public GetServiceList createGetServiceList() {
        return new GetServiceList();
    }

    /**
     * Create an instance of {@link GetServiceListResponse }
     * 
     */
    public GetServiceListResponse createGetServiceListResponse() {
        return new GetServiceListResponse();
    }

    /**
     * Create an instance of {@link IdMakerForClient }
     * 
     */
    public IdMakerForClient createIdMakerForClient() {
        return new IdMakerForClient();
    }

    /**
     * Create an instance of {@link IdMakerForClientResponse }
     * 
     */
    public IdMakerForClientResponse createIdMakerForClientResponse() {
        return new IdMakerForClientResponse();
    }

    /**
     * Create an instance of {@link IdMakerForStaff }
     * 
     */
    public IdMakerForStaff createIdMakerForStaff() {
        return new IdMakerForStaff();
    }

    /**
     * Create an instance of {@link IdMakerForStaffResponse }
     * 
     */
    public IdMakerForStaffResponse createIdMakerForStaffResponse() {
        return new IdMakerForStaffResponse();
    }

    /**
     * Create an instance of {@link TimeChecker }
     * 
     */
    public TimeChecker createTimeChecker() {
        return new TimeChecker();
    }

    /**
     * Create an instance of {@link TimeCheckerResponse }
     * 
     */
    public TimeCheckerResponse createTimeCheckerResponse() {
        return new TimeCheckerResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewService }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddNewService }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "AddNewService")
    public JAXBElement<AddNewService> createAddNewService(AddNewService value) {
        return new JAXBElement<AddNewService>(_AddNewService_QNAME, AddNewService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddNewServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "AddNewServiceResponse")
    public JAXBElement<AddNewServiceResponse> createAddNewServiceResponse(AddNewServiceResponse value) {
        return new JAXBElement<AddNewServiceResponse>(_AddNewServiceResponse_QNAME, AddNewServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBooking }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteBooking }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "DeleteBooking")
    public JAXBElement<DeleteBooking> createDeleteBooking(DeleteBooking value) {
        return new JAXBElement<DeleteBooking>(_DeleteBooking_QNAME, DeleteBooking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBookingResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteBookingResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "DeleteBookingResponse")
    public JAXBElement<DeleteBookingResponse> createDeleteBookingResponse(DeleteBookingResponse value) {
        return new JAXBElement<DeleteBookingResponse>(_DeleteBookingResponse_QNAME, DeleteBookingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteService }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteService }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "DeleteService")
    public JAXBElement<DeleteService> createDeleteService(DeleteService value) {
        return new JAXBElement<DeleteService>(_DeleteService_QNAME, DeleteService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "DeleteServiceResponse")
    public JAXBElement<DeleteServiceResponse> createDeleteServiceResponse(DeleteServiceResponse value) {
        return new JAXBElement<DeleteServiceResponse>(_DeleteServiceResponse_QNAME, DeleteServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAHairCut }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAHairCut }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "GetAHairCut")
    public JAXBElement<GetAHairCut> createGetAHairCut(GetAHairCut value) {
        return new JAXBElement<GetAHairCut>(_GetAHairCut_QNAME, GetAHairCut.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAHairCutResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAHairCutResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "GetAHairCutResponse")
    public JAXBElement<GetAHairCutResponse> createGetAHairCutResponse(GetAHairCutResponse value) {
        return new JAXBElement<GetAHairCutResponse>(_GetAHairCutResponse_QNAME, GetAHairCutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFreeTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFreeTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "GetFreeTime")
    public JAXBElement<GetFreeTime> createGetFreeTime(GetFreeTime value) {
        return new JAXBElement<GetFreeTime>(_GetFreeTime_QNAME, GetFreeTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFreeTimeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFreeTimeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "GetFreeTimeResponse")
    public JAXBElement<GetFreeTimeResponse> createGetFreeTimeResponse(GetFreeTimeResponse value) {
        return new JAXBElement<GetFreeTimeResponse>(_GetFreeTimeResponse_QNAME, GetFreeTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetServiceList }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "GetServiceList")
    public JAXBElement<GetServiceList> createGetServiceList(GetServiceList value) {
        return new JAXBElement<GetServiceList>(_GetServiceList_QNAME, GetServiceList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetServiceListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "GetServiceListResponse")
    public JAXBElement<GetServiceListResponse> createGetServiceListResponse(GetServiceListResponse value) {
        return new JAXBElement<GetServiceListResponse>(_GetServiceListResponse_QNAME, GetServiceListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdMakerForClient }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IdMakerForClient }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "IdMakerForClient")
    public JAXBElement<IdMakerForClient> createIdMakerForClient(IdMakerForClient value) {
        return new JAXBElement<IdMakerForClient>(_IdMakerForClient_QNAME, IdMakerForClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdMakerForClientResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IdMakerForClientResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "IdMakerForClientResponse")
    public JAXBElement<IdMakerForClientResponse> createIdMakerForClientResponse(IdMakerForClientResponse value) {
        return new JAXBElement<IdMakerForClientResponse>(_IdMakerForClientResponse_QNAME, IdMakerForClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdMakerForStaff }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IdMakerForStaff }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "IdMakerForStaff")
    public JAXBElement<IdMakerForStaff> createIdMakerForStaff(IdMakerForStaff value) {
        return new JAXBElement<IdMakerForStaff>(_IdMakerForStaff_QNAME, IdMakerForStaff.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdMakerForStaffResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IdMakerForStaffResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "IdMakerForStaffResponse")
    public JAXBElement<IdMakerForStaffResponse> createIdMakerForStaffResponse(IdMakerForStaffResponse value) {
        return new JAXBElement<IdMakerForStaffResponse>(_IdMakerForStaffResponse_QNAME, IdMakerForStaffResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeChecker }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeChecker }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "TimeChecker")
    public JAXBElement<TimeChecker> createTimeChecker(TimeChecker value) {
        return new JAXBElement<TimeChecker>(_TimeChecker_QNAME, TimeChecker.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeCheckerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeCheckerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "TimeCheckerResponse")
    public JAXBElement<TimeCheckerResponse> createTimeCheckerResponse(TimeCheckerResponse value) {
        return new JAXBElement<TimeCheckerResponse>(_TimeCheckerResponse_QNAME, TimeCheckerResponse.class, null, value);
    }

}
