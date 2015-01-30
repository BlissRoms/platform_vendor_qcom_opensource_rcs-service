/*
 * Copyright (c) 2014 pci-suntektech Technologies, Inc.  All Rights Reserved.
 * pci-suntektech Technologies Proprietary and Confidential.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to
 * deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 */
 
package com.suntek.mway.rcs.client.api.constant;

/**
 * The Class BroadcastContstants.
 */
public class BroadcastConstants {

    /** Text send by system SMS broadcast action */
    public static final String SYSTEM_SMS_SEND_TEXT = "com.suntek.mway.rcs.ACTION_SYSTEM_SMS_SEND";

    /** SYSTEM_SMS_SEND_TEXT broadcast passed parameter name text String. */
    public static final String BC_VAR_SMS_TEXT = "text";

    /** SYSTEM_SMS_SEND_TEXT broadcast passed parameter name time Long. */
    public static final String BC_VAR_SMS_TIME = "time";

    /** Notify UI to show message notification. */
    public static final String UI_SHOW_MESSAGE_NOTIFY = "com.suntek.mway.rcs.ACTION_UI_SHOW_MESSAGE_NOTIFY";

    /** Notify UI to refresh message. */
    public static final String UI_REFRESH_MESSAGE_LIST = "com.suntek.mway.rcs.ACTION_UI_MESSAGE_LIST_NEED_REFRESH";

    /** UI_REFRESH_MESSAGE_LIST broadcast passed parameter name isBlack int. */
    public static final String BC_VAR_MSG_BLACK_FLAG = "blackMsgFlag";

    /** Notify UI to show group message notification. */
    public static final String UI_SHOW_GROUP_MESSAGE_NOTIFY = "com.suntek.mway.rcs.ACTION_UI_SHOW_GROUP_MESSAGE_NOTIFY";

    /**
     * Notify UI that changed group information
     */
    public static final String UI_GROUP_MANAGE_NOTIFY = "com.suntek.mway.rcs.ACTION_UI_GROUP_MANAGE_NOTIFY";

    /**
     * Notify UI that group state is invalid
     * contains parameter groupId, state
     */
    public static final String UI_GROUP_STATE_ERROR = "com.suntek.mway.rcs.ACTION_UI_GROUP_STATE_ERROR";

    /** Notify UI that message status has changed */
    public static final String UI_MESSAGE_STATUS_CHANGE_NOTIFY = "com.suntek.mway.rcs.ACTION_UI_MESSAGE_STATUS_CHANGE_NOTIFY";

    /** Notify UI that message has added to database */
    public static final String UI_MESSAGE_ADD_DATABASE = "com.suntek.mway.rcs.ACTION_UI_MESSAGE_ADD_TO_DATABASE";

    /** UI_MESSAGE_ADD_DATABASE broadcast passed parameter name chatMessage long. */
    public static final String BC_VAR_CHAT_MESSAGE = "chatMessage";

    /** UI_SHOW_MESSAGE_NOTIFY broadcast passed parameter name threadId long. */
    public static final String BC_VAR_MSG_THREAD_ID = "threadId";

    /** UI_SHOW_MESSAGE_NOTIFY broadcast passed parameter name id Integer. */
    public static final String BC_VAR_ID = "id";

    /** UI_SHOW_MESSAGE_NOTIFY broadcast passed parameter name status Integer. */
    public static final String BC_VAR_MSG_STATUS = "status";

    /** UI_SHOW_MESSAGE_NOTIFY broadcast passed parameter name contact String. */
    public static final String BC_VAR_MSG_CONTACT = "contact";

    /** UI_SHOW_MESSAGE_NOTIFY broadcast passed parameter name contactName String. */
    public static final String BC_VAR_MSG_NAME = "name";

    /** UI_SHOW_MESSAGE_NOTIFY broadcast passed parameter name msgType Integer. */
    public static final String BC_VAR_MSG_TYPE = "msgType";

