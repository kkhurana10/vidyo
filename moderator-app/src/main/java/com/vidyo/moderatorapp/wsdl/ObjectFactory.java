
package com.vidyo.moderatorapp.wsdl;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.vidyo.moderatorapp.wsdl package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _ClientType_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "ClientType");
    private static final QName _OK_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "OK");
    private static final QName _ErrorMessage_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "ErrorMessage");
    private static final QName _RetryAfter_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "RetryAfter");
    private static final QName _Language_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "Language");
    private static final QName _EntityType_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "EntityType");
    private static final QName _MemberMode_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "MemberMode");
    private static final QName _MemberStatus_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "MemberStatus");
    private static final QName _RoomStatus_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "RoomStatus");
    private static final QName _GetRoomProfilesRequest_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "GetRoomProfilesRequest");
    private static final QName _CreateTestcallRoomRequest_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "CreateTestcallRoomRequest");
    private static final QName _GetPortalFeaturesRequest_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "GetPortalFeaturesRequest");
    private static final QName _GetActiveSessionsRequest_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "GetActiveSessionsRequest");
    private static final QName _LogoutAllOtherSessionsRequest_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "LogoutAllOtherSessionsRequest");
    private static final QName _OnetimeAccessRequest_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "OnetimeAccessRequest");
    private static final QName _PortalPrefixRequest_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "PortalPrefixRequest");
    private static final QName _RaiseHandRequest_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "RaiseHandRequest");
    private static final QName _UnraiseHandRequest_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "UnraiseHandRequest");
    private static final QName _SilenceSpeakerServerRequest_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "SilenceSpeakerServerRequest");
    private static final QName _SilenceSpeakerServerResponse_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "SilenceSpeakerServerResponse");
    private static final QName _SilenceSpeakerServerAllRequest_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "SilenceSpeakerServerAllRequest");
    private static final QName _SilenceSpeakerServerAllResponse_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "SilenceSpeakerServerAllResponse");
    private static final QName _RoomModeRoomURL_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "roomURL");
    private static final QName _RoomModeRoomPIN_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "roomPIN");
    private static final QName _RoomModeHasModeratorPIN_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "hasModeratorPIN");
    private static final QName _RoomModeModeratorPIN_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "moderatorPIN");
    private static final QName _FilterStart_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "start");
    private static final QName _FilterLimit_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "limit");
    private static final QName _FilterSortBy_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "sortBy");
    private static final QName _FilterDir_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "dir");
    private static final QName _FilterQuery_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "query");
    private static final QName _EntityParticipantID_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "participantID");
    private static final QName _EntityOwnerID_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "ownerID");
    private static final QName _EntityEmailAddress_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "emailAddress");
    private static final QName _EntityTenant_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "tenant");
    private static final QName _EntityAudio_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "audio");
    private static final QName _EntityVideo_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "video");
    private static final QName _EntityAudioSilenced_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "audioSilenced");
    private static final QName _EntityVideoSilenced_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "videoSilenced");
    private static final QName _EntityAppshare_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "appshare");
    private static final QName _EntityPhone1_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "phone1");
    private static final QName _EntityPhone2_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "phone2");
    private static final QName _EntityPhone3_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "phone3");
    private static final QName _EntityDepartment_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "department");
    private static final QName _EntityTitle_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "title");
    private static final QName _EntityInstantMessagerID_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "instantMessagerID");
    private static final QName _EntityLocation_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "location");
    private static final QName _EntityThumbnailUpdateTime_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "thumbnailUpdateTime");
    private static final QName _LectureModeParticipantHandRaised_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "handRaised");
    private static final QName _LectureModeParticipantPresenter_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "presenter");
    private static final QName _WelcomeBannerContentWelcomeBannerText_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "welcomeBannerText");
    private static final QName _LogInRequestEndpointGuid_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "endpointGuid");
    private static final QName _LogInResponseVmaddress_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "vmaddress");
    private static final QName _LogInResponseProxyaddress_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "proxyaddress");
    private static final QName _LogInResponseLoctag_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "loctag");
    private static final QName _LogInResponsePak2_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "pak2");
    private static final QName _SearchMembersRequestQueryField_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "queryField");
    private static final QName _SearchMembersRequestMemberType_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "memberType");
    private static final QName _SearchMembersRequestSortDir_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "sortDir");
    private static final QName _SearchRoomsRequestRoomType_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "roomType");
    private static final QName _JoinConferenceRequestPIN_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "PIN");
    private static final QName _JoinConferenceRequestReferenceNumber_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "referenceNumber");
    private static final QName _GetParticipantsResponseRecorderID_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "recorderID");
    private static final QName _GetParticipantsResponseRecorderName_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "recorderName");
    private static final QName _GetParticipantsResponsePaused_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "paused");
    private static final QName _GetParticipantsResponseWebcast_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "webcast");
    private static final QName _GetLectureModeParticipantsResponseLectureMode_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "lectureMode");
    private static final QName _GetWebcastURLResponseWebCastURL_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "webCastURL");
    private static final QName _GetModeratorURLResponseModeratorURL_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "moderatorURL");
    private static final QName _GetConferenceIDResponseConferenceID_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "conferenceID");
    private static final QName _GetLoginAndWelcomeBannerResponseLoginBannerText_QNAME = new QName("http://portal.vidyo.com/user/v1_1", "loginBannerText");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.vidyo.moderatorapp.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GeneralFault }
     * 
     * @return
     *     the new instance of {@link GeneralFault }
     */
    public GeneralFault createGeneralFault() {
        return new GeneralFault();
    }

    /**
     * Create an instance of {@link InvalidArgumentFault }
     * 
     * @return
     *     the new instance of {@link InvalidArgumentFault }
     */
    public InvalidArgumentFault createInvalidArgumentFault() {
        return new InvalidArgumentFault();
    }

    /**
     * Create an instance of {@link SeatLicenseExpiredFault }
     * 
     * @return
     *     the new instance of {@link SeatLicenseExpiredFault }
     */
    public SeatLicenseExpiredFault createSeatLicenseExpiredFault() {
        return new SeatLicenseExpiredFault();
    }

    /**
     * Create an instance of {@link WrongPINFault }
     * 
     * @return
     *     the new instance of {@link WrongPINFault }
     */
    public WrongPINFault createWrongPINFault() {
        return new WrongPINFault();
    }

    /**
     * Create an instance of {@link ConferenceLockedFault }
     * 
     * @return
     *     the new instance of {@link ConferenceLockedFault }
     */
    public ConferenceLockedFault createConferenceLockedFault() {
        return new ConferenceLockedFault();
    }

    /**
     * Create an instance of {@link NotLicensedFault }
     * 
     * @return
     *     the new instance of {@link NotLicensedFault }
     */
    public NotLicensedFault createNotLicensedFault() {
        return new NotLicensedFault();
    }

    /**
     * Create an instance of {@link ResourceNotAvailableFault }
     * 
     * @return
     *     the new instance of {@link ResourceNotAvailableFault }
     */
    public ResourceNotAvailableFault createResourceNotAvailableFault() {
        return new ResourceNotAvailableFault();
    }

    /**
     * Create an instance of {@link AccessRestrictedFault }
     * 
     * @return
     *     the new instance of {@link AccessRestrictedFault }
     */
    public AccessRestrictedFault createAccessRestrictedFault() {
        return new AccessRestrictedFault();
    }

    /**
     * Create an instance of {@link InvalidModeratorPINFormatFault }
     * 
     * @return
     *     the new instance of {@link InvalidModeratorPINFormatFault }
     */
    public InvalidModeratorPINFormatFault createInvalidModeratorPINFormatFault() {
        return new InvalidModeratorPINFormatFault();
    }

    /**
     * Create an instance of {@link ControlMeetingFault }
     * 
     * @return
     *     the new instance of {@link ControlMeetingFault }
     */
    public ControlMeetingFault createControlMeetingFault() {
        return new ControlMeetingFault();
    }

    /**
     * Create an instance of {@link ScheduledRoomCreationFault }
     * 
     * @return
     *     the new instance of {@link ScheduledRoomCreationFault }
     */
    public ScheduledRoomCreationFault createScheduledRoomCreationFault() {
        return new ScheduledRoomCreationFault();
    }

    /**
     * Create an instance of {@link TestcallRoomCreationFault }
     * 
     * @return
     *     the new instance of {@link TestcallRoomCreationFault }
     */
    public TestcallRoomCreationFault createTestcallRoomCreationFault() {
        return new TestcallRoomCreationFault();
    }

    /**
     * Create an instance of {@link EndpointNotBoundFault }
     * 
     * @return
     *     the new instance of {@link EndpointNotBoundFault }
     */
    public EndpointNotBoundFault createEndpointNotBoundFault() {
        return new EndpointNotBoundFault();
    }

    /**
     * Create an instance of {@link InPointToPointCallFault }
     * 
     * @return
     *     the new instance of {@link InPointToPointCallFault }
     */
    public InPointToPointCallFault createInPointToPointCallFault() {
        return new InPointToPointCallFault();
    }

    /**
     * Create an instance of {@link PrefixNotConfiguredException }
     * 
     * @return
     *     the new instance of {@link PrefixNotConfiguredException }
     */
    public PrefixNotConfiguredException createPrefixNotConfiguredException() {
        return new PrefixNotConfiguredException();
    }

    /**
     * Create an instance of {@link FeatureNotAvailableFault }
     * 
     * @return
     *     the new instance of {@link FeatureNotAvailableFault }
     */
    public FeatureNotAvailableFault createFeatureNotAvailableFault() {
        return new FeatureNotAvailableFault();
    }

    /**
     * Create an instance of {@link VidyoReplayNotAvailableFault }
     * 
     * @return
     *     the new instance of {@link VidyoReplayNotAvailableFault }
     */
    public VidyoReplayNotAvailableFault createVidyoReplayNotAvailableFault() {
        return new VidyoReplayNotAvailableFault();
    }

    /**
     * Create an instance of {@link RoomNotFoundFault }
     * 
     * @return
     *     the new instance of {@link RoomNotFoundFault }
     */
    public RoomNotFoundFault createRoomNotFoundFault() {
        return new RoomNotFoundFault();
    }

    /**
     * Create an instance of {@link PublicRoomCreationFault }
     * 
     * @return
     *     the new instance of {@link PublicRoomCreationFault }
     */
    public PublicRoomCreationFault createPublicRoomCreationFault() {
        return new PublicRoomCreationFault();
    }

    /**
     * Create an instance of {@link PublicRoomDescUpdationFault }
     * 
     * @return
     *     the new instance of {@link PublicRoomDescUpdationFault }
     */
    public PublicRoomDescUpdationFault createPublicRoomDescUpdationFault() {
        return new PublicRoomDescUpdationFault();
    }

    /**
     * Create an instance of {@link NotAllowedToCreateFault }
     * 
     * @return
     *     the new instance of {@link NotAllowedToCreateFault }
     */
    public NotAllowedToCreateFault createNotAllowedToCreateFault() {
        return new NotAllowedToCreateFault();
    }

    /**
     * Create an instance of {@link FileTooLargeFault }
     * 
     * @return
     *     the new instance of {@link FileTooLargeFault }
     */
    public FileTooLargeFault createFileTooLargeFault() {
        return new FileTooLargeFault();
    }

    /**
     * Create an instance of {@link NotAllowedThumbnailPhotoFault }
     * 
     * @return
     *     the new instance of {@link NotAllowedThumbnailPhotoFault }
     */
    public NotAllowedThumbnailPhotoFault createNotAllowedThumbnailPhotoFault() {
        return new NotAllowedThumbnailPhotoFault();
    }

    /**
     * Create an instance of {@link InvalidFault }
     * 
     * @return
     *     the new instance of {@link InvalidFault }
     */
    public InvalidFault createInvalidFault() {
        return new InvalidFault();
    }

    /**
     * Create an instance of {@link InvalidConferenceFault }
     * 
     * @return
     *     the new instance of {@link InvalidConferenceFault }
     */
    public InvalidConferenceFault createInvalidConferenceFault() {
        return new InvalidConferenceFault();
    }

    /**
     * Create an instance of {@link InvalidParticipantFault }
     * 
     * @return
     *     the new instance of {@link InvalidParticipantFault }
     */
    public InvalidParticipantFault createInvalidParticipantFault() {
        return new InvalidParticipantFault();
    }

    /**
     * Create an instance of {@link LogAggregationDisabledFault }
     * 
     * @return
     *     the new instance of {@link LogAggregationDisabledFault }
     */
    public LogAggregationDisabledFault createLogAggregationDisabledFault() {
        return new LogAggregationDisabledFault();
    }

    /**
     * Create an instance of {@link RoomMode }
     * 
     * @return
     *     the new instance of {@link RoomMode }
     */
    public RoomMode createRoomMode() {
        return new RoomMode();
    }

    /**
     * Create an instance of {@link Filter }
     * 
     * @return
     *     the new instance of {@link Filter }
     */
    public Filter createFilter() {
        return new Filter();
    }

    /**
     * Create an instance of {@link Entity }
     * 
     * @return
     *     the new instance of {@link Entity }
     */
    public Entity createEntity() {
        return new Entity();
    }

    /**
     * Create an instance of {@link EntityDetails }
     * 
     * @return
     *     the new instance of {@link EntityDetails }
     */
    public EntityDetails createEntityDetails() {
        return new EntityDetails();
    }

    /**
     * Create an instance of {@link Member }
     * 
     * @return
     *     the new instance of {@link Member }
     */
    public Member createMember() {
        return new Member();
    }

    /**
     * Create an instance of {@link Room }
     * 
     * @return
     *     the new instance of {@link Room }
     */
    public Room createRoom() {
        return new Room();
    }

    /**
     * Create an instance of {@link LectureModeParticipant }
     * 
     * @return
     *     the new instance of {@link LectureModeParticipant }
     */
    public LectureModeParticipant createLectureModeParticipant() {
        return new LectureModeParticipant();
    }

    /**
     * Create an instance of {@link LoginAttempt }
     * 
     * @return
     *     the new instance of {@link LoginAttempt }
     */
    public LoginAttempt createLoginAttempt() {
        return new LoginAttempt();
    }

    /**
     * Create an instance of {@link WelcomeBannerContent }
     * 
     * @return
     *     the new instance of {@link WelcomeBannerContent }
     */
    public WelcomeBannerContent createWelcomeBannerContent() {
        return new WelcomeBannerContent();
    }

    /**
     * Create an instance of {@link LogInRequest }
     * 
     * @return
     *     the new instance of {@link LogInRequest }
     */
    public LogInRequest createLogInRequest() {
        return new LogInRequest();
    }

    /**
     * Create an instance of {@link LogInResponse }
     * 
     * @return
     *     the new instance of {@link LogInResponse }
     */
    public LogInResponse createLogInResponse() {
        return new LogInResponse();
    }

    /**
     * Create an instance of {@link EndpointBehaviorDataType }
     * 
     * @return
     *     the new instance of {@link EndpointBehaviorDataType }
     */
    public EndpointBehaviorDataType createEndpointBehaviorDataType() {
        return new EndpointBehaviorDataType();
    }

    /**
     * Create an instance of {@link LinkEndpointRequest }
     * 
     * @return
     *     the new instance of {@link LinkEndpointRequest }
     */
    public LinkEndpointRequest createLinkEndpointRequest() {
        return new LinkEndpointRequest();
    }

    /**
     * Create an instance of {@link LinkEndpointResponse }
     * 
     * @return
     *     the new instance of {@link LinkEndpointResponse }
     */
    public LinkEndpointResponse createLinkEndpointResponse() {
        return new LinkEndpointResponse();
    }

    /**
     * Create an instance of {@link LogOutRequest }
     * 
     * @return
     *     the new instance of {@link LogOutRequest }
     */
    public LogOutRequest createLogOutRequest() {
        return new LogOutRequest();
    }

    /**
     * Create an instance of {@link LogOutResponse }
     * 
     * @return
     *     the new instance of {@link LogOutResponse }
     */
    public LogOutResponse createLogOutResponse() {
        return new LogOutResponse();
    }

    /**
     * Create an instance of {@link MyEndpointStatusRequest }
     * 
     * @return
     *     the new instance of {@link MyEndpointStatusRequest }
     */
    public MyEndpointStatusRequest createMyEndpointStatusRequest() {
        return new MyEndpointStatusRequest();
    }

    /**
     * Create an instance of {@link MyEndpointStatusResponse }
     * 
     * @return
     *     the new instance of {@link MyEndpointStatusResponse }
     */
    public MyEndpointStatusResponse createMyEndpointStatusResponse() {
        return new MyEndpointStatusResponse();
    }

    /**
     * Create an instance of {@link SearchMyContactsRequest }
     * 
     * @return
     *     the new instance of {@link SearchMyContactsRequest }
     */
    public SearchMyContactsRequest createSearchMyContactsRequest() {
        return new SearchMyContactsRequest();
    }

    /**
     * Create an instance of {@link SearchMyContactsResponse }
     * 
     * @return
     *     the new instance of {@link SearchMyContactsResponse }
     */
    public SearchMyContactsResponse createSearchMyContactsResponse() {
        return new SearchMyContactsResponse();
    }

    /**
     * Create an instance of {@link AddToMyContactsRequest }
     * 
     * @return
     *     the new instance of {@link AddToMyContactsRequest }
     */
    public AddToMyContactsRequest createAddToMyContactsRequest() {
        return new AddToMyContactsRequest();
    }

    /**
     * Create an instance of {@link AddToMyContactsResponse }
     * 
     * @return
     *     the new instance of {@link AddToMyContactsResponse }
     */
    public AddToMyContactsResponse createAddToMyContactsResponse() {
        return new AddToMyContactsResponse();
    }

    /**
     * Create an instance of {@link RemoveFromMyContactsRequest }
     * 
     * @return
     *     the new instance of {@link RemoveFromMyContactsRequest }
     */
    public RemoveFromMyContactsRequest createRemoveFromMyContactsRequest() {
        return new RemoveFromMyContactsRequest();
    }

    /**
     * Create an instance of {@link RemoveFromMyContactsResponse }
     * 
     * @return
     *     the new instance of {@link RemoveFromMyContactsResponse }
     */
    public RemoveFromMyContactsResponse createRemoveFromMyContactsResponse() {
        return new RemoveFromMyContactsResponse();
    }

    /**
     * Create an instance of {@link SearchRequest }
     * 
     * @return
     *     the new instance of {@link SearchRequest }
     */
    public SearchRequest createSearchRequest() {
        return new SearchRequest();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     * @return
     *     the new instance of {@link SearchResponse }
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link SearchByEntityIDRequest }
     * 
     * @return
     *     the new instance of {@link SearchByEntityIDRequest }
     */
    public SearchByEntityIDRequest createSearchByEntityIDRequest() {
        return new SearchByEntityIDRequest();
    }

    /**
     * Create an instance of {@link SearchByEntityIDResponse }
     * 
     * @return
     *     the new instance of {@link SearchByEntityIDResponse }
     */
    public SearchByEntityIDResponse createSearchByEntityIDResponse() {
        return new SearchByEntityIDResponse();
    }

    /**
     * Create an instance of {@link SearchByEmailRequest }
     * 
     * @return
     *     the new instance of {@link SearchByEmailRequest }
     */
    public SearchByEmailRequest createSearchByEmailRequest() {
        return new SearchByEmailRequest();
    }

    /**
     * Create an instance of {@link SearchByEmailResponse }
     * 
     * @return
     *     the new instance of {@link SearchByEmailResponse }
     */
    public SearchByEmailResponse createSearchByEmailResponse() {
        return new SearchByEmailResponse();
    }

    /**
     * Create an instance of {@link SearchMembersRequest }
     * 
     * @return
     *     the new instance of {@link SearchMembersRequest }
     */
    public SearchMembersRequest createSearchMembersRequest() {
        return new SearchMembersRequest();
    }

    /**
     * Create an instance of {@link SearchMembersResponse }
     * 
     * @return
     *     the new instance of {@link SearchMembersResponse }
     */
    public SearchMembersResponse createSearchMembersResponse() {
        return new SearchMembersResponse();
    }

    /**
     * Create an instance of {@link SearchRoomsRequest }
     * 
     * @return
     *     the new instance of {@link SearchRoomsRequest }
     */
    public SearchRoomsRequest createSearchRoomsRequest() {
        return new SearchRoomsRequest();
    }

    /**
     * Create an instance of {@link SearchRoomsResponse }
     * 
     * @return
     *     the new instance of {@link SearchRoomsResponse }
     */
    public SearchRoomsResponse createSearchRoomsResponse() {
        return new SearchRoomsResponse();
    }

    /**
     * Create an instance of {@link GetEntityByEntityIDRequest }
     * 
     * @return
     *     the new instance of {@link GetEntityByEntityIDRequest }
     */
    public GetEntityByEntityIDRequest createGetEntityByEntityIDRequest() {
        return new GetEntityByEntityIDRequest();
    }

    /**
     * Create an instance of {@link GetEntityByEntityIDResponse }
     * 
     * @return
     *     the new instance of {@link GetEntityByEntityIDResponse }
     */
    public GetEntityByEntityIDResponse createGetEntityByEntityIDResponse() {
        return new GetEntityByEntityIDResponse();
    }

    /**
     * Create an instance of {@link GetEntityDetailsByEntityIDRequest }
     * 
     * @return
     *     the new instance of {@link GetEntityDetailsByEntityIDRequest }
     */
    public GetEntityDetailsByEntityIDRequest createGetEntityDetailsByEntityIDRequest() {
        return new GetEntityDetailsByEntityIDRequest();
    }

    /**
     * Create an instance of {@link GetEntityDetailsByEntityIDResponse }
     * 
     * @return
     *     the new instance of {@link GetEntityDetailsByEntityIDResponse }
     */
    public GetEntityDetailsByEntityIDResponse createGetEntityDetailsByEntityIDResponse() {
        return new GetEntityDetailsByEntityIDResponse();
    }

    /**
     * Create an instance of {@link SetThumbnailPhotoRequest }
     * 
     * @return
     *     the new instance of {@link SetThumbnailPhotoRequest }
     */
    public SetThumbnailPhotoRequest createSetThumbnailPhotoRequest() {
        return new SetThumbnailPhotoRequest();
    }

    /**
     * Create an instance of {@link SetThumbnailPhotoResponse }
     * 
     * @return
     *     the new instance of {@link SetThumbnailPhotoResponse }
     */
    public SetThumbnailPhotoResponse createSetThumbnailPhotoResponse() {
        return new SetThumbnailPhotoResponse();
    }

    /**
     * Create an instance of {@link InviteToConferenceRequest }
     * 
     * @return
     *     the new instance of {@link InviteToConferenceRequest }
     */
    public InviteToConferenceRequest createInviteToConferenceRequest() {
        return new InviteToConferenceRequest();
    }

    /**
     * Create an instance of {@link InviteToConferenceResponse }
     * 
     * @return
     *     the new instance of {@link InviteToConferenceResponse }
     */
    public InviteToConferenceResponse createInviteToConferenceResponse() {
        return new InviteToConferenceResponse();
    }

    /**
     * Create an instance of {@link CancelOutboundCallRequest }
     * 
     * @return
     *     the new instance of {@link CancelOutboundCallRequest }
     */
    public CancelOutboundCallRequest createCancelOutboundCallRequest() {
        return new CancelOutboundCallRequest();
    }

    /**
     * Create an instance of {@link CancelOutboundCallResponse }
     * 
     * @return
     *     the new instance of {@link CancelOutboundCallResponse }
     */
    public CancelOutboundCallResponse createCancelOutboundCallResponse() {
        return new CancelOutboundCallResponse();
    }

    /**
     * Create an instance of {@link JoinConferenceRequest }
     * 
     * @return
     *     the new instance of {@link JoinConferenceRequest }
     */
    public JoinConferenceRequest createJoinConferenceRequest() {
        return new JoinConferenceRequest();
    }

    /**
     * Create an instance of {@link JoinConferenceResponse }
     * 
     * @return
     *     the new instance of {@link JoinConferenceResponse }
     */
    public JoinConferenceResponse createJoinConferenceResponse() {
        return new JoinConferenceResponse();
    }

    /**
     * Create an instance of {@link JoinIPCConferenceRequest }
     * 
     * @return
     *     the new instance of {@link JoinIPCConferenceRequest }
     */
    public JoinIPCConferenceRequest createJoinIPCConferenceRequest() {
        return new JoinIPCConferenceRequest();
    }

    /**
     * Create an instance of {@link JoinIPCConferenceResponse }
     * 
     * @return
     *     the new instance of {@link JoinIPCConferenceResponse }
     */
    public JoinIPCConferenceResponse createJoinIPCConferenceResponse() {
        return new JoinIPCConferenceResponse();
    }

    /**
     * Create an instance of {@link DirectCallRequest }
     * 
     * @return
     *     the new instance of {@link DirectCallRequest }
     */
    public DirectCallRequest createDirectCallRequest() {
        return new DirectCallRequest();
    }

    /**
     * Create an instance of {@link DirectCallResponse }
     * 
     * @return
     *     the new instance of {@link DirectCallResponse }
     */
    public DirectCallResponse createDirectCallResponse() {
        return new DirectCallResponse();
    }

    /**
     * Create an instance of {@link GetParticipantsRequest }
     * 
     * @return
     *     the new instance of {@link GetParticipantsRequest }
     */
    public GetParticipantsRequest createGetParticipantsRequest() {
        return new GetParticipantsRequest();
    }

    /**
     * Create an instance of {@link GetParticipantsResponse }
     * 
     * @return
     *     the new instance of {@link GetParticipantsResponse }
     */
    public GetParticipantsResponse createGetParticipantsResponse() {
        return new GetParticipantsResponse();
    }

    /**
     * Create an instance of {@link GetLectureModeParticipantsRequest }
     * 
     * @return
     *     the new instance of {@link GetLectureModeParticipantsRequest }
     */
    public GetLectureModeParticipantsRequest createGetLectureModeParticipantsRequest() {
        return new GetLectureModeParticipantsRequest();
    }

    /**
     * Create an instance of {@link GetLectureModeParticipantsResponse }
     * 
     * @return
     *     the new instance of {@link GetLectureModeParticipantsResponse }
     */
    public GetLectureModeParticipantsResponse createGetLectureModeParticipantsResponse() {
        return new GetLectureModeParticipantsResponse();
    }

    /**
     * Create an instance of {@link LeaveConferenceRequest }
     * 
     * @return
     *     the new instance of {@link LeaveConferenceRequest }
     */
    public LeaveConferenceRequest createLeaveConferenceRequest() {
        return new LeaveConferenceRequest();
    }

    /**
     * Create an instance of {@link LeaveConferenceResponse }
     * 
     * @return
     *     the new instance of {@link LeaveConferenceResponse }
     */
    public LeaveConferenceResponse createLeaveConferenceResponse() {
        return new LeaveConferenceResponse();
    }

    /**
     * Create an instance of {@link MuteAudioRequest }
     * 
     * @return
     *     the new instance of {@link MuteAudioRequest }
     */
    public MuteAudioRequest createMuteAudioRequest() {
        return new MuteAudioRequest();
    }

    /**
     * Create an instance of {@link MuteAudioLocalRequest }
     * 
     * @return
     *     the new instance of {@link MuteAudioLocalRequest }
     */
    public MuteAudioLocalRequest createMuteAudioLocalRequest() {
        return new MuteAudioLocalRequest();
    }

    /**
     * Create an instance of {@link MuteVideoRequest }
     * 
     * @return
     *     the new instance of {@link MuteVideoRequest }
     */
    public MuteVideoRequest createMuteVideoRequest() {
        return new MuteVideoRequest();
    }

    /**
     * Create an instance of {@link MuteAudioResponse }
     * 
     * @return
     *     the new instance of {@link MuteAudioResponse }
     */
    public MuteAudioResponse createMuteAudioResponse() {
        return new MuteAudioResponse();
    }

    /**
     * Create an instance of {@link UnmuteAudioRequest }
     * 
     * @return
     *     the new instance of {@link UnmuteAudioRequest }
     */
    public UnmuteAudioRequest createUnmuteAudioRequest() {
        return new UnmuteAudioRequest();
    }

    /**
     * Create an instance of {@link UnmuteAudioResponse }
     * 
     * @return
     *     the new instance of {@link UnmuteAudioResponse }
     */
    public UnmuteAudioResponse createUnmuteAudioResponse() {
        return new UnmuteAudioResponse();
    }

    /**
     * Create an instance of {@link StartVideoRequest }
     * 
     * @return
     *     the new instance of {@link StartVideoRequest }
     */
    public StartVideoRequest createStartVideoRequest() {
        return new StartVideoRequest();
    }

    /**
     * Create an instance of {@link StartVideoResponse }
     * 
     * @return
     *     the new instance of {@link StartVideoResponse }
     */
    public StartVideoResponse createStartVideoResponse() {
        return new StartVideoResponse();
    }

    /**
     * Create an instance of {@link StopVideoRequest }
     * 
     * @return
     *     the new instance of {@link StopVideoRequest }
     */
    public StopVideoRequest createStopVideoRequest() {
        return new StopVideoRequest();
    }

    /**
     * Create an instance of {@link StopVideoResponse }
     * 
     * @return
     *     the new instance of {@link StopVideoResponse }
     */
    public StopVideoResponse createStopVideoResponse() {
        return new StopVideoResponse();
    }

    /**
     * Create an instance of {@link MyAccountRequest }
     * 
     * @return
     *     the new instance of {@link MyAccountRequest }
     */
    public MyAccountRequest createMyAccountRequest() {
        return new MyAccountRequest();
    }

    /**
     * Create an instance of {@link MyAccountResponse }
     * 
     * @return
     *     the new instance of {@link MyAccountResponse }
     */
    public MyAccountResponse createMyAccountResponse() {
        return new MyAccountResponse();
    }

    /**
     * Create an instance of {@link CreateRoomRequest }
     * 
     * @return
     *     the new instance of {@link CreateRoomRequest }
     */
    public CreateRoomRequest createCreateRoomRequest() {
        return new CreateRoomRequest();
    }

    /**
     * Create an instance of {@link CreateRoomResponse }
     * 
     * @return
     *     the new instance of {@link CreateRoomResponse }
     */
    public CreateRoomResponse createCreateRoomResponse() {
        return new CreateRoomResponse();
    }

    /**
     * Create an instance of {@link DeleteRoomRequest }
     * 
     * @return
     *     the new instance of {@link DeleteRoomRequest }
     */
    public DeleteRoomRequest createDeleteRoomRequest() {
        return new DeleteRoomRequest();
    }

    /**
     * Create an instance of {@link DeleteRoomResponse }
     * 
     * @return
     *     the new instance of {@link DeleteRoomResponse }
     */
    public DeleteRoomResponse createDeleteRoomResponse() {
        return new DeleteRoomResponse();
    }

    /**
     * Create an instance of {@link CreateRoomURLRequest }
     * 
     * @return
     *     the new instance of {@link CreateRoomURLRequest }
     */
    public CreateRoomURLRequest createCreateRoomURLRequest() {
        return new CreateRoomURLRequest();
    }

    /**
     * Create an instance of {@link CreateRoomURLResponse }
     * 
     * @return
     *     the new instance of {@link CreateRoomURLResponse }
     */
    public CreateRoomURLResponse createCreateRoomURLResponse() {
        return new CreateRoomURLResponse();
    }

    /**
     * Create an instance of {@link RemoveRoomURLRequest }
     * 
     * @return
     *     the new instance of {@link RemoveRoomURLRequest }
     */
    public RemoveRoomURLRequest createRemoveRoomURLRequest() {
        return new RemoveRoomURLRequest();
    }

    /**
     * Create an instance of {@link RemoveRoomURLResponse }
     * 
     * @return
     *     the new instance of {@link RemoveRoomURLResponse }
     */
    public RemoveRoomURLResponse createRemoveRoomURLResponse() {
        return new RemoveRoomURLResponse();
    }

    /**
     * Create an instance of {@link CreateRoomPINRequest }
     * 
     * @return
     *     the new instance of {@link CreateRoomPINRequest }
     */
    public CreateRoomPINRequest createCreateRoomPINRequest() {
        return new CreateRoomPINRequest();
    }

    /**
     * Create an instance of {@link CreateRoomPINResponse }
     * 
     * @return
     *     the new instance of {@link CreateRoomPINResponse }
     */
    public CreateRoomPINResponse createCreateRoomPINResponse() {
        return new CreateRoomPINResponse();
    }

    /**
     * Create an instance of {@link RemoveRoomPINRequest }
     * 
     * @return
     *     the new instance of {@link RemoveRoomPINRequest }
     */
    public RemoveRoomPINRequest createRemoveRoomPINRequest() {
        return new RemoveRoomPINRequest();
    }

    /**
     * Create an instance of {@link RemoveRoomPINResponse }
     * 
     * @return
     *     the new instance of {@link RemoveRoomPINResponse }
     */
    public RemoveRoomPINResponse createRemoveRoomPINResponse() {
        return new RemoveRoomPINResponse();
    }

    /**
     * Create an instance of {@link UpdatePasswordRequest }
     * 
     * @return
     *     the new instance of {@link UpdatePasswordRequest }
     */
    public UpdatePasswordRequest createUpdatePasswordRequest() {
        return new UpdatePasswordRequest();
    }

    /**
     * Create an instance of {@link UpdatePasswordResponse }
     * 
     * @return
     *     the new instance of {@link UpdatePasswordResponse }
     */
    public UpdatePasswordResponse createUpdatePasswordResponse() {
        return new UpdatePasswordResponse();
    }

    /**
     * Create an instance of {@link UpdateLanguageRequest }
     * 
     * @return
     *     the new instance of {@link UpdateLanguageRequest }
     */
    public UpdateLanguageRequest createUpdateLanguageRequest() {
        return new UpdateLanguageRequest();
    }

    /**
     * Create an instance of {@link UpdateLanguageResponse }
     * 
     * @return
     *     the new instance of {@link UpdateLanguageResponse }
     */
    public UpdateLanguageResponse createUpdateLanguageResponse() {
        return new UpdateLanguageResponse();
    }

    /**
     * Create an instance of {@link LockRoomRequest }
     * 
     * @return
     *     the new instance of {@link LockRoomRequest }
     */
    public LockRoomRequest createLockRoomRequest() {
        return new LockRoomRequest();
    }

    /**
     * Create an instance of {@link LockRoomResponse }
     * 
     * @return
     *     the new instance of {@link LockRoomResponse }
     */
    public LockRoomResponse createLockRoomResponse() {
        return new LockRoomResponse();
    }

    /**
     * Create an instance of {@link UnlockRoomRequest }
     * 
     * @return
     *     the new instance of {@link UnlockRoomRequest }
     */
    public UnlockRoomRequest createUnlockRoomRequest() {
        return new UnlockRoomRequest();
    }

    /**
     * Create an instance of {@link UnlockRoomResponse }
     * 
     * @return
     *     the new instance of {@link UnlockRoomResponse }
     */
    public UnlockRoomResponse createUnlockRoomResponse() {
        return new UnlockRoomResponse();
    }

    /**
     * Create an instance of {@link SetMemberModeRequest }
     * 
     * @return
     *     the new instance of {@link SetMemberModeRequest }
     */
    public SetMemberModeRequest createSetMemberModeRequest() {
        return new SetMemberModeRequest();
    }

    /**
     * Create an instance of {@link SetMemberModeResponse }
     * 
     * @return
     *     the new instance of {@link SetMemberModeResponse }
     */
    public SetMemberModeResponse createSetMemberModeResponse() {
        return new SetMemberModeResponse();
    }

    /**
     * Create an instance of {@link GetRecordingProfilesRequest }
     * 
     * @return
     *     the new instance of {@link GetRecordingProfilesRequest }
     */
    public GetRecordingProfilesRequest createGetRecordingProfilesRequest() {
        return new GetRecordingProfilesRequest();
    }

    /**
     * Create an instance of {@link GetRecordingProfilesResponse }
     * 
     * @return
     *     the new instance of {@link GetRecordingProfilesResponse }
     */
    public GetRecordingProfilesResponse createGetRecordingProfilesResponse() {
        return new GetRecordingProfilesResponse();
    }

    /**
     * Create an instance of {@link Recorder }
     * 
     * @return
     *     the new instance of {@link Recorder }
     */
    public Recorder createRecorder() {
        return new Recorder();
    }

    /**
     * Create an instance of {@link StartRecordingRequest }
     * 
     * @return
     *     the new instance of {@link StartRecordingRequest }
     */
    public StartRecordingRequest createStartRecordingRequest() {
        return new StartRecordingRequest();
    }

    /**
     * Create an instance of {@link StartRecordingResponse }
     * 
     * @return
     *     the new instance of {@link StartRecordingResponse }
     */
    public StartRecordingResponse createStartRecordingResponse() {
        return new StartRecordingResponse();
    }

    /**
     * Create an instance of {@link GetPortalVersionRequest }
     * 
     * @return
     *     the new instance of {@link GetPortalVersionRequest }
     */
    public GetPortalVersionRequest createGetPortalVersionRequest() {
        return new GetPortalVersionRequest();
    }

    /**
     * Create an instance of {@link GetPortalVersionResponse }
     * 
     * @return
     *     the new instance of {@link GetPortalVersionResponse }
     */
    public GetPortalVersionResponse createGetPortalVersionResponse() {
        return new GetPortalVersionResponse();
    }

    /**
     * Create an instance of {@link PauseRecordingRequest }
     * 
     * @return
     *     the new instance of {@link PauseRecordingRequest }
     */
    public PauseRecordingRequest createPauseRecordingRequest() {
        return new PauseRecordingRequest();
    }

    /**
     * Create an instance of {@link PauseRecordingResponse }
     * 
     * @return
     *     the new instance of {@link PauseRecordingResponse }
     */
    public PauseRecordingResponse createPauseRecordingResponse() {
        return new PauseRecordingResponse();
    }

    /**
     * Create an instance of {@link ResumeRecordingRequest }
     * 
     * @return
     *     the new instance of {@link ResumeRecordingRequest }
     */
    public ResumeRecordingRequest createResumeRecordingRequest() {
        return new ResumeRecordingRequest();
    }

    /**
     * Create an instance of {@link ResumeRecordingResponse }
     * 
     * @return
     *     the new instance of {@link ResumeRecordingResponse }
     */
    public ResumeRecordingResponse createResumeRecordingResponse() {
        return new ResumeRecordingResponse();
    }

    /**
     * Create an instance of {@link StopRecordingRequest }
     * 
     * @return
     *     the new instance of {@link StopRecordingRequest }
     */
    public StopRecordingRequest createStopRecordingRequest() {
        return new StopRecordingRequest();
    }

    /**
     * Create an instance of {@link StopRecordingResponse }
     * 
     * @return
     *     the new instance of {@link StopRecordingResponse }
     */
    public StopRecordingResponse createStopRecordingResponse() {
        return new StopRecordingResponse();
    }

    /**
     * Create an instance of {@link CreateWebcastURLRequest }
     * 
     * @return
     *     the new instance of {@link CreateWebcastURLRequest }
     */
    public CreateWebcastURLRequest createCreateWebcastURLRequest() {
        return new CreateWebcastURLRequest();
    }

    /**
     * Create an instance of {@link CreateWebcastURLResponse }
     * 
     * @return
     *     the new instance of {@link CreateWebcastURLResponse }
     */
    public CreateWebcastURLResponse createCreateWebcastURLResponse() {
        return new CreateWebcastURLResponse();
    }

    /**
     * Create an instance of {@link CreateWebcastPINRequest }
     * 
     * @return
     *     the new instance of {@link CreateWebcastPINRequest }
     */
    public CreateWebcastPINRequest createCreateWebcastPINRequest() {
        return new CreateWebcastPINRequest();
    }

    /**
     * Create an instance of {@link CreateWebcastPINResponse }
     * 
     * @return
     *     the new instance of {@link CreateWebcastPINResponse }
     */
    public CreateWebcastPINResponse createCreateWebcastPINResponse() {
        return new CreateWebcastPINResponse();
    }

    /**
     * Create an instance of {@link RemoveWebcastURLRequest }
     * 
     * @return
     *     the new instance of {@link RemoveWebcastURLRequest }
     */
    public RemoveWebcastURLRequest createRemoveWebcastURLRequest() {
        return new RemoveWebcastURLRequest();
    }

    /**
     * Create an instance of {@link RemoveWebcastURLResponse }
     * 
     * @return
     *     the new instance of {@link RemoveWebcastURLResponse }
     */
    public RemoveWebcastURLResponse createRemoveWebcastURLResponse() {
        return new RemoveWebcastURLResponse();
    }

    /**
     * Create an instance of {@link RemoveWebcastPINRequest }
     * 
     * @return
     *     the new instance of {@link RemoveWebcastPINRequest }
     */
    public RemoveWebcastPINRequest createRemoveWebcastPINRequest() {
        return new RemoveWebcastPINRequest();
    }

    /**
     * Create an instance of {@link RemoveWebcastPINResponse }
     * 
     * @return
     *     the new instance of {@link RemoveWebcastPINResponse }
     */
    public RemoveWebcastPINResponse createRemoveWebcastPINResponse() {
        return new RemoveWebcastPINResponse();
    }

    /**
     * Create an instance of {@link GetWebcastURLRequest }
     * 
     * @return
     *     the new instance of {@link GetWebcastURLRequest }
     */
    public GetWebcastURLRequest createGetWebcastURLRequest() {
        return new GetWebcastURLRequest();
    }

    /**
     * Create an instance of {@link GetWebcastURLResponse }
     * 
     * @return
     *     the new instance of {@link GetWebcastURLResponse }
     */
    public GetWebcastURLResponse createGetWebcastURLResponse() {
        return new GetWebcastURLResponse();
    }

    /**
     * Create an instance of {@link GetUserNameRequest }
     * 
     * @return
     *     the new instance of {@link GetUserNameRequest }
     */
    public GetUserNameRequest createGetUserNameRequest() {
        return new GetUserNameRequest();
    }

    /**
     * Create an instance of {@link GetUserNameResponse }
     * 
     * @return
     *     the new instance of {@link GetUserNameResponse }
     */
    public GetUserNameResponse createGetUserNameResponse() {
        return new GetUserNameResponse();
    }

    /**
     * Create an instance of {@link GetEntityByRoomKeyRequest }
     * 
     * @return
     *     the new instance of {@link GetEntityByRoomKeyRequest }
     */
    public GetEntityByRoomKeyRequest createGetEntityByRoomKeyRequest() {
        return new GetEntityByRoomKeyRequest();
    }

    /**
     * Create an instance of {@link GetEntityByRoomKeyResponse }
     * 
     * @return
     *     the new instance of {@link GetEntityByRoomKeyResponse }
     */
    public GetEntityByRoomKeyResponse createGetEntityByRoomKeyResponse() {
        return new GetEntityByRoomKeyResponse();
    }

    /**
     * Create an instance of {@link GetInviteContentRequest }
     * 
     * @return
     *     the new instance of {@link GetInviteContentRequest }
     */
    public GetInviteContentRequest createGetInviteContentRequest() {
        return new GetInviteContentRequest();
    }

    /**
     * Create an instance of {@link GetInviteContentResponse }
     * 
     * @return
     *     the new instance of {@link GetInviteContentResponse }
     */
    public GetInviteContentResponse createGetInviteContentResponse() {
        return new GetInviteContentResponse();
    }

    /**
     * Create an instance of {@link GetRoomProfilesResponse }
     * 
     * @return
     *     the new instance of {@link GetRoomProfilesResponse }
     */
    public GetRoomProfilesResponse createGetRoomProfilesResponse() {
        return new GetRoomProfilesResponse();
    }

    /**
     * Create an instance of {@link RoomProfile }
     * 
     * @return
     *     the new instance of {@link RoomProfile }
     */
    public RoomProfile createRoomProfile() {
        return new RoomProfile();
    }

    /**
     * Create an instance of {@link GetRoomProfileRequest }
     * 
     * @return
     *     the new instance of {@link GetRoomProfileRequest }
     */
    public GetRoomProfileRequest createGetRoomProfileRequest() {
        return new GetRoomProfileRequest();
    }

    /**
     * Create an instance of {@link GetRoomProfileResponse }
     * 
     * @return
     *     the new instance of {@link GetRoomProfileResponse }
     */
    public GetRoomProfileResponse createGetRoomProfileResponse() {
        return new GetRoomProfileResponse();
    }

    /**
     * Create an instance of {@link SetRoomProfileRequest }
     * 
     * @return
     *     the new instance of {@link SetRoomProfileRequest }
     */
    public SetRoomProfileRequest createSetRoomProfileRequest() {
        return new SetRoomProfileRequest();
    }

    /**
     * Create an instance of {@link SetRoomProfileResponse }
     * 
     * @return
     *     the new instance of {@link SetRoomProfileResponse }
     */
    public SetRoomProfileResponse createSetRoomProfileResponse() {
        return new SetRoomProfileResponse();
    }

    /**
     * Create an instance of {@link RemoveRoomProfileRequest }
     * 
     * @return
     *     the new instance of {@link RemoveRoomProfileRequest }
     */
    public RemoveRoomProfileRequest createRemoveRoomProfileRequest() {
        return new RemoveRoomProfileRequest();
    }

    /**
     * Create an instance of {@link RemoveRoomProfileResponse }
     * 
     * @return
     *     the new instance of {@link RemoveRoomProfileResponse }
     */
    public RemoveRoomProfileResponse createRemoveRoomProfileResponse() {
        return new RemoveRoomProfileResponse();
    }

    /**
     * Create an instance of {@link CreateModeratorURLRequest }
     * 
     * @return
     *     the new instance of {@link CreateModeratorURLRequest }
     */
    public CreateModeratorURLRequest createCreateModeratorURLRequest() {
        return new CreateModeratorURLRequest();
    }

    /**
     * Create an instance of {@link CreateModeratorURLResponse }
     * 
     * @return
     *     the new instance of {@link CreateModeratorURLResponse }
     */
    public CreateModeratorURLResponse createCreateModeratorURLResponse() {
        return new CreateModeratorURLResponse();
    }

    /**
     * Create an instance of {@link RemoveModeratorURLRequest }
     * 
     * @return
     *     the new instance of {@link RemoveModeratorURLRequest }
     */
    public RemoveModeratorURLRequest createRemoveModeratorURLRequest() {
        return new RemoveModeratorURLRequest();
    }

    /**
     * Create an instance of {@link RemoveModeratorURLResponse }
     * 
     * @return
     *     the new instance of {@link RemoveModeratorURLResponse }
     */
    public RemoveModeratorURLResponse createRemoveModeratorURLResponse() {
        return new RemoveModeratorURLResponse();
    }

    /**
     * Create an instance of {@link GetModeratorURLRequest }
     * 
     * @return
     *     the new instance of {@link GetModeratorURLRequest }
     */
    public GetModeratorURLRequest createGetModeratorURLRequest() {
        return new GetModeratorURLRequest();
    }

    /**
     * Create an instance of {@link GetModeratorURLResponse }
     * 
     * @return
     *     the new instance of {@link GetModeratorURLResponse }
     */
    public GetModeratorURLResponse createGetModeratorURLResponse() {
        return new GetModeratorURLResponse();
    }

    /**
     * Create an instance of {@link GetModeratorURLWithTokenRequest }
     * 
     * @return
     *     the new instance of {@link GetModeratorURLWithTokenRequest }
     */
    public GetModeratorURLWithTokenRequest createGetModeratorURLWithTokenRequest() {
        return new GetModeratorURLWithTokenRequest();
    }

    /**
     * Create an instance of {@link GetModeratorURLWithTokenResponse }
     * 
     * @return
     *     the new instance of {@link GetModeratorURLWithTokenResponse }
     */
    public GetModeratorURLWithTokenResponse createGetModeratorURLWithTokenResponse() {
        return new GetModeratorURLWithTokenResponse();
    }

    /**
     * Create an instance of {@link CreateModeratorPINRequest }
     * 
     * @return
     *     the new instance of {@link CreateModeratorPINRequest }
     */
    public CreateModeratorPINRequest createCreateModeratorPINRequest() {
        return new CreateModeratorPINRequest();
    }

    /**
     * Create an instance of {@link CreateModeratorPINResponse }
     * 
     * @return
     *     the new instance of {@link CreateModeratorPINResponse }
     */
    public CreateModeratorPINResponse createCreateModeratorPINResponse() {
        return new CreateModeratorPINResponse();
    }

    /**
     * Create an instance of {@link RemoveModeratorPINRequest }
     * 
     * @return
     *     the new instance of {@link RemoveModeratorPINRequest }
     */
    public RemoveModeratorPINRequest createRemoveModeratorPINRequest() {
        return new RemoveModeratorPINRequest();
    }

    /**
     * Create an instance of {@link RemoveModeratorPINResponse }
     * 
     * @return
     *     the new instance of {@link RemoveModeratorPINResponse }
     */
    public RemoveModeratorPINResponse createRemoveModeratorPINResponse() {
        return new RemoveModeratorPINResponse();
    }

    /**
     * Create an instance of {@link GetConferenceIDRequest }
     * 
     * @return
     *     the new instance of {@link GetConferenceIDRequest }
     */
    public GetConferenceIDRequest createGetConferenceIDRequest() {
        return new GetConferenceIDRequest();
    }

    /**
     * Create an instance of {@link GetConferenceIDResponse }
     * 
     * @return
     *     the new instance of {@link GetConferenceIDResponse }
     */
    public GetConferenceIDResponse createGetConferenceIDResponse() {
        return new GetConferenceIDResponse();
    }

    /**
     * Create an instance of {@link GenerateAuthTokenRequest }
     * 
     * @return
     *     the new instance of {@link GenerateAuthTokenRequest }
     */
    public GenerateAuthTokenRequest createGenerateAuthTokenRequest() {
        return new GenerateAuthTokenRequest();
    }

    /**
     * Create an instance of {@link GenerateAuthTokenResponse }
     * 
     * @return
     *     the new instance of {@link GenerateAuthTokenResponse }
     */
    public GenerateAuthTokenResponse createGenerateAuthTokenResponse() {
        return new GenerateAuthTokenResponse();
    }

    /**
     * Create an instance of {@link CreateScheduledRoomRequest }
     * 
     * @return
     *     the new instance of {@link CreateScheduledRoomRequest }
     */
    public CreateScheduledRoomRequest createCreateScheduledRoomRequest() {
        return new CreateScheduledRoomRequest();
    }

    /**
     * Create an instance of {@link CreateScheduledRoomResponse }
     * 
     * @return
     *     the new instance of {@link CreateScheduledRoomResponse }
     */
    public CreateScheduledRoomResponse createCreateScheduledRoomResponse() {
        return new CreateScheduledRoomResponse();
    }

    /**
     * Create an instance of {@link CreateTestcallRoomResponse }
     * 
     * @return
     *     the new instance of {@link CreateTestcallRoomResponse }
     */
    public CreateTestcallRoomResponse createCreateTestcallRoomResponse() {
        return new CreateTestcallRoomResponse();
    }

    /**
     * Create an instance of {@link DeleteScheduledRoomRequest }
     * 
     * @return
     *     the new instance of {@link DeleteScheduledRoomRequest }
     */
    public DeleteScheduledRoomRequest createDeleteScheduledRoomRequest() {
        return new DeleteScheduledRoomRequest();
    }

    /**
     * Create an instance of {@link DeleteScheduledRoomResponse }
     * 
     * @return
     *     the new instance of {@link DeleteScheduledRoomResponse }
     */
    public DeleteScheduledRoomResponse createDeleteScheduledRoomResponse() {
        return new DeleteScheduledRoomResponse();
    }

    /**
     * Create an instance of {@link CreatePublicRoomRequest }
     * 
     * @return
     *     the new instance of {@link CreatePublicRoomRequest }
     */
    public CreatePublicRoomRequest createCreatePublicRoomRequest() {
        return new CreatePublicRoomRequest();
    }

    /**
     * Create an instance of {@link CreatePublicRoomResponse }
     * 
     * @return
     *     the new instance of {@link CreatePublicRoomResponse }
     */
    public CreatePublicRoomResponse createCreatePublicRoomResponse() {
        return new CreatePublicRoomResponse();
    }

    /**
     * Create an instance of {@link UpdatePublicRoomDescriptionRequest }
     * 
     * @return
     *     the new instance of {@link UpdatePublicRoomDescriptionRequest }
     */
    public UpdatePublicRoomDescriptionRequest createUpdatePublicRoomDescriptionRequest() {
        return new UpdatePublicRoomDescriptionRequest();
    }

    /**
     * Create an instance of {@link UpdatePublicRoomDescriptionResponse }
     * 
     * @return
     *     the new instance of {@link UpdatePublicRoomDescriptionResponse }
     */
    public UpdatePublicRoomDescriptionResponse createUpdatePublicRoomDescriptionResponse() {
        return new UpdatePublicRoomDescriptionResponse();
    }

    /**
     * Create an instance of {@link PortalFeature }
     * 
     * @return
     *     the new instance of {@link PortalFeature }
     */
    public PortalFeature createPortalFeature() {
        return new PortalFeature();
    }

    /**
     * Create an instance of {@link GetPortalFeaturesResponse }
     * 
     * @return
     *     the new instance of {@link GetPortalFeaturesResponse }
     */
    public GetPortalFeaturesResponse createGetPortalFeaturesResponse() {
        return new GetPortalFeaturesResponse();
    }

    /**
     * Create an instance of {@link EndpointFeature }
     * 
     * @return
     *     the new instance of {@link EndpointFeature }
     */
    public EndpointFeature createEndpointFeature() {
        return new EndpointFeature();
    }

    /**
     * Create an instance of {@link SetEndpointDetailsRequest }
     * 
     * @return
     *     the new instance of {@link SetEndpointDetailsRequest }
     */
    public SetEndpointDetailsRequest createSetEndpointDetailsRequest() {
        return new SetEndpointDetailsRequest();
    }

    /**
     * Create an instance of {@link SetEndpointDetailsResponse }
     * 
     * @return
     *     the new instance of {@link SetEndpointDetailsResponse }
     */
    public SetEndpointDetailsResponse createSetEndpointDetailsResponse() {
        return new SetEndpointDetailsResponse();
    }

    /**
     * Create an instance of {@link GetActiveSessionsResponse }
     * 
     * @return
     *     the new instance of {@link GetActiveSessionsResponse }
     */
    public GetActiveSessionsResponse createGetActiveSessionsResponse() {
        return new GetActiveSessionsResponse();
    }

    /**
     * Create an instance of {@link LogoutAllOtherSessionsResponse }
     * 
     * @return
     *     the new instance of {@link LogoutAllOtherSessionsResponse }
     */
    public LogoutAllOtherSessionsResponse createLogoutAllOtherSessionsResponse() {
        return new LogoutAllOtherSessionsResponse();
    }

    /**
     * Create an instance of {@link DisconnectConferenceAllRequest }
     * 
     * @return
     *     the new instance of {@link DisconnectConferenceAllRequest }
     */
    public DisconnectConferenceAllRequest createDisconnectConferenceAllRequest() {
        return new DisconnectConferenceAllRequest();
    }

    /**
     * Create an instance of {@link DisconnectConferenceAllResponse }
     * 
     * @return
     *     the new instance of {@link DisconnectConferenceAllResponse }
     */
    public DisconnectConferenceAllResponse createDisconnectConferenceAllResponse() {
        return new DisconnectConferenceAllResponse();
    }

    /**
     * Create an instance of {@link MuteAudioServerAllRequest }
     * 
     * @return
     *     the new instance of {@link MuteAudioServerAllRequest }
     */
    public MuteAudioServerAllRequest createMuteAudioServerAllRequest() {
        return new MuteAudioServerAllRequest();
    }

    /**
     * Create an instance of {@link MuteAudioServerAllResponse }
     * 
     * @return
     *     the new instance of {@link MuteAudioServerAllResponse }
     */
    public MuteAudioServerAllResponse createMuteAudioServerAllResponse() {
        return new MuteAudioServerAllResponse();
    }

    /**
     * Create an instance of {@link MuteAudioClientAllRequest }
     * 
     * @return
     *     the new instance of {@link MuteAudioClientAllRequest }
     */
    public MuteAudioClientAllRequest createMuteAudioClientAllRequest() {
        return new MuteAudioClientAllRequest();
    }

    /**
     * Create an instance of {@link MuteAudioClientAllResponse }
     * 
     * @return
     *     the new instance of {@link MuteAudioClientAllResponse }
     */
    public MuteAudioClientAllResponse createMuteAudioClientAllResponse() {
        return new MuteAudioClientAllResponse();
    }

    /**
     * Create an instance of {@link MuteVideoServerAllRequest }
     * 
     * @return
     *     the new instance of {@link MuteVideoServerAllRequest }
     */
    public MuteVideoServerAllRequest createMuteVideoServerAllRequest() {
        return new MuteVideoServerAllRequest();
    }

    /**
     * Create an instance of {@link MuteVideoServerAllResponse }
     * 
     * @return
     *     the new instance of {@link MuteVideoServerAllResponse }
     */
    public MuteVideoServerAllResponse createMuteVideoServerAllResponse() {
        return new MuteVideoServerAllResponse();
    }

    /**
     * Create an instance of {@link MuteVideoClientAllRequest }
     * 
     * @return
     *     the new instance of {@link MuteVideoClientAllRequest }
     */
    public MuteVideoClientAllRequest createMuteVideoClientAllRequest() {
        return new MuteVideoClientAllRequest();
    }

    /**
     * Create an instance of {@link MuteVideoClientAllResponse }
     * 
     * @return
     *     the new instance of {@link MuteVideoClientAllResponse }
     */
    public MuteVideoClientAllResponse createMuteVideoClientAllResponse() {
        return new MuteVideoClientAllResponse();
    }

    /**
     * Create an instance of {@link OnetimeAccessResponse }
     * 
     * @return
     *     the new instance of {@link OnetimeAccessResponse }
     */
    public OnetimeAccessResponse createOnetimeAccessResponse() {
        return new OnetimeAccessResponse();
    }

    /**
     * Create an instance of {@link RoomAccessOption }
     * 
     * @return
     *     the new instance of {@link RoomAccessOption }
     */
    public RoomAccessOption createRoomAccessOption() {
        return new RoomAccessOption();
    }

    /**
     * Create an instance of {@link RoomAccessOptionsRequest }
     * 
     * @return
     *     the new instance of {@link RoomAccessOptionsRequest }
     */
    public RoomAccessOptionsRequest createRoomAccessOptionsRequest() {
        return new RoomAccessOptionsRequest();
    }

    /**
     * Create an instance of {@link RoomAccessOptionsResponse }
     * 
     * @return
     *     the new instance of {@link RoomAccessOptionsResponse }
     */
    public RoomAccessOptionsResponse createRoomAccessOptionsResponse() {
        return new RoomAccessOptionsResponse();
    }

    /**
     * Create an instance of {@link PortalPrefixResponse }
     * 
     * @return
     *     the new instance of {@link PortalPrefixResponse }
     */
    public PortalPrefixResponse createPortalPrefixResponse() {
        return new PortalPrefixResponse();
    }

    /**
     * Create an instance of {@link PrefixNotConfiguredFault }
     * 
     * @return
     *     the new instance of {@link PrefixNotConfiguredFault }
     */
    public PrefixNotConfiguredFault createPrefixNotConfiguredFault() {
        return new PrefixNotConfiguredFault();
    }

    /**
     * Create an instance of {@link GetLoginAndWelcomeBannerRequest }
     * 
     * @return
     *     the new instance of {@link GetLoginAndWelcomeBannerRequest }
     */
    public GetLoginAndWelcomeBannerRequest createGetLoginAndWelcomeBannerRequest() {
        return new GetLoginAndWelcomeBannerRequest();
    }

    /**
     * Create an instance of {@link GetLoginAndWelcomeBannerResponse }
     * 
     * @return
     *     the new instance of {@link GetLoginAndWelcomeBannerResponse }
     */
    public GetLoginAndWelcomeBannerResponse createGetLoginAndWelcomeBannerResponse() {
        return new GetLoginAndWelcomeBannerResponse();
    }

    /**
     * Create an instance of {@link GetUserAccountTypeRequest }
     * 
     * @return
     *     the new instance of {@link GetUserAccountTypeRequest }
     */
    public GetUserAccountTypeRequest createGetUserAccountTypeRequest() {
        return new GetUserAccountTypeRequest();
    }

    /**
     * Create an instance of {@link GetUserAccountTypeResponse }
     * 
     * @return
     *     the new instance of {@link GetUserAccountTypeResponse }
     */
    public GetUserAccountTypeResponse createGetUserAccountTypeResponse() {
        return new GetUserAccountTypeResponse();
    }

    /**
     * Create an instance of {@link StartLectureModeRequest }
     * 
     * @return
     *     the new instance of {@link StartLectureModeRequest }
     */
    public StartLectureModeRequest createStartLectureModeRequest() {
        return new StartLectureModeRequest();
    }

    /**
     * Create an instance of {@link StartLectureModeResponse }
     * 
     * @return
     *     the new instance of {@link StartLectureModeResponse }
     */
    public StartLectureModeResponse createStartLectureModeResponse() {
        return new StartLectureModeResponse();
    }

    /**
     * Create an instance of {@link StopLectureModeRequest }
     * 
     * @return
     *     the new instance of {@link StopLectureModeRequest }
     */
    public StopLectureModeRequest createStopLectureModeRequest() {
        return new StopLectureModeRequest();
    }

    /**
     * Create an instance of {@link StopLectureModeResponse }
     * 
     * @return
     *     the new instance of {@link StopLectureModeResponse }
     */
    public StopLectureModeResponse createStopLectureModeResponse() {
        return new StopLectureModeResponse();
    }

    /**
     * Create an instance of {@link RaiseHandResponse }
     * 
     * @return
     *     the new instance of {@link RaiseHandResponse }
     */
    public RaiseHandResponse createRaiseHandResponse() {
        return new RaiseHandResponse();
    }

    /**
     * Create an instance of {@link UnraiseHandResponse }
     * 
     * @return
     *     the new instance of {@link UnraiseHandResponse }
     */
    public UnraiseHandResponse createUnraiseHandResponse() {
        return new UnraiseHandResponse();
    }

    /**
     * Create an instance of {@link DismissRaisedHandRequest }
     * 
     * @return
     *     the new instance of {@link DismissRaisedHandRequest }
     */
    public DismissRaisedHandRequest createDismissRaisedHandRequest() {
        return new DismissRaisedHandRequest();
    }

    /**
     * Create an instance of {@link DismissRaisedHandResponse }
     * 
     * @return
     *     the new instance of {@link DismissRaisedHandResponse }
     */
    public DismissRaisedHandResponse createDismissRaisedHandResponse() {
        return new DismissRaisedHandResponse();
    }

    /**
     * Create an instance of {@link DismissAllRaisedHandRequest }
     * 
     * @return
     *     the new instance of {@link DismissAllRaisedHandRequest }
     */
    public DismissAllRaisedHandRequest createDismissAllRaisedHandRequest() {
        return new DismissAllRaisedHandRequest();
    }

    /**
     * Create an instance of {@link DismissAllRaisedHandResponse }
     * 
     * @return
     *     the new instance of {@link DismissAllRaisedHandResponse }
     */
    public DismissAllRaisedHandResponse createDismissAllRaisedHandResponse() {
        return new DismissAllRaisedHandResponse();
    }

    /**
     * Create an instance of {@link SetPresenterRequest }
     * 
     * @return
     *     the new instance of {@link SetPresenterRequest }
     */
    public SetPresenterRequest createSetPresenterRequest() {
        return new SetPresenterRequest();
    }

    /**
     * Create an instance of {@link SetPresenterResponse }
     * 
     * @return
     *     the new instance of {@link SetPresenterResponse }
     */
    public SetPresenterResponse createSetPresenterResponse() {
        return new SetPresenterResponse();
    }

    /**
     * Create an instance of {@link RemovePresenterRequest }
     * 
     * @return
     *     the new instance of {@link RemovePresenterRequest }
     */
    public RemovePresenterRequest createRemovePresenterRequest() {
        return new RemovePresenterRequest();
    }

    /**
     * Create an instance of {@link RemovePresenterResponse }
     * 
     * @return
     *     the new instance of {@link RemovePresenterResponse }
     */
    public RemovePresenterResponse createRemovePresenterResponse() {
        return new RemovePresenterResponse();
    }

    /**
     * Create an instance of {@link GetVidyoReplayLibraryRequest }
     * 
     * @return
     *     the new instance of {@link GetVidyoReplayLibraryRequest }
     */
    public GetVidyoReplayLibraryRequest createGetVidyoReplayLibraryRequest() {
        return new GetVidyoReplayLibraryRequest();
    }

    /**
     * Create an instance of {@link GetVidyoReplayLibraryResponse }
     * 
     * @return
     *     the new instance of {@link GetVidyoReplayLibraryResponse }
     */
    public GetVidyoReplayLibraryResponse createGetVidyoReplayLibraryResponse() {
        return new GetVidyoReplayLibraryResponse();
    }

    /**
     * Create an instance of {@link WhatIsMyIPAddressRequest }
     * 
     * @return
     *     the new instance of {@link WhatIsMyIPAddressRequest }
     */
    public WhatIsMyIPAddressRequest createWhatIsMyIPAddressRequest() {
        return new WhatIsMyIPAddressRequest();
    }

    /**
     * Create an instance of {@link WhatIsMyIPAddressResponse }
     * 
     * @return
     *     the new instance of {@link WhatIsMyIPAddressResponse }
     */
    public WhatIsMyIPAddressResponse createWhatIsMyIPAddressResponse() {
        return new WhatIsMyIPAddressResponse();
    }

    /**
     * Create an instance of {@link GetChangePasswordHtmlUrlWithTokenRequest }
     * 
     * @return
     *     the new instance of {@link GetChangePasswordHtmlUrlWithTokenRequest }
     */
    public GetChangePasswordHtmlUrlWithTokenRequest createGetChangePasswordHtmlUrlWithTokenRequest() {
        return new GetChangePasswordHtmlUrlWithTokenRequest();
    }

    /**
     * Create an instance of {@link GetChangePasswordHtmlUrlWithTokenResponse }
     * 
     * @return
     *     the new instance of {@link GetChangePasswordHtmlUrlWithTokenResponse }
     */
    public GetChangePasswordHtmlUrlWithTokenResponse createGetChangePasswordHtmlUrlWithTokenResponse() {
        return new GetChangePasswordHtmlUrlWithTokenResponse();
    }

    /**
     * Create an instance of {@link GetPINLengthRangeRequest }
     * 
     * @return
     *     the new instance of {@link GetPINLengthRangeRequest }
     */
    public GetPINLengthRangeRequest createGetPINLengthRangeRequest() {
        return new GetPINLengthRangeRequest();
    }

    /**
     * Create an instance of {@link GetPINLengthRangeResponse }
     * 
     * @return
     *     the new instance of {@link GetPINLengthRangeResponse }
     */
    public GetPINLengthRangeResponse createGetPINLengthRangeResponse() {
        return new GetPINLengthRangeResponse();
    }

    /**
     * Create an instance of {@link SilenceSpeakerServerType }
     * 
     * @return
     *     the new instance of {@link SilenceSpeakerServerType }
     */
    public SilenceSpeakerServerType createSilenceSpeakerServerType() {
        return new SilenceSpeakerServerType();
    }

    /**
     * Create an instance of {@link GetLogAggregationServerRequest }
     * 
     * @return
     *     the new instance of {@link GetLogAggregationServerRequest }
     */
    public GetLogAggregationServerRequest createGetLogAggregationServerRequest() {
        return new GetLogAggregationServerRequest();
    }

    /**
     * Create an instance of {@link GetLogAggregationServerResponse }
     * 
     * @return
     *     the new instance of {@link GetLogAggregationServerResponse }
     */
    public GetLogAggregationServerResponse createGetLogAggregationServerResponse() {
        return new GetLogAggregationServerResponse();
    }

    /**
     * Create an instance of {@link ParticipantStatusResponse }
     * 
     * @return
     *     the new instance of {@link ParticipantStatusResponse }
     */
    public ParticipantStatusResponse createParticipantStatusResponse() {
        return new ParticipantStatusResponse();
    }

    /**
     * Create an instance of {@link ParticipantStatus }
     * 
     * @return
     *     the new instance of {@link ParticipantStatus }
     */
    public ParticipantStatus createParticipantStatus() {
        return new ParticipantStatus();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "ClientType")
    public JAXBElement<String> createClientType(String value) {
        return new JAXBElement<>(_ClientType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "OK")
    public JAXBElement<String> createOK(String value) {
        return new JAXBElement<>(_OK_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "ErrorMessage")
    public JAXBElement<String> createErrorMessage(String value) {
        return new JAXBElement<>(_ErrorMessage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "RetryAfter")
    public JAXBElement<Integer> createRetryAfter(Integer value) {
        return new JAXBElement<>(_RetryAfter_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "Language")
    public JAXBElement<String> createLanguage(String value) {
        return new JAXBElement<>(_Language_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "EntityType")
    public JAXBElement<String> createEntityType(String value) {
        return new JAXBElement<>(_EntityType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "MemberMode")
    public JAXBElement<String> createMemberMode(String value) {
        return new JAXBElement<>(_MemberMode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "MemberStatus")
    public JAXBElement<String> createMemberStatus(String value) {
        return new JAXBElement<>(_MemberStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "RoomStatus")
    public JAXBElement<String> createRoomStatus(String value) {
        return new JAXBElement<>(_RoomStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "GetRoomProfilesRequest")
    public JAXBElement<Object> createGetRoomProfilesRequest(Object value) {
        return new JAXBElement<>(_GetRoomProfilesRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "CreateTestcallRoomRequest")
    public JAXBElement<Object> createCreateTestcallRoomRequest(Object value) {
        return new JAXBElement<>(_CreateTestcallRoomRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "GetPortalFeaturesRequest")
    public JAXBElement<Object> createGetPortalFeaturesRequest(Object value) {
        return new JAXBElement<>(_GetPortalFeaturesRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "GetActiveSessionsRequest")
    public JAXBElement<Object> createGetActiveSessionsRequest(Object value) {
        return new JAXBElement<>(_GetActiveSessionsRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "LogoutAllOtherSessionsRequest")
    public JAXBElement<Object> createLogoutAllOtherSessionsRequest(Object value) {
        return new JAXBElement<>(_LogoutAllOtherSessionsRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "OnetimeAccessRequest")
    public JAXBElement<Object> createOnetimeAccessRequest(Object value) {
        return new JAXBElement<>(_OnetimeAccessRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "PortalPrefixRequest")
    public JAXBElement<Object> createPortalPrefixRequest(Object value) {
        return new JAXBElement<>(_PortalPrefixRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "RaiseHandRequest")
    public JAXBElement<Object> createRaiseHandRequest(Object value) {
        return new JAXBElement<>(_RaiseHandRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "UnraiseHandRequest")
    public JAXBElement<Object> createUnraiseHandRequest(Object value) {
        return new JAXBElement<>(_UnraiseHandRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SilenceSpeakerServerType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SilenceSpeakerServerType }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "SilenceSpeakerServerRequest")
    public JAXBElement<SilenceSpeakerServerType> createSilenceSpeakerServerRequest(SilenceSpeakerServerType value) {
        return new JAXBElement<>(_SilenceSpeakerServerRequest_QNAME, SilenceSpeakerServerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SilenceSpeakerServerType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SilenceSpeakerServerType }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "SilenceSpeakerServerResponse")
    public JAXBElement<SilenceSpeakerServerType> createSilenceSpeakerServerResponse(SilenceSpeakerServerType value) {
        return new JAXBElement<>(_SilenceSpeakerServerResponse_QNAME, SilenceSpeakerServerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SilenceSpeakerServerType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SilenceSpeakerServerType }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "SilenceSpeakerServerAllRequest")
    public JAXBElement<SilenceSpeakerServerType> createSilenceSpeakerServerAllRequest(SilenceSpeakerServerType value) {
        return new JAXBElement<>(_SilenceSpeakerServerAllRequest_QNAME, SilenceSpeakerServerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SilenceSpeakerServerType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SilenceSpeakerServerType }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "SilenceSpeakerServerAllResponse")
    public JAXBElement<SilenceSpeakerServerType> createSilenceSpeakerServerAllResponse(SilenceSpeakerServerType value) {
        return new JAXBElement<>(_SilenceSpeakerServerAllResponse_QNAME, SilenceSpeakerServerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "roomURL", scope = RoomMode.class)
    public JAXBElement<String> createRoomModeRoomURL(String value) {
        return new JAXBElement<>(_RoomModeRoomURL_QNAME, String.class, RoomMode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "roomPIN", scope = RoomMode.class)
    public JAXBElement<String> createRoomModeRoomPIN(String value) {
        return new JAXBElement<>(_RoomModeRoomPIN_QNAME, String.class, RoomMode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "hasModeratorPIN", scope = RoomMode.class)
    public JAXBElement<Boolean> createRoomModeHasModeratorPIN(Boolean value) {
        return new JAXBElement<>(_RoomModeHasModeratorPIN_QNAME, Boolean.class, RoomMode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "moderatorPIN", scope = RoomMode.class)
    public JAXBElement<String> createRoomModeModeratorPIN(String value) {
        return new JAXBElement<>(_RoomModeModeratorPIN_QNAME, String.class, RoomMode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "start", scope = Filter.class)
    public JAXBElement<Integer> createFilterStart(Integer value) {
        return new JAXBElement<>(_FilterStart_QNAME, Integer.class, Filter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "limit", scope = Filter.class)
    public JAXBElement<Integer> createFilterLimit(Integer value) {
        return new JAXBElement<>(_FilterLimit_QNAME, Integer.class, Filter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "sortBy", scope = Filter.class)
    public JAXBElement<String> createFilterSortBy(String value) {
        return new JAXBElement<>(_FilterSortBy_QNAME, String.class, Filter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortDir }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SortDir }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "dir", scope = Filter.class)
    public JAXBElement<SortDir> createFilterDir(SortDir value) {
        return new JAXBElement<>(_FilterDir_QNAME, SortDir.class, Filter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "query", scope = Filter.class)
    public JAXBElement<String> createFilterQuery(String value) {
        return new JAXBElement<>(_FilterQuery_QNAME, String.class, Filter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "participantID", scope = Entity.class)
    public JAXBElement<String> createEntityParticipantID(String value) {
        return new JAXBElement<>(_EntityParticipantID_QNAME, String.class, Entity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "ownerID", scope = Entity.class)
    public JAXBElement<String> createEntityOwnerID(String value) {
        return new JAXBElement<>(_EntityOwnerID_QNAME, String.class, Entity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "emailAddress", scope = Entity.class)
    public JAXBElement<String> createEntityEmailAddress(String value) {
        return new JAXBElement<>(_EntityEmailAddress_QNAME, String.class, Entity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "tenant", scope = Entity.class)
    public JAXBElement<String> createEntityTenant(String value) {
        return new JAXBElement<>(_EntityTenant_QNAME, String.class, Entity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "audio", scope = Entity.class)
    public JAXBElement<Boolean> createEntityAudio(Boolean value) {
        return new JAXBElement<>(_EntityAudio_QNAME, Boolean.class, Entity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "video", scope = Entity.class)
    public JAXBElement<Boolean> createEntityVideo(Boolean value) {
        return new JAXBElement<>(_EntityVideo_QNAME, Boolean.class, Entity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "audioSilenced", scope = Entity.class)
    public JAXBElement<Boolean> createEntityAudioSilenced(Boolean value) {
        return new JAXBElement<>(_EntityAudioSilenced_QNAME, Boolean.class, Entity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "videoSilenced", scope = Entity.class)
    public JAXBElement<Boolean> createEntityVideoSilenced(Boolean value) {
        return new JAXBElement<>(_EntityVideoSilenced_QNAME, Boolean.class, Entity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "appshare", scope = Entity.class)
    public JAXBElement<Boolean> createEntityAppshare(Boolean value) {
        return new JAXBElement<>(_EntityAppshare_QNAME, Boolean.class, Entity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "phone1", scope = Entity.class)
    public JAXBElement<String> createEntityPhone1(String value) {
        return new JAXBElement<>(_EntityPhone1_QNAME, String.class, Entity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "phone2", scope = Entity.class)
    public JAXBElement<String> createEntityPhone2(String value) {
        return new JAXBElement<>(_EntityPhone2_QNAME, String.class, Entity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "phone3", scope = Entity.class)
    public JAXBElement<String> createEntityPhone3(String value) {
        return new JAXBElement<>(_EntityPhone3_QNAME, String.class, Entity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "department", scope = Entity.class)
    public JAXBElement<String> createEntityDepartment(String value) {
        return new JAXBElement<>(_EntityDepartment_QNAME, String.class, Entity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "title", scope = Entity.class)
    public JAXBElement<String> createEntityTitle(String value) {
        return new JAXBElement<>(_EntityTitle_QNAME, String.class, Entity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "instantMessagerID", scope = Entity.class)
    public JAXBElement<String> createEntityInstantMessagerID(String value) {
        return new JAXBElement<>(_EntityInstantMessagerID_QNAME, String.class, Entity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "location", scope = Entity.class)
    public JAXBElement<String> createEntityLocation(String value) {
        return new JAXBElement<>(_EntityLocation_QNAME, String.class, Entity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "thumbnailUpdateTime", scope = Entity.class)
    public JAXBElement<XMLGregorianCalendar> createEntityThumbnailUpdateTime(XMLGregorianCalendar value) {
        return new JAXBElement<>(_EntityThumbnailUpdateTime_QNAME, XMLGregorianCalendar.class, Entity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "participantID", scope = EntityDetails.class)
    public JAXBElement<String> createEntityDetailsParticipantID(String value) {
        return new JAXBElement<>(_EntityParticipantID_QNAME, String.class, EntityDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "ownerID", scope = EntityDetails.class)
    public JAXBElement<String> createEntityDetailsOwnerID(String value) {
        return new JAXBElement<>(_EntityOwnerID_QNAME, String.class, EntityDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "emailAddress", scope = EntityDetails.class)
    public JAXBElement<String> createEntityDetailsEmailAddress(String value) {
        return new JAXBElement<>(_EntityEmailAddress_QNAME, String.class, EntityDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "tenant", scope = EntityDetails.class)
    public JAXBElement<String> createEntityDetailsTenant(String value) {
        return new JAXBElement<>(_EntityTenant_QNAME, String.class, EntityDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "audio", scope = EntityDetails.class)
    public JAXBElement<Boolean> createEntityDetailsAudio(Boolean value) {
        return new JAXBElement<>(_EntityAudio_QNAME, Boolean.class, EntityDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "video", scope = EntityDetails.class)
    public JAXBElement<Boolean> createEntityDetailsVideo(Boolean value) {
        return new JAXBElement<>(_EntityVideo_QNAME, Boolean.class, EntityDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "appshare", scope = EntityDetails.class)
    public JAXBElement<Boolean> createEntityDetailsAppshare(Boolean value) {
        return new JAXBElement<>(_EntityAppshare_QNAME, Boolean.class, EntityDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "phone1", scope = EntityDetails.class)
    public JAXBElement<String> createEntityDetailsPhone1(String value) {
        return new JAXBElement<>(_EntityPhone1_QNAME, String.class, EntityDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "phone2", scope = EntityDetails.class)
    public JAXBElement<String> createEntityDetailsPhone2(String value) {
        return new JAXBElement<>(_EntityPhone2_QNAME, String.class, EntityDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "phone3", scope = EntityDetails.class)
    public JAXBElement<String> createEntityDetailsPhone3(String value) {
        return new JAXBElement<>(_EntityPhone3_QNAME, String.class, EntityDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "department", scope = EntityDetails.class)
    public JAXBElement<String> createEntityDetailsDepartment(String value) {
        return new JAXBElement<>(_EntityDepartment_QNAME, String.class, EntityDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "title", scope = EntityDetails.class)
    public JAXBElement<String> createEntityDetailsTitle(String value) {
        return new JAXBElement<>(_EntityTitle_QNAME, String.class, EntityDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "instantMessagerID", scope = EntityDetails.class)
    public JAXBElement<String> createEntityDetailsInstantMessagerID(String value) {
        return new JAXBElement<>(_EntityInstantMessagerID_QNAME, String.class, EntityDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "location", scope = EntityDetails.class)
    public JAXBElement<String> createEntityDetailsLocation(String value) {
        return new JAXBElement<>(_EntityLocation_QNAME, String.class, EntityDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "thumbnailUpdateTime", scope = EntityDetails.class)
    public JAXBElement<XMLGregorianCalendar> createEntityDetailsThumbnailUpdateTime(XMLGregorianCalendar value) {
        return new JAXBElement<>(_EntityThumbnailUpdateTime_QNAME, XMLGregorianCalendar.class, EntityDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "phone1", scope = Member.class)
    public JAXBElement<String> createMemberPhone1(String value) {
        return new JAXBElement<>(_EntityPhone1_QNAME, String.class, Member.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "phone2", scope = Member.class)
    public JAXBElement<String> createMemberPhone2(String value) {
        return new JAXBElement<>(_EntityPhone2_QNAME, String.class, Member.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "phone3", scope = Member.class)
    public JAXBElement<String> createMemberPhone3(String value) {
        return new JAXBElement<>(_EntityPhone3_QNAME, String.class, Member.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "department", scope = Member.class)
    public JAXBElement<String> createMemberDepartment(String value) {
        return new JAXBElement<>(_EntityDepartment_QNAME, String.class, Member.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "title", scope = Member.class)
    public JAXBElement<String> createMemberTitle(String value) {
        return new JAXBElement<>(_EntityTitle_QNAME, String.class, Member.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "instantMessagerID", scope = Member.class)
    public JAXBElement<String> createMemberInstantMessagerID(String value) {
        return new JAXBElement<>(_EntityInstantMessagerID_QNAME, String.class, Member.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "location", scope = Member.class)
    public JAXBElement<String> createMemberLocation(String value) {
        return new JAXBElement<>(_EntityLocation_QNAME, String.class, Member.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "thumbnailUpdateTime", scope = Member.class)
    public JAXBElement<XMLGregorianCalendar> createMemberThumbnailUpdateTime(XMLGregorianCalendar value) {
        return new JAXBElement<>(_EntityThumbnailUpdateTime_QNAME, XMLGregorianCalendar.class, Member.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "audio", scope = LectureModeParticipant.class)
    public JAXBElement<Boolean> createLectureModeParticipantAudio(Boolean value) {
        return new JAXBElement<>(_EntityAudio_QNAME, Boolean.class, LectureModeParticipant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "video", scope = LectureModeParticipant.class)
    public JAXBElement<Boolean> createLectureModeParticipantVideo(Boolean value) {
        return new JAXBElement<>(_EntityVideo_QNAME, Boolean.class, LectureModeParticipant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "appshare", scope = LectureModeParticipant.class)
    public JAXBElement<Boolean> createLectureModeParticipantAppshare(Boolean value) {
        return new JAXBElement<>(_EntityAppshare_QNAME, Boolean.class, LectureModeParticipant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "handRaised", scope = LectureModeParticipant.class)
    public JAXBElement<Boolean> createLectureModeParticipantHandRaised(Boolean value) {
        return new JAXBElement<>(_LectureModeParticipantHandRaised_QNAME, Boolean.class, LectureModeParticipant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "presenter", scope = LectureModeParticipant.class)
    public JAXBElement<Boolean> createLectureModeParticipantPresenter(Boolean value) {
        return new JAXBElement<>(_LectureModeParticipantPresenter_QNAME, Boolean.class, LectureModeParticipant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "welcomeBannerText", scope = WelcomeBannerContent.class)
    public JAXBElement<String> createWelcomeBannerContentWelcomeBannerText(String value) {
        return new JAXBElement<>(_WelcomeBannerContentWelcomeBannerText_QNAME, String.class, WelcomeBannerContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "endpointGuid", scope = LogInRequest.class)
    public JAXBElement<String> createLogInRequestEndpointGuid(String value) {
        return new JAXBElement<>(_LogInRequestEndpointGuid_QNAME, String.class, LogInRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "vmaddress", scope = LogInResponse.class)
    public JAXBElement<String> createLogInResponseVmaddress(String value) {
        return new JAXBElement<>(_LogInResponseVmaddress_QNAME, String.class, LogInResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "proxyaddress", scope = LogInResponse.class)
    public JAXBElement<String> createLogInResponseProxyaddress(String value) {
        return new JAXBElement<>(_LogInResponseProxyaddress_QNAME, String.class, LogInResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "loctag", scope = LogInResponse.class)
    public JAXBElement<String> createLogInResponseLoctag(String value) {
        return new JAXBElement<>(_LogInResponseLoctag_QNAME, String.class, LogInResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "pak2", scope = LogInResponse.class)
    public JAXBElement<String> createLogInResponsePak2(String value) {
        return new JAXBElement<>(_LogInResponsePak2_QNAME, String.class, LogInResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "queryField", scope = SearchMembersRequest.class)
    public JAXBElement<String> createSearchMembersRequestQueryField(String value) {
        return new JAXBElement<>(_SearchMembersRequestQueryField_QNAME, String.class, SearchMembersRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "memberType", scope = SearchMembersRequest.class)
    public JAXBElement<String> createSearchMembersRequestMemberType(String value) {
        return new JAXBElement<>(_SearchMembersRequestMemberType_QNAME, String.class, SearchMembersRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "start", scope = SearchMembersRequest.class)
    public JAXBElement<BigInteger> createSearchMembersRequestStart(BigInteger value) {
        return new JAXBElement<>(_FilterStart_QNAME, BigInteger.class, SearchMembersRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "limit", scope = SearchMembersRequest.class)
    public JAXBElement<BigInteger> createSearchMembersRequestLimit(BigInteger value) {
        return new JAXBElement<>(_FilterLimit_QNAME, BigInteger.class, SearchMembersRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "sortBy", scope = SearchMembersRequest.class)
    public JAXBElement<String> createSearchMembersRequestSortBy(String value) {
        return new JAXBElement<>(_FilterSortBy_QNAME, String.class, SearchMembersRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortDir }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SortDir }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "sortDir", scope = SearchMembersRequest.class)
    public JAXBElement<SortDir> createSearchMembersRequestSortDir(SortDir value) {
        return new JAXBElement<>(_SearchMembersRequestSortDir_QNAME, SortDir.class, SearchMembersRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "queryField", scope = SearchRoomsRequest.class)
    public JAXBElement<String> createSearchRoomsRequestQueryField(String value) {
        return new JAXBElement<>(_SearchMembersRequestQueryField_QNAME, String.class, SearchRoomsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "roomType", scope = SearchRoomsRequest.class)
    public JAXBElement<String> createSearchRoomsRequestRoomType(String value) {
        return new JAXBElement<>(_SearchRoomsRequestRoomType_QNAME, String.class, SearchRoomsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "start", scope = SearchRoomsRequest.class)
    public JAXBElement<BigInteger> createSearchRoomsRequestStart(BigInteger value) {
        return new JAXBElement<>(_FilterStart_QNAME, BigInteger.class, SearchRoomsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "limit", scope = SearchRoomsRequest.class)
    public JAXBElement<BigInteger> createSearchRoomsRequestLimit(BigInteger value) {
        return new JAXBElement<>(_FilterLimit_QNAME, BigInteger.class, SearchRoomsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "sortBy", scope = SearchRoomsRequest.class)
    public JAXBElement<String> createSearchRoomsRequestSortBy(String value) {
        return new JAXBElement<>(_FilterSortBy_QNAME, String.class, SearchRoomsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortDir }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SortDir }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "sortDir", scope = SearchRoomsRequest.class)
    public JAXBElement<SortDir> createSearchRoomsRequestSortDir(SortDir value) {
        return new JAXBElement<>(_SearchMembersRequestSortDir_QNAME, SortDir.class, SearchRoomsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "moderatorPIN", scope = InviteToConferenceRequest.class)
    public JAXBElement<String> createInviteToConferenceRequestModeratorPIN(String value) {
        return new JAXBElement<>(_RoomModeModeratorPIN_QNAME, String.class, InviteToConferenceRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "moderatorPIN", scope = CancelOutboundCallRequest.class)
    public JAXBElement<String> createCancelOutboundCallRequestModeratorPIN(String value) {
        return new JAXBElement<>(_RoomModeModeratorPIN_QNAME, String.class, CancelOutboundCallRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "PIN", scope = JoinConferenceRequest.class)
    public JAXBElement<String> createJoinConferenceRequestPIN(String value) {
        return new JAXBElement<>(_JoinConferenceRequestPIN_QNAME, String.class, JoinConferenceRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "referenceNumber", scope = JoinConferenceRequest.class)
    public JAXBElement<String> createJoinConferenceRequestReferenceNumber(String value) {
        return new JAXBElement<>(_JoinConferenceRequestReferenceNumber_QNAME, String.class, JoinConferenceRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "PIN", scope = JoinIPCConferenceRequest.class)
    public JAXBElement<String> createJoinIPCConferenceRequestPIN(String value) {
        return new JAXBElement<>(_JoinConferenceRequestPIN_QNAME, String.class, JoinIPCConferenceRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "referenceNumber", scope = JoinIPCConferenceRequest.class)
    public JAXBElement<String> createJoinIPCConferenceRequestReferenceNumber(String value) {
        return new JAXBElement<>(_JoinConferenceRequestReferenceNumber_QNAME, String.class, JoinIPCConferenceRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "moderatorPIN", scope = GetParticipantsRequest.class)
    public JAXBElement<String> createGetParticipantsRequestModeratorPIN(String value) {
        return new JAXBElement<>(_RoomModeModeratorPIN_QNAME, String.class, GetParticipantsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "recorderID", scope = GetParticipantsResponse.class)
    public JAXBElement<Integer> createGetParticipantsResponseRecorderID(Integer value) {
        return new JAXBElement<>(_GetParticipantsResponseRecorderID_QNAME, Integer.class, GetParticipantsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "recorderName", scope = GetParticipantsResponse.class)
    public JAXBElement<String> createGetParticipantsResponseRecorderName(String value) {
        return new JAXBElement<>(_GetParticipantsResponseRecorderName_QNAME, String.class, GetParticipantsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "paused", scope = GetParticipantsResponse.class)
    public JAXBElement<Boolean> createGetParticipantsResponsePaused(Boolean value) {
        return new JAXBElement<>(_GetParticipantsResponsePaused_QNAME, Boolean.class, GetParticipantsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "webcast", scope = GetParticipantsResponse.class)
    public JAXBElement<Boolean> createGetParticipantsResponseWebcast(Boolean value) {
        return new JAXBElement<>(_GetParticipantsResponseWebcast_QNAME, Boolean.class, GetParticipantsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "moderatorPIN", scope = GetLectureModeParticipantsRequest.class)
    public JAXBElement<String> createGetLectureModeParticipantsRequestModeratorPIN(String value) {
        return new JAXBElement<>(_RoomModeModeratorPIN_QNAME, String.class, GetLectureModeParticipantsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "recorderID", scope = GetLectureModeParticipantsResponse.class)
    public JAXBElement<Integer> createGetLectureModeParticipantsResponseRecorderID(Integer value) {
        return new JAXBElement<>(_GetParticipantsResponseRecorderID_QNAME, Integer.class, GetLectureModeParticipantsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "recorderName", scope = GetLectureModeParticipantsResponse.class)
    public JAXBElement<String> createGetLectureModeParticipantsResponseRecorderName(String value) {
        return new JAXBElement<>(_GetParticipantsResponseRecorderName_QNAME, String.class, GetLectureModeParticipantsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "paused", scope = GetLectureModeParticipantsResponse.class)
    public JAXBElement<Boolean> createGetLectureModeParticipantsResponsePaused(Boolean value) {
        return new JAXBElement<>(_GetParticipantsResponsePaused_QNAME, Boolean.class, GetLectureModeParticipantsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "webcast", scope = GetLectureModeParticipantsResponse.class)
    public JAXBElement<Boolean> createGetLectureModeParticipantsResponseWebcast(Boolean value) {
        return new JAXBElement<>(_GetParticipantsResponseWebcast_QNAME, Boolean.class, GetLectureModeParticipantsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "lectureMode", scope = GetLectureModeParticipantsResponse.class)
    public JAXBElement<Boolean> createGetLectureModeParticipantsResponseLectureMode(Boolean value) {
        return new JAXBElement<>(_GetLectureModeParticipantsResponseLectureMode_QNAME, Boolean.class, GetLectureModeParticipantsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "moderatorPIN", scope = LeaveConferenceRequest.class)
    public JAXBElement<String> createLeaveConferenceRequestModeratorPIN(String value) {
        return new JAXBElement<>(_RoomModeModeratorPIN_QNAME, String.class, LeaveConferenceRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "moderatorPIN", scope = MuteAudioRequest.class)
    public JAXBElement<String> createMuteAudioRequestModeratorPIN(String value) {
        return new JAXBElement<>(_RoomModeModeratorPIN_QNAME, String.class, MuteAudioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "moderatorPIN", scope = MuteAudioLocalRequest.class)
    public JAXBElement<String> createMuteAudioLocalRequestModeratorPIN(String value) {
        return new JAXBElement<>(_RoomModeModeratorPIN_QNAME, String.class, MuteAudioLocalRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "moderatorPIN", scope = MuteVideoRequest.class)
    public JAXBElement<String> createMuteVideoRequestModeratorPIN(String value) {
        return new JAXBElement<>(_RoomModeModeratorPIN_QNAME, String.class, MuteVideoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "moderatorPIN", scope = UnmuteAudioRequest.class)
    public JAXBElement<String> createUnmuteAudioRequestModeratorPIN(String value) {
        return new JAXBElement<>(_RoomModeModeratorPIN_QNAME, String.class, UnmuteAudioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "moderatorPIN", scope = StartVideoRequest.class)
    public JAXBElement<String> createStartVideoRequestModeratorPIN(String value) {
        return new JAXBElement<>(_RoomModeModeratorPIN_QNAME, String.class, StartVideoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "moderatorPIN", scope = StopVideoRequest.class)
    public JAXBElement<String> createStopVideoRequestModeratorPIN(String value) {
        return new JAXBElement<>(_RoomModeModeratorPIN_QNAME, String.class, StopVideoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "moderatorPIN", scope = LockRoomRequest.class)
    public JAXBElement<String> createLockRoomRequestModeratorPIN(String value) {
        return new JAXBElement<>(_RoomModeModeratorPIN_QNAME, String.class, LockRoomRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "moderatorPIN", scope = UnlockRoomRequest.class)
    public JAXBElement<String> createUnlockRoomRequestModeratorPIN(String value) {
        return new JAXBElement<>(_RoomModeModeratorPIN_QNAME, String.class, UnlockRoomRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "moderatorPIN", scope = StartRecordingRequest.class)
    public JAXBElement<String> createStartRecordingRequestModeratorPIN(String value) {
        return new JAXBElement<>(_RoomModeModeratorPIN_QNAME, String.class, StartRecordingRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "moderatorPIN", scope = PauseRecordingRequest.class)
    public JAXBElement<String> createPauseRecordingRequestModeratorPIN(String value) {
        return new JAXBElement<>(_RoomModeModeratorPIN_QNAME, String.class, PauseRecordingRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "moderatorPIN", scope = ResumeRecordingRequest.class)
    public JAXBElement<String> createResumeRecordingRequestModeratorPIN(String value) {
        return new JAXBElement<>(_RoomModeModeratorPIN_QNAME, String.class, ResumeRecordingRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "moderatorPIN", scope = StopRecordingRequest.class)
    public JAXBElement<String> createStopRecordingRequestModeratorPIN(String value) {
        return new JAXBElement<>(_RoomModeModeratorPIN_QNAME, String.class, StopRecordingRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "webCastURL", scope = GetWebcastURLResponse.class)
    public JAXBElement<String> createGetWebcastURLResponseWebCastURL(String value) {
        return new JAXBElement<>(_GetWebcastURLResponseWebCastURL_QNAME, String.class, GetWebcastURLResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "moderatorURL", scope = GetModeratorURLResponse.class)
    public JAXBElement<String> createGetModeratorURLResponseModeratorURL(String value) {
        return new JAXBElement<>(_GetModeratorURLResponseModeratorURL_QNAME, String.class, GetModeratorURLResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "conferenceID", scope = GetConferenceIDResponse.class)
    public JAXBElement<String> createGetConferenceIDResponseConferenceID(String value) {
        return new JAXBElement<>(_GetConferenceIDResponseConferenceID_QNAME, String.class, GetConferenceIDResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "moderatorPIN", scope = DisconnectConferenceAllRequest.class)
    public JAXBElement<String> createDisconnectConferenceAllRequestModeratorPIN(String value) {
        return new JAXBElement<>(_RoomModeModeratorPIN_QNAME, String.class, DisconnectConferenceAllRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "moderatorPIN", scope = MuteAudioServerAllRequest.class)
    public JAXBElement<String> createMuteAudioServerAllRequestModeratorPIN(String value) {
        return new JAXBElement<>(_RoomModeModeratorPIN_QNAME, String.class, MuteAudioServerAllRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "moderatorPIN", scope = MuteAudioClientAllRequest.class)
    public JAXBElement<String> createMuteAudioClientAllRequestModeratorPIN(String value) {
        return new JAXBElement<>(_RoomModeModeratorPIN_QNAME, String.class, MuteAudioClientAllRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "moderatorPIN", scope = MuteVideoServerAllRequest.class)
    public JAXBElement<String> createMuteVideoServerAllRequestModeratorPIN(String value) {
        return new JAXBElement<>(_RoomModeModeratorPIN_QNAME, String.class, MuteVideoServerAllRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "moderatorPIN", scope = MuteVideoClientAllRequest.class)
    public JAXBElement<String> createMuteVideoClientAllRequestModeratorPIN(String value) {
        return new JAXBElement<>(_RoomModeModeratorPIN_QNAME, String.class, MuteVideoClientAllRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "loginBannerText", scope = GetLoginAndWelcomeBannerResponse.class)
    public JAXBElement<String> createGetLoginAndWelcomeBannerResponseLoginBannerText(String value) {
        return new JAXBElement<>(_GetLoginAndWelcomeBannerResponseLoginBannerText_QNAME, String.class, GetLoginAndWelcomeBannerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "moderatorPIN", scope = StartLectureModeRequest.class)
    public JAXBElement<String> createStartLectureModeRequestModeratorPIN(String value) {
        return new JAXBElement<>(_RoomModeModeratorPIN_QNAME, String.class, StartLectureModeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "moderatorPIN", scope = StopLectureModeRequest.class)
    public JAXBElement<String> createStopLectureModeRequestModeratorPIN(String value) {
        return new JAXBElement<>(_RoomModeModeratorPIN_QNAME, String.class, StopLectureModeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "moderatorPIN", scope = DismissRaisedHandRequest.class)
    public JAXBElement<String> createDismissRaisedHandRequestModeratorPIN(String value) {
        return new JAXBElement<>(_RoomModeModeratorPIN_QNAME, String.class, DismissRaisedHandRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "moderatorPIN", scope = DismissAllRaisedHandRequest.class)
    public JAXBElement<String> createDismissAllRaisedHandRequestModeratorPIN(String value) {
        return new JAXBElement<>(_RoomModeModeratorPIN_QNAME, String.class, DismissAllRaisedHandRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "moderatorPIN", scope = SetPresenterRequest.class)
    public JAXBElement<String> createSetPresenterRequestModeratorPIN(String value) {
        return new JAXBElement<>(_RoomModeModeratorPIN_QNAME, String.class, SetPresenterRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "moderatorPIN", scope = RemovePresenterRequest.class)
    public JAXBElement<String> createRemovePresenterRequestModeratorPIN(String value) {
        return new JAXBElement<>(_RoomModeModeratorPIN_QNAME, String.class, RemovePresenterRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "audio", scope = ParticipantStatus.class)
    public JAXBElement<Boolean> createParticipantStatusAudio(Boolean value) {
        return new JAXBElement<>(_EntityAudio_QNAME, Boolean.class, ParticipantStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "video", scope = ParticipantStatus.class)
    public JAXBElement<Boolean> createParticipantStatusVideo(Boolean value) {
        return new JAXBElement<>(_EntityVideo_QNAME, Boolean.class, ParticipantStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://portal.vidyo.com/user/v1_1", name = "appshare", scope = ParticipantStatus.class)
    public JAXBElement<Boolean> createParticipantStatusAppshare(Boolean value) {
        return new JAXBElement<>(_EntityAppshare_QNAME, Boolean.class, ParticipantStatus.class, value);
    }

}
