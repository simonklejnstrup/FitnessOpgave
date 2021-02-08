package demo;

public class Member extends Person{
    private boolean isBasic;

    public Member(String name, String cpr, boolean isBasic) {
        super(name, cpr);
        this.isBasic = isBasic;

    }

    public String getMemberType() {
        String memberType;
        if (isBasic){
            memberType = "Basic";
        } else{
            memberType = "Full";
        }
        return memberType;
    }

    public int getMonthlyFee(){
        int monthlyFee;
        if (isBasic){
            monthlyFee = 199;
        } else{
            monthlyFee = 299;
        }
        return monthlyFee;
    }

    @Override
    public String toString() {
        return String.format("%-13s%-15s%-16s%s", name, cpr, getMemberType(), getMonthlyFee());
    }
}
