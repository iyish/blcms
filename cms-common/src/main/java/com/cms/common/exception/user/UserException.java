package com.cms.common.exception.user;

import com.cms.common.exception.base.BaseException;

/**
 * 用户信息异常类
 * 
 * @author Naij 52java.cn
 */
public class UserException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
