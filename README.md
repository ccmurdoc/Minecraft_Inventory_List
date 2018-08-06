# Minecraft_Inventory_List

The program reads data from one file, items-0x.txt. Each line in this file represents one item. The first item on every line denotes the Item type–the remainder of the line varies by item type.

  Tool Pickaxe Diamond 100 1 Fortune 5
  Potion Speed-II-Potion Spd*2 1
  Food Tomato Hunger-10 2
  Tool Axe Stone 10 2 Unbreaking 2
  Armour Boots Diamond 100 10 Protection 3 lightning
Each Item type is denoted by a keyword:

Tool indicates a Tool object.
Armour and Armor indicate an Armour object.
Food, Potion, and Disposable indicate a Consumable object.
After the leading keywords, each line has a distinct structure:

The remainder of a Tool line contains–in order–a name, material, durability, speed, enchantment, and enchantment level. Tool Items are not stackable.
The remainder of a Armour line contains–in order–a name, material, durability, defense, enchantment, enchantment level, and element. Armour Items are not stackable.
The remainder of a Consumable line contains–in order–a name, effect, and # uses. Consumable Items are stackable.
1.2 Output
If the program is run with the first provided input file, items-01.txt, the following output should be generated:

Processing Log:
 (S) Pickaxe
 (S) Shovel
 (S) Pickaxe
 (S) Speed-II-Potion
 (S) Tomato
 (S) PotatoCamera
 (S) PotatoCamera
 (S) Axe
 (S) Boots
 (S) Boots

Player Storage Summary:
 -Used  90% of 10 slots
  Nme: Pickaxe
  Dur: 100
  Spd: 1
  Mtl: Diamond
  Mdr: Fortune (Lvl 5)

  Nme: Shovel
  Dur: 20
  Spd: 3
  Mtl: Gold
  Mdr: Unbreaking (Lvl 2)

  Nme: Pickaxe
  Dur: 100
  Spd: 1
  Mtl: Diamond
  Mdr: Fortune (Lvl 5)

  Nme: Speed-II-Potion
  Eft: Spd*2
  Use: 1
  Qty: 1

  Nme: Tomato
  Eft: Hunger-10
  Use: 2
  Qty: 1

  Nme: PotatoCamera
  Eft: ImageQuality-97%
  Use: 5
  Qty: 2

  Nme: Axe
  Dur: 10
  Spd: 2
  Mtl: Stone
  Mdr: Unbreaking (Lvl 2)

  Nme: Boots
  Dur: 100
  Def: 10
  Mtl: Diamond
  Mdr: Protection (Lvl 3)
  Emt: lightning

  Nme: Boots
  Dur: 100
  Def: 10
  Mtl: Diamond
  Mdr: FeatherFalling (Lvl 4)
  Emt: lightning

To run this program with items-01.txt as input type:

./storage items-01.txt
