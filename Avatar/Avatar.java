//Yash Oza
//Purpose: Project 1-- Design a game for Daphne Bevalier to experiment with
//Avatar Code
//Started March 14th, 2016
//Ended April 7th, 2016
import javax.swing.*;
public class Avatar
{
    public static void main (String args[])
    {
	new Avatar ();
    }


    //tic-tac-toe variables
    char a = ' ';
    char b = ' ';
    char c = ' ';
    char d = ' ';
    char e = ' ';
    char f = ' ';
    char g = ' ';
    char h = ' ';
    char i = ' ';

    char turn = 'x';
    char comp = 'o';

    int tries = 0;
    public Avatar ()  //special admin key in first input gives you special access, type "Oza"
    { //backstory
	System.out.println ("");
	System.out.println ("                                                  (                  (        *   )     (       )\\ )  ");
	System.out.println ("                                                  )\\      (   (      )\\     ` )  /(     )\\     (()/(  ");
	System.out.println ("                                               ((((_)(    )\\  )\\  ((((_)(    ( )(_)) ((((_)(    /(_)) ");
	System.out.println ("                                                )\\ _ )\\  ((_)((_)  )\\ _ )\\  (_(_())   )\\ _ )\\  (_))   ");
	System.out.println ("                                                (_)_\\(_) \\ \\ / /   (_)_\\(_) |_   _|   (_)_\\(_) | _ \\  ");
	System.out.println ("                                                 / _ \\    \\ V /     / _ \\     | |      / _ \\   |   /  ");
	System.out.println ("                                                /_/ \\_\\    \\_/     /_/ \\_\\    |_|     /_/ \\_\\  |_|_\\  ");
	System.out.println ("");
	System.out.println ("                   ____            __              .        _  ____        .             _        _     __             __      __   _                      ");
	System.out.println ("                     |    |   |   /         |       \\      /     |          \\      |    | |      | \\   /     |\\  |    |  \\    /    | |                     ");
	System.out.println ("                     |    |---|  |--        |      /_\\     \\.    |         /_\\     |    |-\\      |-<   |-    | \\ |    |   |  |--   |-\\                     ");
	System.out.println ("                     \\,   |   |   \\__       |__   /   `\\.  ,/    \\,       /   `\\.  |    |  `\\.   |_/   \\__   |  \\|    |__/    \\__  |  `\\.                  ");
	System.out.print (""); //Get the user's name
	printSlow ("\n\nAang-the last Airbender and coincidently the Avatar needs to beat the firelord before Sozen's Comet. If he does not, the entire world will be destroyed.");
	printSlow ("You can help him manoeuvre through his path in mastering all four elements and reaching the fire palace through tasks.");
	String username = JOptionPane.showInputDialog ("What do people call you?"); //admin cheats
	if (username.equals ("Oza")) //allows the creater to choose whatever task for the purpose of testing
	{
	    String[] admin = {"Element Succession", "Fire vs Air", "Agni-Kai", "Blackjack", "007", "Riddles", "Chamberlocation"};
	    String admin2 = (String) JOptionPane.showInputDialog (null, "Which task do you want to start with?", "Input", JOptionPane.INFORMATION_MESSAGE, null, admin, admin [0]);

	    if (admin2.equals ("Agni-Kai"))
		battle (tries); //nim variation
	    else if (admin2.equals ("Fire vs Air"))
		FirevsAir (tries); //tic-tac-toe
	    else if (admin2.equals ("Element Succession"))
		ElementSuccession (); //variation of rock-paper sciccors
	    else if (admin2.equals ("Blackjack"))
		blackjack (tries); //blackjack (second chance for Fire vs Air)
	    else if (admin2.equals ("Riddles"))
		riddles (); //riddles to open door to the firelord chamber
	    else if (admin2.equals ("007"))
		finalbattle (); //007 //one on one with the firelord
	    else
		chamberlocation (); //finding firelord chamber
	} //http://forums.avatarspirit.net/index.php?topic=689.0
	avatar ();
    }


