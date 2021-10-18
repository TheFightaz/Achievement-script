#=========================================#
#|		SK/PL WYKONANY PRZEZ THEFIGHTAZ  |#
#|		ZAKAZ KOPIOWANIA!				 |#
#|		COPYRIGHT 2021©					 |#
#=========================================#



#VARIABLES FOR:
#STONE FOR PLAYER IS = ACHIVMENT "POCZĄTEK" 
#COBBLE FOR PLAYER IS = ACHIVMENT "GÓRNIK" 



#VARIABLES
variables:
	{zmienna3.%player%} = "&4Nie"		#ACIVHMENT "POCZĄTEK!"
	{zmienna4.%player%} = "&4Nie"		#ACHIVMENT "GÓRA LODOWA"
	{zmienna5.%player%} = "&4Nie"		#ACHIVMENT "DEVELOPER"
	{zmienna6.%player%} = "&4Nie"		#ACHIVMENT "TO DOPIERO POCZĄTEK" / WITCH KILL
	{zmienna7.%player%} = "&4Nie"		#ACHIVMENT "MILIONER"
	{zmienna8.%player%} = "&4Nie"		#ACHIVMENT "BEZ ZYCIA"
	{zmienna9.%player%} = "&4Nie"		#ACHIVMENT "GÓRNIK"
	{zmienna10.%player%} = "&4Nie"		#ACHIVMENT "BOGATY"
	{zmienna11.%player%} = "&4Nie"		#ACHIVMENT "MTSV.PL" / SPECIAL FOR HOSTING
	{zmienna12.%player%} = "&4Nie"		#ACHIVMENT "WODNA KRÓLOWA" / GUARDIAN KILL
	{zmienna13.%player%} = "&4Nie"		#ACHIVMENT "KLOC!" - XD
	{zmienna14.%player%} = "&4Nie" 		#ACHIVMENT "MASZ JE WSZYSTKIE"
	{zmienna15.%player%} = "&4Nie"		#ACHIVMENT "UKRYTY" / ON REGION ENTER
#VARIABLES OF NAME (TRUE/FALSE)
	{blok::%player%} = true			#ACHIVMENT "POCZĄTKI"
	{postawione::%player%} = true	#ACHIVMENT "DEVELOPER"
	{witch::%player%} = true		#ACIVHMENT "TO DOPIERO POCZĄTEK!" / WITCH KILL
	{czas::%player%} = true			#ACHIVMENT "BEZ ZYCIA"
	{gornik::%player%} = true		#ACHIVMENT "GORNIK"
	{strona::%player%} = true		#ACHIVMENT "BOGATY" CONTAINS WEB FROM WWW
	{postawionyredstone::%player%} = true #ACHIVMENT "MTSV.PL" / SPECIAL FOR HOSTING
	{guardian::%player%} = true		#ACHIVMENT "WODNA KRÓLOWA" / GUARDIAN KILL
	{postaw::%player%} = true 		#ACHIVMENT "KLOC!" - XD
	{ukryteMiejsce::%player%} = true		#ACHIVMENT "UKRYTY" / ON REGION ENTER
#VARIABLES OF NUMBER (0/1)
	{stone::%player%} = 0			#ACHIVMENT "POCZĄTEK"
	{spawner::%player%} = 0			#ACHIVMENT "DEVELOPER / SPAWNER"
	{beacon::%player%} = 0			#ACIVHEMTN "DEVELOPER / BEACON"
	{witchzabita::%player%} = 0		#ACHIVMENT "TO DOPIERO POCZĄTEK" / WITCH KILL
	{cobble::%player%} = 0			#ACHIVMENT "GÓRNIK"
	{redstone::%player%} = 0		#ACHIVMENT "MTSV.PL" / SPECIAL FOR HOSTING
	{guardianzabity::%player%} = 0  #ACHIVMENT "WODNA KRÓLOWA" / GUARDIAN KILL
	{postawb::%player%} = 0 		#ACHIVMENT "KLOC!" - XD
