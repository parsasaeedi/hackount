//HACKOUNT
//author: Parsa Saeedi


import java.util.Scanner;
import java.util.Random;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import java.text.DecimalFormat;
import java.lang.Math;

public class Hackount {

    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    
    public static void main(String[] args) throws InterruptedException {
        //player
        int firewall, bypasser, cracker, encryptor, network, core, percent, hack = 0, balance, RAM, ping, down, up;
        //victim
        int vfirewall=0, vbypasser, vcracker, vencryptor, vnetwork, vcore, crack, vbalance = 0, list, pass, vRAM, vping, vdown, vup, vmodelnum, softwarelevel = 0;
        String IP = "10.10.0.1", cmdl, cmdh, cmds, cmdIP, cmdw, cmdu, help, vCPU, about, vabout, bitcoin, vbitcoin, walletID = "", vmodel = "",  phonenum, restofbitcoin = "", vrestofbitcoin = "";
        double CPU, r;

        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        DecimalFormat fmt = new DecimalFormat("0.#");


        firewall = 1;
        bypasser = 1;
        cracker = 1;
        encryptor = 1;
        core = 3;
        RAM = 1;
        network = 3;
        ping = 100;
        down = 10;
        up = 10;
        CPU = 1.7;
        balance = 0;
        bitcoin = "";

        // firewall = 95;
        // bypasser = 95;
        // cracker = 95;
        // encryptor = 95;
        // core = 9;
        // RAM = 16;
        // network = 5;
        // ping = 10;
        // down = 300;
        // up = 300;
        // CPU = 1.7;
        // balance = 0;
        // bitcoin = "";
        


        vfirewall = 1;
        vbypasser = 1;
        vcracker = 1;
        vencryptor = 1;
        vcore = 1;
        vnetwork = 1;
        crack = 100000;
        vbitcoin = "";
        vRAM = 1;
        vping = 100;
        vdown = 10;
        vup = 10;

        
        
        int coreupgrade = 5, RAMupgrade = 4, netupgrade = 4;
        int coreprice = 0, RAMprice = 0, netprice = 0, fireprice, encprice, crackprice, bypassprice, pingprice, downprice, upprice;
        int fireupg, encupg, crackupg, bypassupg, pingupg, downupg, upupg;
        String bitfire = "", bitenc = "", bitcrack = "", bitbypass = "", bitnet = "", bitcore = "", bitping = "", bitdown = "", bitup = "", bitRAM = "", updatetype = "", update;

        //game tips
        //only shows the first time when its 0
        //order: scanner, 
        int hackounttips = 0, upgradetips = 0, scannertips = 0, IPtips = 0, wallettips = 0;
        int log = 0; //number of times you went to hackount dir
        


        System.out.println(ANSI_BLACK_BACKGROUND + ANSI_YELLOW + "\nFor the best experience change your terminal background to black.");
        System.out.print("\nPress Enter key to continue...");
        input.nextLine();
        System.out.println("");
        System.out.println("Disclaimer: This is a game. All of this game is offline, and you have nothing to do with the internet. None of your actions in this game are illegal (In the game. In real life it\'s pretty illegal). ");
        System.out.print("\nPress Enter key to continue...");
        input.nextLine();
        System.out.println("");
        System.out.println("Greetings,\n\nYou don't know who I am but I have been watching you for some time. Do not be alarmed, I am not connected with the authorities. You have the potential to become a great hacker. I am inviting you to become a member of our group and join us in a hacking war. With your skills and abilities and our tools, you give us a high chance of winning in this war. Me and a group of other hackers have developed a software that can locate bitcoin owners, anonymously bypass their devices and crack their bitcoin wallet password. And then you can transfer their bitcoins to your own wallet. But we had an attack last week and other hackers now have access to this tool too. Hackount can be very dangerous in the wrong hands. We need to stop them before it\'s too late. If we win this war, you can make millions of dollars worth of bitcoin without getting off your desk. Accept my offer, and you wil be be greatly rewarded.\n\nAnonymous");
        System.out.print("\nPress Enter key to accept the offer...");
        input.nextLine();
        System.out.println("");
        System.out.print("I'm glad you decided to accept my offer. Trust me, I'll make it worth your while.\n");
        System.out.print("\nPress Enter key to continue...");
        input.nextLine();
        System.out.println("");
        System.out.println("By now, hackount (the software's name) should be installed on your local System. You can just run it like any other software in the command line. If you don't know how, you can always type 'help' or 'h'.");
        System.out.print("\nPress Enter key to continue...");
        input.nextLine();
        System.out.println("");
        




        System.out.print("Local System Startup...");
        TimeUnit.MILLISECONDS.sleep((long) 5000 / (int) Math.pow(core*RAM, 0.7));
        System.out.println("\nBootup Complete\nVersion 3.6.209\n2020 all rights reserved\nStarted: " + ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME) + "\nType 'help' or 'h' for help.");