    public void avatar ()
    { //choose an initial task
	System.out.println ("");
	String[] possibleValues = {"Element Succession", "Fire vs Air", "Agni-Kai"};
	String choice10 = (String) JOptionPane.showInputDialog (null, "Which task do you want to start with?", "Input", JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues [0]);
	//http://forums.avatarspirit.net/index.php?topic=689.0
	System.out.println ("                                                                                _____      _______ ");
	System.out.println ("                                                                               / | | \\    /       \\");
	System.out.println ("                                                                              | _\\Ã‚Â¸/_ |  <         )");
	System.out.println ("                                                                             (] o   o [)  \\_______/");
	System.out.println ("                                                                               \\__-__/     //");
	System.out.println ("                                                                               /  ^  \\    //");
	System.out.println ("                                                                              /__/ \\__\\  //");
	System.out.println ("                                                                              ||     || //");
	System.out.println ("                                                                              {|_____|}//");
	System.out.println ("                                                                              /|>---<|//");
	System.out.println ("                                                                             (_)    (_)");
	System.out.println ("                                                                              |   V //|");
	System.out.println ("                                                                              /   |// \\");
	System.out.println ("                                                                              \\___//__/");
	System.out.println ("                                                                               | //| |");
	System.out.println ("                                                                               |// | |");
	System.out.println ("                                                                              ///\\ /__\\");

	if (choice10.equals ("Agni-Kai")) //nim
	    battle (tries);
	else if (choice10.equals ("Fire vs Air")) //tic-tac-toe
	    FirevsAir (tries);
	else
	    ElementSuccession (); //variation of rock-paper sciccors
    }


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void FirevsAir (int tries)  //there is only way to win (2,2 then 3,3 then 2,3 then 2,1)
    { //tic-tac-toe emulation
	tries = 1;
	String v = printWinner ();
	printSlow ("\n\nIn your search to become more powerful you have run into Zuko, who for some apparent reason wants to kill you and restore his honour.");
	printSlow ("You know right now you are not powerful enough to face him, so you will have to out-strategise him in a life simulation of Tic-Tac-Toe.");
	printSlow ("Use your airbending to defeat him. Win it within 3 tries to succeed. The 'x' signifies the Avatar, whereas the 'o' signifies Zuko.");
	printSlow ("But remember if you place your piece on a pre-existing piece (even by mistake) then you lose your chance to battle.\n");
	//http://chris.com/ascii/index.php?art=creatures/dragons   http://chris.com/ascii/index.php?art=people/vikings
	System.out.println ("                 ,                                  /           /");
	System.out.println ("       ,   |\\ ,__                                 /' .,,,,  ./         ");
	System.out.println ("       |\\   \\/   `.                             /';'     ,/    ");
	System.out.println ("       \\ `-.:.     `\\                          / /   ,,//,`'`      ");
	System.out.println ("    `-.__ `\\=====|                             ( ,, '_,  ,,,' ``   ");
	System.out.println ("       /=`'/   ^_\\                             |    /@  ,,, ;\" `  ");
	System.out.println ("     .'   /\\   .=)                            /    .   ,''/' `,``   ");
	System.out.println ("      .-'  .'|  '-(/_|                       /   .     ./, `,, ` ; ");
	System.out.println ("    .'  __(  \\  .'`                       ,./  .   ,-,',` ,,/''\\,'   ");
	System.out.println ("   /_.'`  `.  |`                              |   /; ./,,'`,,'' |   |     ");
	System.out.println ("            \\ |                              |     /   ','    /    |  ");
	System.out.println ("         |/                                 \\___/'   '     |     |  ");
	System.out.println ("                                              `,,'  |      /     `\\  ");
	System.out.println ("                                                   /      |        ~\\  ");
	System.out.println ("                                                  '       (");
	System.out.println ("                                                 :");
	System.out.println ("                                                ; .         \\-- ");
	System.out.println ("                                              :   \\         ;  ");
	while (tries != 4) //play untill 4 tries
	{
	    System.out.println ("\nTry  # " + tries); //inform number of tries
	    printboard ();
	    makemove (turn); //turns (both comp and player)
	    v = printWinner ();
	    if (winner ()) //only do when winnner to end while loop
	    {
		printboard ();
		System.out.println ("The " + printWinner () + " wins.");
		v = printWinner ();
		if (v.equals ("Avatar"))
		    tries = 4; //suffice while loop condition
		else
		    tries++; //if lose contantly, but total is 3 tries
		a = ' ';
		b = ' ';
		c = ' ';
		d = ' ';
		e = ' ';
		f = ' ';
		g = ' ';
		h = ' ';
		i = ' ';
	    }
	}

	if (v.equals ("Avatar"))
	{
	    System.out.println ("Let's move onto the next task.\n\n");
	    battle (tries); // variation of nim
	}
	else
	{
	    System.out.println ("You've lost against Zuko. When all seems lost, there still may be a chance for redemption.");
	    blackjack (tries); // second chance original task
	}
    }


    public void printboard ()
    {
	System.out.println ("    1   2   3");
	System.out.println (" 1  " + a + " | " + b + " | " + c);
	System.out.println ("   ------------");
	System.out.println (" 2  " + d + " | " + e + " | " + f);
	System.out.println ("   ------------");
	System.out.println (" 3  " + g + " | " + h + " | " + i);
    }


    public void makemove (char piece)
    { //usermove
	int x = IBIO.inputInt ("\nEnter the x-coordinate: ");
	int y = IBIO.inputInt ("Enter the y-coordinate: ");
	while (!isValid (x, y)) // get legit inputs
	{
	    System.out.println ("Error - invalid coordinate. Try again.");
	    x = IBIO.inputInt ("\nEnter the x-coordinate: ");
	    y = IBIO.inputInt ("Enter the y-coordinate: ");
	}
	if (x == 1 && y == 1 && a == ' ')
	    a = piece;
	else if (x == 2 && y == 1 && b == ' ')
	    b = piece;
	else if (x == 3 && y == 1 && c == ' ')
	    c = piece;
	else if (x == 1 && y == 2 && d == ' ')
	    d = piece;
	else if (x == 2 && y == 2 && e == ' ')
	    e = piece;
	else if (x == 3 && y == 2 && f == ' ')
	    f = piece;
	else if (x == 1 && y == 3 && g == ' ')
	    g = piece;
	else if (x == 2 && y == 3 && h == ' ')
	    h = piece;
	else if (x == 3 && y == 3 && i == ' ')
	    i = piece;
	compmove (comp);
    }


    public void compmove (char piece)
    { //compove

	if (e == ' ')
	    e = piece;
	else if (e == 'x' && c == ' ')
	    c = piece;
	//diagonals defense
	else if (a == 'x' && e == 'x' && i == ' ')
	    i = piece;
	else if (i == 'x' && e == 'x' && a == ' ')
	    a = piece;
	else if (c == 'x' && e == 'x' && g == ' ')
	    g = piece;
	else if (e == 'x' && g == 'x' && c == ' ')
	    c = piece;
	//vertical line 1 defense
	else if (a == 'x' && d == 'x' && g == ' ')
	    g = piece;
	else if (d == 'x' && g == 'x' && a == ' ')
	    a = piece;
	else if (a == 'x' && g == 'x' && d == ' ')
	    d = piece;
	//vertical line 3 defense
	else if (c == 'x' && f == 'x' && i == ' ')
	    i = piece;
	else if (i == 'x' && c == 'x' && f == ' ')
	    f = piece;
	else if (i == 'x' && f == 'x' && c == ' ')
	    c = piece;
	//horisontal line 1 defense
	else if (a == 'x' && b == 'x' && c == ' ')
	    c = piece;
	else if (b == 'x' && c == 'x' && a == ' ')
	    a = piece;
	else if (a == 'x' && c == 'x' && b == ' ')
	    b = piece;
	//horisontal line 3 defense
	else if (g == 'x' && h == 'x' && i == ' ')
	    i = piece;
	else if (h == 'x' && i == 'x' && g == ' ')
	    g = piece;
	else if (g == 'x' && i == 'x' && h == ' ')
	    h = piece;
	//vertical line 2 defense
	else if (b == 'x' && e == 'x' && h == ' ')
	    h = piece;
	else if (b == 'x' && h == 'x' && e == ' ')
	    e = piece;
	else if (e == 'x' && h == 'x' && b == ' ')
	    b = piece;
	//horisontal line 2 defense
	else if (d == 'x' && e == 'x' && f == ' ')
	    f = piece;
	else if (e == 'x' && f == 'x' && d == ' ')
	    d = piece;
	else if (d == 'x' && f == 'x' && e == ' ')
	    e = piece;
	//pieces left defense
	else if (g == ' ')
	    g = piece;
	else if (h == ' ')
	    h = piece;
	else if (d == ' ')
	    d = piece;
	else if (f == ' ')
	    f = piece;
	else if (c == ' ')
	    c = piece;
	else if (a == ' ')
	    a = piece;
	else if (b == ' ')
	    b = piece;
	else if (i == ' ')
	    i = piece; // all these are neccessary so that the computer plays something every turn and that too not ontop of an existing piece
    }


