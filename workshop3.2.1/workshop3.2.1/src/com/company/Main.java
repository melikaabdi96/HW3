package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MusicPlayer musicPlayer1 = new MusicPlayer();
        MusicPlayer musicPlayer2 = new MusicPlayer();
        MusicPlayer musicPlayer3 = new MusicPlayer();
        MusicPlayer musicPlayer4 = new MusicPlayer();
        MusicCollection pop = new MusicCollection(musicPlayer1);
        MusicCollection jazz = new MusicCollection(musicPlayer2);
        MusicCollection rock = new MusicCollection(musicPlayer3);
        MusicCollection country = new MusicCollection(musicPlayer4);
        Scanner input = new Scanner(System.in);
        while (true) {
            printOperations();
            System.out.println("Choose your music type : ");
            int operation = input.nextInt();

            switch (operation) {
                case 1:{
                    System.out.println("Enter your file name : ");
                    String name = input.nextLine();
                    jazz.addFile(name);
                    break;}
                case 2:{
                    System.out.println("Enter you file index :");
                    int index = input.nextInt();
                    jazz.listFile(index);
                    break;
                }
                case 3:{
                    System.out.println("Enter your file index :");
                    int index = input.nextInt();
                    jazz.removeFile(index);
                    break;
                }
                case 4: {
                    jazz.listAllFiles();
                    break;
                }
                case 5:{
                    System.out.println("Enter your file index :");
                    int index = input.nextInt();
                    jazz.startPlaying(index);
                    break;
                }
                case 6: {
                    jazz.stopPlaying();
                    break;
                }
                case 7:{
                    System.out.println("Enter your file index :");
                    int index = input.nextInt();
                    jazz.validIndex(index);
                    break;
                }
                case 8:{
                    System.out.println("Enter your file name : ");
                    String name = input.nextLine();
                    pop.addFile(name);
                    break;}
                case 9:{
                    System.out.println("Enter you file index :");
                    int index = input.nextInt();
                    pop.listFile(index);
                    break;
                }
                case 10:{
                    System.out.println("Enter your file index :");
                    int index = input.nextInt();
                    pop.removeFile(index);
                    break;
                }
                case 11: {
                    pop.listAllFiles();
                    break;
                }
                case 12:{
                    System.out.println("Enter your file index :");
                    int index = input.nextInt();
                    pop.startPlaying(index);
                    break;
                }
                case 13: {
                    pop.stopPlaying();
                    break;
                }
                case 14:{
                    System.out.println("Enter your file index :");
                    int index = input.nextInt();
                    pop.validIndex(index);
                    break;
                }
                case 15:{
                    System.out.println("Enter your file name : ");
                    String name = input.nextLine();
                    country.addFile(name);
                    break;}
                case 16:{
                    System.out.println("Enter you file index :");
                    int index = input.nextInt();
                    country.listFile(index);
                    break;
                }
                case 17:{
                    System.out.println("Enter your file index :");
                    int index = input.nextInt();
                    country.removeFile(index);
                    break;
                }
                case 18: {
                    country.listAllFiles();
                    break;
                }
                case 19:{
                    System.out.println("Enter your file index :");
                    int index = input.nextInt();
                    country.startPlaying(index);
                    break;
                }
                case 20: {
                    country.stopPlaying();
                    break;
                }
                case 21:{
                    System.out.println("Enter your file index :");
                    int index = input.nextInt();
                    country.validIndex(index);
                    break;
                }
                case 22:{
                    System.out.println("Enter your file name : ");
                    String name = input.nextLine();
                    rock.addFile(name);
                    break;}
                case 23:{
                    System.out.println("Enter you file index :");
                    int index = input.nextInt();
                    rock.listFile(index);
                    break;
                }
                case 24:{
                    System.out.println("Enter your file index :");
                    int index = input.nextInt();
                    rock.removeFile(index);
                    break;
                }
                case 25: {
                    rock.listAllFiles();
                    break;
                }
                case 26:{
                    System.out.println("Enter your file index :");
                    int index = input.nextInt();
                    rock.startPlaying(index);
                    break;
                }
                case 27: {
                    rock.stopPlaying();
                    break;
                }
                case 28: {
                    System.out.println("Enter your file index :");
                    int index = input.nextInt();
                    rock.validIndex(index);
                    break;
                }
                default:
                    break;
            }
        }

        // write your code here
    }

    private static void printOperations() {
        System.out.println(" which musiccollection do you need?\n Enter number(1-7)if you need jazz collection/n Enter number(8-14)if you need pop collection/n Enter number(15-21)if you need country collection/n Enter number(22-28)if you need rock collection/n");
    }
}
