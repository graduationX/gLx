package com.educate.pojo;

public class Teacher {
    private String tid;

    private String tname;

    private String tsex;

    private String tphone;

    private String tnamed;

    private String tclass;
    
    private String password;

    private String userCode;
    

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public String getTsex() {
        return tsex;
    }

    public void setTsex(String tsex) {
        this.tsex = tsex == null ? null : tsex.trim();
    }

    public String getTphone() {
        return tphone;
    }

    public void setTphone(String tphone) {
        this.tphone = tphone == null ? null : tphone.trim();
    }

    public String getTnamed() {
        return tnamed;
    }

    public void setTnamed(String tnamed) {
        this.tnamed = tnamed == null ? null : tnamed.trim();
    }

    public String getTclass() {
        return tclass;
    }

    public void setTclass(String tclass) {
        this.tclass = tclass == null ? null : tclass.trim();
    }

    
    
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	

	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", tsex=" + tsex
				+ ", tphone=" + tphone + ", tnamed=" + tnamed + ", tclass="
				+ tclass + "]";
	}
    
	
    
}