    public boolean isValid (int x, int y)
    { //get actual coordinates
	if ((x >= 1) && (x <= 3) && (y >= 1) && (y <= 3))
	    return true;
	else
	    return false;
    }


    public boolean winner ()
    { //get a winner
	if (a == b && a == c && a != ' ')
	    return true;
	else if (d == e && d == f && d != ' ')
	    return true;
	else if (g == h && g == i && g != ' ')
	    return true;
	else if (a == d && a == g && a != ' ')
	    return true;
	else if (b == e && b == h && b != ' ')
	    return true;
	else if (c == f && c == i && c != ' ')
	    return true;
	else if (a == e && a == i && a != ' ')
	    return true;
	else if (c == e && c == g && c != ' ')
	    return true;
	else if (a != ' ' && b != ' ' && c != ' ' && d != ' ' && e != ' ' && f != ' ' && g != ' ' && h != ' ' && i != ' ')
	    return true;
	else
	    return false;
    }


    public String printWinner ()
    { //get a winner
	String q = ("Firelord");
	String z = ("Avatar");

	if (a == b && a == c && a == turn) //top horizontal
	    return z;
	else if (d == e && d == f && d == turn)
	    return z;
	else if (g == h && g == i && g == turn)
	    return z;
	else if (a == d && a == g && a == turn)
	    return z;
	else if (b == e && b == h && b == turn)
	    return z;
	else if (c == f && c == i && c == turn)
	    return z;
	else if (a == e && a == i && a == turn)
	    return z;
	else if (c == e && c == g && c == turn)
	    return z;
	else
	    return q;

    }


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void blackjack (int tries)
    {
	tries = 1;
	int upointss = 0;
	int cpointss = 0;
	//story
	printSlow ("\n\nThis is your means for redemption. Beat 3 local men more than they beat you in 7 games of blackjack to get gain a second chance to face Zuko.");
	printSlow ("Blackjack works by players drawing as many cards as they want, but it's total has to be as close to 21 as possible, as that person wins.");
	printSlow ("But make sure the total does not exceed 21, becuase if it does then that player will be disqualified.");
	printSlow ("The first player has drawn cards."); //info for how to play
	printSlow ("The second player has drawn cards.");
	printSlow ("The third player has drawn cards.");
	printSlow ("It is your turn to draw cards.");
	System.out.println ("                                  .------."); //http://www.asciiworld.com/-Cards-.html
	System.out.println ("               .------.           |A .   |");
	System.out.println ("               |A_  _ |    .------; / \\  |");
	System.out.println ("               |( \\/ )|-----. _   |(_,_) |");
	System.out.println ("               | \\  / | /\\  |( )  |  I  A|");
	System.out.println ("               |  \\/ A|/  \\ |_x_) |------'");
	System.out.println ("               `-----+'\\  / | Y  A|");
	System.out.println ("                     |  \\/ A|-----'    hjw");
	System.out.println ("                     `------'");

	do
	{ //other player cards
	    char draw = 'y';
	    int num = (int) (Math.random () * 11) + 1;
	    int num2 = (int) (Math.random () * 11) + 1;
	    int num4 = (int) (Math.random () * 11) + 1;
	    int num5 = (int) (Math.random () * 11) + 1; //means of getting comp card total
	    int num6 = (int) (Math.random () * 11) + 1;
	    int num7 = (int) (Math.random () * 11) + 1;
	    int num8 = (int) (Math.random () * 11) + 1;
	    int num9 = (int) (Math.random () * 11) + 1;
	    int num10 = (int) (Math.random () * 11) + 1;
	    int num11 = (int) (Math.random () * 11) + 1;
	    int num12 = (int) (Math.random () * 11) + 1;

	    int utotal = uhand (num, num2); //user total
	    int ctotal = chand (num4, num5, num6); //comp 1 total
	    int c2total = c2hand (num7, num8, num9); // comp 2 total
	    int c3total = c3hand (num10, num11, num12); // comp 3 total
	    while (draw == 'y') //give player the ability to draw cards as much as they want to
	    {
		int num3 = (int) (Math.random () * 11) + 1;
		System.out.println ("\n\nSo far you have a total of " + utotal);
		draw = IBIO.inputChar ("Would you like to draw another card to increase your chances?(y or n) ");
		if (draw == 'y')
		    utotal = utotal + num3;
	    }
	    if (utotal == ctotal)
		ctotal = 16;
	    if (utotal == c2total)
		c2total = 12;
	    if (utotal == c3total)
		c3total = 15;
	    upointss = winner3 (ctotal, c2total, c3total, utotal, upointss);
	    cpointss = winner4 (ctotal, c2total, c3total, utotal, cpointss);
	    tries++;
	    utotal = 0;
	}
	while (tries != 8);

	if (upointss >= cpointss)
	{ //http://ascii.co.uk/art/cards
	    System.out.println ("You have won your brawl, and now you've got a second chance.");
	    System.out.println ("     .-~~-.");
	    System.out.println ("    {      }");
	    System.out.println (" .-~-.    .-~-.");
	    System.out.println ("{              }");
	    System.out.println (" `.__.'||`.__.'");
	    System.out.println ("       ||");
	    System.out.println ("      '--`");
	    System.out.println ("");
	    System.out.println ("");
	    System.out.println ("     /\\");
	    System.out.println ("   .'  `.");
	    System.out.println ("  '      `.");
	    System.out.println ("<          >");
	    System.out.println (" `.      .'");
	    System.out.println ("   `.  .'");
	    System.out.println ("     \\/");
	    System.out.println ("");
	    System.out.println ("");
	    System.out.println ("       /\\");
	    System.out.println ("     .'  `.");
	    System.out.println ("    '      `.");
	    System.out.println (" .'          `.");
	    System.out.println ("{              }");
	    System.out.println (" ~-...-||-...-~");
	    System.out.println ("       ||");
	    System.out.println ("      '--`");
	    System.out.println ("");
	    System.out.println ("");
	    System.out.println (" .-~~~-__-~~~-.");
	    System.out.println ("{              }");
	    System.out.println (" `.          .'");
	    System.out.println ("   `.      .'");
	    System.out.println ("     `.  .'");
	    System.out.println ("       \\/");
	    FirevsAir (tries);
	}

	else
	{
	    System.out.println ("You have took too long. It's Game over.");
	    avatar ();
	}
    }


