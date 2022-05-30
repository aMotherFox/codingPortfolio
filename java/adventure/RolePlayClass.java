public class RolePlayClass {
    
    public static void decidePath(Integer userNumberPick) {
        //Integer userNumberPick = scanner.nextInt(); //stage 3
        //RolePlayClass.decidePath(userNumberPick);

        if (userNumberPick == 1) {
            System.out.println(" You wander down the darkening winding path, a moss covered sign hiding the words 'Lost Woods' ");
            System.exit(1);
        } else {
            System.out.println(" You wander down the bright scenic path, stopping to admire the shrines you pass. ");
        }

    }

    public static void decideFight(Boolean fightOrFlight) {
        //Boolean fightOrFlight = scanner.nextBoolean();
        //RolePlayClass.decideFight(fightOrFlight);

        if (fightOrFlight == true){
            System.out.println(" You lunge at the wolf and... it falls back screaming. 'What are you doing?!', Victoria yelled, 'That is Hyrule's sweetheart, Bucky!'.  ");
            System.out.println(" Now that he is in the light you can see the familiar puppy face of the famous dog celebrity, Bucky! He may be the size of a pony, but he's a worldwide known idol and every village sells stuffed animals of him! ");
            System.out.println(" Victoria stares at you blankly. 'I didn't know you were so violent... maybe you shouldn't come to the party.' Victoria flutters to Bucky's back and she rides him like a pony off into the forest. Everything goes black. ");
            System.exit(1);
        } else {
            System.out.println(" 'Don't run!', Victoria yelled, 'That's my friend, Bucky!' ");
        }

    }

    public static void sorryRocky(String rockyApology) {
        //String rockyApology = scanner.nextLine();
        //RolePlayClass.sorryRocky(rockyApology);

        if (rockyApology == "No"){
            System.out.println(" You suggest to Rocky that before he re-joins society as a productive member, first he should get some therapy. Maybe he can come to the next annual midsummer picnic.  ");
            System.exit(1);
        } else {
            System.out.println(" The more the merrier! Now that Rocky is free from the shackles of the patriarchy, he's ready to be a productive member of society! ");
        }

    }

    public static void eatPie(String pieFlavor) {
        //String rockyApology = scanner.nextLine();
        //RolePlayClass.sorryRocky(rockyApology);

        if (pieFlavor == "apple"){
            System.out.println(" Victoria praises your choice of pie flavor. She buys one of each except for " + pieFlavor + " which she buys two. You pack the pies away into your satchel and continue your journey as Victoria perches again on your shoulder. "); 
        } else if (pieFlavor == "peach") {
            System.out.println(" Victoria praises your choice of pie flavor. She buys one of each except for " + pieFlavor + " which she buys two. You pack the pies away into your satchel and continue your journey as Victoria perches again on your shoulder. ");               
        } else if (pieFlavor == "pumpkin") {
            System.out.println(" Victoria praises your choice of pie flavor. She buys one of each except for " + pieFlavor + " which she buys two. You pack the pies away into your satchel and continue your journey as Victoria perches again on your shoulder. ");               
        } else if (pieFlavor == "cherry") {
            System.out.println(" Victoria praises your choice of pie flavor. She buys one of each except for " + pieFlavor + " which she buys two. You pack the pies away into your satchel and continue your journey as Victoria perches again on your shoulder. ");               
        } else {
            System.out.println(" Victoria and Scout stare at you like a weirdo. 'I don't... sell that flavor' Scout said. Things become so awkward you decide to leave. ");
            System.exit(1);
        }

    }

    
    
}

//RolePlayClass.eatPie(pieFlavor);