#OPTIONS
options:
	tag: &8&l[&2&lMC&6&lSquare&f&l.pl&8&l]
#GUI
command /osiagniecia:
	trigger:
		open chest inventory named "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lOSIAGNIĘCIA &8&l|" with 6 rows to player
		wait 2 tick
		set slot 0,1,2,3,4,5,6,7,8,9,17,18,26,27,35,36,44,45,46,47,48,49,50,51,52 and 53 of player's current inventory to orange stained glass pane named "" with lore ""		#ORANGE GLASS PANE (OUTSIDE GUI BACK)
		set slot 10,11,15,16,19,25,28,34,37,38,42 and 43 of player's current inventory to lime stained glass pane named "" with lore ""			#LIME DYE GLASS PANE		(INSIDE GUI FRONT)
		set slot 12 of player's current inventory to cobblestone named "&2&lPoczątki!" with lore "&d&l» &6Opis &2osiągnięcia:" and "" and "&d&l» &7Wykop &62021 &8Cobblestone!" and "" and "&d&l» &7Zrobione: &8[%{zmienna3.%player%}%&8]" and "&d&l» &7Aktualnie wykopane &8[&b%{stone::%player%}%&8]" and "" and "&d&l» &7Nagroda:" and "&d&l» &2+2 &4❤HP"		#ACHIVMENTS			(ACHIVMENTS INSIDE[CLICK ON GUI EVENT]}
		set slot 13 of player's current inventory to ice named "&b&lGóra Lodowa!" with lore "&d&l» &6Opis &2osiągnięcia:" and "" and "&d&l» &7Zdobądź &610000&2$"	and "" and "&d&l» &7Zrobione: &8[%{zmienna4.%player%}%&8]" and "" and "&d&l» &7Nagroda:" and "&d&l» &2+2 &4❤HP"	#ACHIVMENTS			(ACHIVMENTS INSIDE[CLICK ON GUI EVENT]}
		set slot 14 of player's current inventory to iron block named "&3&lDeveloper" with lore "&d&l» &6Opis &2osiągnięcia:" and "" and "&d&l» &7Postaw na swojej &2wyspie" and "&d&l» &8&l1X &b&lBeacon" and "&d&l» &8&l1X &2Spawner" and "" and "&d&l» &7Zrobione: &8[%{zmienna5.%player%}%&8]" and "" and "&d&l» &7Nagroda:" and "&d&l» &2+2 &4❤HP"		#ACHIVMENTS			(ACHIVMENTS INSIDE[CLICK ON GUI EVENT]}
		set slot 20 of player's current inventory to wither rose named "&2&lTo dopiero początek!" with lore "&d&l» &6Opis &2osiągnięcia:"	 and "" and "&d&l» &7Zabij Bossa &2Leśna Królowa &8(&b1 Dungeon&8)" and "" and "&d&l» &7Zrobione: &8[%{zmienna6.%player%}%&8]" and "" and "&d&l» &7Nagroda:" and "&d&l» &2+2 &4❤HP"	#ACHIVMENTS			(ACHIVMENTS INSIDE[CLICK ON GUI EVENT]}
		set slot 21 of player's current inventory to emerald block named "&2&lMILIONER!" with lore "&d&l» &6Opis &2osiągnięcia:" and "" and "&d&l» &7Zdobądź &61000000&2$" and "" and "&d&l» &7Zrobione: &8[%{zmienna7.%player%}%&8]" and "" and "&d&l» &7Nagroda:" and "&d&l» &2+2 &4❤HP"	#ACHIVMENTS			(ACHIVMENTS INSIDE[CLICK ON GUI EVENT]}
		set slot 22 of player's current inventory to warped fungus named "&7&lBez &c&lŻycia" with lore "&d&l» &6Opis &2osiągnięcia:" and "" and "&d&l» &7Spędź na serwerze &6100&2h!" and "" and "&d&l» &7Zrobione: &8[%{zmienna8.%player%}%&8]" and "" and "&d&l» &7Nagroda:" and "&d&l» &2+2 &4❤HP"	#ACHIVMENTS			(ACHIVMENTS INSIDE[CLICK ON GUI EVENT]}
		set slot 23 of player's current inventory to diamond pickaxe named "&2&lGórnik!" with lore "&d&l» &6Opis &2osiągnięcia:" and "" and "&d&l» &7Wykop &61000000 &8Stone!" and "" and "&d&l» &7Zrobione: &8[%{zmienna9.%player%}%&8]" and "&d&l» &7Aktualnie wykopane &8[&b%{cobble::%player%}%&8]" and "" and "&d&l» &7Nagroda:" and "&d&l» &2+2 &4❤HP"		#ACHIVMENTS			(ACHIVMENTS INSIDE[CLICK ON GUI EVENT]}
		set slot 24 of player's current inventory to paper named "&2&lBogaty!" with lore "&d&l» &6Opis &2osiągnięcia:" and "" and "&d&l» &7Zakup dowolną rzecz" and "&d&l» &7na stronie internetowej &6McSq.pl" and "" and "&d&l» &7Zrobione: &8[%{zmienna10.%player%}%&8]" and "" and "&d&l» &7Nagroda:" and "&d&l» &2+2 &4❤HP"	#ACHIVMENTS			(ACHIVMENTS INSIDE[CLICK ON GUI EVENT]}
		set slot 29 of player's current inventory to redstone block named "&b&lMTSV.PL" with lore "&d&l» &6Opis &2osiągnięcia:" and "" and "&d&l» &7Posiadaj 500 bloków &cRedstone" and "&d&l» &7na swojej &2wyspie!" and "" and "&d&l» &7Postawione bloki: &8[&c%{redstone::%player%}%&8]" and "&d&l» &7Zrobione: &8[%{zmienna11.%player%}%&8]" and "" and "&d&l» &7Nagroda:" and "&d&l» &2+2 &4❤HP"	#ACHIVMENTS			(ACHIVMENTS INSIDE[CLICK ON GUI EVENT]}
		set slot 30 of player's current inventory to prismarine bricks named "&b&lWodna Królowa" with lore "&d&l» &6Opis &2osiągnięcia:" and "" and "&d&l» &7Zabij Bossa &bRzeczny Bóg" and "" and "&d&l» &7Zrobione: &8[%{zmienna12.%player%}%&8]" and "" and "&d&l» &7Nagroda:" and "&d&l» &2+2 &4❤HP"		#ACHIVMENTS			(ACHIVMENTS INSIDE[CLICK ON GUI EVENT]}
		set slot 31 of player's current inventory to grass block named "&d&lKloc!" with lore "&d&l» &6Opis &2osiągnięcia:" and "" and "&d&l» &7Postaw na swojej wyspie &215k &bbloków!" and "" and "&d&l» &7Zrobione: &8[%{zmienna13.%player%}%&8]" and "&d&l» &7Postawione bloki: &8[%{postawb::%player%}%&8]"	#ACHIVMENTS			(ACHIVMENTS INSIDE[CLICK ON GUI EVENT]}
		set slot 32 of player's current inventory to barrier named "&4&lUKRYTY" with lore "&d&l» &6Opis &2osiągnięcia:" and "" and "&d&l» &7Tego nie wie nikt :3" and "" and "&d&l» &7Zrobione: &8[%{zmienna15.%player%}%&8]" and "" and "&d&l» &7Nagroda:" and "&d&l» &2+3 &4❤HP"	#ACHIVMENTS			(ACHIVMENTS INSIDE[CLICK ON GUI EVENT]}
		set slot 33 of player's current inventory to diamond named "&4&lMasz je wszystkie!" with lore "&d&l» &6Opis &2osiągnięcia:"	 and "" and "&d&l» &7Zdobądź wszystkie osiągnięcia!" and "" and "&d&l» &7Zrobione: &8[%{zmienna14.%player%}%&8]" and "" and "&d&l» &7Nagroda:" and "&d&l» &2+5 &4❤HP"	#ACHIVMENTS			(ACHIVMENTS INSIDE[CLICK ON GUI EVENT]}
		set slot 39 of player's current inventory to gold ore named "&bWkrótce" with lore ""		#ACHIVMENTS			(ACHIVMENTS INSIDE[CLICK ON GUI EVENT]}
		set slot 40 of player's current inventory to gold ore named "&bWkrótce" with lore ""		#ACHIVMENTS			(ACHIVMENTS INSIDE[CLICK ON GUI EVENT]}
		set slot 41 of player's current inventory to gold ore named "&bWkrótce" with lore ""		#ACHIVMENTS			(ACHIVMENTS INSIDE[CLICK ON GUI EVENT]}
		