    /** UI_SHOW_MESSAGE_NOTIFY broadcast passed parameter name burnFlag Integer. */
    public static final String BC_VAR_BURN_FLAG = "burnFlag";

    /** UI_SHOW_MESSAGE_NOTIFY broadcast passed parameter name tickerText String. */
    public static final String BC_VAR_MSG_TICKERTEXT = "tickerText";

    /** UI_SHOW_MESSAGE_NOTIFY broadcast passed parameter name groupId String. */
    public static final String BC_VAR_MSG_GROUP_ID = "groupId";

    /**
     * UI_SHOW_MESSAGE_NOTIFY broadcast passed parameter name actionType String.
     *
     * actionType contains:
     * {@link BroadcastConstants#ACTION_TYPE_CREATE}
     * {@link BroadcastConstants#ACTION_TYPE_CREATE_NOT_ACTIVE}
     * {@link BroadcastConstants#ACTION_TYPE_CONNECTED}
     * {@link BroadcastConstants#ACTION_TYPE_DEPARTED}
     * {@link BroadcastConstants#ACTION_TYPE_BOOTED}
     * {@link BroadcastConstants#ACTION_TYPE_DELETED}
     * {@link BroadcastConstants#ACTION_TYPE_UPDATE_ALIAS}
     * {@link BroadcastConstants#ACTION_TYPE_UPDATE_CHAIRMAN}
     * {@link BroadcastConstants#ACTION_TYPE_UPDATE_REMARK}
     * {@link BroadcastConstants#ACTION_TYPE_UPDATE_SUBJECT}
     */

    public static final String BC_VAR_MSG_ACTION_TYPE = "actionType";

    /***
     * Group created
     */
    public static final String ACTION_TYPE_CREATE = "create";

    /**
     * Group create but not active
     */
    public static final String ACTION_TYPE_CREATE_NOT_ACTIVE = "create_not_active";

    /***
     * New member to join the group
     */
    public static final String ACTION_TYPE_CONNECTED = "connected";
    /**
     * Group member quit
     */
    public static final String ACTION_TYPE_DEPARTED = "departed";
    /**
     * Member has been kicked out of the group
     */
    public static final String ACTION_TYPE_BOOTED = "booted";

    /**
     * Group has disband
     */
    public static final String ACTION_TYPE_DELETED = "deleted";

    /**
     * Update the subject of group
     */
    public static final String ACTION_TYPE_UPDATE_SUBJECT = "updateSubject";

    /**
     * Update the remark of group
     */
    public static final String ACTION_TYPE_UPDATE_REMARK = "updateRemark";

    /**
     * Update the alias of group member
     */
    public static final String ACTION_TYPE_UPDATE_ALIAS = "updateAlias";

    /**
     * Update the alias of group member
     */
    public static final String ACTION_TYPE_UPDATE_CHAIRMAN = "updateChairman";

    /**
     * Update the max count of group
     */
    public static final String ACTION_TYPE_UPDATE_MAXCOUNT = "updateMaxCount";

    /**
     * Over the max count of group
     */
    public static final String ACTION_TYPE_OVER_MAXCOUNT = "overMaxCount";

    /**
     * Update the policy of group
     */
    public static final String ACTION_TYPE_POLICY_UPDATE = "updatePolicy";

    /** UI_SHOW_MESSAGE_NOTIFY broadcast passed parameter name phoneNumber String. */
    public static final String BC_VAR_MSG_PHONE = "phoneNumber";

    /** UI_SHOW_MESSAGE_NOTIFY broadcast passed parameter name displayName String. */
    public static final String BC_VAR_MSG_DISPLAY_NAME = "displayName";

    /** Update download progress broadcast. */
    public static final String UPDATE_DOWN_PROGRESS = "update_download_progress";

    /** UPDATE_DOWN_PROGRESS broadcast passed parameter name id String. */
    public static final String BC_VAR_DOWN_PRG_ID = "id";

    /** UPDATE_DOWN_PROGRESS broadcast passed parameter name progress integer. */
    public static final String BC_VAR_DOWN_PRG_PROGRESS = "progress";

