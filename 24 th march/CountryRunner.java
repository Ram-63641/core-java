class CountryRunner {
    public static void main(String[] args) {

        String president = Country.getPresident("india");

        if(president != null){
            System.out.println("President : " + president);
        }

        String[] countries = {
            "usa","china","russia","france","germany","brazil","uk","japan",
            "canada","australia","south africa","argentina","mexico",
            "indonesia","turkey","iran","egypt","pakistan","bangladesh",
            "nepal","sri lanka","afghanistan","ukraine","poland","spain",
            "italy","netherlands","belgium","sweden","norway","denmark",
            "finland","switzerland","austria","greece","portugal",
            "hungary","czech republic","slovakia","romania","bulgaria",
            "serbia","croatia","slovenia","estonia","latvia","lithuania",
            "israel","saudi arabia","uae","qatar","kuwait","oman","kenya",
            "nigeria","ghana","ethiopia","uganda","tanzania","zambia",
            "zimbabwe","botswana","namibia","angola","morocco","algeria",
            "tunisia","libya","sudan","colombia","peru","chile","venezuela",
            "ecuador","bolivia"
        };

        for(String ref : countries){

            String pres = Country.getPresident(ref);

            if(pres != null){
                System.out.println("President : " + pres);
            }
        }
    }
}