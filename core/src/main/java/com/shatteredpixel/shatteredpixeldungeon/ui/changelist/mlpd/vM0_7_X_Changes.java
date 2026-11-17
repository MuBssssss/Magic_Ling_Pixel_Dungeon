package com.shatteredpixel.shatteredpixeldungeon.ui.changelist.mlpd;

import com.shatteredpixel.shatteredpixeldungeon.Assets;
import com.shatteredpixel.shatteredpixeldungeon.PaswordBadges;
import com.shatteredpixel.shatteredpixeldungeon.actors.mobs.lb.RivalSprite;
import com.shatteredpixel.shatteredpixeldungeon.custom.utils.NetIcons;
import com.shatteredpixel.shatteredpixeldungeon.effects.PasswordBadgeBanner;
import com.shatteredpixel.shatteredpixeldungeon.messages.Messages;
import com.shatteredpixel.shatteredpixeldungeon.scenes.ChangesScene;
import com.shatteredpixel.shatteredpixeldungeon.scenes.PixelScene;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ApprenticeWitchSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.CharSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.CrivusStarFruitsSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.DM720Sprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.DeepSeaSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.DimandKingSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.DragonGirlBlueSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.DwarfGeneralSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.FireCrystalSprites;
import com.shatteredpixel.shatteredpixeldungeon.sprites.FireDragonSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.FrankensteinSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.GhostHalloweenSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.GudaziSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.HollowKnightSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSpriteSheet;
import com.shatteredpixel.shatteredpixeldungeon.sprites.KatydidSprites;
import com.shatteredpixel.shatteredpixeldungeon.sprites.KongFuSprites;
import com.shatteredpixel.shatteredpixeldungeon.sprites.LuoWhiteSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.MintSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.MoonLowSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.NyzSprites;
import com.shatteredpixel.shatteredpixeldungeon.sprites.PianoLeSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.PiraLandSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.QinWolfSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.QliphothSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.RedNecromancerSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.SakaFishBossSprites;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ShopkKingSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ShopkeeperSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.SmallLeafSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.WhiteGirlSprites;
import com.shatteredpixel.shatteredpixeldungeon.sprites.YetYogSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ZakoSprite;
import com.shatteredpixel.shatteredpixeldungeon.ui.BuffIcon;
import com.shatteredpixel.shatteredpixeldungeon.ui.BuffIndicator;
import com.shatteredpixel.shatteredpixeldungeon.ui.Icons;
import com.shatteredpixel.shatteredpixeldungeon.ui.Window;
import com.shatteredpixel.shatteredpixeldungeon.ui.changelist.ChangeButton;
import com.shatteredpixel.shatteredpixeldungeon.ui.changelist.ChangeInfo;
import com.watabou.noosa.Image;

import java.util.ArrayList;

public class vM0_7_X_Changes {
    public static void addAllChanges(ArrayList<ChangeInfo> changeInfos) {
        add_V07993_Changes(changeInfos);
        add_V07990_Changes(changeInfos);
        add_V078_90_Changes(changeInfos);
        add_V0770_Changes(changeInfos);
        add_V0765_Changes(changeInfos);
        add_V0760_Changes(changeInfos);
        add_V0755_Changes(changeInfos);
        add_V0751_Changes(changeInfos);
        add_V0750_Changes(changeInfos);
        add_V0740_Changes(changeInfos);
        add_V0735_Changes(changeInfos);
        add_V0732_Changes(changeInfos);
        add_V0731_Changes(changeInfos);
        add_V0730_Changes(changeInfos);
        add_V0723_Changes(changeInfos);
        add_V0721_Changes(changeInfos);
        add_V0716_Changes(changeInfos);
        add_V0715_Changes(changeInfos);
        add_V0714_Changes(changeInfos);
        add_V0713_Changes(changeInfos);
        add_V0712_Changes(changeInfos);
        add_V0711_Changes(changeInfos);
        add_V0710_Changes(changeInfos);
        add_V079_Changes(changeInfos);
        add_V078_Changes(changeInfos);
        add_V077_Changes(changeInfos);
        add_V076_Changes(changeInfos);
        add_V075_Changes(changeInfos);
        add_V074_Changes(changeInfos);
        add_V071_Changes(changeInfos);
        add_GYD_Changes(changeInfos);
    }

    public static void add_V07993_Changes( ArrayList<ChangeInfo> changeInfos ) {

        ChangeInfo changes = new ChangeInfo("v0.7.9.9-SP3", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.AUDIO), ("Music Optimization"),
                ("Music was compressed to shrink the install size while keeping quality")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Other Changes"),
                ("1. Iterated on some assets\n" +
                        "2. Improved some text\n" +
                        "3. Polished various asset details")));

        changes.addButton(new ChangeButton(Icons.get(Icons.WARNING), ("Error Report v2"),
                ("A brand new error report v2 screen, thanks to Mint for the design")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.GOLDLANGGUN), ("New Legendary Weapon: Golden Spear"),
                ("A weapon only those favoured by Tyche can find, granting its wielder an unmatched blessing")));

        changes.addButton(new ChangeButton(new LuoWhiteSprite(), ("Redeem Code System v1.0"),
                ("Redeem codes arrive, replacing update compensation")));


        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.LANTERNB), ("Extinguished Lights v1.2"),
                (
                        "1. The darkened-lights penalty changed from double everywhere to the normal drain + 2*challenges/5, and only for the automatic drain\n\n" +
                                "2. Improved Witch's Whisper: Binding. It now purifies your gear when it ends, at the cost of dropping it one level")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "0.7.9.9-SP3:\n\n" +
                        "1. Fixed some missing text\n" +
                        "2. Fixed crashes and infinite turns from the poison staff and torches"));

        changes.addButton( new ChangeButton(new ItemSprite(ItemSpriteSheet.SAI,
                new ItemSprite.Glowing( Window.GDX_COLOR )), "Enchantment: Judgment",
                "This enchantment is disabled for now"));

    }

    public static void add_V07990_Changes( ArrayList<ChangeInfo> changeInfos ) {

        ChangeInfo changes = new ChangeInfo("v0.7.9.9-SP1", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SEED_AIKELAIER), ("Seed Finder v3"),
                ("Seed Finder v3 is here: more powerful and much faster!\n\n" +
                        "1. Built on a JDK 21 engine, so searching is far faster\n" +
                        "2. Deep search mode is now available\n" +
                        "3. Fixed some odd UI bugs in the seed finder\n" +
                        "4. Fixed bad display when searching seeds by string\n" +
                        "5. Added format restoration; click it if you are unsure of the format")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.LANTERNB), ("Extinguished Lights v1.1"),
                (
                        "1. Added auto-load mode\n" +
                        "2. Fixed some teleport issues in the extinguishing cycle\n" +
                                "3. Rare monster spawn rate set to 35%")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.CHALLENGE_ON), ("Potion Hysteria"),
                ("Potion Hysteria was improved; see the challenge description.")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "0.7.9.9:\n\n" +
                        "1. Fixed some bugs reported in the mid-tier group\n" +
                        "2. Other crash fixes"));

        changes.addButton( new ChangeButton(new ItemSprite(ItemSpriteSheet.SAI,
                new ItemSprite.Glowing( Window.GDX_COLOR )), "Enchantment: Judgment",
                "Fixed some odd issues caused by Judgment"));

        changes = new ChangeInfo("v0.7.9.9", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new GudaziSprite(),("New NPC: Gudazi"),
                ("A traveller from far away, now at the Snowview Town campfire.")));

        changes.addButton(new ChangeButton(new ZakoSprite(),("New NPC: Miaoyin Momiji"),
                ("Everyone's favourite. Do not make her angry")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.WHITE_BAST), ("New Weapon: White Wave Rapier"),
                ("My lamp shall purge evil! My blade shall part the tide! My eye shall find the truth! My heart shall pass judgment.")));

        changes.addButton( new ChangeButton(new ItemSprite(ItemSpriteSheet.SAI,
                new ItemSprite.Glowing( Window.GDX_COLOR )), "New Enchantment: Judgment",
                "This enchantment releases the power of judgment from your weapon. It can mark one enemy, and when that enemy dies its max health is converted into a single physical hit against every visible enemy."));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_15), ("New Challenge: Extinguished Lights"),
                ("The lights are now a proper challenge. See the challenge description.")));

        Image s = new QliphothSprite();
        s.scale.set(PixelScene.align(0.74f));
        changes.addButton(new ChangeButton(s, ("New Boss: Fruit of Clivus, Second Generation"),
                ("They weave a great net, feeding every creature that falls into the pit to the single red fruit at its centre. The fruit was reworked. Enjoy")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Other Changes"),
                ("1. Iterated on some assets\n" +
                        "2. Improved some text\n" +
                        "3. Polished various details\n" +
                        "4. Trinkets can now be upgraded in developer mode")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "0.7.9.8:\n\n" +
                        "1. Fixed some alchemy crafting issues\n" +
                        "2. Fixed some bugs reported in the mid-tier group\n" +
                        "3. Other bug fixes"));
    }

    public static void add_V078_90_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.7.8-v0.7.9", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.CHANGES), ("Engine Update"),
                ("Magic Ling Pixel Dungeon now runs on the Shattered 2.5.0 codebase")));

        changes.addButton(new ChangeButton(Icons.get(Icons.CATALOG), ("Balance Patch 3.1, Part One"),
                ("The first half of Balance Patch 3.1 is in:\n\n" +
                        "[Weapons]\n\n" +
                        "1. Moon Blade: attack delay is now 0.45 turns, and it is a tier-4 weapon\n\n" +
                        "2. Vampiric Blade: base damage raised to 3-15, growth is now 2-2\n\n" +
                        "3. Verdant Ash: now a tier-5 weapon, attack delay 0.40\n\n" +
                        "4. Thorns: removed the low-level penalty and the range bonus, the terror duration now equals the item level, cursed prisms cannot be used on it, the penalty now starts at level 11, and the Tree of Life chance is 35%\n\n" +
                        "5. Ice Fish: recipe is now Ice Brew + Grilled Herring + Imbued Prism. Twin Fish growth is 3-7 and its attack delay is 1\n\n" +
                        "6. Absolution: delay 1.76, growth 1-6, base damage 2-25, each kill lowers the delay by 0.0067 up to 100 kills, and every 2 kills raises the growth range by 1 up to 26 kills\n\n" +
                        "7. Glutinous Greatsword: base stats now match the greatsword\n\n"),
                        ("[Challenges]\n\n" +
                        "1. Lights: with the darkness challenge on, the lights drain twice as fast (already handled, currently x2)\n\n" +
                        "2. Potion Hysteria: the chance of a negative effect is now 95%, and nothing but the pie gives a positive one."),
                        "[Monsters]\n\n" +
                        "1. Sakaban Fish: 10 less shielding in phase one, attack raised by 7\n\n" +
                        "2. The Fire Witch's stats now depend on your deepest floor, not the floor you robbed\n\n" +
                        "3. Brown Bat: evasion now matches regular region 2 monsters\n\n" +
                        "4. Dusk Slime: 25% chance to set you burning\n\n" +
                        "5. Frost Rat: armor is now 1-3\n\n" +
                        "6. Fire Fly: armor is now 1-4\n\n" +
                        "7. Heavy Armor Gnoll: health is 80, and its death shielding is 75% of max health"));

        changes = new ChangeInfo("Preloaded", false, null);
        changes.hardlight(Window.CBLACK);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ApprenticeWitchSprite(), ("New Monster: Apprentice Witch"),
                ("A poor student of the magic academy, still apprenticed as a witch.\n\nThis data is preloaded and will go live after Halloween.")));

        changes.addButton(new ChangeButton(new FrankensteinSprite(), ("New Monster: Broken Dream Doll"),
                ("It is looking for its creator, and for every breath of life it can tear apart.\n\nThis data is preloaded and will go live after Halloween.")));

        changes.addButton(new ChangeButton(new GhostHalloweenSprite(), ("New Monster: Ghost"),
                ("A wraith no one can figure out....\n\nThis data is preloaded and will go live after Halloween.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Other Changes"),
                ("1. Iterated on some assets\n" +
                        "2. Improved some text\n" +
                        "3. Polished various details")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "0.7.9.0:\n\n" +
                        "1. Fixed some alchemy crafting issues\n" +
                        "2. Fixed some bugs reported in the mid-tier group\n" +
                        "3. Other bug fixes\n"));