    /** File transfer progress broadcast. */
    public static final String FILE_TRANSFER_PROGRESS = "ui_file_transfre_progress";

    /** UPDATE_DOWN_PROGRESS broadcast passed parameter name messageId String. */
    public static final String BC_VAR_TRANSFER_PRG_MESSAGE_ID = "messageId";

    /** UPDATE_DOWN_PROGRESS broadcast passed parameter name sessionId long. */
    public static final String BC_VAR_TRANSFER_PRG_SESSION_ID = "sessionId";

    /** UPDATE_DOWN_PROGRESS broadcast passed parameter name start long. */
    public static final String BC_VAR_TRANSFER_PRG_START = "start";

    /** UPDATE_DOWN_PROGRESS broadcast passed parameter name end long. */
    public static final String BC_VAR_TRANSFER_PRG_END = "end";

    /** UPDATE_DOWN_PROGRESS broadcast passed parameter name total long. */
    public static final String BC_VAR_TRANSFER_PRG_TOTAL = "total";

    /** Warning file is too large broadcast. */
    public static final String UI_ALERT_FILE_TOO_LARGE = "com.suntek.mway.rcs.ACTION_UI_MESSAGE_ALERT_FILE_TOO_LARGE";

    /** UI_ALERT_FILE_TOO_LARGE broadcast passed parameter name fileMaxSize String. */
    public static final String BC_VAR_FILE_MAX_SIZE = "fileMaxSizeKb";

    /** Warning File extension is not valid broadcast. */
    public static final String UI_ALERT_FILE_SUFFIX_INVALID = "com.suntek.mway.rcs.ACTION_UI_MESSAGE_ALERT_FILE_SUFFIX_INVALID";

    /** UI_ALERT_FILE_SUFFIX_INVALID broadcast passed parameter name validSuffix String. */
    public static final String BC_VAR_FILE_VALID_SUFFIX = "validSuffix";

    /** Invite users to join a group chat broadcast. */
    public static final String UI_INVITE_TO_JOIN_GROUP = "com.suntek.mway.rcs.ACTION_UI_INVITE_TO_JOIN_GROUP";

    /** UI_INVITE_TO_JOIN_GROUP broadcast passed parameter name groupId String. */
    public static final String BC_VAR_GROUP_ID = "groupId";

    /** UI_INVITE_TO_JOIN_GROUP broadcast passed parameter name subject String. */
    public static final String BC_VAR_GROUP_SUBJECT = "subject";

    /** UI_INVITE_TO_JOIN_GROUP broadcast passed parameter name remark String. */
    public static final String BC_VAR_GROUP_REMARK = "remark";

    /** UI_INVITE_TO_JOIN_GROUP broadcast passed parameter name inviteUser String. */
    public static final String BC_VAR_INVITE_USER = "inviteUser";

    /** UI_INVITE_TO_JOIN_GROUP broadcast passed parameter name chatUri String. */
    public static final String BC_VAR_CHARURI = "chatUri";

    /** UI_INVITE_TO_JOIN_GROUP broadcast passed parameter name conversationId String. */
    public static final String BC_VAR_CONVERSATION_ID = "conversationId";

    /** UI_INVITE_TO_JOIN_GROUP broadcast passed parameter name contributionId String. */
    public static final String BC_VAR_CONTRIBUTION_ID = "contributionId";

    /** UI_INVITE_TO_JOIN_GROUP broadcast passed parameter name inviteTime String. */
    public static final String BC_VAR_INVITE_TIME = "inviteTime";

    /** UI_INVITE_TO_JOIN_GROUP broadcast passed parameter name numberData String. */
    public static final String BC_VAR_NUMBER_DATA = "numberData";

    /** UI_INVITE_TO_JOIN_GROUP broadcast passed parameter name policy Integer. */
    public static final String BC_VAR_POLICY = "policy";

    /** UI_INVITE_TO_JOIN_GROUP broadcast passed parameter name alias String. */
    public static final String BC_VAR_ALIAS = "alias";