#GUI BLOCK ON CLICK
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lOSIAGNIĘCIA &8&l|":
		cancel event
#=================================================================================================================================================================================================#

#RULES

#ACHIVMENT "TO DOPIERO POCZĄTEK"
on mine cobblestone:
	if {blok::%player%} is true:
		add 1 to {stone::%player%}	
		if {stone::%player%} is 2021:
			send title "&2Początki!" with subtitle "&7Odblokowałeś/aś &6Osiągnięcie!" to player for 2 seconds
			

#ACHIVMENT "GÓRNIK"
on mine stone:
	if {gornik::%player%} is true:
		add 1 to {cobble::%player%}
		if {gornik::%player%} is 1000000:
			send title "&2Górnik!" with subtitle "&7Odblokowałeś/aś &6Osiągnięcie!" to player for 2 seconds
			
			
#ACHIVMENT "DEVELOPER / BEACON"			
on place beacon:
	if {postawione::%player%} is true:
		add 1 to {beacon::%player%}
		
		
#ACHIVMENT "DEVELOPER / SPAWNER"		
on place mob spawner:
	if {postawione::%player%} is true:
		add 1 to {spawner::%player%}
		
		
#ACHIVMENT "TO DOPIERO POCZĄTEK" / WITCH KILL
on death of a witch:
	if attacker is a player:
		if victim is a witch:
			if {witch::%player%} is true:
				add 1 to {witchzabita::%attacker%}
				if {witchzabita::%player%} is 1:
					send title "&2To dopiero początek!" with subtitle "&7Odblokowałeś/aś &6Osiągnięcie!" to player for 2 seconds
				
