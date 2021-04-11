package com.haiyu.manager.pojo;

import javax.persistence.*;

@Table(name = "base_admin_user")
public class BaseAdminUser {
    /**
     * ID
     */
/*  @Id：
    @Id 标注用于声明一个实体类的属性映射为数据库的主键列。该属性通常置于属性声明语句之前，可与声明语句同行，也可写在单独行上。
    @Id标注也可置于属性的getter方法之前。

    @GeneratedValue：
    @GeneratedValue 用于标注主键的生成策略，通过strategy 属性指定。默认情况下，JPA 自动选择一个最适合底层数据库的主键生成策略：SqlServer对应identity，MySQL 对应 auto increment。
    在javax.persistence.GenerationType中定义了以下几种可供选择的策略：
            –IDENTITY：采用数据库ID自增长的方式来自增主键字段，Oracle 不支持这种方式；
            –AUTO： JPA自动选择合适的策略，是默认选项；
            –SEQUENCE：通过序列产生主键，通过@SequenceGenerator 注解指定序列名，MySql不支持这种方式
            –TABLE：通过表产生主键，框架借由表模拟序列产生主键，使用该策略可以使应用更易于数据库移植。
*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 系统用户名称
     */
    @Column(name = "sys_user_name")
    private String sysUserName;

    /**
     * 系统用户密码
     */
    @Column(name = "sys_user_pwd")
    private String sysUserPwd;

    /**
     * 角色
     */
    @Column(name = "role_id")
    private Integer roleId;

    /**
     * 手机号
     */
    @Column(name = "user_phone")
    private String userPhone;

    /**
     * 登记时间
     */
    @Column(name = "reg_time")
    private String regTime;

    /**
     * 状态（0：无效；1：有效）
     */
    @Column(name = "user_status")
    private Integer userStatus;

    /**
     * 获取ID
     *
     * @return id - ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取系统用户名称
     *
     * @return sys_user_name - 系统用户名称
     */
    public String getSysUserName() {
        return sysUserName;
    }

    /**
     * 设置系统用户名称
     *
     * @param sysUserName 系统用户名称
     */
    public void setSysUserName(String sysUserName) {
        this.sysUserName = sysUserName;
    }

    /**
     * 获取系统用户密码
     *
     * @return sys_user_pwd - 系统用户密码
     */
    public String getSysUserPwd() {
        return sysUserPwd;
    }

    /**
     * 设置系统用户密码
     *
     * @param sysUserPwd 系统用户密码
     */
    public void setSysUserPwd(String sysUserPwd) {
        this.sysUserPwd = sysUserPwd;
    }

    /**
     * 获取角色
     *
     * @return role_id - 角色
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 设置角色
     *
     * @param roleId 角色
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取手机号
     *
     * @return user_phone - 手机号
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 设置手机号
     *
     * @param userPhone 手机号
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * 获取登记时间
     *
     * @return reg_time - 登记时间
     */
    public String getRegTime() {
        return regTime;
    }

    /**
     * 设置登记时间
     *
     * @param regTime 登记时间
     */
    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    /**
     * 获取状态（0：无效；1：有效）
     *
     * @return user_status - 状态（0：无效；1：有效）
     */
    public Integer getUserStatus() {
        return userStatus;
    }

    /**
     * 设置状态（0：无效；1：有效）
     *
     * @param userStatus 状态（0：无效；1：有效）
     */
    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    @Override
    public String toString() {
        return "BaseAdminUser{" +
                "id=" + id +
                ", sysUserName='" + sysUserName + '\'' +
                ", sysUserPwd='" + sysUserPwd + '\'' +
                ", roleId=" + roleId +
                ", userPhone='" + userPhone + '\'' +
                ", regTime='" + regTime + '\'' +
                ", userStatus=" + userStatus +
                '}';
    }
}