    /**
     * UI_GROUP_CHAT_MAXCOUNT_CHANGE broadcast passed parameter name maxCount String.
     */
    public static final String BC_VAR_MAXCOUNT = "maxCount";

    /**
     * Group chat element change
     */
    public static final String UI_GROUP_CHAT_SUBJECT_CHANGE = "ui_groupchat_subject_change";

    /** ************************************** send message error begin ******************************************************. */

    /**
     * UI send message error broadcast
     */
    public static final String UI_SHOW_MESSAGE_SEND_ERROR = "com.suntek.mway.rcs.ACTION_UI_SHOW_MESSAGE_SEND_ERROR";

    /**
     * Sip not registered
     */
    public static final String BC_VAR_SEND_ERROR_NOT_REG = "sip_not_register";

    /**
     * Group not exist
     */
    public static final String BC_VAR_SEND_ERROR_GROUP_NOT_EXIST = "group_not_exist";

    /**
     * Create group not complete
     */
    public static final String BC_VAR_SEND_ERROR_GROUP_NOT_COMPLETED = "group_not_completed";

    /**
     * Group has deleted
     */
    public static final String BC_VAR_SEND_ERROR_GROUP_HAS_DELETED = "group_has_deleted";

    /** ************************************** send message error end ******************************************************. */

    /** ************************************** send group refer error begin ******************************************************. */
    /**
     * UI send group refer message failed
     */
    public static final String UI_SHOW_GROUP_REFER_ERROR = "com.suntek.mway.rcs.ACTION_UI_SHOW_GROUP_REFER_ERROR";

    /**
     * UI_SHOW_GROUP_REFER_ERROR broadcast passed parameter name referType String.
     */
    public static final String BC_VAR_REFER_TYPE = "referType";

    /**
     * Send group refer type define
     */
    public static final String REFER_TYPE_INVITE = "invite";
    public static final String REFER_TYPE_SUBJECT = "updateSubject";
    public static final String REFER_TYPE_ALIAS = "setAlias";
    public static final String REFER_TYPE_TRANSFER_CHAIRMAN = "transferChairman";
    public static final String REFER_TYPE_KICKOUT = "kickout";
    public static final String REFER_TYPE_QUIT = "quit";
    public static final String REFER_TYPE_DISBAND= "disband";

    /** ************************************** send group refer error end ******************************************************. */

    /** ************************************** send composing broadcast begin ******************************************************. */
    /**
     * The broadcast of composing
     */
    public static final String UI_SHOW_COMPOSING_INFO = "com.suntek.mway.rcs.ACTION_UI_SHOW_COMPOSING_INFO";

    /**
     * UI_SHOW_COMPOSING_INFO broadcast passed parameter name state String.
     */
    public static final String BC_VAR_COMPOSE_STATE = "state";

    /**
     * UI_SHOW_COMPOSING_INFO broadcast passed parameter name contentType String.
     */
    public static final String BC_VAR_COMPOSE_CONTENTTYPE = "contentType";

    /**
     * UI_SHOW_COMPOSING_INFO broadcast passed parameter name refresh Integer.
     */
    public static final String BC_VAR_COMPOSE_REFRESH = "refresh";

    /**
     * UI_SHOW_COMPOSING_INFO broadcast passed parameter name lastActive String.
     */
    public static final String BC_VAR_COMPOSE_LASTACTIVE = "lastActive";

    /** ************************************** send composing broadcast end ******************************************************. */

    /** ************************************** send report broadcast begin ******************************************************. */
    /**
     * The broadcast of composing
     */
    public static final String UI_SHOW_RECV_REPORT_INFO = "com.suntek.mway.rcs.ACTION_UI_SHOW_RECV_REPORT_INFO";

    /**
     * UI_SHOW_RECV_REPORT_INFO broadcast passed parameter name status String.
     */
    public static final String BC_VAR_REPORT_STATUS = "status";

