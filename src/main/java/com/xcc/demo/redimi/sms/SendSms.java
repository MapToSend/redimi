package com.xcc.demo.redimi.sms;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;

import com.tencentcloudapi.sms.v20190711.SmsClient;

import com.tencentcloudapi.sms.v20190711.models.SendSmsRequest;
import com.tencentcloudapi.sms.v20190711.models.SendSmsResponse;

public class SendSms
{
    public static void main(String [] args) {
        try{

            Credential cred = new Credential("", "");
            
            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setEndpoint("sms.tencentcloudapi.com");

            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setHttpProfile(httpProfile);
            
            SmsClient client = new SmsClient(cred, "", clientProfile);
            
            String params = "{是的撒多所大所}";
            SendSmsRequest req = SendSmsRequest.fromJsonString(params, SendSmsRequest.class);
            
            SendSmsResponse resp = client.SendSms(req);
            
            System.out.println(SendSmsRequest.toJsonString(resp));
        } catch (TencentCloudSDKException e) {
                System.out.println(e.toString());
        }

    }
    
}