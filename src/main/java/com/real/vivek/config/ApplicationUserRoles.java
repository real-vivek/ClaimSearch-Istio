//package com.real.vivek.config;
//
//import java.util.Set;
//
//import com.google.common.collect.Sets;
//
//public enum ApplicationUserRoles {
//	USER(Sets.newHashSet()),
//	ADMIN(Sets.newHashSet(ApplicaionUserPermission.USER_READ, ApplicaionUserPermission.USER_WRITE));
//
//	private final Set<ApplicaionUserPermission> permissions;
//
//	private ApplicationUserRoles(Set<ApplicaionUserPermission> permissions) {
//		this.permissions = permissions;
//	}
//
//	public Set<ApplicaionUserPermission> getPermissions() {
//		return permissions;
//	}
//
//}