#ACHIVMENT "MTSV.PL" / SPECIAL FOR HOSTING / REDSTONE BLOCK			
on place of redstone block:
	if {postawionyredstone::%player%} is true:
		add 1 to {redstone::%Player%}
		if {redstone::%player%} is 500:
			send title "&bMTSV.PL" with subtitle "&7Odblokowałeś/aś &6Osiągnięcie!" to player for 2 seconds
				
				
#ACHIVMENT "WODNA KRÓLOWA" / GUARDIAN KILL
on death of a guardian:
	if attacker is a player:
		if victim is a guardian:
			if {guardian::%player%} is true:
				add 1 to {guardianzabity::%attacker%}
				if {guardianzabity::%player%} is 1:
					send title "&bWodna Królowa" with subtitle "&7Odblokowałeś/aś &6Osiągnięcie!" to player for 2 seconds


#ACHIVMENT "KLOC!" - XD
on place:
	if {postaw::%player%} is true:
		add 1 to {postawb::%player%}
		if {postawb::%player%} is 15000:
			send title "&dKLOC!" with subtitle "&7Odblokowałeś/aś &6Osiągnięcie!" to player for 2 seconds
			

#ACHIVMENT "UKRYTY" / ON REGION ENTER
on entering of region "ukryty":
	if {ukryteMiejsce::%player%} is true:
		set {ukryteMiejsce::%player%} to false
		send title "&4&lACIVHMENT UKRYTY" with subtitle "&7Odblokowałeś/aś &6Osiągnięcie!" to player for 2 seconds
