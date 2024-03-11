package Minimarket;

public class pembeli{
    protected String member;
    protected double diskon;
    public void setMembership (String member){
        this.member = member; 
        if (member.equalsIgnoreCase("Platinum")) {
            this.diskon = 0.15;
        } else if (member.equalsIgnoreCase("Gold")){
            this.diskon = 0.1;
        } else if (member.equalsIgnoreCase("Silver")){
            this.diskon = 0.05;
        } else if (member.equalsIgnoreCase("NonMember")){
            this.diskon = 0;
        }
    }
}