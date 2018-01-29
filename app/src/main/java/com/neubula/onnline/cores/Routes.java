package com.neubula.onnline.cores;

/**
 * Created by quadri on 08/03/16.
 */
public class Routes {

    public static final String ROOT_URL = Constants.IN_PROTOCOL + Constants.BASE_URL + Constants.PREFIX_URL;

    /*
	 | ----------------------------------------------------------------------
	 | Api Notification Routes
	 | ----------------------------------------------------------------------
	 |
	 */
    public static String GET_NOTIFICATION = ROOT_URL + "/notification";
    public static String GET_DESTROY_NOTIFICATION = ROOT_URL + "/notification/{notification_id}/destroy";
	
	/*
	 | ----------------------------------------------------------------------
	 | Api Lit History Routes
	 | ----------------------------------------------------------------------
	 |
	 */
    public static String GET_HISTORY = ROOT_URL + "/history";
    public static String GET_DESTROY_HISTORY = ROOT_URL + "/history/{history_id}/destroy";

	/*
	 | ----------------------------------------------------------------------
	 | Api Feed Routes
	 | ----------------------------------------------------------------------
	 |
	 */
    public static String GET_FEED = ROOT_URL + "/feed";
    public static String GET_DESTROY_FEED = ROOT_URL + "/feed/{feed_id}/destroy";

	/*
	 | ----------------------------------------------------------------------
	 | Api Wil Routes
	 | ----------------------------------------------------------------------
	 |
	 */
    public static String GET_WIL = ROOT_URL + "/wil/{user_id}";
    public static String GET_DESTROY_WIL = ROOT_URL + "/wil/{wil_id}/destroy";

	/*
	 | ----------------------------------------------------------------------
	 | Api User Routes
	 | ----------------------------------------------------------------------
	 |
	 */
    public static String GET_FOLLOWER = ROOT_URL + "/user/{user_id}/follower";
    public static String GET_FOLLOWING = ROOT_URL + "/user/{user_id}/following";
    public static String GET_FOLLOW_USER = ROOT_URL + "/user/{user_id}/follow";
    public static String GET_UNFOLLOW_USER = ROOT_URL + "/user/{user_id}/unfollow";
    public static String GET_SEARCH_USER = ROOT_URL + "/user/search/{value?}";

	/*
	 | ----------------------------------------------------------------------
	 | Api Lit Routes
	 | ----------------------------------------------------------------------
	 |
	 */
    public static String GET_EXPLORE = ROOT_URL + "/lit/explore";
    public static String GET_PROFILE_LIT = ROOT_URL + "/lit/profile/{user_id}";

    public static String POST_STORE_LIT = ROOT_URL + "/lit/store";
    public static String POST_UPDATE_LIT = ROOT_URL + "/lit/update";
    public static String POST_UPDATE_LIT_IMAGE = ROOT_URL + "/lit/image/update";

    public static String GET_LIT_DESTROY = ROOT_URL + "/lit/{lit_id}/destroy";
    public static String GET_LIT_PUBLISH = ROOT_URL + "/lit/{lit_id}/publish";
    public static String GET_LIT_UNPUBLISH = ROOT_URL + "/lit/{lit_id}/unpublish";
    public static String GET_LIT_SHARE = ROOT_URL + "/lit/{lit_id}/share";
    public static String GET_LIT_REPORT_ABUSE = ROOT_URL + "/lit/{lit_id}/report/abuse";
    public static String GET_LIT_LIKE = ROOT_URL + "/lit/{lit_id}/like";
    public static String GET_LIT_UNLIKE = ROOT_URL + "/lit/{lit_id}/unlike";
    public static String GET_LIT_LIKED_USERS = ROOT_URL + "/lit/{lit_id}/like/users";
    public static String GET_LIT_TAKEN_USERS = ROOT_URL + "/lit/{lit_id}/take/users";
    public static String GET_LIT_SHARED_USERS = ROOT_URL + "/lit/{lit_id}/share/users";
    public static String GET_SEARCH_LIT = ROOT_URL + "/lit/search/{value?}";

    public static String GET_LIT = ROOT_URL + "/lit/{page}/{value?}";

	/*
	 | ----------------------------------------------------------------------
	 | Api Paper Routes
	 | ----------------------------------------------------------------------
	 |
	 */
    public static String GET_PAPER = ROOT_URL + "/paper/{lit_id}";
    public static String POST_STORE_PAPER = ROOT_URL + "/paper/store";

	/*
	 | ----------------------------------------------------------------------
	 | Api Answer Routes
	 | ----------------------------------------------------------------------
	 |
	 */
    public static String GET_ANSWER = ROOT_URL + "/answer/{lit_id}";

	/*
	 | ----------------------------------------------------------------------
	 | Api Question Routes
	 | ----------------------------------------------------------------------
	 |
	 */
    public static String GET_QUESTION = ROOT_URL + "/question/{lit_id}";
    public static String POST_STORE_QUESTION = ROOT_URL + "/question/store";
    public static String POST_UPDATE_QUESTION = ROOT_URL + "/question/update";
    public static String GET_DESTROY_QUESTION = ROOT_URL + "/question/{question_id}/destroy";

	/*
	 | ----------------------------------------------------------------------
	 | Api Edit Profile Routes
	 | ----------------------------------------------------------------------
	 |
	 */
    public static String POST_UPDATE_INFO = ROOT_URL + "/edit/info/update";
    public static String POST_UPDATE_PROFILE_PICTURE = ROOT_URL + "/edit/profile/picture/update";
    public static String POST_UPDATE_COVER = ROOT_URL + "/edit/cover/update";
    public static String POST_UPDATE_PASSWORD = ROOT_URL + "/edit/password/update";
    public static String POST_UPDATE_USERNAME = ROOT_URL + "/edit/username/update";
    public static String POST_UPDATE_SETTING = ROOT_URL + "/edit/setting/update";
    public static String POST_DESTROY_PROFILE = ROOT_URL + "/edit/profile/destroy";
	
	/*
	 | ----------------------------------------------------------------------
	 | Api Feedback Routes
	 | ----------------------------------------------------------------------
	 |
	 */
    public static String POST_STORE_FEEDBACK = ROOT_URL + "/feedback/store";
	
	/*
	 | ----------------------------------------------------------------------
	 | Api Auth Routes
	 | ----------------------------------------------------------------------
	 |
	 */
    public static String POST_LOGIN = ROOT_URL + "/auth/login";
    public static String POST_RESEND_OTP = ROOT_URL + "/auth/otp/resend";
    public static String POST_REGISTER = ROOT_URL + "/auth/register";
    public static String POST_VERIFY = ROOT_URL + "/auth/verify";
    public static String POST_SOCIAL = ROOT_URL + "/auth/social/login";
    public static String POST_RESET_EMAIL = ROOT_URL + "/auth/reset/email";
    public static String POST_RESET_SMS = ROOT_URL + "/auth/reset/sms";
    public static String POST_RESET_PASSWORD = ROOT_URL + "/auth/reset/password";

	/*
	 | ----------------------------------------------------------------------
	 | Api Sync Routes
	 | ----------------------------------------------------------------------
	 |
	 */
	public static String GET_SYNC_VERSION = ROOT_URL + "/sync/version";
}