#ACHIVMENT "BEZ ZYCIA / TIME SET EVERY SECOND"
every second:
	loop all players:
		if {czas::%loop-player%} is true:
			add 1 to {sek::%loop-player%}
			if {sek::%loop-player%} is 60:
				delete {sek::%loop-player%}
				add 1 to {minute::%loop-player%}
				if {minute::%loop-player%} is 60:
					add 1 to {hour::%loop-player%}

					
#ACHIVMENT "BOGATY" / CONTAINS WEB FROM WWW
command /zmiennazmien:
	permission: zmienna.set.shop
	trigger:
		set {strona::%player%} to false
		stop

				
#ACHIVMENTS 1 "POCZĄTKI"
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lOSIAGNIĘCIA &8&l|":
		clicked slot is 12:
			if {zmienna3.%player%} is "&2Tak":
				send "{@tag} &2Zdobyłeś/aś już to &6osiągnięcie!"
				stop
			else:
				if {stone::%player%} is greater than or equal to 2021:
					set {blok::%player%} to false
					set {zmienna3.%player%} to "&2Tak"
					add 2 to player's max health
					send title "&2Początki!" with subtitle "&7Odebrałeś/aś &6Osiągnięcie!" to player for 2 seconds
				else:
					send "{@tag} &cNie wykonałeś jeszcze tego osiągnięcia!"
#ACHIVMENT 2 "GÓRA LODOWA"
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lOSIAGNIĘCIA &8&l|":
		clicked slot is 13:
			if {zmienna4.%player%} is "&2Tak":
				send "{@tag} &2Zdobyłeś/aś już to &6osiągnięcie!"
				stop
			else:
				if player's balance is greater than or equal to 10000:
					set {zmienna4.%player%} to "&2Tak"
					send title "&bGóra Lodowa!" with subtitle "&7Odebrałeś/aś &6Osiągnięcie!" to player for 2 seconds
					add 2 to player's max health
				else if player's balance is less than 10000:
					send "{@tag} &cNie wykonałeś/aś jeszcze tego osiągnięcia!"
#ACHIVMENT 3 "DEVELOPER"
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lOSIAGNIĘCIA &8&l|":
		clicked slot is 14:
			if {zmienna5.%player%} is "&2Tak":
				send "{@tag} &2Zdobyłeś/aś już to &6osiągnięcie!"
				stop
			else:
				if {beacon::%player%} is greater than or equal to 1:
					if {spawner::%player%} is greater than or equal to 1:
						set {postawione::%player%} to false
						set {zmienna5.%player%} to "&2Tak"
						send title "&3Developer!" with subtitle "&7Odebrałeś/aś &6Osiągnięcie!" to player for 2 seconds
						add 2 to player's max health
					else:
						send "{@tag} &cNie wykonałeś/aś jeszcze tego osiągnięcia! "
				else:
					send "{@tag} &cNie wykonałeś/aś jeszcze tego osiągnięcia!"
#ACHIVMENT 4 "TO DOPIERO POCZATEK"
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lOSIAGNIĘCIA &8&l|":
		clicked slot is 20:
			if {zmienna6.%player%} is "&2Tak":
				send "{@tag} &2Zdobyłeś/aś już to &6osiągnięcie!"
				stop
			else:
				if {witchzabita::%player%} is greater than or equal to 1:
					set {witch::%player%} to false
					set {zmienna6.%player%} to "&2Tak"
					send title "&2To dopiero początek!" with subtitle "&7Odebrałeś/aś &6Osiągnięcie!" to player for 2 seconds
					add 2 to player's max health
				else if {witchzabita::%player%} is 0:
					send "{@tag} &cNie wykonałeś/aś jeszcze tego osiągnięcia!"
