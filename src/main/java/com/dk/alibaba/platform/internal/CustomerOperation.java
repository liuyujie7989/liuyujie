package com.dk.alibaba.platform.internal;

import com.dk.alibaba.platform.auth.ProviderPass;
import com.dk.alibaba.platform.constant.RequestURI;
import com.dk.alibaba.platform.model.req.SelectCustomerDetailsByIdReq;
import com.dk.alibaba.platform.model.rsp.SelectCustomerDetailsByIdRsp;
import com.dk.alibaba.platform.parser.ResponseParseException;
import com.dk.alibaba.platform.parser.ResponseParser;
import com.dk.alibaba.platform.util.ParamUtils;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @author doukang
 * @description 前台用户相关服务
 * @date 2019/11/4 18:20
 */
public class CustomerOperation extends BaseOperation {

    public CustomerOperation(ProviderPass providerPass) {
        super(providerPass);
    }

    /**
     * 查询前台用户详细信息
     *
     * @param req
     * @return
     */
    public SelectCustomerDetailsByIdRsp selectDetailsById(SelectCustomerDetailsByIdReq req) {
        String requestBody = ParamUtils.createRequestBody(providerPass, "SELECT_DETAILS_BY_ID_REQ", req);
        return doOperation(RequestURI.SELECT_CUSTOMER_DETAILS_BY_ID, requestBody, new ResponseParser<SelectCustomerDetailsByIdRsp>() {
            @Override
            public SelectCustomerDetailsByIdRsp parse(String response) throws ResponseParseException {
                List<String> fields = Arrays.asList("infoInformation", "infoPerson", "infoLegal");
                try {
                    String result = getResult(response, "SELECT_DETAILS_BY_ID_RSP", fields);
                    SelectCustomerDetailsByIdRsp rsp = mapper.readValue(result, SelectCustomerDetailsByIdRsp.class);
                    // todo 2: 账号未实名认证
                    if ("1".equals(rsp.getCode())) {
                        throw new RuntimeException("请求失败：" + rsp.getCode() + ":" + rsp.getMessage());
                    }
                    return rsp;
                } catch (IOException e) {
                    throw new ResponseParseException(e);
                }
            }
        });
    }
}
