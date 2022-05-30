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
        System.out.print(" 'I'm on my way to the midsummer picnic in the Korok Forest! All the bunnies, mice, squirrels, and fawns are waiting for me to arrive and use my magic to summon the fireflies for the band's performance' Victoria said proudly. Even though you just met the little fairy, you already new it made perfect sense that she would be so popular and beloved by the community. She is as sweet as she is beautiful. ");
        System.out.print(" 'I heard you're a kind hearted person who would help a little fairy like me. Is that true?' (true/false)");

        Boolean willHelp = scanner.nextBoolean(); //stage 2
        if (willHelp == true){
            System.out.println(" 'I'm so happy! so it is " + willHelp + " that you're a kind hearted person!' Victoria smiled with happy tears in her eyes. 'Thank you" + userName + " ' ");
        } else {
            System.out.println(" Victoria stares at you blankly. 'Then perish' she says ominously as your vision goes dark. ");
            System.exit(1);
        }
        System.out.print(" You stand, brushing the grass blades off your clothes as Victoria perches on your shoulder and you begin walking in the direction of Korok forest, the fairy's fluffy ponytail bouncing with each step. ");
        System.out.print(" Unsure if you've actually made it out of the Great Hyrule Forest, you come to a path split in 3 directions. 'Which way should we go? Path 1, 2, or 3?', Victoria asks. ");

        Integer userNumberPick = scanner.nextInt(); //stage 3
        RolePlayClass.decidePath(userNumberPick);
        System.out.println(" 'You can tell we're in Korok Forest because of the shrines!' Victoria said cheerfully. Victoria truly is as wise as she is beautiful. ");
        System.out.println(" She led you to a forest clearing and there sat a pie cart that seemed sized for a child. ");
        System.out.println(" Victoria knocked on the wooden counter and up popped a racoon. 'Victoria!' the racoon said and hugged his fairy friend.  ");
        System.out.println(" 'Hello Scout!', Victoria said while hugging back. 'This is my friend  " + userName + " , I'd like to get some pies as we're headed to the midsummer picnic!' Victoria truly is as generous as she is beautiful. ");
        System.out.println(" Victoria asks you to pick a pie flavor; will it be apple, pumpkin, cherry, or peach? ");

        //scanner here for pie flavor, choice called pieFlavor
        String pieFlavor = scanner.nextLine(); //stage 4
        System.out.println("You picked " + pieFlavor + "! ");
        System.out.println(" Victoria praises your choice. She buys one of each except for " + pieFlavor + " which she buys two. You pack the pies away into your satchel and continue your journey as Victoria perches again on your shoulder. ");
        System.out.println(" Victoria seems perfectly content, calling hellos to the butterflies as you both pass them by on the forest path. But you have noticed the forest noises have slowly gotten quieter and quieter. You become on-edge, as it would be horrible if something bad happened to the fairest fairy in all the land. ");
        System.out.println(" Suddenly, it is still and silent. You open your mouth to ask Victoria if she senses anything strange, when from the shadows; A GIANT BROWN WOLF JUMPS OUT AT YOU!!! ");
        System.out.println(" You have a split second to make a decision!! Fight or flight!! Is it true or false that you are a fighter? (true/false)");

        //scanner here for fighting boolean, choice called fightOrFlight
        Boolean fightOrFlight = scanner.nextBoolean(); //stage 5
        RolePlayClass.decideFight(fightOrFlight);
        System.out.println(" Now that he is in the light you can see the familiar puppy face of the famous dog celebrity, Bucky! He may be the size of a pony, but he's a worldwide known idol and every village sells stuffed animals of him! He's known as Hyrule's Sweetheart!");
        System.out.println(" You apologize profousely for scaring Bucky, but being the most pure-hearted creature in all the lands, Bucky gracefully forgives you. ");
        System.out.println(" It turns out, Bucky is also going to the midsummer picnic! Not only that, but he is the lead performer that Victoria's firefly show will light the way for! ");
        System.out.println(" Bucky is, of course, just as considerate as he is handsome. ");
        System.out.println(" He asks how many miles you have walked: ");

        //scanner here for Integer, choice called milesWalked
        Integer milesWalked = scanner.nextInt(); //stage 6
        System.out.println(" Bucky gasped at your response. 'You mean to say you've walked " + milesWalked + " miles?? You two need some rest! Here, hop on! '. "); 
        System.out.println(" You saddle onto Bucky's back and he bounds off into the forest. Thanks to him, you all swiftly arrive at the picnic! It is in the clearing where the Master Sword once stood! ");
        System.out.println(" Victoria flutters off your shoulder and onto the ground, frolicking forwards to her friends. All the small critters ran to her as they exchanged hugs. She is as popular as she is beautiful. Glitter sparkles with her every movement."); 
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
        System.out.println(" Victoria flutters forward. 'I believe my magic can cure him! Let me try!' She implored. She is as merciful as she is beautiful! ");
        System.out.println(" Do you think it's true Rocky can be reformed? (Yes/No)");

        //scanner here for Rocky boolean, choice called saveRocky
        String saveRocky = scanner.nextLine(); //stage 8
        if (saveRocky == "No"){
            System.out.println(" You decide it is too dangerous. Instead, you banish Rocky to the Lost Woods. Unfortunately you don't have the authority for that, so everyone just ignores Rocky until he feels really awkward and leaves.  ");
            System.out.println(" The party continues on! Go have fun! ");
            System.exit(1);
        } else {
            System.out.println(" Victoria sprinkles her fairy glitter onto Rocky. You cannot help but notice how stylish and talented she looks while doing it. If only every citizen of Hyrule could be in her prescence. ");
        }
        System.out.println(" Rocky begins glowing before his fur returns to it's normal grey color. Victoria had done it! She cured Rocky of his misogyny! ");
        System.out.println(" Will you accept Rocky's apology? (Yes/No)");

        String rockyApology = scanner.nextLine(); //stage 9
        RolePlayClass.sorryRocky(rockyApology);
        if (rockyApology == "No"){
            System.out.println(" You suggest to Rocky that before he re-joins society as a productive member, first he should get some therapy. Maybe he can come to the next annual midsummer picnic.  ");
            //System.exit(1);
        } else {
            System.out.println(" The more the merrier! Now that Rocky is free from the shackles of the patriarchy, he's ready to be a productive member of society! ");
        }
        System.out.println(" The party went on well into the night, until the moon was peaked directly above them in the sky. You looked around in confusion as Victoria floated above everyone's head. ");
        System.out.println(" 'It's time!' Victoria called out. Your bewildement only grew as everyone took a knee, facing the stage. Suddenly, you heard it. Loud, heavy steps, sending shockwaves through the ground. Something was coming. ");
        System.out.println(" The largest of the fawn pulled out a throne from backstage, quickly scampering off to also kneel with the crowd. From the parted trees, you saw it; a silent creature taking slow step after step, sending vibrations with the force of its weight. ");
        System.out.println(" It's white fur stood in sharp contrast to the red royal cloak and golden crown. It climbed the stairs to the stage at a snail's pace, and trudged to the throne, sending a minor earthquake through the half mile radius as it plopped down. ");
        System.out.println("The creature stared into the crowd with a blank face, unseeing to it's subjects. A minute of tense, defeaning silence shrowded the gathering, until finally, the creature on the throne opened it's mouth wide. ");
        System.out.println(" 'NIEVE HAS SPOKEN' Victoria cried and all the party guests grabbed armfuls of food, pouring it directly into the creature's mouth, unneeding to chew and swallowing whole. You stared frozen in shock and terror as this 'Nieve' gulped down hundreds of pounds of food, white fur becoming slathered in sauces, juices, and grease. ");
        System.out.println(" After a long ritual, the beast is finally satiated. Victoria delicately collapses to the ground in exhaustion, her face flushed innocently with exertion. You scoop her up in your hands and bring her to eye level. ");
        System.out.println("Do you ask Victoria what this ritual was, and who this Lord was? (Yes/No)");

        String nieve = scanner.nextLine(); //stage 10
        if (nieve == "No"){
            System.out.println(" Eventually the creature burps loudly, almost bursting everyone's ear drums, and waddles slowly back into the forest. ");
        } else {
            System.out.println(" 'That's Nieve, my cat. It is her birthday tomorrow so we promised to do this for her. She's not actually royalty, just extremely spoiled.' VICTORIA TRULY IS AS COMPASSIONATE AS SHE IS BEAUTIFUL. ");
        }
        System.out.println("As all good things must, the party comes to an end. Victoria's large, sparkly eyes peer up at you demurely as you try to say goodbye. It is increadibly hard as you know you may never meet someone as pure and beautiful as her again. She senses your hesitation and gives your thumb a big hug. She then looks at you, and gives you a wink and finger heart. Your vision begins to darken as her magic transports you home. ");
        
    }

    // private static void something() {

    // }
}

//java objects and how to instantiate objects; constructors, getters, setters, and data models