#ACHIVMENT 5 "MILIONER"
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lOSIAGNIĘCIA &8&l|":
		clicked slot is 21:
			if {zmienna7.%player%} is "&2Tak":
				send "{@tag} &2Zdobyłeś/aś już to &6osiągnięcie!"
				stop
			else:
				if player's balance is greater than or equal to 1000000:
					set {zmienna7.%player%} to "&2Tak"
					send title "&2MILIONER!" with subtitle "&7Odebrałeś/aś &6Osiągnięcie!" to player for 2 seconds
					add 2 to player's max health
				else if player's balance is less than 1000000:
					send "{@tag} &cNie wykonałeś/aś jeszcze tego osiągnięcia!"
#ACHIVMENT 6 "BEZ ŻYCIA"
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lOSIAGNIĘCIA &8&l|":
		clicked slot is 22:	
			if {zmienna8.%player%} is "&2Tak":
				send "{@tag} &2Zdobyłeś/aś już to &6osiągnięcie!"
				stop
			else:
				if {hour::%player%} is greater than or equal to 100:
					set {czas::%player%} to false
					send title "&7Bez &cŻycia!" with subtitle "&7Odebrałeś/aś &6Osiągnięcie!" to player for 2 seconds
					add 2 to player's max health
				else:
					send "{@tag} &cNie wykonałeś/aś jeszcze tego osiągnięcia!"
#ACHIVMENT 7 "GÓRNIK"
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lOSIAGNIĘCIA &8&l|":
		clicked slot is 23:	
			if {zmienna9.%player%} is "&2Tak":
				send "{@tag} &2Zdobyłeś/aś już to &6osiągnięcie!"
				stop
			else:
				if {cobble::%player%} is greater than or equal to 100000:
					set {gornik::%player%} to false
					set {zmienna9.%player%} to "&2Tak"
					add 2 to player's max health
					send title "&2Górnik!" with subtitle "&7Odebrałeś/aś &6Osiągnięcie!" to player for 2 seconds
				else:
					send "{@tag} &cNie wykonałeś jeszcze tego osiągnięcia!"
#ACHIVMENT 8 "BOGATY"
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lOSIAGNIĘCIA &8&l|":
		clicked slot is 24:
			if {zmienna10.%player%} is "&2Tak":
				send "{@tag} &2Zdobyłeś/aś już to &6osiągnięcie!"
				stop
			else:
				if {strona::%player%} is false:
					set {zmienna10.%player%} to "&2Tak"
					set {strona::%player%} to true
					add 2 to player's max health 
					send title "&2Bogaty!" with subtitle "&7Odebrałeś/aś &6Osiągnięcie!" to player for 2 seconds
				else:
					send "{@tag} &cNie wykonałeś jeszcze tego osiągnięcia!"
#ACHIVMENT 9 "MTSV.PL" / SPECIAL FOR HOSTING MTSV.PL
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lOSIAGNIĘCIA &8&l|":
		clicked slot is 29:
			if {zmienna11.%player%} is "&2Tak":
				send "{@tag} &2Zdobyłeś/aś już to &6osiągnięcie!"
				stop
			else:
				if {redstone::%player%} is greater than or equal to 500:
					set {zmienna11.%player%} to "&2Tak"
					set {postawionyredstone::%player%} to false
					add 2 to player's max health
					send title "&bMTSV.PL" with subtitle "&7Odebrałeś/aś &6Osiągnięcie!" to player for 2 seconds
				else:
					send "{@tag} &cNie wykonałeś jeszcze tego osiągnięcia!"
#ACHIVMENT 10 "WODNA KORONA"
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lOSIAGNIĘCIA &8&l|":
		clicked slot is 30:
			if {zmienna12.%player%} is "&2Tak":
				send "{@tag} &2Zdobyłeś/aś już to &6osiągnięcie!"
				stop
			else:
				if {guardianzabity::%player%} is greater than or equal to 1:
					set {zmienna12.%player%} to "&2Tak"
					set {guardian::%player%} to false
					add 2 to player's max health
					send title "&bWodna Królowa" with subtitle "&7Odebrałeś/aś &6Osiągnięcie!" to player for 2 seconds
				else:
					send "{@tag} &cNie wykonałeś jeszcze tego osiągnięcia!"