    public int uhand (int num, int num2)
    { //userhand
	int utotal = 0;

	utotal = num + num2;
	return utotal;
    }


    public int chand (int num4, int num5, int num6)
    { //player hand
	int ctotal = 0;

	ctotal = num4 + num5;

	if (ctotal < 10)
	    ctotal = ctotal + num6;
	return ctotal;
    }


    public int c2hand (int num7, int num8, int num9)
    { //player 2 hand
	int c2total = 0;

	c2total = num7 + num8;

	if (c2total < 12)
	    c2total = c2total + num9;
	return c2total;
    }


    public int c3hand (int num10, int num11, int num12)
    { //player 3 hand
	int c3total = 0;

	c3total = num10 + num11;

	if (c3total < 16)
	    c3total = c3total + num12;
	return c3total;
    }


    public int winner3 (int ctotal, int c2total, int c3total, int utotal, int upointss)
    { //winner
	//keep the player informed
	System.out.println ("Now you have a total of " + utotal);
	System.out.println ("\nIt's time to show.");
	System.out.println ("The First player has " + ctotal);
	System.out.println ("The Second player has " + c2total);
	System.out.println ("The Third player has " + c3total);

	if (ctotal > 21)
	{
	    System.out.println ("The first player is disqualified.");
	    ctotal = 0;
	}

	if (c2total > 21)
	{
	    System.out.println ("The second player is disqualified.");
	    c2total = 0;
	}


	if (c3total > 21)
	{
	    System.out.println ("The third player is disqualified.");
	    c3total = 0;
	}


	if (utotal > 21)
	{
	    System.out.println ("You are disqualified.");
	    utotal = 0;
	}


	if ((utotal > ctotal) && (utotal > c2total) && (utotal > c3total))
	{
	    upointss++;
	    System.out.println ("\nThe Avatar has won and now has " + upointss + " slight hands.");
	}


	else
	    System.out.println ("\nOne of the opponents has won this match.");
	return upointss;
    }


    public int winner4 (int ctotal, int c2total, int c3total, int utotal, int cpointss)
    {
	if ((utotal < ctotal) && (utotal < c2total) && (utotal < c3total))
	    cpointss++;
	return cpointss;
    }


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void finalbattle ()
    { //version of 007
	for (int i = 1 ; i <= 9 ; i++)
	    System.out.println ("        007");
	int upoint = 0;
	int cpoint = 0;
	int cpow = 0;
	int upow = 0;
	String c2 = ("");
	String c = ("");
	// final task--one on one battle with firelord
	printSlow ("\nThis is the final battle against the firelord. Use your elemental powers to attack or defend,");
	printSlow ("but dont forget ones elemental power requires a surplus of more than 1 energy ro consuct an attack. ");
	printSlow ("Play wisely and remember the fate of the world rests on your shoulders.");
	System.out.println ("       ");
	System.out.println ("          (");
	System.out.println ("         ( ,)");
	System.out.println ("        ). ( )");
	System.out.println ("       (, )' (.");
	System.out.println ("      \\WWWWWWWW/");
	System.out.println ("       '--..--'");
	System.out.println ("          }{");
	System.out.println ("          {}");
	do //play till 3 tries
	{
	    int num = (int) (Math.random () * 3) + 1;
	    c2 = cplay (num, c2);
	    System.out.println ("\n\nThe Fire Lord has " + cpow + " energy points.");
	    System.out.println ("The Avatar has " + upow + " energy points.");
	    cpow = ci (num, cpow);
	    c = uplay (c);
	    upow = ui (c, upow);
	    upoint = winner (c, c2, upow, cpow, upoint);
	    System.out.println ("\nThe Avatar has " + upoint + " points");
	    cpoint = winner2 (c, c2, upow, cpow, cpoint);
	    System.out.println ("The Fire Lord has " + cpoint + " points");
	    upow = upayback (c, upow);
	    cpow = cpayback (num, cpow);
	}
	while (upoint != 3);

	if (upoint > cpoint)
	{
	    System.out.println ("\nThe Avatar has beaten the Fire lord.\n");
	    conclusion ();
	}
	else if (upoint == cpoint)
	{
	    System.out.println ("\nThings seem to be at a tie.\n");
	    conclusion3 ();
	}
	else
	{
	    System.out.println ("\nThe Fire Lord has beaten the Avatar.\n");
	    conclusion2 ();
	}
    }


    public String cplay (int num, String c2)
    {
	if (num == 1)
	    c2 = ("p");
	else if (num == 2)
	    c2 = ("a");
	else
	    c2 = ("d");
	return c2;
    }


    public int cpayback (int num, int cpow)  //computer power choiced
    {
	if (num == 2)
	    cpow--;
	if (cpow < 0)
	    cpow = 0;
	return cpow;
    }


    public int ci (int num, int cpow)  //computer power
    {
	if (num == 1)
	    cpow++;
	return cpow;
    }


    public int upayback (String c, int upow)  //user power
    {
	if ((upow == 5) && (c.equals ("a") || c.equals ("atk") || c.equals ("ATK") || c.equals ("Atk")))
	    upow = upow - 5;
	else if ((upow != 5) && (c.equals ("atk") || c.equals ("ATK") || c.equals ("Atk") || c.equals ("a")))
	    upow--;
	if (upow < 0)
	    upow = 0;
	return upow;
    }


    public int ui (String c, int upow)  //user powered choice
    {
	if (c.equals ("pow") || c.equals ("POW") || c.equals ("Pow") || c.equals ("p"))
	    upow++;
	return upow;
    }