    /**
     * UI_SHOW_RECV_REPORT_INFO broadcast passed parameter recipient  String.
     */
    public static final String BC_VAR_REPORT_RECIPIENT = "recipient";

    /**
     * UI_SHOW_RECV_REPORT_INFO broadcast passed parameter name status String.
     */
    public static final String BC_VAR_REPORT_ORIGINAL_RECT = "original-recipient";

    /** ************************************** send report broadcast end ******************************************************. */

    /** ************************************** send group transfer chairman confirm broadcast begin ******************************************************. */
    /**
     * The broadcast of group chairman transfer confirm
     * parameter contains chaturi, subject, contributionId, conversationId
     */
    public static final String UI_SHOW_GROUP_TRANSFER_CHAIRMAN_CONFIRM = "com.suntek.mway.rcs.ACTION_UI_SHOW_GROUP_TRANSFER_CHAIRMAN_CONFIRM";

    /** ************************************** send group transfer chairman confirm broadcast end ******************************************************. */

    /** Invite to join a group chat timeout broadcast. */
    public static final String UI_JOIN_GROUP_INVITE_TIMEOUT = "com.suntek.mway.rcs.ACTION_UI_JOIN_GROUP_INVITE_TIMEOUT";

    /** ************************************** download file begin ******************************************************. */
    /**
     * broadcast of downloading file
     */
    public static final String UI_DOWNLOADING_FILE_CHANGE = "com.suntek.mway.rcs.UI_DOWNLOADING_FILE_CHANGE";

    /**
     * UI_DOWNLOADING_FILE_CHANGE broadcast passed parameter name primary key id Integer.
     */
    public static final String BC_VAR_PK_ID = "pkId";

    /**
     * UI_DOWNLOADING_FILE_CHANGE broadcast passed parameter name filepath String.
     */
    public static final String BC_VAR_FILEPATH = "filepath";

    /**
     * UI_DOWNLOADING_FILE_CHANGE broadcast passed parameter name total long.
     */
    public static final String BC_VAR_TOTAL_LEN = "total";

    /**
     * UI_DOWNLOADING_FILE_CHANGE broadcast passed parameter name current long.
     */
    public static final String BC_VAR_CURRENT_LEN = "current";


    /** ************************************** download file end ******************************************************. */

    /** ************************************** AV ******************************************************. */
    /** Notify UI to Sending call */
    public static final String UI_AV_SENDING_CALL = "ui_av_sending_call";

    /** Notify UI to Handling Incoming AV Events. */
    public static final String UI_AV_INCOMING_CALL = "com.suntek.mway.rcs.ACTION_AV_INCOMING_CALL";

    /** Notify UI to Handling AV Invite Events. */
    public static final String UI_AV_INVITE_EVENT = "ui_av_invite_event";

    /** Notify UI to Handling Restore AV Events. */
    public static final String UI_AV_RESTORE_CALL = "ui_av_restore_event";

    /** Notify UI to Prompt not register. */
    public static final String UI_AV_NOT_REGISTER = "ui_av_not_register";

    /** AV broadcast passed parameter name sessionId String. */
    public static final String BC_VAR_AV_SESSIONID = "sessionId";

    /** AV broadcast passed parameter name contact String. */
    public static final String BC_VAR_AV_CONTACT = "contact";

    /** AV broadcast passed parameter name callType String. */
    public static final String BC_VAR_AV_MEDIA_TYPE = "callType";

    /** AV broadcast passed parameter name callRecordId String. */
    public static final String BC_VAR_AV_CALLRECORDID = "callRecordId";

    /** ************************************** PUBLIC ACCOUNT ******************************************************. */
    /** Callback notification after load thumb of public account. */
    public static final String UI_PA_LOAD_THUMB = "ui_pa_load_thumb";

    /** Callback notification after load file of public account. */
    public static final String UI_PA_LOAD_FILE = "ui_pa_load_file";

    /** Public account broadcast passed parameter name messageId String. */
    public static final String BC_VAR_PA_MESSAGEID = "messageId";