        //localhost
        do {
            System.out.print("\nlocalhost> ");
            help = "(e)xit\t\texit this localhost\n(h)elp\t\tdisplay this menu\n(l)s\t\tlist files in this dir\n./<fileName>\trun a file";
            cmdl = input.next();
            if (cmdl.equals("help") || cmdl.equals("h")) {
                System.out.println(help);
            } 
            
            else if (cmdl.equals("l") || cmdl.equals("ls")) {
                System.out.println("hackount.sh\t88k  -rw wwr r-x");
            } 





            //hackount
            else if (cmdl.equals("./hackount.sh") || cmdl.equals("hack")) {

                System.out.print("checking internet connection... ");
                TimeUnit.MILLISECONDS.sleep((long) 4000*ping/(network*down*up));
                System.out.println(" OK!");

                System.out.print("starting Tor on port: 9051");
                TimeUnit.MILLISECONDS.sleep((long) 30 * ping / network);
                System.out.print("\nstarting Tor on port: 9052");
                TimeUnit.MILLISECONDS.sleep((long) 30 * ping / network);
                System.out.print("\nstarting Tor on port: 9053");
                TimeUnit.MILLISECONDS.sleep((long) 30 * ping / network);
                System.out.print("\nstarting Tor on port: 9054");
                TimeUnit.MILLISECONDS.sleep((long) 50 * ping / network);

                System.out.print("\nchecking Tor connection on port: 9051... ");
                TimeUnit.MILLISECONDS.sleep((long) 30 * ping / network);
                System.out.println("OK!");
                System.out.print("checking Tor connection on port: 9052... ");
                TimeUnit.MILLISECONDS.sleep((long) 30 * ping / network);
                System.out.println("OK!");
                System.out.print("checking Tor connection on port: 9053... ");
                TimeUnit.MILLISECONDS.sleep((long) 40 * ping / network);
                System.out.println("OK!");
                System.out.print("checking Tor connection on port: 9054... ");
                TimeUnit.MILLISECONDS.sleep((long) 30 * ping / network);
                System.out.println("OK!");
                

                System.out.print("\nestablishing connection to the Hackount servers... ");
                for (percent = 0; percent <= 100; percent++) {
                    if (percent < 10) {
                        System.out.print(percent + "%");
                        TimeUnit.MILLISECONDS.sleep((long) 35* (int) (Math.pow(ping * 10, 0.25)/Math.pow(network * 2, 0.5)));
                        System.out.print("\b\b");
                    } else if (percent >= 10 && percent < 99) {
                        System.out.print(percent + "%");
                        TimeUnit.MILLISECONDS.sleep((long) 15*(int) (Math.pow(ping * 10, 0.25)/(Math.pow(network * 2, 0.5))));
                        System.out.print("\b\b\b");
                    } else if (percent == 99) {
                        System.out.print(percent + "%");
                        TimeUnit.MILLISECONDS.sleep((long) 120*(int) (Math.pow(ping * 10, 0.25)/Math.pow(network * 2, 0.5)));
                        System.out.print("\b\b\b");
                    } else if (percent == 100) {
                        System.out.print(percent + "%");
                        TimeUnit.MILLISECONDS.sleep((long) 80 * (int) (Math.pow(ping * 10, 0.25)/(Math.pow(network * 2, 0.5))));
                        System.out.print("\b\b\b");
                    }
                }

                System.out.println("\nConnection Established!");
                if (hackounttips == 0) {
                    System.out.println("\nYou now have access to a really powerful hacking tool. Remember, with great power comes great responsibility. Here you can open the scanner to look for devices, learn about your system, upgrade your system, and access your wallet and see your balance. You can always type 'help' or 'h' to find the commands. And don\'t forget, there is always a shortcut for every command, don\'t waist time. Every second counts. Almost forgot to mention: you can get hacked and lose all your bitcoins too. This is a two way war. So upgrade your firewall and encryptor.");
                    System.out.print("\nPress Enter key to continue...");
                    input.nextLine();
                    input.nextLine();
                    System.out.println("");
                    hackounttips = 1;
                }
                System.out.println("Type 'help' or 'h' for help.");

                TimeUnit.MILLISECONDS.sleep((long) 1);

                do {

                    int gothacked = ran.nextInt(10 * (int) Math.pow(firewall * encryptor, 0.7)) + 1;
                    if (gothacked == 1 && log > 5) {
                        System.out.println("you have been hacked\nyour balance is 0.00000000 ₿");
                        balance = 0;
                    }
                    log ++;

                    if (core == 5) CPU = 2.9;
                    else if (core == 7) CPU = 4.0;
                    else if (core == 9) CPU = 5.2;

                    help = "(e)xit\t\texit hackount\n(h)elp\t\tdisplay this menu\n(s)can\t\tscan for devices\n(w)allet\tgo to your bitcoin wallet\n(u)pgrade\tupgrade your device\n(a)bout\t\tshow your device\'s specs";
                    about = "Processor:\t" + CPU + "GHz, core i" + core + "\nmemory:\t\t" + RAM + "Gb\nfirewall:\tlevel " + firewall + "\nbypasser:\tlevel " + bypasser + "\ncracker:\tlevel " + cracker + "\nencryptor:\tlevel " + encryptor + "\nnetwork:\t" + network + "G\nping:\t\t" + ping + "ms\ndownload:\t" + down + " Mbps\nupload:\t\t" + up + " Mbps";
                    
                    restofbitcoin = "";
                    if (balance < 10) bitcoin = "0.0000000" + balance;
                    else if (balance < 100) bitcoin = "0.000000" + balance;
                    else if (balance < 1000) bitcoin = "0.00000" + balance;
                    else if (balance < 10000) bitcoin = "0.0000" + balance;
                    else if (balance < 100000) bitcoin = "0.000" + balance;
                    else if (balance < 1000000) bitcoin = "0.00" + balance;
                    else if (balance < 10000000) bitcoin = "0.0" + balance;
                    else if (balance < 100000000) bitcoin = "0." + balance;
                    else if (balance < 1000000000) {
                        if ((balance - ((balance /100000000)*100000000)) < 10) restofbitcoin = ".0000000" + (balance - ((balance /100000000)*100000000));
                        else if ((balance - ((balance /100000000)*100000000)) < 100) restofbitcoin = ".000000" + (balance - ((balance /100000000)*100000000));
                        else if ((balance - ((balance /100000000)*100000000)) < 1000) restofbitcoin = ".00000" + (balance - ((balance /100000000)*100000000));
                        else if ((balance - ((balance /100000000)*100000000)) < 10000) restofbitcoin = ".0000" + (balance - ((balance /100000000)*100000000));
                        else if ((balance - ((balance /100000000)*100000000)) < 100000) restofbitcoin = ".000" + (balance - ((balance /100000000)*100000000));
                        else if ((balance - ((balance /100000000)*100000000)) < 1000000) restofbitcoin = ".00" + (balance - ((balance /100000000)*100000000));
                        else if ((balance - ((balance /100000000)*100000000)) < 10000000) restofbitcoin = ".0" + (balance - ((balance /100000000)*100000000));
                        else if ((balance - ((balance /100000000)*100000000)) < 100000000) restofbitcoin = "." + (balance - ((balance /100000000)*100000000));
                        bitcoin = (balance /100000000) + restofbitcoin;
                    }

                    
                    
                    System.out.print("\nhackount> ");
                    cmdh = input.next();
        
                    //help
                    if (cmdh.equals("help") || cmdh.equals("h")) {
                        System.out.println(help);
                    }
        
                    //scan
                    else if (cmdh.equals("s") || cmdh.equals("scan")) {
                        
                        if (scannertips == 0) {
                            System.out.println("Here you can scan for devices. type 'scan' or 's' to scan for a new device. You can try to bypass the device by typing 'bypass' or 'b'. The higher their firewall, the lower your chance of success in bypassing, and the longer it takes to bypass their devices. You need to update your bypasser to bypass higher firewalls, increase your speed and chance of bypassing. For now, stick with level 1 firewalls.");
                            System.out.print("\nPress Enter key to continue...");
                            input.nextLine();
                            input.nextLine();
                            System.out.println("");
                            scannertips = 1;
                        }

                        System.out.println("\nType 'help' or 'h' for help.");
        
                        do {
                            help = "(e)xit\t\texit scanner\n(h)elp\t\tdisplay this menu\n(s)can\t\tsearch for nearby devices\n(b)ypass\tbypass the last found device";

                            System.out.print("\nscanner> ");
                            cmds = input.next();

                            if (cmds.equals("help") || cmds.equals("h")) {
                                System.out.println(help);
                            } else if (cmds.equals("s") || cmds.equals("scan")) {
                                System.out.println("searching for devices...");

                                //IPaddress
                                int bit1, bit2, bit3, bit4;
                                bit1 = ran.nextInt(155) + 101;
                                bit2 = ran.nextInt(255) + 1;
                                bit3 = ran.nextInt(255) + 1;
                                bit4 = ran.nextInt(255) + 1;
                                IP = bit1 + "." + bit2 + "." + bit3 + "." + bit4;
                                



                                //Start of IP
                                System.out.println("\nIP: " + IP);

                                if (bypasser <= 5) {
                                    vfirewall = ran.nextInt(7) + 1;
                                } else if (bypasser < 95) {
                                    vfirewall = ran.nextInt(10) + bypasser - 5;
                                } else if (bypasser <= 100) {
                                    vfirewall = ran.nextInt(5) + 95;
                                }
                                System.out.println("Firewall: " + vfirewall);

                            } else if (cmds.equals("b") || cmds.equals("bypass")) {
                            
                                System.out.print("bypassing " + IP + "... ");

                                for (percent = 0; percent <= 100; percent++) {
                                    if (percent < 10) {
                                        System.out.print(percent + "%");
                                        TimeUnit.MILLISECONDS.sleep((long) 8*(int) (Math.pow((ping+100)*vfirewall*15, 0.7) / (network * (int) (Math.pow(bypasser*15, 0.7)*(int)(Math.pow(RAM*core*8, 0.25))))));
                                        System.out.print("\b\b");
                                    } else if (percent >= 10 && percent < 99) {
                                        System.out.print(percent + "%");
                                        TimeUnit.MILLISECONDS.sleep((long) 5*(int) (Math.pow((ping+100)*vfirewall*15, 0.7) / (network * (int) (Math.pow(bypasser*15, 0.7)*(int)(Math.pow(RAM*core*8, 0.25))))));
                                        System.out.print("\b\b\b");
                                    } else if (percent == 99) {
                                        System.out.print(percent + "%");
                                        TimeUnit.MILLISECONDS.sleep((long) 100*(int) (Math.pow((ping+100)*vfirewall*15, 0.7) / (network * (int) (Math.pow(bypasser*15, 0.7)*(int)(Math.pow(RAM*core*8, 0.25))))));
                                        System.out.print("\b\b\b");
                                    } else if (percent == 100) {
                                        System.out.print(percent + "%");
                                        TimeUnit.MILLISECONDS.sleep((long) 20*(int) (Math.pow(ping*vfirewall*15, 0.7) / (network * (int) (Math.pow(bypasser*15, 0.7)*(int)(Math.pow(RAM*core*8, 0.25))))));
                                        System.out.print("\b\b\b");
                                    }
                                }
                                
                                //Bypass chances
                                r = ran.nextDouble();
                                if ((vfirewall - bypasser) < 1) {
                                    if (r < 1) hack = 1; //successful
                                    else hack = 0; //unsuccessful
                                } else if ((vfirewall - bypasser) < 2) {
                                    if (r < 0.9) hack = 1;
                                    else hack = 0;
                                } else if ((vfirewall - bypasser) < 3) {
                                    if (r < 0.8) hack = 1;
                                    else hack = 0;
                                } else if ((vfirewall - bypasser) < 4) {
                                    if (r < 0.7) hack = 1;
                                    else hack = 0;
                                } else if ((vfirewall - bypasser) < 5) {
                                    if (r < 0.6) hack = 1;
                                    else hack = 0;
                                } else if ((vfirewall - bypasser) < 6) {
                                    if (r < 0.5) hack = 1;
                                    else hack = 0;
                                } else if ((vfirewall - bypasser < 7)) {
                                    if (r < 0.4) hack = 1; 
                                    else hack = 0;
                                } else if ((vfirewall - bypasser) < 8) {
                                    if (r < 0.3) hack = 1;
                                    else hack = 0;
                                } else {
                                    hack = 0;
                                }

                                if (hack == 1) {
                                    System.out.println("\nbypass successful!");
                                    if (IPtips == 0) {
                                        System.out.println("\nYou have successully hacked into this device! From here, you can learn about the device, try to crack the wallet password and then access the wallet, or download the device\'s software.");
                                        System.out.print("\nPress Enter key to continue...");
                                        input.nextLine();
                                        input.nextLine();
                                        System.out.println("");
                                        IPtips = 1;
                                    }
                                    System.out.println("Type 'help' or 'h' for help.");
                                    
                                    //vbypasser is defined before IP

                                    //vcracker
                                    if (vfirewall <= 5) {
                                        vcracker= ran.nextInt(6) + 1;
                                    } else if (vfirewall > 5 && vfirewall < 95) {
                                        vcracker = ran.nextInt(8) + vfirewall - 4;
                                    } else if (vfirewall >= 95) {
                                        vcracker = ran.nextInt(5) + 95;
                                    }
                                    //vencryptor
                                    if (vfirewall <= 5) {
                                        vencryptor = ran.nextInt(6) + 1;
                                    } else if (vfirewall > 5 && vfirewall < 95) {
                                        vencryptor = ran.nextInt(8) + vfirewall - 4;
                                    } else if (vfirewall >= 95) {
                                        vencryptor = ran.nextInt(5) + 95;
                                    }
                                    //vbypasser
                                    if (vfirewall <= 5) {
                                        vbypasser= ran.nextInt(6) + 1;
                                    } else if (vfirewall > 5 && vfirewall < 95) {
                                        vbypasser = ran.nextInt(8) + vfirewall - 4;
                                    } else if (vfirewall >= 95) {
                                        vbypasser = ran.nextInt(5) + 95;
                                    }
                                    //CPU
                                    vCPU = fmt.format((ran.nextDouble() + 1)* 2.5);
                                    //core
                                    vcore = ran.nextInt(4) + 1;
                                    if (vcore == 1) {
                                        vcore = 3;
                                    } else if (vcore == 2) {
                                        vcore = 5;
                                    } else if (vcore == 3) {
                                        vcore = 7;
                                    } else if (vcore == 4) {
                                        vcore = 9;
                                    }
                                    //network
                                    vnetwork = ran.nextInt(3) + 3;
                                    //phone number
                                    int dig1, dig2, dig3;
                                    dig1 = ran.nextInt(899) + 100;
                                    dig2 = ran.nextInt(899) + 100;
                                    dig3 = ran.nextInt(899) + 100;
                                    phonenum = "(" + dig1 + ")" + dig2 + "-" + dig3;
                                    //walletID
                                    walletID = "";
                                    int letter;
                                    for (int y = 0; y < 26; y++) {
                                        letter = ran.nextInt(10);
                                        walletID = walletID + letter;
                                    }
                                    //model
                                    vmodelnum = ran.nextInt(8);
                                    if (vmodelnum == 0) vmodel = "Apple";
                                    else if (vmodelnum == 1) vmodel = "Samsung";
                                    else if (vmodelnum == 2) vmodel = "Sony";
                                    else if (vmodelnum == 3) vmodel = "Huawei";
                                    else if (vmodelnum == 4) vmodel = "Motorola";
                                    else if (vmodelnum == 5) vmodel = "Xiaomi";
                                    else if (vmodelnum == 6) vmodel = "LG";
                                    else if (vmodelnum == 7) vmodel = "Asus";
                                    //RAM
                                    vRAM = ran.nextInt(5) + 1;
                                    if (vRAM == 1) vRAM = 1;
                                    else if (vRAM == 2) vRAM = 2;
                                    else if (vRAM == 3) vRAM = 4;
                                    else if (vRAM == 4) vRAM = 8;
                                    else if (vRAM == 5) vRAM = 16;
                                    //ping
                                    vping = ran.nextInt(100) + 1;
                                    //download
                                    vdown = ran.nextInt(300) + 1;
                                    //upload
                                    vup = ran.nextInt(300) + 1;




                                    //walletcracked?
                                    crack = 0; //0=not cracked, 1=cracked

                                    //balance
                                    if (vencryptor <= 5) {
                                        vbalance = ran.nextInt(100000) + 200000; //
                                    } else if (vencryptor > 5) {
                                        vbalance = ran.nextInt(100000) + (100000 * 2 * vencryptor) - 50000;
                                    }
                                    
                                    vrestofbitcoin = "";
                                    if (vbalance < 10) vbitcoin = "0.0000000" + vbalance;
                                    else if (vbalance < 100) vbitcoin = "0.000000" + vbalance;
                                    else if (vbalance < 1000) vbitcoin = "0.00000" + vbalance;
                                    else if (vbalance < 10000) vbitcoin = "0.0000" + vbalance;
                                    else if (vbalance < 100000) vbitcoin = "0.000" + vbalance;
                                    else if (vbalance < 1000000) vbitcoin = "0.00" + vbalance;
                                    else if (vbalance < 10000000) vbitcoin = "0.0" + vbalance;
                                    else if (vbalance < 100000000) vbitcoin = "0." + vbalance;
                                    else if (vbalance < 1000000000) {
                                        if ((vbalance - ((vbalance /100000000)*100000000)) < 10) vrestofbitcoin = ".0000000" + (vbalance - ((vbalance /100000000)*100000000));
                                        else if ((vbalance - ((vbalance /100000000)*100000000)) < 100) vrestofbitcoin = ".000000" + (vbalance - ((vbalance /100000000)*100000000));
                                        else if ((vbalance - ((vbalance /100000000)*100000000)) < 1000) vrestofbitcoin = ".00000" + (vbalance - ((vbalance /100000000)*100000000));
                                        else if ((vbalance - ((vbalance /100000000)*100000000)) < 10000) vrestofbitcoin = ".0000" + (vbalance - ((vbalance /100000000)*100000000));
                                        else if ((vbalance - ((vbalance /100000000)*100000000)) < 100000) vrestofbitcoin = ".000" + (vbalance - ((vbalance /100000000)*100000000));
                                        else if ((vbalance - ((vbalance /100000000)*100000000)) < 1000000) vrestofbitcoin = ".00" + (vbalance - ((vbalance /100000000)*100000000));
                                        else if ((vbalance - ((vbalance /100000000)*100000000)) < 10000000) vrestofbitcoin = ".0" + (vbalance - ((vbalance /100000000)*100000000));
                                        else if ((vbalance - ((vbalance /100000000)*100000000)) < 100000000) vrestofbitcoin = "." + (vbalance - ((vbalance /100000000)*100000000));
                                        
                                        bitcoin = (balance /100000000) + vrestofbitcoin;
                                    }

                                    
                                    
                                    //about
                                    vabout = "company:\t" + vmodel + "\nprocessor:\t" + vCPU + "GHz, core i" + vcore + "\nmemory:\t\t" + vRAM + "Gb\nfirewall:\t" + vfirewall + "\nbypasser:\t" + vbypasser + "\ncracker:\t" + vcracker + "\nencryptor:\t" + vencryptor + "\nnetwork:\t" + vnetwork + "G\nping:\t\t" + vping + "ms\ndownload:\t" + vdown + " Mbps\nupload:\t\t" + vup + " Mbps\nphone number:\t" + phonenum;

                                    //pass
                                    pass = ran.nextInt(10000) + 1;
                                    if ((vfirewall - bypasser) < 0) pass = ran.nextInt(9000) + 1001;
                                    else if ((vfirewall - bypasser) < 1) pass = ran.nextInt(10000) + 1001;
                                    else if ((vfirewall - bypasser) < 2) pass = ran.nextInt(12000) + 1001;
                                    else if ((vfirewall - bypasser) < 3) pass = ran.nextInt(14000) + 1001;
                                    else if ((vfirewall - bypasser) < 4) pass = ran.nextInt(16000) + 1001;
                                    else if ((vfirewall - bypasser < 5)) pass = ran.nextInt(18000) + 1001;
                                    else if ((vfirewall - bypasser) > 5) pass = ran.nextInt(20000) + 1001;


                                    //IP
                                    do {
                                        help = "(e)xit\t\texit this device\n(h)elp\t\tdisplay this menu\n(w)allet\tgo to bitcoin wallet\n(c)rack\t\tcrack the bitcoin wallet password found on this device\n(a)bout\t\tshow device specs\n(g)et.<soft>\tdownloads this device\'s software to your local machine";

                                        System.out.print( "\n" + IP + "> ");
                                        cmdIP = input.next();

                                        if (cmdIP.equals("h") || cmdIP.equals("help")) {
                                            System.out.println(help);
                                        } else if (cmdIP.equals("a") || cmdIP.equals("about")) {
                                            System.out.println(vabout);

                                        } else if (cmdIP.equals("get.firewall") || cmdIP.equals("g.firewall") || cmdIP.equals("g.bypasser") || cmdIP.equals("get.bypasser") || cmdIP.equals("g.cracker") || cmdIP.equals("get.cracker") || cmdIP.equals("g.encryptor") || cmdIP.equals("get.encryptor")) {
                                            int upgrade = 0;
                                            if (cmdIP.equals("get.firewall") || cmdIP.equals("g.firewall")) {
                                                if (vfirewall > firewall) {
                                                    upgrade = 1;
                                                    softwarelevel = vfirewall;
                                                }
                                            } else if (cmdIP.equals("g.bypasser") || cmdIP.equals("get.bypasser")) {
                                                if (vbypasser> bypasser) {
                                                    upgrade = 1;
                                                    softwarelevel = vbypasser;
                                                }
                                            } else if (cmdIP.equals("g.cracker") || cmdIP.equals("get.cracker")) {
                                                if (vcracker > cracker) {
                                                    upgrade = 1;
                                                    softwarelevel = vcracker; 
                                                }
                                            } else if (cmdIP.equals("g.encryptor") || cmdIP.equals("get.encryptor")) {
                                                if (vencryptor > encryptor) {
                                                    upgrade = 1;
                                                    softwarelevel = vencryptor;
                                                }
                                            }

                                            if (upgrade == 1){
                                                System.out.print("downloading packages... ");
                                                for (percent = 0; percent <= 100; percent++) {
                                                    if (percent < 10) {
                                                        System.out.print(percent + "%");
                                                        TimeUnit.MILLISECONDS.sleep((long) Math.pow(softwarelevel, 0.5) * 50/ (int) Math.pow(network*down, 0.4));
                                                        System.out.print("\b\b");
                                                    } else if (percent >= 10 && percent < 99) {
                                                        System.out.print(percent + "%");
                                                        TimeUnit.MILLISECONDS.sleep((long) Math.pow(softwarelevel, 0.5) * 45/ (int) Math.pow(network*down, 0.4));
                                                        System.out.print("\b\b\b");
                                                    } else if (percent == 99) {
                                                        System.out.print(percent + "%");
                                                        TimeUnit.MILLISECONDS.sleep((long) Math.pow(softwarelevel, 0.5) * 200/ (int) Math.pow(network*down, 0.4));
                                                        System.out.print("\b\b\b");
                                                    } else if (percent == 100) {
                                                        System.out.print(percent + "%");
                                                        TimeUnit.MILLISECONDS.sleep((long) Math.pow(softwarelevel, 0.5) * 40/ (int) Math.pow(network*down, 0.4));
                                                    }
                                                }
                                                System.out.print("\ndownload complete!\nopening packages... ");
                                                for (percent = 0; percent <= 100; percent++) {
                                                    if (percent < 10) {
                                                        System.out.print(percent + "%");
                                                        TimeUnit.MILLISECONDS.sleep((long) Math.pow(softwarelevel, 0.5) * 20/ (int) Math.pow(network*down, 0.4));
                                                        System.out.print("\b\b");
                                                    } else if (percent >= 10 && percent < 99) {
                                                        System.out.print(percent + "%");
                                                        TimeUnit.MILLISECONDS.sleep((long) Math.pow(softwarelevel, 0.5) * 15/ (int) Math.pow(network*down, 0.4));
                                                        System.out.print("\b\b\b");
                                                    } else if (percent == 99) {
                                                        System.out.print(percent + "%");
                                                        TimeUnit.MILLISECONDS.sleep((long) Math.pow(softwarelevel, 0.5) * 100/ (int) Math.pow(network*down, 0.4));
                                                        System.out.print("\b\b\b");
                                                    } else if (percent == 100) {
                                                        System.out.print(percent + "%");
                                                        TimeUnit.MILLISECONDS.sleep((long) Math.pow(softwarelevel, 0.5) * 20/ (int) Math.pow(network*down, 0.4));
                                                    }
                                                }
                                                System.out.print("\ninstalling packages...");
                                                for (percent = 0; percent <= 100; percent++) {
                                                    if (percent < 10) {
                                                        System.out.print(percent + "%");
                                                        TimeUnit.MILLISECONDS.sleep((long) Math.pow(softwarelevel, 0.5)*30/(int) (Math.pow(core*RAM, 0.4)));
                                                        System.out.print("\b\b");
                                                    } else if (percent >= 10 && percent < 99) {
                                                        System.out.print(percent + "%");
                                                        TimeUnit.MILLISECONDS.sleep((long) Math.pow(softwarelevel, 0.5)*20/(int) (Math.pow(core*RAM, 0.4)));
                                                        System.out.print("\b\b\b");
                                                    } else if (percent == 99) {
                                                        System.out.print(percent + "%");
                                                        TimeUnit.MILLISECONDS.sleep((long) Math.pow(softwarelevel, 0.5)*200/(int) (Math.pow(core*RAM, 0.4)));
                                                        System.out.print("\b\b\b");
                                                    } else if (percent == 100) {
                                                        System.out.print(percent + "%");
                                                        TimeUnit.MILLISECONDS.sleep((long) Math.pow(softwarelevel, 0.5)*20/(int) (Math.pow(core*RAM, 0.25)));
                                                    }
                                                }
                                                System.out.println("\ninstall complete!");
                                        

                                                if (cmdIP.equals("g.firewall") || cmdIP.equals("get.firewall")) {
                                                    firewall = vfirewall;
                                                    System.out.println("\nfirewall upgraded to level " + firewall);
                                                    TimeUnit.SECONDS.sleep((long) 1);
                                                } else if (cmdIP.equals("g.bypasser") || cmdIP.equals("get.bypasser")) {
                                                    bypasser = vbypasser;
                                                    System.out.println("\nbypasser upgraded to level " + bypasser);
                                                    TimeUnit.SECONDS.sleep((long) 1);
                                                } else if (cmdIP.equals("g.cracker") || cmdIP.equals("get.cracker")) {
                                                    cracker = vcracker;
                                                    System.out.println("\ncracker upgraded to level " + cracker);
                                                    TimeUnit.SECONDS.sleep((long) 1);
                                                } else if (cmdIP.equals("g.encryptor") || cmdIP.equals("get.encryptor")) {
                                                    encryptor = vencryptor;
                                                    System.out.println("\nencryptor upgraded to level " + encryptor);
                                                    TimeUnit.SECONDS.sleep((long) 1);
                                                }

                                            } else if (upgrade == 0) {
                                                System.out.println("you have a later version installed on your machine");
                                            }


                                        } else if (cmdIP.equals("g.core") || cmdIP.equals("get.core") || cmdIP.equals("g.CPU") || cmdIP.equals("get.CPU") || cmdIP.equals("g.processor") || cmdIP.equals("get.processor") || cmdIP.equals("get.RAM") || cmdIP.equals("g.RAM") || cmdIP.equals("get.memory") || cmdIP.equals("g.memory")) {
                                            System.out.println("you can't download hardware...");
                                        } else if (cmdIP.equals("g.network") || cmdIP.equals("get.network") || cmdIP.equals("g.ping") || cmdIP.equals("get.ping") || cmdIP.equals("g.download") || cmdIP.equals("get.download") || cmdIP.equals("g.upload") || cmdIP.equals("get.upload")) {
                                            System.out.println("you can\'t download service...");
                                        }

                                        //wallet
                                        else if (cmdIP.equals("w") || cmdIP.equals("wallet")) {
                                            if (crack == 1) {
                                                help = "(e)xit\t\texits this wallet\n(h)elp\t\tdisplay this menu\n(b)alance\tshow wallet ballance\n(t)ransfer\ttransfer bitcoins to your account";
                                                
                                                if (wallettips == 0) {
                                                    System.out.println("\nGreat job! You now have access to the bitcoin wallet. You can simply transfer all the bitcoins to your own account.");
                                                    System.out.print("\nPress Enter key to continue...");
                                                    input.nextLine();
                                                    input.nextLine();
                                                    System.out.println("");
                                                    wallettips = 1;
                                                }

                                                System.out.println("Type 'help' or 'h' for help");
                                                do {
                                                    System.out.print("\n" + walletID + "> ");
                                                    cmdw = input.next();

                                                    if (cmdw.equals("h") || cmdw.equals("help")) {
                                                        System.out.println(help);

                                                    } else if (cmdw.equals("b") || cmdw.equals("balance")) {
                                                        System.out.println("your balance is: " + vbitcoin + " ₿");

                                                    } else if (cmdw.equals("t") || cmdw.equals("transfer")) {
                                                        System.out.print("processing the transaction...");
                                                        TimeUnit.SECONDS.sleep((long) (int) (12 / network));
                                                        System.out.println("transaction successful!\ntotal:\t -" + vbitcoin + " ₿\nthis account\'s balance is: 0.00000000 ₿");
                                                        balance = balance + vbalance;
                                                        vbalance = 0;
                                                        vbitcoin = "0.00000000";
                                                    } else if (cmdw.equals("e") || cmdw.equals("exit")) {

                                                    } else {
                                                        System.out.println("command not found: " + cmdw);
                                                    }

                                                } while (!cmdw.equals("e") && !cmdw.equals("exit"));
                                            } else if (crack == 0) {
                                                System.out.println("ACCESS DENIED!");
                                            }

                                        //crack    
                                        } else if (cmdIP.equals("c") || cmdIP.equals("crack")) {
                                            System.out.print("establishing connection to the wallet servers... ");
                                            for (percent = 0; percent <= 100; percent++) {
                                                if (percent < 10) {
                                                    System.out.print(percent + "%");
                                                    TimeUnit.MILLISECONDS.sleep((long) 20* (int) (Math.pow(ping * 10, 0.25)/Math.pow(network * 2, 0.5)));
                                                    System.out.print("\b\b");
                                                } else if (percent >= 10 && percent < 99) {
                                                    System.out.print(percent + "%");
                                                    TimeUnit.MILLISECONDS.sleep((long) 10*(int) (Math.pow(ping * 10, 0.25)/(Math.pow(network * 2, 0.5))));
                                                    System.out.print("\b\b\b");
                                                } else if (percent == 99) {
                                                    System.out.print(percent + "%");
                                                    TimeUnit.MILLISECONDS.sleep((long) 100*(int) (Math.pow(ping * 10, 0.25)/Math.pow(network * 2, 0.5)));
                                                    System.out.print("\b\b\b");
                                                } else if (percent == 100) {
                                                    System.out.print(percent + "%");
                                                    TimeUnit.MILLISECONDS.sleep((long) 40 * (int) (Math.pow(ping * 10, 0.25)/(Math.pow(network * 2, 0.5))));
                                                    System.out.print("\b\b\b");
                                                }
                                            }
                                            System.out.print("\nconnection established!\ntrying the password list: ");
                                            for (list = 0; list <= 10000 && !(list == pass); list++) {
                                                if (list < 10) {
                                                    System.out.print(list + "/10000");
                                                    TimeUnit.MILLISECONDS.sleep((long) 5 * (int)(Math.sqrt(vencryptor*10)) / ((int)(Math.pow((core * RAM*8), 0.25)) * (int)(Math.sqrt(cracker*10))));
                                                    System.out.print("\b\b\b\b\b\b\b");
                                                } else if (list >= 10 && list < 99) {
                                                    System.out.print(list + "/10000");
                                                    TimeUnit.MILLISECONDS.sleep((long) 5 * (int)(Math.sqrt(vencryptor*10)) / ((int)(Math.pow((core * RAM*8), 0.25)) * (int)(Math.sqrt(cracker*10))));
                                                    System.out.print("\b\b\b\b\b\b\b\b");
                                                } else if (list >= 100 && list < 999) {
                                                    System.out.print(list + "/10000");
                                                    TimeUnit.MILLISECONDS.sleep((long) 5 * (int)(Math.sqrt(vencryptor*10)) / ((int)(Math.pow((core * RAM*8), 0.25)) * (int)(Math.sqrt(cracker*10))));
                                                    System.out.print("\b\b\b\b\b\b\b\b\b");
                                                } else if (list >= 1000 && list < 10000) {
                                                    System.out.print(list + "/10000");
                                                    TimeUnit.MILLISECONDS.sleep((long) 5 * (int)(Math.sqrt(vencryptor*10)) / ((int)(Math.pow((core * RAM*8), 0.25)) * (int)(Math.sqrt(cracker*10))));
                                                    System.out.print("\b\b\b\b\b\b\b\b\b\b");
                                                } else if (list == pass) {
                                                    System.out.println(list + "/10000");
                                                }
                                                

                                            }
                                            
                                            if (list == pass) {
                                                System.out.println(pass + "/10000\ncrack successful!");
                                                crack = 1;
                                            } else {
                                                System.out.println("crack unsuccessful");
                                                crack = 0;
                                            }


                                        } else if (cmdIP.equals("e") || cmdIP.equals("exit")) {

                                        } else {
                                            System.out.println("command not found: " + cmdIP);
                                        }
                                        
                                        
                                        //end of IP
                                    } while (!cmdIP.equals("e") && !cmdIP.equals("exit"));


                                } else if (hack == 0) {
                                    System.out.println("\nbypass failed.");
                                }
                                
                            
                            } else if (cmds.equals("e") || cmds.equals("exit")) {

                            } else {
                                System.out.println("command not found: " + cmds);
                            }
                            

        
                            //end of scanner
                        } while (!cmds.equals("e") && !cmds.equals("exit"));
                        
        
        
        
                    //myWallet
                    } else if (cmdh.equals("w") || cmdh.equals("wallet")) {
                        cmdw = "";
                        System.out.print("establishing connection to the wallet servers... ");
                        for (percent = 0; percent <= 100; percent++) {
                            if (percent < 10) {
                                System.out.print(percent + "%");
                                TimeUnit.MILLISECONDS.sleep((long) 20* (int) (Math.pow(ping * 10, 0.25)/Math.pow(network * 2, 0.5)));
                                System.out.print("\b\b");
                            } else if (percent >= 10 && percent < 99) {
                                System.out.print(percent + "%");
                                TimeUnit.MILLISECONDS.sleep((long) 10*(int) (Math.pow(ping * 10, 0.25)/(Math.pow(network * 2, 0.5))));
                                System.out.print("\b\b\b");
                            } else if (percent == 99) {
                                System.out.print(percent + "%");
                                TimeUnit.MILLISECONDS.sleep((long) 100*(int) (Math.pow(ping * 10, 0.25)/Math.pow(network * 2, 0.5)));
                                System.out.print("\b\b\b");
                            } else if (percent == 100) {
                                System.out.print(percent + "%");
                                TimeUnit.MILLISECONDS.sleep((long) 40 * (int) (Math.pow(ping * 10, 0.25)/(Math.pow(network * 2, 0.5))));
                                System.out.print("\b\b\b");
                            }
                        }
                        System.out.println("\nconnection established!\nType 'help' or 'h' for help");
                        help = "(e)xit\t\texit this bank account\n(h)elp\t\tdisplay this menu\n(b)alance\tshow wallet ballance";
                        do {
                            System.out.print("\n55648295403512975220499943> ");
                            cmdw = input.next();
                            if (cmdw.equals("h") || cmdw.equals("help")) {
                                System.out.println(help);
                            } else if (cmdw.equals("b") || cmdw.equals("balance")) {
                                System.out.println("your balance is: " + bitcoin + " ₿");
                            } else if (cmdw.equals("e") || cmdw.equals("exit")) { 

                            } else {
                                System.out.println("command not found: " + cmdw);
                            }
                        } while (!cmdw.equals("e") && !cmdw.equals("exit"));


                        
                    } else if (cmdh.equals("a") || cmdh.equals("about")) {
                        System.out.println(about);
                    } 
                    



                    //upgrade
                    else if (cmdh.equals("u") || cmdh.equals("upgrade")) {

                        if (upgradetips == 0) {
                            System.out.println("I have noticed your machine isn't very strong. You can upgrade almost anything in your system. You can upgrade FIREWALL to increase your security and lower the chance of getting hacked. Devices that you will hack also have firewall. The higher the firewall, the harder it it to bypass it. By upgrading BYPASSER, you can bypass higher level firewalls, increase your chances of bypassing the device and decrease the time it takes. By upgrading ENCRYPTOR, you can secure your wallet. But your victims also have encryptors, the higher their level, the harder they are to crack. By upgrading your CRACKER, you can crack higher level encryptors, increase your chances of success, and decrease the time it takes to crack them.");
                            System.out.print("\nPress Enter key to continue...");
                            input.nextLine();
                            input.nextLine();
                            System.out.println("");
                            System.out.println("You can also upgrade your hardware, including your processor and RAM. The stronger they are, the faster you can process things. That includes cracking, bypassing, loading, and installing software. Installing hardware needs a system reboot. Don\'t worry, you won\'t lose any data.");
                            System.out.print("\nPress Enter key to continue...");
                            input.nextLine();
                            System.out.println("");
                            System.out.println("You can also upgrade your network, including your network generation, download and upload speeds, and ping. Doing so, makes anything that has to do with internet, faster.");
                            System.out.print("\nPress Enter key to continue...");
                            input.nextLine();
                            System.out.println("");
                            System.out.println("You can also download softwares like bypasser, encryptor, firewall, and encryptor from the devices that you hack. That saves you some bitcoins.");
                            System.out.print("\nPress Enter key to continue...");
                            input.nextLine();
                            System.out.println("");
                            upgradetips = 1;
                        }
                        
                        
                        //upgrade command
                        do {

                            //balance
                            restofbitcoin = "";
                            if (balance < 10) bitcoin = "0.0000000" + balance;
                            else if (balance < 100) bitcoin = "0.000000" + balance;
                            else if (balance < 1000) bitcoin = "0.00000" + balance;
                            else if (balance < 10000) bitcoin = "0.0000" + balance;
                            else if (balance < 100000) bitcoin = "0.000" + balance;
                            else if (balance < 1000000) bitcoin = "0.00" + balance;
                            else if (balance < 10000000) bitcoin = "0.0" + balance;
                            else if (balance < 100000000) bitcoin = "0." + balance;
                            else if (balance < 1000000000) {
                                if ((balance - ((balance /100000000)*100000000)) < 10) restofbitcoin = ".0000000" + (balance - ((balance /100000000)*100000000));
                                else if ((balance - ((balance /100000000)*100000000)) < 100) restofbitcoin = ".000000" + (balance - ((balance /100000000)*100000000));
                                else if ((balance - ((balance /100000000)*100000000)) < 1000) restofbitcoin = ".00000" + (balance - ((balance /100000000)*100000000));
                                else if ((balance - ((balance /100000000)*100000000)) < 10000) restofbitcoin = ".0000" + (balance - ((balance /100000000)*100000000));
                                else if ((balance - ((balance /100000000)*100000000)) < 100000) restofbitcoin = ".000" + (balance - ((balance /100000000)*100000000));
                                else if ((balance - ((balance /100000000)*100000000)) < 1000000) restofbitcoin = ".00" + (balance - ((balance /100000000)*100000000));
                                else if ((balance - ((balance /100000000)*100000000)) < 10000000) restofbitcoin = ".0" + (balance - ((balance /100000000)*100000000));
                                else if ((balance - ((balance /100000000)*100000000)) < 100000000) restofbitcoin = "." + (balance - ((balance /100000000)*100000000));
                                bitcoin = (balance /100000000) + restofbitcoin;
                            }

                            help  = "(e)xit\t\texits upgrade menu\n(h)elp\t\tdisplay this menu\n(g)et.<specs>\tupgrades your computer (needs a reboot after)\n(a)bout\tshows your machine\'s current specs";
                            updatetype = "";
                            update = "";
                            //prices   
                            
                            
                            //core
                            if (core == 3) {
                                coreupgrade = 5;
                                coreprice = 3000000;
                                bitcore = "0.03000000";
                            } else if (core == 5) {
                                coreupgrade = 7;
                                coreprice = 6000000;
                                bitcore = "0.06000000";
                            } else if (core == 7) {
                                coreupgrade = 9;
                                coreprice = 12000000;
                                bitcore = "0.18000000";
                            }

                            //RAM
                            if (RAM == 1) {
                                RAMupgrade = 2;
                                RAMprice = 2000000;
                                bitRAM = "0.02000000";
                            } else if (RAM == 2) {
                                RAMupgrade = 4;
                                RAMprice = 4000000;
                                bitRAM = "0.04000000";
                            } else if (RAM == 4) {
                                RAMupgrade = 8;
                                RAMprice = 8000000;
                                bitRAM = "0.08000000";
                            } else if (RAM == 8) {
                                RAMupgrade = 16;
                                RAMprice = 16000000;
                                bitRAM = "0.16000000";
                            }

                            //network
                            if (network == 3) {
                                netupgrade = 4;
                                netprice = 4000000;
                                bitnet = "0.04000000";
                            } else if (network == 4) {
                                netupgrade = 5;
                                netprice = 8000000;
                                bitnet = "0.08000000";
                            }

                            //firewall
                            fireupg = firewall +1;
                            fireprice = firewall * 100000 + 100000; 
                            if (fireprice < 1000) bitfire = "0.00000" + fireprice;
                            else if (fireprice < 10000) bitfire = "0.0000" + fireprice;
                            else if (fireprice < 100000) bitfire = "0.000" + fireprice;
                            else if (fireprice < 1000000) bitfire = "0.00" + fireprice;
                            else if (fireprice < 10000000) bitfire = "0.0" + fireprice;
                            else if (fireprice < 100000000) bitfire = "0." + fireprice;

                            //encryptor
                            encupg = encryptor + 1;
                            encprice = encryptor * 100000 + 100000;
                            if (encprice < 1000) bitenc = "0.00000" + encprice;
                            else if (encprice < 10000) bitenc = "0.0000" + encprice;
                            else if (encprice < 100000) bitenc = "0.000" + encprice;
                            else if (encprice < 1000000) bitenc = "0.00" + encprice;
                            else if (encprice < 10000000) bitenc = "0.0" + encprice;
                            else if (encprice < 100000000) bitenc = "0." + encprice;

                            //cracker
                            crackupg = cracker + 1;
                            crackprice = crackupg * 100000;
                            if (crackprice < 1000) bitcrack = "0.00000" + crackprice;
                            else if (crackprice < 10000) bitcrack = "0.0000" + crackprice;
                            else if (crackprice < 100000) bitcrack = "0.000" + crackprice;
                            else if (crackprice < 1000000) bitcrack = "0.00" + crackprice;
                            else if (crackprice < 10000000) bitcrack = "0.0" + crackprice;
                            else if (crackprice < 100000000) bitcrack = "0." + crackprice;

                            //bypasser
                            bypassupg = bypasser + 1;
                            bypassprice = bypassupg * 100000;
                            if (bypassprice < 1000) bitbypass = "0.00000" + bypassprice;
                            else if (bypassprice < 10000) bitbypass = "0.0000" + bypassprice;
                            else if (bypassprice < 100000) bitbypass = "0.000" + bypassprice;
                            else if (bypassprice < 1000000) bitbypass = "0.00" + bypassprice;
                            else if (bypassprice < 10000000) bitbypass = "0.0" + bypassprice;
                            else if (bypassprice < 100000000) bitbypass = "0." + bypassprice;

                            //ping
                            pingupg = ping - 5;
                            pingprice = ((100 - pingupg) / 5) * 100000 + 100000;
                            if (pingprice < 1000) bitping = "0.00000" + pingprice;
                            else if (pingprice < 10000) bitping = "0.0000" + pingprice;
                            else if (pingprice < 100000) bitping = "0.000" + pingprice;
                            else if (pingprice < 1000000) bitping = "0.00" + pingprice;
                            else if (pingprice < 10000000) bitping = "0.0" + pingprice;
                            else if (pingprice < 100000000) bitping = "0." + pingprice;

                            //download
                            downupg = down + 10;
                            downprice = downupg * 10000;
                            if (downprice < 1000) bitdown = "0.00000" + downprice;
                            else if (downprice < 10000) bitdown = "0.0000" + downprice;
                            else if (downprice < 100000) bitdown = "0.000" + downprice;
                            else if (downprice < 1000000) bitdown = "0.00" + downprice;
                            else if (downprice < 10000000) bitdown = "0.0" + downprice;
                            else if (downprice < 100000000) bitdown = "0." + downprice;

                            //upload
                            upupg = up + 10;
                            upprice = upupg * 10000;
                            if (upprice < 1000) bitup = "0.00000" + upprice;
                            else if (upprice < 10000) bitup = "0.0000" + upprice;
                            else if (upprice < 100000) bitup = "0.000" + upprice;
                            else if (upprice < 1000000) bitup = "0.00" + upprice;
                            else if (upprice < 10000000) bitup = "0.0" + upprice;
                            else if (upprice < 100000000) bitup = "0." + upprice;


                            System.out.println("upgrades:\n");

                            if (bypasser < 100) System.out.println("bypasser:\tlevel " + bypassupg + "  \t\t" + bitbypass + " ₿");
                            else System.out.println("bypasser:\tfully upgraded");

                            if (cracker < 100) System.out.println("cracker:\tlevel " + crackupg + "  \t\t" + bitcrack + " ₿");
                            else System.out.println("cracker:\tfully upgraded");

                            if (firewall < 100) System.out.println("firewall:\tlevel " + fireupg + "  \t\t" + bitfire + " ₿");
                            else System.out.println("firewall:\tfully upgraded");

                            if (encryptor < 100) System.out.println("encryptor:\tlevel " + encupg + "  \t\t" + bitenc + " ₿");
                            else System.out.println("encryptor:\tfully upgraded");

                            if (core < 9) System.out.println("processor:\tcore i" + coreupgrade + "  \t\t" + bitcore + " ₿");
                            else System.out.println("processor:\tfully upgraded");

                            if (RAM < 16) System.out.println("RAM:\t\t" + RAMupgrade + "Gb memory  \t\t" + bitRAM + " ₿");
                            else System.out.println("RAM:\t\tfully upgraded");

                            if (network < 5) System.out.println("network:\t" + netupgrade + "G\t\t\t" + bitnet + " ₿");
                            else System.out.println("network:\tfully upgraded");

                            if (ping > 10) System.out.println("ping:\t\t" + pingupg + "ms  \t\t\t" + bitping + " ₿");
                            else System.out.println("ping:\t\tfully upgraded");

                            if (down < 300) System.out.println("download:\t" + downupg + " Mbps  \t\t" + bitdown + " ₿");
                            else System.out.println("downlaod:\tfully upgraded");

                            if (up < 300) System.out.println("upload:\t\t" + upupg + " Mbps  \t\t" + bitup + " ₿");
                            else System.out.println("upload:\t\tfully upgraded");


                            System.out.println("\nyour balance is " + bitcoin + " ₿");



                            

                            System.out.print("\nupgrade> ");
                            cmdu = input.next();
                            

                            if (cmdu.equals("h") || cmdu.equals("help")) {
                                System.out.println(help);
                            }
                            else if (cmdu.equals("a") || cmdu.equals("about")) {
                                System.out.println(about);
                            } 

                            else if (cmdu.equals("g.bypasser") || cmdu.equals("get.bypasser")) {
                                if (bypasser < 100) {
                                    if (balance >= bypassprice) {
                                        bypasser ++;
                                        balance = balance - bypassprice;
                                        updatetype = "software";
                                        update = "bypasser";
                                    } else {
                                        System.out.print("not enough balance");
                                        TimeUnit.SECONDS.sleep((long) 1);
                                        System.out.println("");
                                    }
                                } else {
                                    System.out.print("bypasser is fully upgraded");
                                    TimeUnit.SECONDS.sleep((long) 1);
                                    System.out.println("");
                                }
                            }

                            else if (cmdu.equals("g.cracker") || cmdu.equals("get.cracker")) {
                                if (cracker < 100) {
                                    if (balance >= crackprice) {
                                        cracker ++;
                                        balance = balance - crackprice;
                                        updatetype = "software";
                                        update = "cracker";
                                    } else {
                                        System.out.print("not enough balance");
                                        TimeUnit.SECONDS.sleep((long) 1);
                                        System.out.println("");
                                    }
                                } else {
                                    System.out.print("cracker is fully upgraded");
                                    TimeUnit.SECONDS.sleep((long) 1);
                                    System.out.println("");
                                }
                            } 

                            else if (cmdu.equals("g.encryptor") || cmdu.equals("get.encryptor")) {
                                if (cracker < 100) {
                                    if (balance >= encprice) {
                                        encryptor ++;
                                        balance = balance - encprice;
                                        updatetype = "software";
                                        update = "encryptor";
                                    } else {
                                        System.out.print("not enough balance");
                                        TimeUnit.SECONDS.sleep((long) 1);
                                        System.out.println("");
                                    }
                                } else {
                                    System.out.print("encryptor is fully upgraded");
                                    TimeUnit.SECONDS.sleep((long) 1);
                                    System.out.println("");
                                }
                            } 

                            else if (cmdu.equals("g.firewall") || cmdu.equals("get.firewall")) {
                                if (firewall < 100) {
                                    if (balance >= fireprice) {
                                        firewall ++;
                                        balance = balance - fireprice;
                                        updatetype = "software";
                                        update = "firewall";
                                    } else {
                                        System.out.print("not enough balance");
                                        TimeUnit.SECONDS.sleep((long) 1);
                                        System.out.println("");
                                    }
                                } else {
                                    System.out.print("firewall is fully upgraded");
                                    TimeUnit.SECONDS.sleep((long) 1);
                                    System.out.println("");
                                }
                            }

                            else if (cmdu.equals("g.processor") || cmdu.equals("get.processor") || cmdu.equals("get.core") || cmdu.equals("g.core") || cmdu.equals("get.core") || cmdu.equals("g.core")) {
                                if (core < 9) {
                                    if (balance >= coreprice) {
                                        core = core + 2;
                                        cmdu = "e";
                                        cmdh = "e";
                                        balance = balance - coreprice;
                                        updatetype = "hardware";
                                        update = "core";
                                    } else {
                                        System.out.print("not enough balance");
                                        TimeUnit.SECONDS.sleep((long) 1);
                                        System.out.println("");
                                    }
                                } else {
                                    System.out.print("processor is fully upgraded");
                                    TimeUnit.SECONDS.sleep((long) 1);
                                    System.out.println("");
                                }
                            }

                            else if (cmdu.equals("g.RAM") || cmdu.equals("get.RAM") || cmdu.equals("get.memory") || cmdu.equals("g.memory") || cmdu.equals("get.ram") || cmdu.equals("g.ram")) {
                                if (RAM < 16) {
                                    if (balance >= RAMprice) {
                                        RAM = RAM * 2;
                                        cmdu = "e";
                                        cmdh = "e";
                                        balance = balance - RAMprice;
                                        updatetype = "hardware";
                                        update = "RAM";
                                        
                                    } else {
                                        System.out.print("not enough balance");
                                        TimeUnit.SECONDS.sleep((long) 1);
                                        System.out.println("");
                                    }
                                } else {
                                    System.out.print("RAM is fully upgraded");
                                    TimeUnit.SECONDS.sleep((long) 1);
                                    System.out.println("");
                                }
                            }

                            else if (cmdu.equals("g.network") || cmdu.equals("get.network")) {
                                if (network < 5) {
                                    if (balance >= netprice) {
                                        network ++;
                                        balance = balance - netprice;
                                        updatetype = "network";
                                        update = "network";
                                    } else {
                                        System.out.print("not enough balance");
                                        TimeUnit.SECONDS.sleep((long) 1);
                                        System.out.println("");
                                    }
                                } else {
                                    System.out.print("network is fully upgraded");
                                    TimeUnit.SECONDS.sleep((long) 1);
                                    System.out.println("");
                                }
                            }
                            else if (cmdu.equals("g.ping") || cmdu.equals("get.ping")) {
                                if (ping > 10) {
                                    if (balance >= pingprice) {
                                        ping = ping - 5;
                                        balance = balance - pingprice;
                                        updatetype = "network";
                                        update = "ping";
                                    } else {
                                        System.out.print("not enough balance");
                                        TimeUnit.SECONDS.sleep((long) 1);
                                        System.out.println("");
                                    }
                                } else {
                                    System.out.print("ping is fully upgraded");
                                    TimeUnit.SECONDS.sleep((long) 1);
                                    System.out.println("");
                                }
                            }

                            else if (cmdu.equals("g.download") || cmdu.equals("get.download")) {
                                if (down < 990) {
                                    if (balance >= downprice) {
                                        down = down + 10;
                                        balance = balance - downprice;
                                        updatetype = "network";
                                        update = "download";
                                    } else {
                                        System.out.print("not enough balance");
                                        TimeUnit.SECONDS.sleep((long) 1);
                                        System.out.println("");
                                    }
                                } else {
                                    System.out.print("download is fully upgraded");
                                    TimeUnit.SECONDS.sleep((long) 1);
                                    System.out.println("");
                                }
                            }

                            else if (cmdu.equals("g.upload") || cmdu.equals("get.upload")) {
                                if (up < 990) {
                                    if (balance >= upprice) {
                                        up = up + 10;
                                        balance = balance - upprice;
                                        updatetype = "network";
                                        update = "upload";
                                    } else {
                                        System.out.print("not enough balance");
                                        TimeUnit.SECONDS.sleep((long) 1);
                                        System.out.println("");
                                    }
                                } else {
                                    System.out.print("upload is fully upgraded");
                                    TimeUnit.SECONDS.sleep((long) 1);
                                    System.out.println("");
                                }
                            }

                            else if (cmdu.equals("e") || cmdu.equals("exit")) {

                            }
                            else {
                                System.out.println("command not found: " + cmdu);
                                TimeUnit.SECONDS.sleep((long) 1);
                            }

                            int updatelevel = 0;
                            if (update.equals("firewall")) updatelevel = fireupg;
                            else if (update.equals("cracker")) updatelevel = crackupg;
                            else if (update.equals("encryptor")) updatelevel = encupg;
                            else if (update.equals("bypasser")) updatelevel = bypassupg;

                            if (updatetype.equals("software")) {
                                System.out.print("downloading packages... ");
                                for (percent = 0; percent <= 100; percent++) {
                                    if (percent < 10) {
                                        System.out.print(percent + "%");
                                        TimeUnit.MILLISECONDS.sleep((long) 300 /(int) Math.pow(network*down, 0.7));
                                        System.out.print("\b\b");
                                    } else if (percent >= 10 && percent < 99) {
                                        System.out.print(percent + "%");
                                        TimeUnit.MILLISECONDS.sleep((long) 150 /(int) Math.pow(network*down, 0.7));
                                        System.out.print("\b\b\b");
                                    } else if (percent == 99) {
                                        System.out.print(percent + "%");
                                        TimeUnit.MILLISECONDS.sleep((long) 900 /(int) Math.pow(network*down, 0.7));
                                        System.out.print("\b\b\b");
                                    } else if (percent == 100) {
                                        System.out.print(percent + "%");
                                        TimeUnit.MILLISECONDS.sleep((long) 100 /(int) Math.pow(network*down, 0.7));
                                    }
                                }
                                System.out.print("\ndownload complete!\nopening packages... ");
                                for (percent = 0; percent <= 100; percent++) {
                                    if (percent < 10) {
                                        System.out.print(percent + "%");
                                        TimeUnit.MILLISECONDS.sleep((long) 60/(int) Math.pow(core*RAM, 0.7));
                                        System.out.print("\b\b");
                                    } else if (percent >= 10 && percent < 99) {
                                        System.out.print(percent + "%");
                                        TimeUnit.MILLISECONDS.sleep((long) 30/(int) Math.pow(core*RAM, 0.7));
                                        System.out.print("\b\b\b");
                                    } else if (percent == 99) {
                                        System.out.print(percent + "%");
                                        TimeUnit.MILLISECONDS.sleep((long) 300/(int) Math.pow(core*RAM, 0.7));
                                        System.out.print("\b\b\b");
                                    } else if (percent == 100) {
                                        System.out.print(percent + "%");
                                        TimeUnit.MILLISECONDS.sleep((long) 30/(int) Math.pow(core*RAM, 0.7));
                                    }
                                }
                                System.out.print("\ninstalling packages... ");
                                for (percent = 0; percent <= 100; percent++) {
                                    if (percent < 10) {
                                        System.out.print(percent + "%");
                                        TimeUnit.MILLISECONDS.sleep((long) 100/(int) Math.pow(core*RAM, 0.7));
                                        System.out.print("\b\b");
                                    } else if (percent >= 10 && percent < 99) {
                                        System.out.print(percent + "%");
                                        TimeUnit.MILLISECONDS.sleep((long) 50/(int) Math.pow(core*RAM, 0.7));
                                        System.out.print("\b\b\b");
                                    } else if (percent == 99) {
                                        System.out.print(percent + "%");
                                        TimeUnit.MILLISECONDS.sleep((long) 600/(int) Math.pow(core*RAM, 0.7));
                                        System.out.print("\b\b\b");
                                    } else if (percent == 100) {
                                        System.out.print(percent + "%");
                                        TimeUnit.MILLISECONDS.sleep((long) 50/(int) Math.pow(core*RAM, 0.7));
                                    }
                                }
                                System.out.print("\ninstall complete!\n\n" + update + " updated to level " + updatelevel);
                                TimeUnit.SECONDS.sleep((long) 2);
                                System.out.println("");
                                


                            } else if (updatetype.equals("hardware")) {
                                System.out.print("installing drivers ");
                                for (percent = 0; percent <= 100; percent++) {
                                    if (percent < 10) {
                                        System.out.print(percent + "%");
                                        TimeUnit.MILLISECONDS.sleep((long) 200/(int) Math.pow(core*RAM, 0.7));
                                        System.out.print("\b\b");
                                    } else if (percent >= 10 && percent < 99) {
                                        System.out.print(percent + "%");
                                        TimeUnit.MILLISECONDS.sleep((long) 150/(int) Math.pow(core*RAM, 0.7));
                                        System.out.print("\b\b\b");
                                    } else if (percent == 99) {
                                        System.out.print(percent + "%");
                                        TimeUnit.MILLISECONDS.sleep((long) 1000/(int) Math.pow(core*RAM, 0.7));
                                        System.out.print("\b\b\b");
                                    } else if (percent == 100) {
                                        System.out.print(percent + "%");
                                        TimeUnit.MILLISECONDS.sleep((long) 200/(int) Math.pow(core*RAM, 0.7));
                                    }
                                }
                                System.out.print("\ninstall complete");
                                TimeUnit.SECONDS.sleep((long) 1);
                                System.out.println("\n");
                                if (update.equals("RAM")) System.out.print("memory updated to " + RAMupgrade + "Gb");
                                else if (update.equals("core")) System.out.print("proccessor updated to core i" + coreupgrade);
                                TimeUnit.SECONDS.sleep((long) 2);
                                System.out.print("\n\nrebooting system...");
                                TimeUnit.MILLISECONDS.sleep((long) 10000 / (int) Math.pow(core*RAM, 0.7));
                                System.out.println("\nLocal System Startup\nBootup Complete\nVersion 3.6.209\n2020 all rights reserved\nStarted: " + ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME) + "\nType 'help' or 'h' for help.");



                            } else if (updatetype.equals("network")) {
                                System.out.print("requesting update from ISP...");
                                TimeUnit.MILLISECONDS.sleep((long) 50000/up);
                                System.out.print("\nrequest accepted!");
                                TimeUnit.MILLISECONDS.sleep((long) 100); 
                                System.out.print("\nISP operator updating your network...");
                                TimeUnit.SECONDS.sleep((long) 4);
                                System.out.println("\nnetwork updated!");
                                if (update.equals("network")) System.out.print("\nnetwork updated to " + netupgrade + "G");
                                else if (update.equals("ping")) System.out.print("\nping decrease by 5ms to " + pingupg + "ms");
                                else if (update.equals("download")) System.out.print("\ndownload speed increased by 10 Mbps to " + downupg + " Mbps");
                                else if (update.equals("upload")) System.out.print("\nupload speed increased by 10 Mbps to " + upupg + " Mbps");

                                TimeUnit.SECONDS.sleep((long) 4);

                                System.out.println("\n");
                            }
                                

                        } while (!cmdu.equals("e") && !cmdu.equals("exit"));
                        

                        


                    }





                    else if (cmdh.equals("e") || cmdh.equals("exit")) {

                    } else {
                        System.out.println("command not found: " + cmdh);
                    }
                    //end of hackount
                } while (!cmdh.equals("e") && !cmdh.equals("exit"));




            } else if (cmdl.equals("e") || cmdl.equals("exit")) {

            } else {
                System.out.println("command not found: " + cmdl);
            }
            //end of localhost
        } while ((!cmdl.equals("e") && !cmdl.equals("exit")));



        input.close();
    }
}