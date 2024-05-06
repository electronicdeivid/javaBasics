package javaParaPrincipiantesUdemy;

public class sentenciaSwitchJava {
    public static void main(String[] args) {
        System.out.println("Electronic Civil Engineer | Backend Developer | AWSx1 | Springboot | Django ");
        int dayOfWeek = 5;

        if (dayOfWeek==1){
            System.out.println("It's comedy Monday ");
        }else if(dayOfWeek==2){
            System.out.println("It's drama Tuesday ");
        }else if(dayOfWeek==3){
            System.out.println("It's action Wednesday ");
        }else if(dayOfWeek==4){
                System.out.println("It's animated Thursday ");
        }else if(dayOfWeek==5){
            System.out.println("It's Terror Friday ");
        }else if(dayOfWeek==6){
            System.out.println("It's documentaries Saturday ");
        }else if(dayOfWeek==7){
            System.out.println("It's science-fiction Sunday");
        }else {
            System.out.println("What day do you live on?");
        }

        // Para resolver lo mismo escribiendo menos caracteres,utilizamos switch
        switch (dayOfWeek){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("What day do you live on?");

        }
    }
}

