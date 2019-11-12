package com.example.demo.service.impl;

import com.example.demo.entity.SysUser;
import com.example.demo.mapper.SysUserMapper;
import com.example.demo.service.SysuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: demo1112
 * @Package: com.example.demo.service.impl
 * @ClassName: SysuserServiceimpl
 * @Author: ZHY
 * @Description: ${description}
 * @Date: 2019/11/12 14:23
 * @Version: 1.0
 */
@Service
public class SysuserServiceimpl implements SysuserService {
    @Autowired
    SysUserMapper sysUserMapper;

    @Override
    public SysUser selectOne(SysUser user) {

        return sysUserMapper.selectOne( user );
    }
}
