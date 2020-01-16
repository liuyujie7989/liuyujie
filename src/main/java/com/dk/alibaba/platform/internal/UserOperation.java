package com.dk.alibaba.platform.internal;

import com.dk.alibaba.platform.auth.ProviderPass;
import com.dk.alibaba.platform.constant.RequestURI;
import com.dk.alibaba.platform.model.req.SelectUserInfoReq;
import com.dk.alibaba.platform.model.rsp.SelectUserInfoRsp;
import com.dk.alibaba.platform.parser.ResponseParseException;
import com.dk.alibaba.platform.parser.ResponseParser;
import com.dk.alibaba.platform.util.ParamUtils;

import java.io.IOException;
import java.util.Collections;

/**
 * @author doukang
 * @description 后台用户相关服务
 * @date 2019/11/4 18:19
 */
public class UserOperation extends BaseOperation {

    public UserOperation(ProviderPass providerPass) {
        super(providerPass);
    }

    /**
     * 查询后台用户信息
     *
     * @param req
     * @return
     */
    public SelectUserInfoRsp selectUserInfo(SelectUserInfoReq req) {
        String requestBody = ParamUtils.createRequestBody(providerPass, "SELECT_USER_INFO_REQ", req);
        return doOperation(RequestURI.SELECT_USER_INFO, requestBody, new ResponseParser<SelectUserInfoRsp>() {
            @Override
            public SelectUserInfoRsp parse(String response) throws ResponseParseException {
                try {
                    String result = getResult(response, "SELECT_USER_INFO_RSP", Collections.emptyList());
                    SelectUserInfoRsp rsp = mapper.readValue(result, SelectUserInfoRsp.class);
                    return rsp;
                } catch (IOException e) {
                    throw new ResponseParseException(e);
                }
            }
        });
    }
}
