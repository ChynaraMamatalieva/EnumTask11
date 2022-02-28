package com.company;

public enum OblastiKyrgyzstana {
    CHUI("Chuidun kilmaty adamga jagymduu bolot"),
    TALAS("Talasta fasol osot"),
    NARYN("Narynda aba yraiy suuk"),
    OSH("Osh shaary berekeluu shaar"),
    JALALABAD("Jalalabadda Arlanbop tokoyubar"),
    BATKEN("Batkende oruk osturushot"),
    YSYKKOL("Ysyk-Kold Kyrgyzstandyn bermeti");

    private String ozgocholugu;

    OblastiKyrgyzstana(String ozgocholugu) {
        this.ozgocholugu = ozgocholugu;
    }

    public String getOzgocholugu() {
        return ozgocholugu;
    }

    public void setOzgocholugu(String ozgocholugu) {
        this.ozgocholugu = ozgocholugu;
    }

}