    /** Public account broadcast passed parameter name eventType String. */
    public static final String BC_VAR_PA_EVENTTYPE = "eventType";

    /** The load file event type START. */
    public static final String BC_V_PA_LOAD_FILE_EVENTTYPE_START = "start";

    /** The load file event type SUCCESS. */
    public static final String BC_V_PA_LOAD_FILE_EVENTTYPE_SUCCESS = "success";

    /** The load file event type ERROR. */
    public static final String BC_V_PA_LOAD_FILE_EVENTTYPE_ERROR = "error";

    /** The load file event type END. */
    public static final String BC_V_PA_LOAD_FILE_EVENTTYPE_END = "end";

    /** The load file event type LOADING. */
    public static final String BC_V_PA_LOAD_FILE_EVENTTYPE_ING = "loading";

    /** Public account broadcast passed parameter name filePaths String. */
    public static final String BC_VAR_PA_LOAD_THUMB_FILEPATHS = "filePaths";

    /** ************************************** MCLOUD ******************************************************. */
    /** Callback notification after put file. */
    public static final String UI_MC_PUT_FILE = "ui_mc_put_file";

    /** Callback notification after share file. */
    public static final String UI_MC_SHARE_FILE = "ui_mc_share_file";

    /** Callback notification after share and send file. */
    public static final String UI_MC_SHARE_AND_SEND_FILE = "ui_mc_share_and_send_file";

    /** Callback notification after get share file list. */
    public static final String UI_MC_GET_SHARE_FILE_LIST = "ui_mc_get_share_file_list";

    /** Callback notification after download file from url. */
    public static final String UI_MC_DOWNLOAD_FILE_FROM_URL = "ui_mc_download_file_from_url";

    /** Callback notification after get remote file list. */
    public static final String UI_MC_GET_REMOTE_FILE_LIST = "ui_mc_get_remote_file_list";

    /** Mcloud broadcast passed parameter name eventType String. */
    public static final String BC_VAR_MC_ENENTTYPE = "eventType";

    /** Mcloud broadcast passed parameter name fullPathInID String. */
    public static final String BC_VAR_MC_FULL_FILE_ID = "fullPathInID";

    /** Mcloud broadcast passed parameter name percent String. */
    public static final String BC_VAR_MC_PERCENT = "percent";

    /** Mcloud broadcast passed parameter name processSize String. */
    public static final String BC_VAR_MC_PROCESS_SIZE = "processSize";

    /** Mcloud broadcast passed parameter name totalSize String. */
    public static final String BC_VAR_MC_TOTAL_SIZE = "totalSize";

    /** Mcloud broadcast passed parameter name message String. */
    public static final String BC_VAR_MC_MESSAGE = "message";

    /** Mcloud broadcast passed parameter name localPath String. */
    public static final String BC_VAR_MC_LOCALPATH = "localPath";

    /** Mcloud broadcast passed parameter name shareNode ShareNode. */
    public static final String BC_VAR_MC_SHARE_NODE = "shareNode";

    /** Mcloud broadcast passed parameter name shareNodeList list<ShareNode>. */
    public static final String BC_VAR_MC_SHARE_NODE_LIST = "shareNodeList";

    /** Mcloud broadcast passed parameter name remoteNodeList list<FileNode>. */
    public static final String BC_VAR_MC_REMOTE_NODE_LIST = "remoteNodeList";

    /** The mcloud event type STARTED. */
    public static final String BC_V_MC_EVENTTYPE_STARTED = "started";

    /** The mcloud event type SUCCESS. */
    public static final String BC_V_MC_EVENTTYPE_SUCCESS = "success";

    /** The mcloud event type ERROR. */
    public static final String BC_V_MC_EVENTTYPE_ERROR = "error";

    /** The mcloud event type PROGRESS. */
    public static final String BC_V_MC_EVENTTYPE_PROGRESS = "progress";

    /** The mcloud event type FILE_TOO_LARGE. */
    public static final String BC_V_MC_EVENTTYPE_FILE_TOO_LARGE = "fileToLarge";

