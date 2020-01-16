package com.dk.alibaba.platform;

import com.dk.alibaba.platform.auth.ProviderPass;
import com.dk.alibaba.platform.model.rsp.SelectCustomerDetailsByIdRsp;
import com.dk.alibaba.platform.model.rsp.SelectUserInfoRsp;
import com.dk.alibaba.platform.internal.CustomerOperation;
import com.dk.alibaba.platform.internal.UserOperation;
import com.dk.alibaba.platform.model.req.SelectCustomerDetailsByIdReq;
import com.dk.alibaba.platform.model.req.SelectUserInfoReq;

/**
 * @author doukang
 * @description 阿里接口平台入口
 * @date 2019/11/4 19:10
 */
public class AlibabaPlatForm {

    private CustomerOperation customerOperation;

    private UserOperation userOperation;

    public AlibabaPlatForm(String appId, String appSecret, String apiHost) {
        ProviderPass providerPass = new ProviderPass(appId, appSecret, apiHost);
        this.customerOperation = new CustomerOperation(providerPass);
        this.userOperation = new UserOperation(providerPass);
    }

    /**
     * 查询前台用户详细信息
     *
     * @param req
     * @return
     */
    public SelectCustomerDetailsByIdRsp selectCustomerDetailsById(SelectCustomerDetailsByIdReq req) {
        return customerOperation.selectDetailsById(req);
    }

    /**
     * 查询后台用户信息
     *
     * @param req
     * @return
     */
    public SelectUserInfoRsp selectUserInfo(SelectUserInfoReq req) {
        return userOperation.selectUserInfo(req);
    }
}