//        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
//        changes.hardlight(Window.R_COLOR);
//        changeInfos.add(changes);
//
//        changes.addButton(new ChangeButton(new ShopkKingSprite(), ("Shop Boss Improvements"),
//                ("Enemy elite bonuses no longer apply, and the hormone surge duration was reduced")));
//
//        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Other Changes"),
//                ("The finder was removed and will return as a web tool. To check seeds, use the item finder in developer mode")));


    }

    public static void add_V0770_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.7.7.0", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.RedBloodMoon), ("Blood Sword Returns"),
                ("The Crimson Blood Sword is back, and it is now a legendary weapon!!!")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.WORN_SHORTSWORD), ("Warrior Talents Upgraded"),
                ("The Warrior's T1-T3 talents were all improved. Come and try them")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.DIFFCULTBOOT), ("Difficulty System Preloaded"),
                ("The difficulty system is preloaded. See you in August!")));

        Image i = new Image("sprites/boss/fireDragon.png", 0, 0, 24, 24);
        i.scale.set(PixelScene.align(0.74f));
        changes.addButton(new ChangeButton(i, ("Lava Fire Dragon - Complete"),
                ("The truth behind the jungle riot. It gained a tail sweep and a dragon charge, a little more health, and is limited to before floor 11\n\n" +
                        "Rewards: a _blessed cross_ + _20 dewdrops_ + _one artifact_, with everything else as before")));

        changes.addButton(new ChangeButton(Icons.get(Icons.SKULL), ("Shadow AI Improved"),
                ("Your shadow is smarter now. Can you beat \"yourself\"?")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS),("Other Changes"),
                ("1. Iterated on some assets\n" +
                        "2. Improved some text\n" +
                        "3. Polished various details")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "0.7.7.0:\n\n" +
                        "1. Fixed some alchemy crafting issues\n" +
                        "2. Fixed some bugs reported in the mid-tier group\n" +
                        "3. Other bug fixes\n"));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight(Window.R_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ShopkKingSprite(), ("Shop Boss Improvements"),
                ("Enemy elite bonuses no longer apply, and the hormone surge duration was reduced")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS),("Other Changes"),
                ("The finder was removed and will return as a web tool. To check seeds, use the item finder in developer mode")));

    }

    public static void add_V0765_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.7.6.5", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SCROLL_GOLD), ("Ever-Changing Journey 1.0"),
                ("New special mode: Ever-Changing Journey")));

        changes.addButton(new ChangeButton(Icons.get(Icons.CHANGES), ("Major Update"),
                ("Magic Ling is now built on Shattered V2.4.2!\n\n" +
                        "New trinkets and the alchemy system are waiting for you")));

        changes.addButton(new ChangeButton(Icons.get(Icons.DISPLAY), ("UI Changes"),
                ("Magic Ling's UI was adjusted. Come and try it")));

        changes.addButton( new ChangeButton(new ItemSprite(ItemSpriteSheet.MOONDAILY,
                new ItemSprite.Glowing( Window.BLUE_COLOR )), "New Enchantment: Ebb",
                "This enchantment rewinds the time of enemies in sight and adds a blast like the staff of blast wave, and it can inflict _inner demon damage: our side_ elemental damage on enemies."));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "0.7.6.5:\n\n" +
                        "Fixed a pile of issues; see the Magic Ling error log digest in the QQ group"));

        changes.addButton(new ChangeButton(Icons.get(Icons.CHALLENGE_ON), ("Challenge Changes"),
                ("Mutation and Unpredictable were tuned")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.WORN_SHORTSWORD), ("Warrior Talent Changes"),
                ("The Warrior's regeneration talent no longer heals, and fixed a teleport bug with Bullseye")));

    }

    public static void add_V0760_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.7.6.0-NER2", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.WORN_SHORTSWORD), ("Warrior Talent Changes"),
                ("The Warrior's talents were strengthened further, see below\n\n" +
                        "T1 changes:\n" +
                        "Harvest Joy <-- buffed --> Harvest Meal:\n" +
                        "Higher seed chance\n" +
                        "T2 changes:\n\n" +
                        "Iron Stomach <-- buffed --> Thorn Stomach:\n" +
                        "+1 Taking a hit while eating reflects _9 damage_\n" +
                        "+2 Taking a hit while eating reflects _12 damage_")));


        changes = new ChangeInfo("v0.7.6.0-NER", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.WORN_SHORTSWORD), ("Warrior Talents Buffed"),
                ("The Warrior's tier 1 and 2 talents were buffed, see below\n\n" +
                        "T1 changes:\n\n" +
                        "Hearty Meal --> buffed --> Harvest Time:\n" +
                        "+1 On top of the old effect, you may eat seeds, with a 5% chance to trigger the same potion effect as a beneficial seed\n" +
                        "+2 On top of +1, the potion chance rises to 10%\n\n" +
                        "Reworked --> Iron Will:\n" +
                        "+1 Gain _2 shielding_ after killing an enemy.\n" +
                        "+2 Gain _3 shielding_ after killing an enemy.\n\n" +
                        "T2 changes:\n" +
                        "Iron Stomach <-- buffed --> Thorn Stomach:\n" +
                        "+1 Taking a hit while eating grants _1 turn of Thorns_.\n" +
                        "+2 Taking a hit while eating grants _2 turns of Thorns_.\n\n" +
                        "Liquid Will <-- reworked --> Regenerative Healing:\n" +
                        "+1: Whenever the Warrior takes physical damage that directly lowers her health, she gains _2 shielding_ on her next turn.\n" +
                        "+2: Whenever the Warrior takes physical damage that directly lowers her health, she gains _4 shielding_ and a _minor heal_ on her next turn\n" +
                        "Minor heal: restores _5%_ of max health\n\n" +
                        "Improvised Throw <-- reworked --> Bullseye:\n" +
                        "+1: Throwing a non-thrown-weapon item at an enemy gives it _2 turns_ of Marked and _2 turns_ of blindness. This talent has a 50 turn cooldown.\n" +
                        "+2: Throwing a non-thrown-weapon item at an enemy gives it _3 turns_ of Marked and _3 turns_ of blindness, and you may _choose to blink_ in front of the target. This talent has a 50 turn cooldown.\n" +
                        "Marked: physical damage taken increased by 10%.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "0.7.5.6:\n\n" +
                        "1. Fixed upgrade issues from very old versions" +
                        "2. The lights no longer have a challenge limit; ticking it counts as one challenge. In a later version the lights will leave the challenge list and become a special module in normal runs."));

    }

    public static void add_V0755_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.7.5.5-6", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        Image s =new PiraLandSprite();
        s.scale.set(PixelScene.align(1f));
        changes.addButton(new ChangeButton(s, ("New Mini-Boss: Fishman"),
                "A limited-time boss for the Dragon Boat Festival event, 6.11-6.21\n\n6.15: fixed a major bug"));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.RICESWORD), ("New Legendary Weapon: Glutinous Greatsword"),
                ("Beating the Dragon Boat Festival event unlocks it!\n\n6.15: fixed some issues")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "0.7.5.5:\n\n" +
                        "1. Fixed difficulty not loading correctly\n" +
                        "2. Fixed some data issues\n" +
                        "3. Fixed the Dwarf General floor not loading properly\n" +
                        "4. Fixed some potential hidden badge issues\n" +
                        "5. Fixed some major issues Firebase mentioned last time"));

    }

    public static void add_V0751_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.7.5.1", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
        changes.hardlight(CharSprite.POSITIVE);
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(new Image(Assets.Environment.TILES_SEWERS, 48, 80, 16, 16 ), "Room Changes",
                "In the Taiji room the cursed area now gives at least +1 and at most +3,\n" +
                        "the rift area always gives a highly-cursed item,\nand the water area is never cursed but is always plain"));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "0.7.5.1:\n\n" +
                        "1. Fixed difficulty not loading correctly\n" +
                        "2. Enabled the life simulator difficulty option\n" +
                        "3. Improved life simulator logic\n" +
                        "4. Fixed a crash from blizzard vapour spreading off the map\n" +
                        "5. Fixed challenge issues and difficulty issues\n" +
                        "6. Fixed odd rewards from some floor 0 NPCs"));

    }

    public static void add_V0750_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.7.5.0-SUMMER", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.BLESS_SCROLL), ("Developer Mode v0.8"),
                ("1. Added the custom stats item, which can adjust hero stats\n\n" +
                        "2. Developer mode moved to the difficulty selection, please note.")));


        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.HIGHTWAND_1), ("High-Tier Staff Changes"),
                ("The Staff of the Storm and the Ice Witch's drop were largely remade, and the wisp flame staff's damage was raised slightly.")));

        changes.addButton(new ChangeButton(NetIcons.get(NetIcons.CHAT), ("Seed Finder v0.4"),
                ("The seed finder UI was remade and the cobalt coin payment removed\n\n" +
                        "Once again: a long press lets you search by a single parameter (seed analyser)")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Badge Improvements"),
                ("Some badge rewards were adjusted:\n\n" +
                        "1. DM-720 badge - the cat person gives an extra cursed prism\n" +
                        "2. Ice Princess badge - its staff can now spawn naturally in the dungeon\n" +
                        "See the badge descriptions for more")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS),("Other Changes"),
                ("1. Iterated on some assets\n" +
                        "2. Improved some text\n" +
                        "3. Polished various details")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
        changes.hardlight(CharSprite.POSITIVE);
        changeInfos.add(changes);

        Image s =new DwarfGeneralSprite();
        s.scale.set(PixelScene.align(0.8f));
        changes.addButton(new ChangeButton(s, ("New Boss: Dwarf General"),
                "1. Some skills nerfed\n2. Story completed\n3. The imp's shop upgrades after you beat the General in a run"));


        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight(Window.R_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.THEDIED), ("Solemn Kill"),
                ("Fixed the lifesteal effect always triggering on ambushes, and fixed odd triggers on the reaper enchantment")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "0.7.4.0:\n\n" +
                        "1. Fixed odd challenge unlocking\n" +
                        "2. Fixed odd dialogue from some floor 0 NPCs\n" +
                        "3. Fixed crashes with some artifacts"));
    }

    public static void add_V0740_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.7.4.0", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        Image s =new DwarfGeneralSprite();
        s.scale.set(PixelScene.align(0.8f));
        changes.addButton(new ChangeButton(s, ("New Boss: Dwarf General"),
                "Story: QinYue\n\nCode: JDSALing\n\nSkill design: Shejishi"));

        changes.addButton(new ChangeButton(new QinWolfSprite(), ("Qinyue's Birthday"),
                ("Talk to Qinyue between 5.14 and 5.21 for a special item. It is very useful at certain times.\n\n" +
                        "Happy birthday again, Qinyue!!!")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.KINGAXE), ("New Weapon: Court Treaty"),
                ("The Dwarf General's weapon, with its weapon skill implemented.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.THEDIED), ("Solemn Kill Improvements"),
                ("Fixed odd ambush damage and adjusted the lifesteal slightly")));

        changes.addButton(new ChangeButton(Icons.get(Icons.BADGES),("New Badges"),
                ("Two hidden badges were added.")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "0.7.4.0:\n\n" +
                        "1. Fixed some small Unpredictable issues\n" +
                        "2. Fixed some Scroll of Return issues\n" +
                        "3. Small changes to the regular fruit arena\n" +
                        "4. Fixed some Seeking Spear issues"
        ));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS),("Other Changes"),
                ("1. Iterated on some assets\n" +
                        "2. Improved some text\n" +
                        "3. Polished various details")));


        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight(Window.R_COLOR);
        changeInfos.add(changes);

        Image issxsaxs =new DimandKingSprite();
        issxsaxs.scale.set(PixelScene.align(0.8f));
        changes.addButton(new ChangeButton(issxsaxs, ("Mimic King"),
                ("The Mimic King's copied weapon damage is no longer exact but 75%.\n\nIts base movement speed is now 0.85.")));
    }

    public static void add_V0735_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.7.3.5", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_16), ("Challenge: Unpredictable v0.5"),
                ("The blood crystal floor from yesterday's hotfix was fully reworked,\n\n" +
                        "and the doors there are now hidden doors." +
                        "\n\nYou no longer need a key to open them.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SEEKSXS), ("New Weapon: Seeking Spear"),
                ("An item from another world. Give it a try. Its data was completed, including crit effects.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "0.7.3.5:\n\n" +
                        "1. Fixed some small Unpredictable issues\n" +
                        "2. Fixed some Seeking Spear mechanics not working"
        ));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight(Window.R_COLOR);
        changeInfos.add(changes);

        Image s =new CrivusStarFruitsSprite();
        s.scale.set(PixelScene.align(0.8f));
        changes.addButton(new ChangeButton(s, ("Boss Change: Fruit of Clivus"),
                "Fixed the strange fruit not taking turns."));

        Image dragonSprite = new FireDragonSprite();
        dragonSprite.scale.set(PixelScene.align(0.52f));
        changes.addButton(new ChangeButton(dragonSprite, ("Lava Fire Dragon"),
                ("Fixed the fire dragon not taking turns, lowered its defense and removed the damage cap.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_14), ("Tactical Combat Challenge Removed"),
                ("Tactical Combat was removed, along with the acid body.")));
    }

    public static void add_V0732_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.7.3.2", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_16), ("Challenge: Unpredictable v0.4"),
                ("Fixed a pile of issues and added 3 new terrain types.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SEEKSXS), ("New Weapon: Seeking Spear"),
                ("An item from another world. Give it a try.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_16), ("DM275"),
                ("DM-275 damage increased.")));

    }

    public static void add_V0731_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.7.3.1", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SMTITEM), ("Preloaded Item: Glimmer Guide"),
                ("Coming in a later version; the unfinished version can be tested in developer mode.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "0.7.3.1:\n\n" +
                        "1. Fixed some issues on the Cerberus floor\n" +
                        "2. Fixed some odd errors with the lights shadow\n" +
                        "3. Fixed a crash transmuting tier-6 weapons\n" +
                        "4. Fixed the Mimic King one-shotting you in its third phase, and summons being lost on its floor\n" +
                        "5. Fixed odd monster spawning in the Demon Halls\n" +
                        "6. Fixed the meat pie sprite"
        ));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.LINGPEA), ("Prism Changes"),
                ("Only works before depth 10.")));
    }

    public static void add_V0730_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.7.3.0", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SKIN_7), ("New System: Skins"),
                ("10 new skins were added. Take your pick.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.ICEGOLD), ("Limited Event: Double Cobalt Coins"),
                ("Event dates: 2024-5.1 to 2024-5.20\n\n" +
                        "Cobalt coins drop twice as often during the event. Enjoy.")));

        changes.addButton(new ChangeButton(NetIcons.get(NetIcons.GLOBE),("Server Issues"),
                ( "The server has been having problems, so only the update endpoint is available. It should recover in mid-May; sorry for the trouble.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "0.7.3.0:\n\n" +
                        "1. Fixed some sublevel issues\n" +
                        "2. Fixed some crashes\n" +
                        "3. Fixed acid body magic attacks passing through creatures and walls"
        ));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_17), ("Challenge Change Preview"),
                ("The difficulty system arrives later, and the Lonely City challenge will move into hard mode.\n\nDeveloper mode will also move into the difficulty system.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight(Window.R_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.BUFFS), ("Balance Changes"),
                ("1. Dwarf warlock health and attack speed reduced\n" +
                        "2. Dwarf warlock health and accuracy reduced")));
    }

    public static void add_V0723_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.7.2.2-5", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(NetIcons.get(NetIcons.GLOBE),("Server Upgrade"),
                ( "The MLPD server was fully upgraded for a better experience.")));

        Image xax = new SakaFishBossSprites();
        xax.scale.set(PixelScene.align(0.72f));
        changes.addButton(new ChangeButton(xax,  "Sakaban Fish",
                "AI improved: the Sakaban Fish now avoids fights and may teleport when hurt."));

        Image dragonSprite = new FireDragonSprite();
        dragonSprite.scale.set(PixelScene.align(0.52f));
        changes.addButton(new ChangeButton(dragonSprite, ("Lava Fire Dragon"),
                ("AI improved: the fire dragon avoids fights and summons elementals more often.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.LINGPEA), ("Main Story: Chapter of the Lightless Flame v0.3"),
                ("1. Some wrong choices no longer end the story\n" +
                        "2. Killing pure crystal elementals no longer affects the story\n" +
                        "3. Added follow-up story; the Oklah line is coming\n" +
                        "4. Fewer traps on the fire dragon floor")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "0.7.2.2-5:\n\n" +
                        "1. Fixed Boss Rush issues\n" +
                        "2. Fixed revival on floor 0\n" +
                        "3. Fixed issues from leaving your backpack behind on the Sakaban Fish floor\n" +
                        "4. Fixed the strange fruit's armor defense\n" +
                        "5. Fixed odd prices in the vending machine\n" +
                        "6. Improved some text"
        ));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_14), ("Challenge: Tactical Combat v1.7"),
                ("1. Tactical Combat no longer affects the Barren Lands challenge\n" +
                        "2. Clever enemies no longer avoid cliffs under Tactical Combat.\n" +
                        "3. The acid body chance under Tactical Combat is now 10%")));
    }

    public static void add_V0721_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.7.2.1", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        Image dragonSprite = new DM720Sprite();
        dragonSprite.scale.set(PixelScene.align(0.72f));
        changes.addButton(new ChangeButton(dragonSprite, ("DM-720 Changes"),
                ("1. Removed its constant water healing and wire healing.\n" +
                        "2. Badder Bosses difficulty is implemented; see the challenge.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS),("Second Balance Pass"),
                        ( "1: Challenge changes\n"  +
                        "* Potion Hysteria: the pie's strength gain is capped per region, and below 12 Strength it is guaranteed\n" +
                        "Region / limit: (regions 1/2/3/4/5, 1/2/2/1/1 times)\n" +
                        "* Frozen meat now gives half the old shielding\n" +
                        "* Unpredictable: the fixed big-room floors are gone, there are no normal trap floors, only trap-plus floors, and big floors can still appear (in short: the terrain is still there, with elites and the three wells added, and normal traps replaced by a sea of blades and fire)\n\n" +
                        "2: Weapon changes\n" +
                        "* Verdant Ash: normal damage growth is now 1-3, block changed from 0-3 to a non-growing 0-10 with no bonuses.\n" +
                        "* Thorns: the strange fruit Tree of Life now drops 80% of the time with no pity timer\n" +
                        "* Twin Axes: growth is now 1-2\n" +
                        "* Kite Shield: block growth now matches the round shield\n" +
                        "* Dragon Scale: block growth is now 0-4!!!\n\n" +
                        "3: Fire Witch shop\n" +
                        "* The Fire Witch shop was fixed so you can no longer stall for free turns.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "0.7.2.0:\n\n" +
                        "1. Fixed a Mimic King crash\n" +
                        "2. Fixed DM-720's bad spawn logic\n" +
                        "3. Improved the Shop Lord's rewards\n" +
                        "4. Fixed odd movement speed in the Lonely City and odd armor on Tengu and the portal\n" +
                        "5. Fixed the explosive body's movement speed\n" +
                        "6. Fixed the Vampiric Blade's attack speed",
                "This version was reviewed by the mid-tier group:\n" +
                        "Reviewers: Serious Fairy, WTE\n" +
                        "Code: JDSALing"
        ));
    }

    public static void add_V0716_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.7.1.8", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        Image dragonSprite = new FireDragonSprite();
        dragonSprite.scale.set(PixelScene.align(0.72f));
        changes.addButton(new ChangeButton(dragonSprite, ("New Boss: Lava Fire Dragon"),
                ("The mastermind behind the jungle. Can you fight it? Happy first birthday to the fire dragon.")));


        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.DRAGONSHILED), ("New Boss Weapon: Dragon Scale"),
                ("Give it a try")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.LINGPEA), ("New Main Story: Chapter of the Lightless Flame"),
                ("The truth of the jungle is revealed here...")));

        changes.addButton(new ChangeButton(Icons.get(Icons.BADGES),("New Badges"),
                ("One hidden badge and one regular badge.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS),("Other Changes"),
                ("1. Iterated on some assets\n" +
                "2. Improved some text\n" +
                        "3. Polished various details\n" +
                        "4. First pass on the bestiary")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight(Window.R_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.BUFFS), ("Balance Changes"),
                ("1. Scrolls of Return, return pylons and spatial beacons no longer work on sublevels\n" +
                        "2. Scrolls of Upgrade no longer spawn on sublevels")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "0.7.1.8:\n\n" +
                        "1. Fixed issues in Boss Rush mode\n" +
                        "2. Fixed some text issues\n" +
                        "3. Fixed Lonely City stat issues and Mimic King issues"
        ));

    }


    public static void add_V0715_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.7.1.6", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new RedNecromancerSprite(),("New Elite: Necro Lord"),
                ("The elite form of the fire fly.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight(Window.R_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.BUFFS), ("Feature Removed: Effect Button"),
                ("Removed because it had too many bugs.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SKELETONGOLD), ("BossRushV1.7"),
                ("1. Fixed odd red mist from the strange fruit\n\n" +
                        "2. Fixed startup not detecting Boss Rush mode")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "0.7.1.6:\n\n" +
                        "1. Fixed issues in Boss Rush mode\n" +
                        "2. Fixed some monster issues in rifts\n" +
                        "5. Fixed some lights issues\n" +
                        "6. Fixed some boss issues"
        ));

    }

    public static void add_V0714_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.7.1.5", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.BZMDR_BOOKS), ("New Player Book"),
                ("Added the new player book")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.GRILLED_FISH), ("New Weapon: Grilled Herring"),
                ("The winner of the first Jinghong Cup Forged Through Fire track is now in game.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.BUFFS), ("Feature: Effect Button"),
                ("You can now cancel beneficial effects yourself")));

        changes.addButton(new ChangeButton(new HollowKnightSprite(),("New NPC: Little Knight"),
                ("The pride of Hallownest.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SKELETONGOLD), ("BossRushV1.6"),
                ("1. Fixed some issues\n\n" +
                        "2. The fourth difficulty is open")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.BOMB_SWORD), ("Bomb Dagger"),
                ("Fixed bombs being countable")));

        changes.addButton(new ChangeButton(new RivalSprite(),("Shadow"),
                ("Improved AI and stronger effects.")));


        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS),("Miscellaneous Changes"),
                ("1. White Yan NPC: improved dialogue logic\n" +
                        "2. Iterated on the underlying code\n" +
                        "3. Reduced BGM size\n" +
                        "4. Challenge rating changes:\n\n" +
                        "1, 2, 3 challenges - D,\n" +
                        "4, 5, 6 challenges - C,\n" +
                        "7, 8 challenges - B\n" +
                        "9, 10 challenges - B+\n" +
                        "11, 12, 13 challenges - A\n" +
                        "14 challenges - A+\n" +
                        "15 challenges - S\n" +
                        "16 challenges - SS\n" +
                        "17 challenges - SSS")));
    }


    public static void add_V0713_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.7.1.3-4", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.LANGS), ("Language Update: Traditional Chinese"),
                ("Sotis's Traditional Chinese translation was updated")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.BOMB_SWORD), ("Bomb Dagger Returns"),
                ("Kids, I'm back. And now it is a tier-5 weapon.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.HIGHTWAND_1), ("New Staff: Staff of Venom"),
                ("Due to a code bug this should have been the venom staff rather than the chaos staff\n\nRecipe: sleeping runestone + corrosive brew + acid staff\n\nThe staff fires a bolt that bursts into crimson mist where it lands, releasing a highly corrosive gas. Anything inside the crimson mist takes steadily increasing damage, starting at a few points. At high poison it blinds the target; at severe poison it suffocates them until death arrives.\n\n0.7.1.4: fixed the projectile")));


        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "0.7.1.3:\n\n" +
                        "1. Fixed cobalt coin errors in Boss Rush, though old saves cannot be synced\n" +
                        "2. Fixed some monster issues in rifts\n" +
                        "3. Fixed some scorpion issues\n" +
                        "4. Fixed some Tactical Combat issues\n" +
                        "5. Fixed the Fade lights buff being obtainable after floor 20\n" +
                        "6. Fixed some fading grass issues"
        ));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes"),
                ("1.Buff icons now show at most six per row on mobile\n" +
                        "2. Iterated on some UI")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_14), ("Challenge: Tactical Combat v1.6"),
                ("1. Arena change: it does not apply to bosses or NPCs, or on sublevels\n\n" +
                        "2. Improved the arena's particle effects")));
    }

    public static void add_V0712_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.7.1.2", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(NetIcons.get(NetIcons.GLOBE), ("Online Update System v2.0"),
                ("Fully optimized, with download progress and in-game progress tracking. You can play while it downloads.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.AUDIO), ("New Music: Desert"),
                ("By Quan.\n\nIt will be added with part one of the Golden Age update. For now you can hear it in the night-time easter egg story.")));


        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "0.7.1.2:\n\n" +
                        "1. Fixed cobalt coin issues\n" +
                        "2. Fixed some crashes Firebase reported last version\n" +
                        "3. Fixed some issues with the Goo crystal key in Unpredictable"
        ));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_14), ("Challenge: Tactical Combat v1.5"),
                ("1. Added the Tactical Combat arena\n\n2. Clever enemies have a 20% chance not to fall off cliffs\n\n3. With this challenge and potion fear both on, spring grass no longer heals and instead poisons you like a Potion of Healing would")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes"),
                ("1. Iterated on some assets\n" +
                        "2. Improved some text\n" +
                        "3. Polished various details\n" +
                        "4. Improved the title screen and added more menu music")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SKELETONGOLD), ("BossRushV1.5"),
                ("1. Fixed key issues on floor 2\n\n2. Fixed some issues on floors 14 and 29\n\n3. Fixed some terrain issues")));

    }

    public static void add_V0711_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.7.1.0", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new SmallLeafSprite(), ("Xiaoye"),
                ("NPC polish")));

        changes.addButton(new ChangeButton(new PianoLeSprite(), ("Kotori"),
                ("Xiaoye's sister, NPC polish")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_14), ("New Challenge: Tactical Combat"),
                ("Apparently the monsters have had enough of you, and now things get rough.\n\nEnemies you meet are either cleverer or duller (50% each).\n\n1. Dull enemies mostly follow clever ones of the same species (rats follow rats)\n\n2. Clever enemies below 50% health that escape combat seek out beneficial plants for buffs and turn the tile into water, while dull enemies step on plants at random\n\n(Note: with this challenge on, the Barren Lands challenge still has plants and seeds, but you still cannot plant them and get no dew)\n\n3. Clever enemies cannot fall into rifts; they climb out first\n\n4. (After floor 12) clever enemies have a 1% chance to be born as mutated acid bodies. Kids, I'm back.")));

        changes.addButton(new ChangeButton(NetIcons.get(NetIcons.GLOBE), ("Online Update System"),
                ("The old update system was removed in favour of online updates. APKs can be downloaded and installed in game.\n\nThe desktop version still requires opening the URL and downloading manually.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_17), ("Challenge Tuning: Lonely City Maze"),
                ("The Lonely City mark now appears with a 25% chance")));

        changes.addButton( new ChangeButton(new Image(Assets.Environment.TILES_COLD, 48, 80, 16
                , 16), "Room Changes",
                "The honeypot room now has a 5% chance of a far nastier monster set"));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SKELETONGOLD), ("BossRushV1.2"),
                ("1. Fixed some issues; everything now uses gold vouchers, 5 stacked ones trade for a voucher, and 50 stacked gold gives one voucher\n\n" +
                        "2. The dog now benefits from modifiers, the dwarven warrior set was tuned, and the floor 14 boss is stronger\n\n3. Bosses can drop more gold vouchers")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes"),
                ("1. Iterated on some assets\n" +
                        "2. Improved some text\n" +
                        "3. Polished various details\n" +
                        "4. Improved the title screen and added more menu music")));

    }

    public static void add_V0710_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.7.0.X", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SKELETONGOLD), ("New Mode: Boss Rush"),
                ("Still in testing, play carefully.")));


        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new DragonGirlBlueSprite(), ("Ancient Ruins v1.3"),
                ("1. Little Blue always spawns\n\n" +
                        "2. Improved Keyblade generation")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.FISHING_SPEAR), "Thrown Weapon Improvements",
                "Fixed some issues with enchanted thrown weapons, thanks to Shoudian"));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes"),
                ("1. Iterated on some assets\n" +
                        "2. Improved some text\n" +
                        "3. Polished various details")));

    }

    public static void add_V079_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.7.0.9-10", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        Image ss =new CrivusStarFruitsSprite();
        ss.scale.set(PixelScene.align(0.8f));
        changes.addButton(new ChangeButton(ss, ("Boss Change: Fruit of Clivus"),
                "Phases two and three were adjusted"));

        changes.addButton(new ChangeButton(new NyzSprites(), ("Nyazaki"),
                ("Nyazaki's portrait was added and some bugs fixed")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.HIGHTWAND_1), ("New Staff: Staff of Chaos"),
                ("The staff's energy is wildly unstable and can release all kinds of magic. It deals damage and adds a random spell effect.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.MEAT_PIE), ("New Alchemy Recipes"),
                ("Alchemy has more recipes. Give them a try.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(NetIcons.get(NetIcons.CHAT), ("Seed Finder v0.3"),
                ("Fixed some bugs and made searching faster. Levels now render in special colours, and a long press lets you search by a single parameter (free, no cobalt coins)")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.HIGHTWAND_6), ("Symbiotic Staff"),
                ("Improved the firing effect.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.BLINDING_DART), ("Thrown Weapons"),
                ("Fixed thrown weapon issues.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_17), ("Challenge Update: Lonely City Maze"),
                ("In the new Lonely City, the city is the old floor 0, and special room supplies drop from at most level 4 to at most level 2.\n\n" +
                        "Floors 2 to 24 gain Lonely City marked monsters, but not boss floors.\n\n" +
                        "Lonely City enemies gain 1% per day, and the return trip was improved.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes"),
                ("1. Iterated on some assets\n" +
                        "2. Improved some text\n" +
                        "3. Polished various details\n" +
                        "4. Negative gold now shows in red")));

        changes = new ChangeInfo("v0.7.0.8", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        Image s =new CrivusStarFruitsSprite();
        s.scale.set(PixelScene.align(0.8f));
        changes.addButton(new ChangeButton(s, ("New Boss: Fruit of Clivus"),
                "Appears above 9 challenges; see the following tabs for its mechanics." +
                        "Strange fruit appearance:\n" +
                        "It appears at 9 or more challenges,\n" +
                        "100% if you do not have the strange fruit badge yet,\n" +
                        "70% after you have the badge.\n" +
                        "Once you have the badge it also has a 20% chance with no challenges\n" +
                        "\n" +
                        "Note: once it appears the run is locked to the strange fruit.\n" +
                        "Cross resets do not change it",
                "Phase one: 280-160\n\n" +
                        "The fruit is in the centre with 12 tentacles\n" +
                        "Phase one also has four hero remains holding four small purifications\n" +
                        "Note: the four small purifications are cleared from the ground on a phase change. Everything else on the ground is returned to you at once (like psychokinetic crystals)\n" +
                        "Tentacle skill: cross poison mist. Outside the danger zone it periodically grabs you (the same chain the Warden uses)\n" +
                        "Danger zone: when an impassable tile sits between the tentacle and you, it cannot grab you\n" +
                        "After all 12 tentacles are down, moving once starts phase two. (No point trying to exploit it: phase one stops at 160 until you move)\n" +
                        "Falling into a rift in phase one teleports you to safety with no damage.",
                "Phase two: 160-0\n\n" +
                        "The tentacles are invulnerable and give off acid mist.\n" +
                        "The fruit teleports periodically (yes, the strange fruit is the reverse of the normal one)\n" +
                        "Tentacles also grab you periodically\n" +
                        "Two extra pure crystal elementals appear, 50 health + 50 shielding\n" +
                        "From phase two on, falling off a cliff still teleports you to safety but always costs 3 health.\n" +
                        "Hitting the body in this phase releases red mist that deals a fixed 6 damage, so be careful and dodge it.",
                "Final phase: 0\n\n" +
                        "Once the strange fruit reaches 0 health it calls for energy from everything around. You can either burn the fruit down or kill the tentacles; from phase three the tentacles become vulnerable because they must feed the body.\n" +
                        "If the fruit is above 60 health (not including 60), the enemy it marks periodically takes true damage equal to a third of its own max health\n" +
                        "Hitting tentacles in this phase releases red mist that deals a fixed 6 damage, so be careful and dodge it.\n" +
                        "The fruit also explodes when it dies, so do not stand too close\n" +
                        "There are useful elements in the arena too; explore to find the rest."));

        Image issxsaxs =new FireCrystalSprites();
        issxsaxs.scale.set(PixelScene.align(0.8f));
        changes.addButton(new ChangeButton(issxsaxs, ("Shop Robbing Is Permanent!!"),
                "Shop robbing was improved, fixed and made permanent!!!\n\nA later update adds an extra story line, so you will not always fight Lena; you will head to the mysterious Snowridge Canyon to help her.\n\n" +
                        "The Fire Witch was improved too; see the following table.",
                "Lena Improvements\n\n" +
                        "1. Fixed the witch curse being applied after the fight\n" +
                        "2. Destroying Lena's rose barrier now removes it at once",
                "Shop Lord Improvements\n\n" +
                        "1. The Shop Lord sells at full price, with a discount during Spring Festival.\n" +
                        "2. Lena no longer drops the Book of Return, and the book now only returns you to the main floor of the current depth, with no floor choice."));

        changes.addButton( new ChangeButton(new BuffIcon(BuffIndicator.CORRUPT, true), ("Elite Challenge Changes"),
                "New mutant:\n\n" +
                        "Glitch body mutation: its cognition has collapsed and nothing about it makes sense...\n\n" +
                        "It deals 20% more damage, and all of its information is hidden, including stats, description and sprite, though you can still work out most enemies' types from how they fight."));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new DragonGirlBlueSprite(), ("Ancient Ruins v1.3"),
                ("Fixed Some Issues")));

        changes.addButton(new ChangeButton(new ShopkeeperSprite(), ("Merchant Return Text"),
                ("Added return text for the merchants: Nyazaki, the imp, the shopkeeper and Those Memories")));

        changes.addButton(new ChangeButton(new LuoWhiteSprite(), ("Floor 0 Changes"),
                ("1. Improved Luobai's shop\n\n" +
                        "2. Moved goods around in Nyazaki's and Luobai's shops")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.GREEN_DARK), ("Thrown Weapon: Glimmer Dart"),
                ("Fixed an error in the growth curve.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.RED_BLOOD), ("Thrown Weapon: Wrath of the Earth"),
                ("Fixed an error in the growth curve.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes"),
                ("1. Iterated on some assets\n" +
                        "2. Removed some unused music\n" +
                        "3. Polished various details\n" +
                        "4. Negative gold now shows in red")));
    }

    public static void add_V078_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.7.0.8-P1", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        Image ss =new CrivusStarFruitsSprite();
        ss.scale.set(PixelScene.align(0.8f));
        changes.addButton(new ChangeButton(ss, ("Boss Change: Fruit of Clivus"),
                "Appears above 9 challenges; see the following tabs for mechanics. Coloured text marks a fix." +
                        "Strange fruit appearance:\n" +
                        "It appears at 9 or more challenges,\n" +
                        "100% if you do not have the strange fruit badge yet,\n" +
                        "70% after you have the badge.\n" +
                        "Once you have the badge it also has a 20% chance with no challenges\n" +
                        "\n" +
                        "Note: once it appears the run is locked to the strange fruit.\n" +
                        "Cross resets do not change it",
                "Phase one: 280-160\n\n" +
                        "The fruit is in the centre with 12 tentacles, _tentacle health: 60->50 in phase one, 30->40 in phase two; the fruit's evasion dropped from 15 to 14_\n" +
                        "Phase one also has four hero remains holding four small purifications\n" +
                        "Note: the four small purifications are cleared from the ground on a phase change. Everything else on the ground is returned to you at once (like psychokinetic crystals)\n" +
                        "Tentacle skill: cross poison mist. Outside the danger zone it periodically grabs you (the same chain the Warden uses)\n" +
                        "Danger zone: when an impassable tile sits between the tentacle and you, it cannot grab you\n" +
                        "After all 12 tentacles are down, moving once starts phase two. (No point trying to exploit it: phase one stops at 160 until you move)\n" +
                        "Falling into a rift in phase one teleports you to safety with no damage.",
                "Phase two: 160-0\n\n" +
                        "The tentacles are invulnerable and give off acid mist.\n" +
                        "The fruit teleports periodically, _with a longer cooldown: 12 turns becomes 16_ (yes, the strange fruit is the reverse of the normal one)\n" +
                        "Tentacles also grab you periodically\n" +
                        "Two extra pure crystal elementals appear, _30 health + 30 shielding_\n" +
                        "From phase two on, falling off a cliff still teleports you to safety but always costs 3 health.\n" +
                        "Hitting the body in this phase releases red mist that deals a fixed 6 damage, so be careful and dodge it.",
                "Final phase: 0\n\n" +
                        "Once the strange fruit reaches 0 health it calls for energy. _6 tentacles each give it 12 health, 2x6_\n" +
                        "You can either burn the fruit down or kill the tentacles; from phase three the tentacles become vulnerable because they must feed the body.\n" +
                        "_The hive mind no longer disappears by itself above 60 health_" +
                        "If the fruit is above 60 health (not including 60), the enemy it marks periodically takes true damage equal to a third of its own max health\n" +
                        "Hitting tentacles in this phase releases red mist that deals a fixed 6 damage. _The fruit also stops teleporting_\n" +
                        "The fruit also explodes _for heavy area damage_ when it dies, so do not stand too close\n" +
                        "There are useful elements in the arena too; explore to find the rest.",
                "Rewards:\n\n" +
                        "On top of the normal fruit rewards:\n1. 200 gold\n2. 15 cobalt coins\n3. 2 food\n4. _An extra torch after the fight if the lights are enabled_"));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SWORD_BAG), ("Item Change: Armory Pack"),
                ("Thrown weapons cannot go in it.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes"),
                ("1. Iterated on some assets\n" +
                        "2. Improved some text\n" +
                        "3. Polished various details\n" +
                        "4. Negative gold now shows in red")));

        changes = new ChangeInfo("v0.7.0.8", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        Image s =new CrivusStarFruitsSprite();
        s.scale.set(PixelScene.align(0.8f));
        changes.addButton(new ChangeButton(s, ("New Boss: Fruit of Clivus"),
                "Appears above 9 challenges; see the following tabs for its mechanics." +
                        "Strange fruit appearance:\n" +
                        "It appears at 9 or more challenges,\n" +
                        "100% if you do not have the strange fruit badge yet,\n" +
                        "70% after you have the badge.\n" +
                        "Once you have the badge it also has a 20% chance with no challenges\n" +
                        "\n" +
                        "Note: once it appears the run is locked to the strange fruit.\n" +
                        "Cross resets do not change it",
                        "Phase one: 280-160\n\n" +
                                "The fruit is in the centre with 12 tentacles\n" +
                                "Phase one also has four hero remains holding four small purifications\n" +
                                "Note: the four small purifications are cleared from the ground on a phase change. Everything else on the ground is returned to you at once (like psychokinetic crystals)\n" +
                                "Tentacle skill: cross poison mist. Outside the danger zone it periodically grabs you (the same chain the Warden uses)\n" +
                                "Danger zone: when an impassable tile sits between the tentacle and you, it cannot grab you\n" +
                                "After all 12 tentacles are down, moving once starts phase two. (No point trying to exploit it: phase one stops at 160 until you move)\n" +
                                "Falling into a rift in phase one teleports you to safety with no damage.",
                "Phase two: 160-0\n\n" +
                "The tentacles are invulnerable and give off acid mist.\n" +
                        "The fruit teleports periodically (yes, the strange fruit is the reverse of the normal one)\n" +
                        "Tentacles also grab you periodically\n" +
                        "Two extra pure crystal elementals appear, 50 health + 50 shielding\n" +
                        "From phase two on, falling off a cliff still teleports you to safety but always costs 3 health.\n" +
                        "Hitting the body in this phase releases red mist that deals a fixed 6 damage, so be careful and dodge it.",
                "Final phase: 0\n\n" +
                "Once the strange fruit reaches 0 health it calls for energy from everything around. You can either burn the fruit down or kill the tentacles; from phase three the tentacles become vulnerable because they must feed the body.\n" +
                        "If the fruit is above 60 health (not including 60), the enemy it marks periodically takes true damage equal to a third of its own max health\n" +
                        "Hitting tentacles in this phase releases red mist that deals a fixed 6 damage, so be careful and dodge it.\n" +
                        "The fruit also explodes when it dies, so do not stand too close\n" +
                        "There are useful elements in the arena too; explore to find the rest."));

        Image issxsaxs =new FireCrystalSprites();
        issxsaxs.scale.set(PixelScene.align(0.8f));
        changes.addButton(new ChangeButton(issxsaxs, ("Shop Robbing Is Permanent!!"),
                "Shop robbing was improved, fixed and made permanent!!!\n\nA later update adds an extra story line, so you will not always fight Lena; you will head to the mysterious Snowridge Canyon to help her.\n\n" +
                        "The Fire Witch was improved too; see the following table.",
                "Lena Improvements\n\n" +
                        "1. Fixed the witch curse being applied after the fight\n" +
                        "2. Destroying Lena's rose barrier now removes it at once",
                "Shop Lord Improvements\n\n" +
                        "1. The Shop Lord sells at full price, with a discount during Spring Festival.\n" +
                        "2. Lena no longer drops the Book of Return, and the book now only returns you to the main floor of the current depth, with no floor choice."));

        changes.addButton( new ChangeButton(new BuffIcon(BuffIndicator.CORRUPT, true), ("Elite Challenge Changes"),
                "New mutant:\n\n" +
                        "Glitch body mutation: its cognition has collapsed and nothing about it makes sense...\n\n" +
                        "It deals 20% more damage, and all of its information is hidden, including stats, description and sprite, though you can still work out most enemies' types from how they fight."));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new DragonGirlBlueSprite(), ("Ancient Ruins v1.3"),
                ("Fixed Some Issues")));

        changes.addButton(new ChangeButton(new ShopkeeperSprite(), ("Merchant Return Text"),
                ("Added return text for the merchants: Nyazaki, the imp, the shopkeeper and Those Memories")));

        changes.addButton(new ChangeButton(new LuoWhiteSprite(), ("Floor 0 Changes"),
                ("1. Improved Luobai's shop\n\n" +
                        "2. Moved goods around in Nyazaki's and Luobai's shops")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.GREEN_DARK), ("Thrown Weapon: Glimmer Dart"),
                ("Fixed an error in the growth curve.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.RED_BLOOD), ("Thrown Weapon: Wrath of the Earth"),
                ("Fixed an error in the growth curve.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes"),
                ("1. Iterated on some assets\n" +
                        "2. Removed some unused music\n" +
                        "3. Polished various details\n" +
                        "4. Negative gold now shows in red")));
    }

    public static void add_V077_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.7.0.7", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SWORD_BAG), ("New Item: Armory Pack"),
                ("A pack that carries your weapons and armor, but above 14 challenges thieves treat it as precious (the mad and regular ones; the Crimson Bandit will not steal it),\n\n" +
                        "If your armory pack is stolen the thief is slowed to 0.6 movement, and you gain 6 turns of mind vision\n\n")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        Image s =new DimandKingSprite();
        s.scale.set(PixelScene.align(0.8f));
        changes.addButton(new ChangeButton(s, ("Mimic King"),
                ("1. Fixed melee attacks getting stuck\n" +
                        "2. Fixed drops carrying over between phases\n" +
                        "3. Fixed drops on the Tengu floor\n" +
                        "4. The portal's movement speed is now 0.85, and the Lonely City cannot speed it up\n" +
                        "5. Properly fixed the Mimic King floor save hang (may not help old saves)")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_17), ("Challenge Update: Lonely City Maze"),
                ("In the new floor 0, everyone returns to the Lonely City.")));

        changes.addButton(new ChangeButton(new MintSprite(), ("Light Green Changes"),
                ("Improved. Long live the Light Green fans.")));

        changes.addButton(new ChangeButton(new MoonLowSprite(), ("Pale Moon Changes"),
                ("Improved, with a portrait added.")));

        changes.addButton(new ChangeButton(new DeepSeaSprite(), ("Xiaohai Changes"),
                ("Art was improved.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.FISHING_SPEAR), "Thrown Weapon Improvements",
                "Fixed some issues with enchanted thrown weapons, thanks to Shoudian"));

        changes = new ChangeInfo("Nerfs", false, null);
        changes.hardlight(Window.RED_COLOR);
        changeInfos.add(changes);


        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.LOCK_SWORD_DIAMOND), "Keyblade of Return",
                "Overall scaling reduced from 1-11 to 1-6."));

    }

    public static void add_V076_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.7.0.6-HC", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new MintSprite(), ("New NPC: Sleeping Cat"),
                ("Has a 40% chance to appear at the inn and rewards a legendary book, not counting towards the floor 0 NPC limit.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        Image s =new DimandKingSprite();
        s.scale.set(PixelScene.align(0.8f));
        changes.addButton(new ChangeButton(s, ("Mimic King"),
                ("Fixed units at 0 health not dying.")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "0.7.0.6:\n\n" +
                        "1. Fixed issues with phased bosses\n" +
                        "2. Fixed Lena using the wrong skills\n" +
                        "3. Fixed the Mimic King being invulnerable"
        ));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes"),
                ("1. Iterated on some assets\n" +
                        "2. Polished various details\n" +
                        "3. Improved some screens\n")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_17), ("Challenge Update: Lonely City Maze"),
                ("In the new floor 0, everyone disappears into the Lonely City except Xiaoye, Mio, Nyazaki, Bubble, Luobai and the innkeeper.")));
    }

    public static void add_V075_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.7.0.5", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.ICEGOLD), "Ice Blue Cobalt Coin v0.4",
                "Tengu in Badder Bosses now gives 10 extra cobalt coins and the Mimic King 20"));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.THEDIED), "New Legendary Weapon: \"Solemn Kill\"",
                "Price: 600 cobalt coins, or 10% off with the Potion Hysteria badge.\n\nFrom this version on, buying a legendary weapon unlocks it in the dungeon for good and adds it to the spawn pool."));

        Image s =new DimandKingSprite();
        s.scale.set(PixelScene.align(0.8f));
        changes.addButton(new ChangeButton(s, ("Badder Boss: Mimic King"),
                ("The Mimic King appears as a badder boss; see the detailed challenge notes.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new KongFuSprites(), ("Pigeon Changes"),
                ("Its reward changed from a sweet date zongzi to a meat pie")));

        changes.addButton(new ChangeButton(new YetYogSprite(), ("Bubble Changes"),
                ("Art improvements")));

        Image issxsaxs =new FireCrystalSprites();
        issxsaxs.scale.set(PixelScene.align(0.8f));
        changes.addButton(new ChangeButton(issxsaxs, ("Shop Robbing Improvements"),
                ("Shop robbing was improved and some issues fixed")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "0.7.0.5:\n\n" +
                        "1. Fixed issues with phased bosses\n" +
                        "2. Fixed Lena using the wrong skills"
        ));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes"),
                ("1. Iterated on some assets\n" +
                        "2. Polished various details\n" +
                        "3. Improved some screens\n")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_17), ("Challenge Update: Lonely City Maze"),
                ("In the new floor 0, everyone disappears into the Lonely City except Xiaoye, Mio, Nyazaki, Bubble and Luobai.")));

    }

    public static void add_V074_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.7.0.4", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(PasswordBadgeBanner.image(PaswordBadges.Badge.WHATSUP.image), ("New Hidden Badge"),
                ("Freebies are not proper. Split the gold \"a petal\".")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.ICEGOLD), "Ice Blue Cobalt Coin v0.3",
                "Normal gain: (current floor/5)*5\n\nChallenge bonus: x2 above 10 challenges, x3 above 15\n\n" +
                        "Fighting Lena on the way back (shop robbing): 15 extra cobalt coins\n\n" +
                        "Lonely City Yog-Zot: 30 extra cobalt coins\n\nNote: bugs in the last version threw the cobalt economy badly out of balance.\n\nYou can collect 50 cobalt coins as compensation from Luobai's shop (once per device).\n\n" +
                        "Developer mode bosses drop cobalt coins so you can see the amounts, but picking them up does not count."));

        changes.addButton(new ChangeButton(new YetYogSprite(), ("New NPC: Bubble"),
                ("Spawns with Nyazaki. You know what the deal is between Nyazaki and Bubble.")));

        changes.addButton(new ChangeButton(NetIcons.get(NetIcons.CHAT), ("Seed Finder v0.2"),
                ("Fixed some bugs; multi-sequence searches are supported and the Red Dragon King's rewards are shown.\n\nDefaults are now more sensible, before floor 16.")));

        changes.addButton(new ChangeButton(NetIcons.get(NetIcons.GLOBE), ("Resolution Region Changed"),
                ("Domestic traffic is under heavy load, so we moved to a Hong Kong node. Downloads may be a little slower; thanks for understanding.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new KongFuSprites(), ("Pigeon Changes"),
                ("The reward changed from a meat pie to a sweet date zongzi")));

        changes.addButton(new ChangeButton(new WhiteGirlSprites(), ("Town Changes"),
                ("Apart from Mio and Bubble's items and Luobai's coins, each NPC can only be claimed from 4 times per run; after that they give 1 gold.")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "0.7.0.4:\n\n" +
                        "No crashes at all. Very stable :)"
        ));

        changes.addButton( new ChangeButton(new ItemSprite(ItemSpriteSheet.GREATAXE,
                new ItemSprite.Glowing( 0x00FFFF )), "Enchantment Change: Ghostfire (uncommon -> rare, downgraded)",
                "This enchantment lets wisp fire burst from your weapon, setting enemies alight and poisoning enemies that are already burning.\n\nArcane ring bonus: increases the ghostfire chance"));

        changes.addButton( new ChangeButton(new ItemSprite(ItemSpriteSheet.GREATSWORD,
                new ItemSprite.Glowing( 0xcc7770 )), "Enchantment Change: Blast (rare -> uncommon, higher tier)",
                "This enchantment drives the wielder wild, letting explosive energy burst from the weapon: the target takes an area blast, or is briefly crippled.\n\nArcane ring bonus: increases damage"));


        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes"),
                ("1. Iterated on some assets\n" +
                        "2. Polished various details\n" +
                        "3. Improved some screens\n")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_17), ("Challenge Update: Lonely City Maze"),
                ("In the new floor 0, everyone disappears into the Lonely City except Xiaoye, Mio, Nyazaki and Bubble.")));

    }

    public static void add_V071_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.7.0.0-3", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(new Image(Assets.Environment.TILES_SEWERS, 48, 80, 16
                , 16), "Floor 0 Overhaul",
                "Floor 0 had a major overhaul with nearly 20 new NPCs. Enjoy."));

        changes.addButton(new ChangeButton(new KatydidSprites(), ("New Monster: Venom Spitter"),
                ("Some people found the old bug unpleasant, so it became this.")));

        changes.addButton(new ChangeButton(new NyzSprites(), ("Nyazaki Room Overhaul"),
                ("There is something even better waiting for you in one of the floor 0 rooms this new year.")));

        changes.addButton(new ChangeButton(NetIcons.get(NetIcons.CHAT), ("All-New Seed Finder"),
                ("A bigger and better seed finder, for a small fee in cobalt coins (why coins? Resource recycling, of course :)\n\n" +
                        "In short, the seed finder is in, discounted for the new year. Come and try it.")));

        Image issxsaxs =new FireCrystalSprites();
        issxsaxs.scale.set(PixelScene.align(0.8f));
        changes.addButton(new ChangeButton(issxsaxs, ("Shop Robbing Returns (Limited Time)"),
                ("Shop robbing is back for a limited time, from the first day of the new year to the Lantern Festival. The Fire Witch was also improved.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.Fish_A), "Steamed Fish",
                "Steamed fish can spawn from the first day of the new year to the Lantern Festival."));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.ICEGOLD), "Ice Blue Cobalt Coin v0.2",
                "Normal gain: (current floor/5)*5\n\n(+1 step per 5 challenges)\n\n" +
                        "Fighting Lena on the way back (shop robbing): 15 extra cobalt coins\n\n" +
                        "Lonely City Yog-Zot: 30 extra cobalt coins\n\nNote: some players farmed coins maliciously last version and there were other issues, so cobalt coins were reset for fairness.\n\nYou can collect 30 starter cobalt coins from Luobai's shop (once per device)."));

        changes.addButton( new ChangeButton(new BuffIcon(BuffIndicator.CORRUPT, true), ("Mutation"),
                ("Improved mutation particles so they are easier to tell apart.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "0.7.0.0:\n\n" +
                        "1. Fixed a serious bug that swapped test mode and normal mode" +
                        "2. Fixed some small issues",
                "0.7.0.1:\n\n" +
                        "1. Fixed some terrain errors on floor 0\n" +
                        "2. Fixed going up and down stairs in the jungle and on floor 26\n" +
                        "3. Fixed some other issues",
                "0.7.0.2-3:\n\n" +
                        "1. Fixed some bosses not dropping cobalt coins\n" +
                        "2. Fixed the Turbid Flame Witch being able to use return pylons\n" +
                        "3. Fixed the Dark Gold Gem Amulet losing its cooldown on reload\n" +
                        "4. Fixed a looping event when returning home from shop robbing, which is now a sublevel\n" +
                        "5. Fixed some issues with the Blood Moon fire bounty hunter\n" +
                        "6. Fixed Mimic King floor issues; old saves may not be fixed, very sorry\n" +
                        "7. Fixed some floor issues on shop robbing floors\n" +
                        "8. Fixed a crash when reviving with the cross on a boss floor"

        ));

    }

    public static void add_GYD_Changes( ArrayList<ChangeInfo> changeInfos ) {

        ChangeInfo changes = new ChangeInfo("", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo("Steamed Fish Status\n\n\n", true, "\n\n\n");
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image("fish.png"), "Steamed Fish",
                "Steamed fish can spawn from the first day of the new year to the Lantern Festival."));


    }

}