    /** The mcloud event type OTHER. */
    public static final String BC_V_MC_EVENTTYPE_OTHER = "other";

    /** The broadcast for plug-in service unavailable */
    public static final String PLUGIN_SERVICE_UNAVAILABLE = "com.suntek.mway.rcs.action.PLUGIN_SERVICE_UNAVAILABLE";

    /** The broadcast for plug-in apk uninstalled */
    public static final String PLUGIN_APK_UNINSTALLED = "com.suntek.mway.rcs.action.PLUGIN_APK_UNINSTALLED";

    /** ************************************** IMAP ******************************************************. */
    public static final String BACKUP_ALL_MESSAGE = "com.suntek.mway.rcs.BACKUP_ALL_MESSAGE";

    public static final String RESTORE_ALL_MESSAGE = "com.suntek.mway.rcs.RESTORE_ALL_MESSAGE";

    public static final String RESTORE_ALL_MESSAGE_RESULT = "com.suntek.mway.rcs.RESTORE_ALL_MESSAGE_RESULT";

    public static final int BACKUP_STATUS_EXCEPTION = -1;
    public static final int BACKUP_STATUS_START = 0;
    public static final int BACKUP_STATUS_WORKING = 1;
    public static final int BACKUP_STATUS_FINISH = 2;

    public static final int RESTORE_STATUS_EXCEPTION = -1;
    public static final int RESTORE_STATUS_START = 0;
    public static final int RESTORE_STATUS_WORKING = 1;
    public static final int RESTORE_STATUS_FINISH = 2;

    public static final String ACTION_DMS_OPEN_BUSS = "com.suntek.mway.rcs.ACTION_DMS_OPEN_BUSS";
    public static final String ACTION_DMS_OPEN_BUSS_RESULT = "com.suntek.mway.rcs.ACTION_DMS_OPEN_BUSS_RESULT";
    public static final String OPER_RESULTCODE = "resultCode";
    public static final String OPER_RESULTDESC = "resultDesc";
    public static final String DMS_OPEN_BUSS_IMSI = "imsi";
    public static final String DMS_OPEN_BUSS_MSISDN = "number";
    public static final String DMS_TIPS_TITLE = "title";
    public static final String DMS_TIPS_MESSAGE = "message";
    public static final String DMS_TIPS_ACCEPT_BTN = "Accept_btn";
    public static final String DMS_TIPS_REJECT_BTN = "Reject_btn";

    public static final String DMS_USER_STATUS = "status";

    public static final int DMS_OPEN_BUSS_RESULTCODE_SUCCESS = 0;
    public static final int DMS_OPEN_BUSS_RESULTCODE_FAILED = -1;
    public static final String ACTION_DMS_NEW_CONFIG = "com.suntek.mway.rcs.ACTION_DMS_NEW_CONFIG";
    public static final String ACTION_DMS_UPDATE_CONFIG = "com.suntek.mway.rcs.ACTION_DMS_UPDATE_CONFIG";
    public static final String ACTION_SHOW_DIALOG_INFO = "com.suntek.mway.rcs.ACTION_SHOW_DIALOG_INFO";
    public static final String ACTION_OPEN_PS = "com.suntek.mway.rcs.ACTION_OPEN_PS";
    public static final String ACTION_CLOSE_WIFI_AND_OPEN_PS = "com.suntek.mway.rcs.ACTION_CLOSE_WIFI_AND_OPEN_PS";
    public static final String ACTION_DMS_USER_STATUS_CHANGED = "com.suntek.mway.rcs.ACTION_DMS_USER_STATUS_CHANGED";
    public static final String ACTION_CONFIRM_USE_NEW_IMSI = "com.suntek.mway.rcs.ACTION_CONFIRM_USE_NEW_IMSI";
    public static final String ACTION_INPUT_SMS_VERIFY_CODE = "com.suntek.mway.rcs.ACTION_INPUT_SMS_VERIFY_CODE";

}