    public String uplay (String c)  //choice
    {
	c = IBIO.inputString ("\nWhat would you like to do? (atk, def, or pow) ");

	if (c.equals ("atk") || c.equals ("ATK") || c.equals ("Atk") || c.equals ("a"))
	    c = ("a");
	else if (c.equals ("def") || c.equals ("DEF") || c.equals ("Def") || c.equals ("d"))
	    c = ("d");
	else
	    c = ("p");
	return c;

    }


    public int winner (String c, String c2, int upow, int cpow, int upoint)
    { //winner
	if (c.equals ("p"))
	    System.out.println ("The Avatar chooses to power up.");
	else if (c.equals ("d"))
	    System.out.println ("The Avatar chooses to defend.");
	else //if (c.equals ("a"))
	    System.out.println ("The Avatar chooses to attack.");

	if (c2.equals ("p"))
	    System.out.println ("The Fire Lord chooses to power up.");
	else if (c2.equals ("a"))
	    System.out.println ("The Fire Lord chooses to attack.");
	else //if (c2.equals ("d"))
	    System.out.println ("The Fire Lord chooses to defend.");

	if ((upow == 5) && (c.equals ("a") || c.equals ("atk") || c.equals ("ATK") || c.equals ("Atk")))
	{
	    System.out.println ("You have unlleashed your avatar state, your attack is undefendable.");
	    upoint++;
	}

	else if (c.equals ("a") && c2.equals ("a") && upow > 0 && cpow > 0)
	    System.out.println ("The battle has resulted in a tie.");
	else if (c.equals ("a") && c2.equals ("a") && upow > 0 && !(cpow > 0))
	{
	    System.out.println ("The Avatar wins. \nThe Fire Lord did not have enough energy for an attack.");
	    upoint++;
	}

	else if (c.equals ("a") && c2.equals ("p") && upow > 0)
	{
	    System.out.println ("The Avatar wins, he got the Fire Lord with a sneak attack.");
	    upoint++;
	}

	else if (c.equals ("a") && c2.equals ("a") && !(upow > 0) && !(cpow > 0))
	    System.out.println ("No-one has energy, to further attack energy has to be gained.");

	else if (c.equals ("d") && c2.equals ("a"))
	    System.out.println ("The Avatar blocked the Fire Lords attack.");
	else if (c.equals ("a") && c2.equals ("d"))
	    System.out.println ("The Fire Lord blocked the Avatars attack.");

	else if (c.equals ("p") && c2.equals ("a") && !(cpow > 0))
	    System.out.println ("The Fire Lord does not have enough energy for an attack, \nbut the Avatar is building energy.");
	else if (c.equals ("a") && c2.equals ("p") && !(upow < 0))
	    System.out.println ("The Avatar does not have enough energy for an attack, \nbut the Fire Lord is building energy.");

	else if (c.equals ("p") && c2.equals ("p"))
	    System.out.println ("Both Avatars are gaining energy.");
	else if (c.equals ("d") && c2.equals ("p"))
	    System.out.println ("The Avatar is gaining energy.");
	else if (c.equals ("p") && c2.equals ("d"))
	    System.out.println ("The Fire Lord is gaining energy.");

	return upoint;
    }


    public int winner2 (String c, String c2, int upow, int cpow, int cpoint)
    { //winningcondition
	if (c.equals ("a") && c2.equals ("a") && !(upow > 0) && cpow > 0)
	{
	    System.out.println ("The Fire Lord wins. The Avatar did not have enough energy for an attack.");
	    cpoint++;
	}

	else if (c.equals ("p") && c2.equals ("a") && cpow > 0)
	{
	    System.out.println ("The Fire Lord wins, he got the Avatar with a sneak attack.");
	    cpoint++;
	}

	return cpoint;

    }


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void battle (int tries)
    { //agni kai- version of nim
	tries = 0;
	char win = 'l';
	int amt2 = 0;
	rules ();
	while (tries != 3 && win == 'l')
	{
	    int left = 15; //get full board
	    tries++;
	    while (left > 0)
	    {
		drawLeft (left);
		left = turn (left);
		drawLeft (left);
		int g = left;
		amt2 = (int) (Math.random () * 2) + 1;
		left = compturn (left, tries, amt2);
		win = whosewon (g, amt2, win);
	    }
	}
	if (win == 'l')
	{
	    System.out.println ("You've lost this task.");
	    avatar ();
	}

	else
	{
	    System.out.println ("The doors are now open.");
	    chamberlocation ();
	}
    }


    public void rules ()
    { //rules
	printSlow ("You have got to the fire palace, but the gaurds are not letting you in. But there is one guard who wants to make a deal.");
	printSlow ("If you can beat him in an Agni Kai within 3 tries, he will let you in. Here is how it goes: there are 15 stones in the pile.");
	printSlow ("Players take turn taking stones, one turn each in which they can take one or two stones. The player who takes the last stone loses.");

    }


    public void drawLeft (int left)
    { //pick stones from the ones that are remaining
	System.out.println ("");
	System.out.println ("Stones remaining:" + left);
	for (int i = 1 ; i <= left ; i++)
	    System.out.print ("*");
	System.out.println ("");
    }


    public boolean isValid2 (int num, int left)
    { //valid
	if (num > left)
	    return false;
	else if ((num == 1) || (num == 2))
	    return true;
	else
	    return false;
    }


    public int turn (int left)
    { //same valid, but for different purpose
	int amt = IBIO.inputInt ("How many stones do you want to remove? ");
	while (!isValid2 (amt, left))
	{
	    System.out.println ("That amount is invalid. Try a smaller number.");
	    amt = IBIO.inputInt ("How many stones do you want to remove? ");
	}
	return (left - amt);
    }


    public int compturn (int left, int tries, int amt2)
    { //computer turn
	if (left == 2 && amt2 == 2)
	    amt2 = 1;
	else if (left == 3)
	    amt2 = 2;
	else if ((left == 1 && amt2 == 1) || (left == 1 && amt2 == 2))
	    System.out.println ("\nYou have won and it only took you " + tries + " battles.");
	else if (amt2 == 2 && left > 2)
	    System.out.println ("The firelord is pondering how many stars to remove.\nThe firelord removes 2 stars.");
	else if (amt2 == 1 && left > 1)
	    System.out.println ("The firelord is pondering how many stars to remove.\nThe firelord removes 1 star.");
	else
	    System.out.println ("The firelord has won.");
	return (left - amt2);
    }


