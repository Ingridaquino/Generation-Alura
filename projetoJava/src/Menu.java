import FrontEnd.FrontEnd;
import SoftSkills.SoftSkill;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
              Menu();
              Email();
    }


    public static void Menu(){

        FrontEnd front = new FrontEnd();
//        BackEnd back = new back();

         SoftSkill soft = new SoftSkill();

        Scanner entrada = new Scanner(System.in);
        int opcao;


        System.out.println("----- O que estudar para ser um programador ----");
        System.out.println("1- Front-end");
        System.out.println("2- Back-end");
        System.out.println("3- Banco de Dados");
        System.out.println("4- Soft Skill");
        System.out.println("0- sair ");

        System.out.println("Digite: ");
        opcao = entrada.nextInt();

        if(opcao == 1){
            front.FrontText();
        } else if (opcao == 2){
//            back.BackendText();
        } else if (opcao == 3){
            soft.SkillText();
        } else if (opcao == 4){

        }

    }

    public static void Email(){
        Scanner entrada = new Scanner(System.in);
        String email;

        System.out.println(" --- Para ficar por dentro de tudo, cadastre seu e-mail");
        System.out.println("Email: ");
        email = entrada.next();

        System.out.println("Email " + email + " cadastrado com sucesso!! ");
    }


}