#ACHIVMENT 11 "KLOC!" - XD
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lOSIAGNIĘCIA &8&l|":
		clicked slot is 31:
			if {zmienna13.%player%} is "&2Tak":
				send "{@tag} &2Zdobyłeś/aś już to &6osiągnięcie!"
				stop
			else:
				if {postawb::%player%} is greater than or equal to 15000:
					set {zmienna13.%player%} to "&2Tak"
					set {postaw::%player%} to false
					add 2 to player's max health
					send title "&dKloc!" with subtitle "&7Odebrałeś/aś &6Osiągnięcie!" to player for 2 seconds
				else:
					send "{@tag} &cNie wykonałeś jeszcze tego osiągnięcia!"
#ACHIVMENT 12 "UKRYTY" / ON REGION ENTER
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lOSIAGNIĘCIA &8&l|":
		clicked slot is 32:
			if {zmienna15.%player%} is "&2Tak":
				send "{@tag} &2Zdobyłeś/aś już to &6osiągnięcie!"
				stop
			else:
				if {ukryteMiejsce::%player%} is false:
					set {zmienna15.%player%} to "&2Tak"
					add 3 to player's max health
					send title "&4&lACHIVMENT UKRYTY" with subtitle "&7Odebrałeś/aś &6Osiągnięcie!" to player for 2 seconds
				else:
					send "{@tag} &cNie wykonałeś jeszcze tego osiągnięcia!"
#ACHIVMENT 13 "MASZ JE WSZYSTKIE"
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lOSIAGNIĘCIA &8&l|":
		clicked slot is 33:
			if {zmienna14.%player%} is "&2Tak":
				send "{@tag} &2Zdobyłeś/aś już to &6osiągnięcie!"
				stop
			else:
				if {zmienna13.%player%} is "&2Tak":
					if {zmienna12.%player%} is "&2Tak":
						if {zmienna11.%player%} is "&2Tak":
							if {zmienna10.%player%} is "&2Tak":
								if {zmienna9.%player%} is "&2Tak":
									if {zmienna8.%player%} is "&2Tak":
										if {zmienna7.%player%} is "&2Tak":
											if {zmienna6.%player%} is "&2Tak":
												if {zmienna5.%player%} is "&2Tak":
													if {zmienna4.%player%} is "&2Tak":
														if {zmienna3.%player%} is "&2Tak":
															if {zmienna15.%player%} is "&2Tak":
																set {zmienna14.%player%} to "&2Tak"
																send title "&4&lMasz je Wszystkie!" with subtitle "&7Odebrałeś/aś &6Osiągnięcie!" to player for 2 seconds
																add 5 to player's max health
															else:
																send "{@tag} &cNie wykonałeś jeszcze tego osiągnięcia!"
														else:
															send "{@tag} &cNie wykonałeś jeszcze tego osiągnięcia!"
													else:
														send "{@tag} &cNie wykonałeś jeszcze tego osiągnięcia!!"
												else:
													send "{@tag} &cNie wykonałeś jeszcze tego osiągnięcia!"
											else:
												send "{@tag} &cNie wykonałeś jeszcze tego osiągnięcia!"
										else:
											send "{@tag} &cNie wykonałeś jeszcze tego osiągnięcia!"
									else:
										send "{@tag} &cNie wykonałeś jeszcze tego osiągnięcia!"
								else:
									send "{@tag} &cNie wykonałeś jeszcze tego osiągnięcia!"
							else:
								send "{@tag} &cNie wykonałeś jeszcze tego osiągnięcia!"
						else:
							send "{@tag} &cNie wykonałeś jeszcze tego osiągnięcia!"
					else:
						send "{@tag} &cNie wykonałeś jeszcze tego osiągnięcia!"
				else:
					send "{@tag} &cNie wykonałeś jeszcze tego osiągnięcia!"
					