    public char whosewon (int g, int amt2, char win)
    { //winner
	if ((amt2 == 1 && g == 1) || (g == 2 && amt2 == 2) || (g == 1 && amt2 == 2))
	    return 'w';
	else
	    return 'l';
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void chamberlocation ()
    {
	printSlow ("\n\nNow that you are in the palace, it's time to find the Firelord. He may be in his chamber.");
	printSlow ("Guess a number from 1-100 to find the resonated coordinates of the firelords chamber.");
	printSlow ("Your earth bending friend: Toff, will give you hints as she uses her feet to faintly pinpoint the surrounding.");
	printSlow ("But remember, time's running out. Do it within 7 tries to succeed."); //fire palace
	System.out.println ("   ^"); //http://www.asciiworld.com/-House-.html
	System.out.println ("       ^!^               ^");
	System.out.println ("        _____30________________");
	System.out.println ("    ^!^    |__2_________44_________|                  ");
	System.out.println ("      59   |.H.H.H.H.H.H.H.32H.H.H.|    ^!^");
	System.out.println ("       _____||~|~|~|~|~|~|~|~|~|~||_____   ^!^");
	System.out.println ("       |__89_______6_______31__________4___|");
	System.out.println (" _)o(_ |  HH  |.H.H.H.H.H.H.H.H.|  HH  | _)o(_");
	System.out.println (" /(|)\\ |  HH  ||~|~|~|~|~|~|~|~||  HH  | /(|)\\");
	System.out.println ("   N   |1 __  |___5_________3___|  __  |   N");
	System.out.println ("   N   |  HH  |.H.H.H.'`'.H.H.H.|  HH  |   N");
	System.out.println ("   N   |  HH  ||~|~|~|!X!|~|~|~||  HH  |   N");
	System.out.println (" ~~^~^\"|_92___|\"\"\"\"\"\"\"|~|\"\"\"\"\"\"\"|__84__|\"^~^~~");
	System.out.println (".|~|.:.......:.|~|.:.......:.|~|.:.......:.|~|.");
	System.out.println ("_| |_|_|_|_|_|_| |_|_|78_|_|_|_| |_|_|_|_|_|_| |_");
	System.out.println ("~| |~~~~~~~~~~~| |~~~~~~~~~~~| |~~~~~~34~~~| |~");
	System.out.println (" | |    48     | | 33        | |    95     | |");
	System.out.println ("^~^~^^ ~^  ~ ^~^~^^   ^~ ~  ^~~^^~`  ~~^  ~^^^~");
	System.out.println (" ~~~ ^~^~  ^~ ^^~  ~^^   ~^^    ^~^  ~^~   ~^");
	System.out.println ("Sher^");
	System.out.println ("");
	System.out.println ("      29__                         __");
	System.out.println ("       /%%\\        69          ^    /%%\\");
	System.out.println ("       ^  /%%%%\\      *-*            /%%%%\\");
	System.out.println ("   ^     /%%100%\\___7__|___28_____8___/%%%%%%\\");
	System.out.println ("      |\"\"\"\"|%%%/^\\%%%/^\\%%%/^\\%%%|\"\"\"\"|   ^");
	System.out.println ("      | H  |%%%|H|%%%|H|%%%|H|%%%| H  |      ^");
	System.out.println ("      |    |¾¾¾¾¾¾¾¾¾¾¾¾¾¾¾¾¾¾¾¾¾|    |41");
	System.out.println ("      |10  |   HHH   HHH   HHH   | 17 |");
	System.out.println ("()) _61___|    |__27_______24________|    |__11__  ()");
	System.out.println ("(()/%/^\\%%| 37   |%%%%%%%%73%%%%%%%%99%%%| 20 |%%/^\\%\\(()");
	System.out.println ("()/%%|H|%%| 12   |%%%96%%%%%%%%%%%76%%%%%| 62 |%%|H|%%\\()");
	System.out.println (")/%%%%%%%%|    |9 ___  _/-o-\\_  ___  |    |%%%%%%%%\\(");
	System.out.println ("()| HH HH | 16 |  HHH   | | |   HHH  | 18 | HH HH |()");
	System.out.println ("|||_______|____|__HHH___|_|_|___HHH__|____|_18____|||");
	System.out.println ("_____70____________25____   _______26________67____");
	System.out.println ("| |");
	int guess = 0;
	int turn = 0;
	int num = (int) (Math.random () * 100) + 1;
	while (num != guess)
	{
	    guess = IBIO.inputInt ("\n\nGuess the number: ");

	    if (num == guess)
		System.out.println ("\nYour guess was correct, and it took you " + turn + " tries!");
	    else if (num >= guess)
	    {
		System.out.println ("That's too Low");
		turn++;
	    }
	    else
	    {
		System.out.println ("That's too high");
		turn++;
	    }
	}

	if (turn > 7)
	{
	    System.out.println ("It is too late. You have taken to long to complete the challenge.");
	    System.out.println ("The firelord has already left his chamber and launched an attack on the earth kindgom. It is game over!");
	    avatar ();
	}

	else
	{
	    System.out.println ("Congrats, you have finished the task and now know the Firelord's location.");
	    System.out.println ("There is still a chance to beat him. Hurry to the chamber.");
	    riddles ();
	}
    }


    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void ElementSuccession ()
    {
	// public String ElementSuccession ();
	printSlow ("\nHelp Aang understand the elements one step further. Win 5 games to complete his training.");
	printSlow ("Win more games than the master move onto the next task, or its going to be game over.");
	int cPoint = 0;
	int uPoint = 0;
	int game = 1;
	System.out.println ("\n\n---------------------------------"); //http://patorjk.com/software/taag/#p=display&h=2&v=0&f=Sweet&t=Water
	System.out.println ("-----Rock, Fire, Water, Air------\n");
	System.out.println ("   __                _    ");
	System.out.println ("  /__\\   ___    ___ | | __                               (                       ");
	System.out.println (" / \\//  / _ \\  / __|| |/ /                              )\\ )                    ");
	System.out.println ("/ _  \\ | (_) || (__ |   <                               (()/(   (    (       (   ");
	System.out.println ("\\/ \\_/  \\___/  \\___||_|\\_\\                             /(_))  )\\   )(     ))\\");
	System.out.println ("                                                        (_))_| ((_) (()\\   /((_) ");
	System.out.println ("                  ___                                   | |_    (_)  ((_) (_))   ");
	System.out.println ("                 (   )                                  | |_    (_)  ((_) (_))   ");
	System.out.println (" ___  ___  ___  .---. | |_     .--.  ___ .-.            | __|   | | | '_| / -_)  ");
	System.out.println ("(   )(   )(   )/ .-, (   __)  /    \\(   )   \\           |_|     |_| |_|   \\___| ");
	System.out.println (" | |  | |  | |(__) ; || |    |  .-. ;| ' .-. ; ");
	System.out.println ("");
	System.out.println (" | |  | |  | |  .'`  || | ___|  | | ||  / (___)");
	System.out.println (" |_|     |_| |_|   \\___|                                  _                    _          _      ");
	System.out.println (" | |  | |  | || /  | || | | ||  ' _.'| |                / /\\                 /\\ \\       /\\ \\    ");
	System.out.println (" ' `-'   `-' '' `-'  |' `-' ;'  `-' /| |               / /  \\                \\ \\ \\     /  \\ \\   ");
	System.out.println ("  '.__.'.__.' `.__.'_. `.__.  `.__.'(___)             / / /\\ \\               /\\ \\_\\   / /\\ \\ \\  ");
	System.out.println (" ___  ___  ___  .---. | |_     .--.  ___ .-.         / / /  \\ \\ \\           / / /    / / /_/ / /  ");
	System.out.println ("(   )(   )(   )/ .-, (   __)  /    \\(   )   \\       / /___/ /\\ \\           / /      / /__\\/ /   ");
	System.out.println ("                                                   / / /_____/ /\\ \\       / / /    / / /_____/   ");
	System.out.println ("                                                  / /_________/\\ \\ \\  ___/ / /__  / / /\\ \\ \\     ");
	System.out.println ("                                                 / / /_       __\\ \\_\\/\\__\\/_/___\\/ / /  \\ \\ \\       ");
	System.out.println ("                                                 \\_\\___\\     /____/_/\\/_________/\\/_/    \\_\\/     ");
	title ();
	while (uPoint != 5)
	{
	    char user = userChoice ();
	    System.out.println ("You have selected " + user);
	    char comp = compChoice ();
	    System.out.println ("The computer has selected " + comp);
	    char win = winner (user, comp);
	    if (win == 'c')
	    {
		cPoint++;
		System.out.println ("\nThe Master wins!");
	    }
	    else if (win == 'u')
	    {
		uPoint++;
		System.out.println ("\nYou win!");

	    }
	    else
		System.out.println ("\nThere is a tie!");
	    System.out.println ("Points: You: " + uPoint + " Master: " + cPoint);
	    System.out.println ("");
	}

	if (uPoint == 5 && cPoint < 6)
	{
	    System.out.println ("Your element training is now complete. You are now ready to face the Firelord!");
	    FirevsAir (tries);
	}

	else
	{
	    System.out.println ("Your training has took too long. It's game over for you.");
	    avatar ();
	}
    }


    public void title ()
    { //just so they know
	System.out.println ("Rock beats Fire");
	System.out.println ("Water beats Fire");
	System.out.println ("Water beats Rock");
	System.out.println ("Air beats Rock");
	System.out.println ("Fire beats Air");
	System.out.println ("Air beats Water\n\n");
    }


    public boolean isValid (String c)
    { // get legit inputs

	if ((c.equals ("Rock")) || (c.equals ("rock")) || (c.equals ("r")) || (c.equals ("R")) || (c.equals ("ROCK")))
	    return false;
	else if ((c.equals ("Water")) || (c.equals ("water")) || (c.equals ("w")) || (c.equals ("W")) || (c.equals ("WATER")))
	    return false;
	else if ((c.equals ("Air")) || (c.equals ("air")) || (c.equals ("AIR")) || (c.equals ("A")) || (c.equals ("a")))
	    return false;
	else if ((c.equals ("Fire")) || (c.equals ("fire")) || (c.equals ("f")) || (c.equals ("F")) || (c.equals ("FIRE")))
	    return false;
	else
	    return true;
    }


    public char userChoice ()
    { //player turn
	System.out.println ("Rock, Fire, Air, or Water?");

	boolean a = true;
	String c = "r";
	while (a == true)
	{
	    c = IBIO.inputString ("What do you choose? ");
	    a = isValid (c);
	}

	if ((c.equalsIgnoreCase ("Rock")) || (c.equalsIgnoreCase ("r")))
	    return 'r';
	else if ((c.equalsIgnoreCase ("Water")) || (c.equalsIgnoreCase ("w")))
	    return 'w';
	else if ((c.equalsIgnoreCase ("Air")) || (c.equalsIgnoreCase ("a")))
	    return 'a';
	else
	    return 'f';

    }


    public char compChoice ()
    { //computer turn
	int num = (int) (Math.random () * 4) + 1;
	switch (num)
	{
	    case 1:
		return 'r';

	    case 2:
		return 'f';

	    case 3:
		return 'a';

	    case 4:
		return 'w';

	}
	return 'w';
    }


    public char winner (char comp, char user)
    { //winner
	if (comp == user)
	    return 'b';
	else if (((comp == 'r') && (user == 'f')) || ((comp == 'w') && (user == 'f')) || ((comp == 'w') && (user == 'r')) || ((comp == 'a') && (user == 'r')) || ((comp == 'f') && (user == 'a')) || ((comp == 'a') && (user == 'w')))
	    return 'u';
	else
	    return 'c';
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void riddles ()
    { //riddles
	int correct = 0;
	printSlow ("\nHelp Aang open the firelord's chamber. OH NO! The door is locked.");
	printSlow ("Ominous Sound: To open the door you will need to answer a few riddles correctly.");
	printSlow ("To open the door, 3 of the 5 riddles need to be answered correctly.");
	System.out.println ("");
	System.out.println ("                             _ .--.");
	System.out.println ("                            ( `    )");
	System.out.println ("                         .-'      `--,");
	System.out.println ("              _..----.. (             )`-.");
	System.out.println ("            .'_|` _|` _|(  .__,           )");
	System.out.println ("           /_|  _|  _|  _(        (_,  .-'");
	System.out.println ("          ;|  _|  _|  _|  '-'__,--'`--'");
	System.out.println ("          | _|  _|  _|  _| |");
	System.out.println ("      _   ||  _|  _|  _|  _|");
	System.out.println ("    _( `--.\\_|  _|  _|  _|/");
	System.out.println ("     .-'       )--,|  _|  _|.`");
	System.out.println ("    (__, (_      ) )_|  _| /");
	System.out.println ("   jgs`-.__.\\ _,--'\\|__|__/");
	System.out.println ("                ;____;");
	System.out.println ("                 \\YT/");
	System.out.println ("                  ||");
	System.out.println ("                 |\"\"|");
	System.out.println ("                 '=='");
	correct = riddle1 (correct);
	System.out.println ("\nSo far you have " + correct + " correct answers.");

	correct = riddle2 (correct);
	System.out.println ("\nSo far you have " + correct + " correct answers.");

	correct = riddle3 (correct);
	System.out.println ("\nSo far you have " + correct + " correct answers.");

	correct = riddle4 (correct);
	System.out.println ("\nSo far you have " + correct + " correct answers.");

	correct = riddle5 (correct);
	System.out.println ("\nYou have " + correct + " correct answers.");


	if (correct < 3)
	{
	    System.out.println ("You have lost the task and need to re-start the game.");
	    avatar ();
	}

	else
	{
	    System.out.println ("You have unlocked the Firelord's chamber. Things are about to go down.");
	    finalbattle ();
	}
    }


    public int riddle1 (int correct)
    {
	printSlow ("\n\n\nA man is in a maze, suddenly the power shuts off.");
	printSlow ("He walks on and it gets colder and colder. He comes to a set of doors numbered 1, 2, 3 and 4.");
	printSlow ("He walks through door 3. Then, he comes to three more doors labeled A,B, and C.");
	printSlow ("He goes through B and it locks behind him trapping him so he cannot turn back. In front of him are two doors.");
	printSlow ("In one is a loaded gun(g) that will shoot him and the other contains an electric chair(e) that he will be strapped to.\n");

	char ans = IBIO.inputChar ("Which one should he choose? (g) or (e) ");

	if (ans == 'e')
	{
	    System.out.println ("That is correct.");
	    correct++;
	}


	else
	    System.out.println ("That is wrong.");
	return correct;
    }


    public int riddle2 (int correct)
    {
	printSlow ("\n\nWho can jump higher than a mountain?");
	char ans2 = IBIO.inputChar ("Anyone (y), no-one (n), Donald Trump (d), or only the Avatar (a) ");

	if (ans2 == 'y')
	{
	    System.out.println ("That is correct.");
	    correct++;
	}


	else
	    System.out.println ("That is wrong.");
	return correct;
    }


    public int riddle3 (int correct)
    {
	printSlow ("\n\nYou do not want me but...");
	printSlow ("If you get me you do not want to lose me?");
	String ans3 = IBIO.inputString ("What am I?(one word) ");

	if ((ans3.equals ("lawsuit")) || (ans3.equals ("Lawsuit")) || (ans3.equals ("LAWSUIT")))
	{
	    System.out.println ("That is correct.");
	    correct++;
	}

	else
	    System.out.println ("That is wrong.");
	return correct;

    }


    public int riddle4 (int correct)
    {
	printSlow ("\n\nMary's father have 4 daughters: Mimi, Mama and Mandy.");
	String ans4 = IBIO.inputString ("What is the last daughter's name? ");

	if ((ans4.equals ("mary")) || (ans4.equals ("Mary")) || (ans4.equals ("MARY")))
	{
	    System.out.println ("That is correct.");
	    correct++;
	}


	else
	    System.out.println ("That is wrong.");
	return correct;
    }


    public int riddle5 (int correct)
    {
	printSlow ("\n\nThis thing all things devours:");
	printSlow ("Birds, beasts, trees, flowers;");
	printSlow ("Gnaws iron, bites steel;");
	printSlow ("Grinds hard stones to meal;");
	printSlow ("Slays kings, ruins town,");
	printSlow ("And beats high mountains down.");
	String ans5 = IBIO.inputString ("What am I?(one word) ");

	if ((ans5.equals ("TIME")) || (ans5.equals ("Time")) || (ans5.equals ("time")))
	{
	    System.out.println ("That is correct.");
	    correct++;
	}


	else
	    System.out.println ("That is wrong.");
	return correct;
    }


    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void conclusion ()  //ending where user wins
    {
	printSlow ("The Avatar has been a saviour to the world from evil for centuries. You have completed your life purpose");
	printSlow ("and have saved billions of innocent lives. The age of war is now over, it is time for you to lead a time of peace.");
	printSlow ("(The game is going to load up again if you want to play again and since you've won, you can exit and play again with the special admin code (Oza))");
    }


    public void conclusion2 ()  // ending when user loses
    {
	printSlow ("You are now experiencing your final moments. Your time as the Avatar seems to be at it's end. OH-Wait... What is happening?");
	printSlow ("Oh... You have unleashed the Avatar state. Your power has re-molded itself. Just when you thought you had no hope left...");
	printSlow ("Ohhhhhh noooooo, Azula has shocked you while you were in the Avatar state. The line of Avatars has come to an end, you have lost the game.");
    }


    public void conclusion3 ()  //ending when user ties last game, get a second chance
    {
	printSlow ("You are now experiencing your final moments. Your time as the Avatar seems to be at it's end. OH-Wait... What is happening?");
	printSlow ("Oh... You have unleashed the Avatar state. Your power has re-molded itself. Just when you thought you had no hope left...");
	printSlow ("You have been granted a second chance to battle.");
	finalbattle ();
    }


    /////////////////////////////////////////////////////////////////////////////////////////////////////

    public void printSlow (String s)
    { //for slower paced text/ cool effect/ addition to the game
	for (int i = 0 ; i < s.length () ; i++)
	{
	    System.out.print ("" + s.charAt (i));
	    //sleep for a bit after printing a letter
	    try
	    {
		Thread.sleep (20);
	    }
	    catch (InterruptedException m)
	    {
		;
	    }
	}
	System.out.println ();
    }
}


