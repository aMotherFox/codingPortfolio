import java.util.List;
import java.util.Scanner;

/*
RPG challenge
Requirements:
1.) User must pick at least 1;
    - string
    - number
    - boolean

2.) Program must use at least 1 list/array
    -i.e. combine all numbers, combine strings

3.)At least 10 stages

4.) AT LEAST 
    - 1 private static method
    - 2 public static methods FROM ANOTHER CLASS

5.) Have at least 2 ways the user can stop the program earlier than intended (System.exit)
*/

public class RolePlayingGame {
    
    public static void main(String[] args) {

        //new = instanciate
        Scanner scanner = new Scanner(System.in); //instanciating a Scanner object

        System.out.print(" 'Hey, Listen!' ");
        System.out.print(" Your eyes flutter open against the sunlight, soft breeze on your skin. You had decided to take a nap in the shade of the biggest tree in the Great Hyrule forest. ");
        System.out.print(" You notice a small orb of light dancing in front of your eyes and as your vision comes back into focus, you realize it's a little fairy. The scent of fresh fruits fill you nose as you take in her appearance. ");
        System.out.print(" She wears a bouncy white dress made of flower petals, her wavy brown hair pulled into a half ponytail, adorned with a flower crown that led your eyes straight to her petite pointed ears. ");
        System.out.print(" 'I'm Victoria! What is your name?', The fairy asks ");

        String userName = scanner.nextLine(); //stage 1
        System.out.println(" 'Hello, " + userName + "' the fairy giggles. ");
        System.out.print(" You ask Victoria if there is anything she needs from you. ");
        System.out.print(" 'I'm on my way to the midsummer picnic in the Korok Forest! All the bunnies, mice, squirrels, and fawns are waiting for me to arrive and use my magic to summon the fireflies for the band's performance' Victoria said proudly. ");
        System.out.print(" 'I heard you're a kind hearted person who would help a little fairy like me. Is that true?' (true/false)");

        Boolean willHelp = scanner.nextBoolean(); //stage 2
        if (willHelp == true){
            System.out.println(" 'I'm so happy! so it is " + willHelp + " that you're a kind hearted person!' Victoria smiled with happy tears in her eyes. ");
        } else {
            System.out.println(" Victoria stares at you blankly. 'Then perish' she says ominously as your vision goes dark. ");
            System.exit(1);
        }
        System.out.print(" You stand, brushing the grass blades off your clothes as Victoria perches on your shoulder and you begin walking in the direction of Korok forest. ");
        System.out.print(" Unsure if you've actually made it out of the Great Hyrule Forest, you come to a path split in 3 directions. 'Which way should we go? Path 1, 2, or 3?', Victoria asks. ");

        Integer userNumberPick = scanner.nextInt(); //stage 3
        RolePlayClass.decidePath(userNumberPick);
        // if (userNumberPick == 1) {
        //     System.out.println(" You wander down the darkening winding path, a moss covered sign hiding the words 'Lost Woods' ");
        //     System.exit(1);
        // } else {
        //     System.out.println(" You wander down the bright scenic path, stopping to admire the shrines you pass. ");
        // }
        System.out.println(" 'You can tell we're in Korok Forest because of the shrines!' Victoria said cheerfully. ");
        System.out.println(" She led you to a forest clearing and there sat a pie cart that seemed sized for a child. ");
        System.out.println(" Victoria knocked on the wooden counter and up popped a racoon. 'Victoria!' the racoon said and hugged his fairy friend.  ");
        System.out.println(" 'Hello Scout!', Victoria said while hugging back. 'This is my friend  " + userName + " , I'd like to get some pies as we're headed to the midsummer picnic!' ");

        //scanner here for pie flavor array, choice called pieFlavor
        String pieFlavor = scanner.nextLine(); //stage 4
        System.out.println(" Victoria praises your choice of pie flavor. She buys one of each except for " + pieFlavor + " which she buys two. You pack the pies away into your satchel and continue your journey as Victoria perches again on your shoulder. ");
        System.out.println(" Victoria seems perfectly content, calling hellos to the butterflies as you both pass them by on the forest path. But you have noticed the forest noises have slowly gotten quieter and quieter. ");
        System.out.println(" Suddenly, it is still and silent. You open your mouth to ask Victoria if she senses anything strange, when from the shadows; A GIANT BROWN WOLF JUMPS OUT AT YOU!!! ");
        System.out.println(" You have a split second to make a decision!! Fight or flight!! Is it true or false that you are a fighter? (true/false)");

        //scanner here for fighting boolean, choice called fightOrFlight
        Boolean fightOrFlight = scanner.nextBoolean(); //stage 5
        RolePlayClass.decideFight(fightOrFlight);
        // if (fightOrFlight == true){
        //     System.out.println(" You lunge at the wolf and... it falls back screaming. 'What are you doing?!', Victoria yelled, 'That is Hyrule's sweetheart, Bucky!'.  ");
        //     System.out.println(" Now that he is in the light you can see the familiar puppy face of the famous dog celebrity, Bucky! He may be the size of a pony, but he's a worldwide known idol and every village sells stuffed animals of him! ");
        //     System.out.println(" Victoria stares at you blankly. 'I didn't know you were so violent," + userName + ". Maybe you shouldn't come to the party.' Victoria flutters to Bucky's back and she rides him like a pony off into the forest. Everything goes black. ");
        //     System.exit(1);
        // } else {
        //     System.out.println(" 'Don't run!', Victoria yelled, 'That's my friend, Bucky!' ");
        // }
        System.out.println(" Now that he is in the light you can see the familiar puppy face of the famous dog celebrity, Bucky! He may be the size of a pony, but he's a worldwide known idol and every village sells stuffed animals of him! He's known as Hyrule's Sweetheart!");
        System.out.println(" You apologize profousely for scaring Bucky, but being the most pure-hearted creature in all the lands, Bucky gracefully forgives you. ");
        System.out.println(" It turns out, Bucky is also going to the midsummer picnic! Not only that, but he is the lead performer that Victoria's firefly show will light the way for! ");
        System.out.println(" Bucky is, of course, just as considerate as he is handsome. ");
        System.out.println(" He asks how many miles you have walked: ");

        //scanner here for Integer, choice called milesWalked
        Integer milesWalked = scanner.nextInt(); //stage 6
        System.out.println(" Bucky gasped at your response. 'You mean to say you've walked " + milesWalked + " miles?? You two need some rest! Here, hop on! '. "); 
        System.out.println(" You saddle onto Bucky's back and he bounds off into the forest. Thanks to him, you all swiftly arrive at the picnic! It is in the clearing where the Master Sword once stood! ");
        System.out.println(" Victoria flutters off your shoulder and onto the ground, frolicking forwards to her friends. All the small critters ran to her as they exchanged hugs. "); 
        System.out.println(" The festivies go on for a few hours until the sky turns to twilight. Victoria soars into the air and calls all the fireflies! ");
        System.out.println(" Bucky takes the stage and the party goes silent other than some giggles and murmurs. 'Welcome to the annual midsummer picnic! I'm so glad we could be joined by everyone, and-' ");
        System.out.println(" 'NOT EVERYONE!!' a voice roared out. You turned to look as the party filled with screams of terror, and in the tree branches you saw him; King of the Tigers, Rocky!! ");
        System.out.println(" Rocky was the size of a slightly large house cat but his cruelty and misogyny was known throughout the lands! And he had a special grudge against Bucky. ");
        System.out.println(" 'Leave Bucky alone!' Victoria cried, but Rocky barred his teeth. 'Bucky, your time has come. I will never forgive you.' ");
        System.out.println(" Bucky, as gentle as his heart was, was also the bravest in the land and he stood tall in response. 'My brother, stop this feud. Mother feeds me more because I am 75lbs and you are 13lbs. Also, you are 7 years old, and have 15 feline girlfriends who are less than 3 years old. It's unbecoming for the Emre family name.'  ");
        System.out.println(" 'You sit on your ivory throne and lecture me! No longer! This is your end!' ");
        System.out.println(" Rocky lunges from the trees towards Bucky!! With only a second to decide, will you intervene? (Yes/No) ");  
        
        //scanner here for String, choice called saveBucky
        String saveBucky = scanner.nextLine(); //stage 7
        if (saveBucky == "No"){
            System.out.println(" You do not save Bucky, but he is also the most powerful in the land. Mid-air he disarms Rocky and pulls him into a bear hug, vowing to not fight his brother.  ");
            System.out.println(" The crowd cheered as Rocky cried 'NOOOOO' and the party continued. Everyone partied late into the night and all was well. ");
            System.exit(1);
        } else {
            System.out.println(" You snatch Rocky out of the air and hold him by the scruff so he goes limp. ");
        }
        System.out.println(" 'How?? How have you disarmed me??' Rocky hissed. ");
        System.out.println(" Victoria flutters forward. 'I believe my magic can cure him! Let me try!' She implored ");
        System.out.println(" Do you think it's true Rocky can be reformed? (true/false)");

        //scanner here for Rocky boolean, choice called saveRocky
        Boolean saveRocky = scanner.nextBoolean(); //stage 8
        if (saveRocky == false){
            System.out.println(" You decide it is too dangerous. Instead, you banish Rocky to the Lost Woods. Unfortunately you don't have the authority for that, so everyone just ignores Rocky until he feels really awkward and leaves.  ");
            System.out.println(" The party continues on! Go have fun! ");
            System.exit(1);
        } else {
            System.out.println(" Victoria sprinkles her fairy glitter onto Rocky. You cannot help but notice how stylish and talented she looks while doing it. ");
        }
        System.out.println(" Rocky begins glowing before his fur returns to it's normal grey color. Victoria had done it! She cured Rocky of his misogyny! ");
        System.out.println(" Will you accept Rocky's apology? (Yes/No)");

        String rockyApology = scanner.nextLine(); //stage 9
        if (rockyApology == "No"){
            System.out.println(" You suggest to Rocky that before he re-joins society as a productive member, first he should get some therapy. Maybe he can come to the next annual midsummer picnic.  ");
        } else {
            System.out.println(" The more the merrier! Now that Rocky is free from the shackles of the patriarchy, he's ready to be a productive member of society! ");
        }


    }

    // private static void something() {

    // }
}

//java objects and how to instantiate objects; constructors, getters, setters, and data models