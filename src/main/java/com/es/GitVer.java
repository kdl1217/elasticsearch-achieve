package com.evcar.subsidy;

public class GitVer {
    private String _branch = "";
    private String _rev = "";
    private String _hash = "";
    private String _hash160 = "";

    public String get_branch() {
        return _branch;
    }

    public String get_rev() {
        return _rev;
    }

    public String get_hash() {
        return _hash;
    }

    public String getVersion(){ return _branch + "." + _rev + "@" + _hash; }
    public String getSourceLink(){ return "https://github.com/InCar/rooster-gather/tree/" + _hash160; }
}
