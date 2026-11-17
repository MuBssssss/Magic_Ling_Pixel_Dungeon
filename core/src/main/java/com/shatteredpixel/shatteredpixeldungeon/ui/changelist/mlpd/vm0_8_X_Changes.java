package com.shatteredpixel.shatteredpixeldungeon.ui.changelist.mlpd;

import com.shatteredpixel.shatteredpixeldungeon.Assets;
import com.shatteredpixel.shatteredpixeldungeon.actors.hero.Talent;
import com.shatteredpixel.shatteredpixeldungeon.actors.mobs.ShopGuardDead;
import com.shatteredpixel.shatteredpixeldungeon.actors.mobs.gold.ArtilleristSprite;
import com.shatteredpixel.shatteredpixeldungeon.actors.mobs.gold.GnollBlindSprite;
import com.shatteredpixel.shatteredpixeldungeon.actors.mobs.gold.HermitCrabSprite;
import com.shatteredpixel.shatteredpixeldungeon.actors.mobs.lb.RivalSprite;
import com.shatteredpixel.shatteredpixeldungeon.messages.Messages;
import com.shatteredpixel.shatteredpixeldungeon.scenes.ChangesScene;
import com.shatteredpixel.shatteredpixeldungeon.scenes.PixelScene;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ApprenticeWitchSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ButcherSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.CharSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.CrivusStarFruitsSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.DeadDogCerberusSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.DimandKingSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.DreamSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.FireDragonSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.FrankensteinSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.GhostHalloweenSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.GhostSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSpriteSheet;
import com.shatteredpixel.shatteredpixeldungeon.sprites.LuoWhiteSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.PeachGodStateSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.PumkingGhostSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.QliphothSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.QuestionSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.RedNecromancerSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ShieldHuntsmanSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.SkyDeadSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.VampireSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.WhiteGirlSprites;
import com.shatteredpixel.shatteredpixeldungeon.ui.BuffIcon;
import com.shatteredpixel.shatteredpixeldungeon.ui.BuffIndicator;
import com.shatteredpixel.shatteredpixeldungeon.ui.Icons;
import com.shatteredpixel.shatteredpixeldungeon.ui.TalentIcon;
import com.shatteredpixel.shatteredpixeldungeon.ui.Window;
import com.shatteredpixel.shatteredpixeldungeon.ui.changelist.ChangeButton;
import com.shatteredpixel.shatteredpixeldungeon.ui.changelist.ChangeInfo;
import com.watabou.noosa.Image;

import java.util.ArrayList;

public class vm0_8_X_Changes {

    public static void addAllChanges(ArrayList<ChangeInfo> changeInfos) {
        add_V0880_Changes(changeInfos);
        add_V0874_Changes(changeInfos);
        add_V0872_Changes(changeInfos);
        add_V0871_Changes(changeInfos);
        add_V0870_Changes(changeInfos);
        add_V0860_Changes(changeInfos);
        add_V0852_Changes(changeInfos);
        add_V0850_Changes(changeInfos);
        add_V0848_Changes(changeInfos);
        add_V0845_Changes(changeInfos);
        add_V0840_Changes(changeInfos);
        add_V0831_Changes(changeInfos);
        add_V0830_Changes(changeInfos);
        add_V0822_Changes(changeInfos);
        add_V0820_Changes(changeInfos);
        add_V0810_Changes(changeInfos);
        add_V0808_Changes(changeInfos);
        add_V0805_Changes(changeInfos);
        add_V0801_Changes(changeInfos);
        add_V0800M1_Changes(changeInfos);
    }

    public static void add_V0880_Changes(ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.8.8.0-1", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.LIBGDX), ("LibGDX 1.13!"),
                ("Magic Ling now runs on LibGDX 1.13, which performs better on newer Android devices.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.AUDIO), ("Really Slow Motion-Neutral Assault"),
                ("This track currently serves as the battle BGM for Cerberus")));

        changes.addButton(new ChangeButton(Icons.get(Icons.HEART), ("Special terrain icon system"),
                ("More special terrain icons have been added: Crimson Space, Dragon Lair, and the Food Vending Machine")));

        changes.addButton(new ChangeButton(Icons.get(Icons.NEWS), ("New redeem code: ChinaBirthDay"),
                ("Claim your reward in game through the Luobai Shop or the game menu!\n\nValid until: before 2025-10-07 01:05.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SCROLL_GOLD), ("Gold Butterfly Mode V2.4"),
                (
                        "Gold Butterfly Mode - V2.4\n\n" +
                                "_-_ Fixed 3x3 transmutation in Gold Butterfly Mode not granting upgrades: above 18 upgrades the item would transmute without upgrading\n" +
                                "_-_ Fixed the Gold Butterfly Mode NPC Xiayu Wuming resetting your uses to 2 instead of adding 2\n" +
                                "_-_ Fixed stairs not working when floor 20 in Gold Butterfly Mode rolled the Dwarven General floor\n" +
                                "_-_ Gold Butterfly Mode now grants 3 trinkets automatically in the Xiayu Wuming intro dialogue\n" +
                                "_-_ Goblin Priests in Gold Butterfly Mode are significantly stronger")));

        changes.addButton(new ChangeButton(Icons.get(Icons.CATALOG), ("Balance Patch V3.4, Part 2"),
                ("Balance Patch V3.4, Part 2 has been implemented. Details below:\n\n" +
                        "[General]\n\n" +
                        "_-_ All-Meat Flatbread no longer guarantees strength below 12 Strength\n" +
                        "_-_ Venom-Infused Staff now deals escalating damage\n" +
                        "_-_ Emerald now has a 300-turn cooldown and only 40 turns of invisibility")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Global system: custom banners"),
                ("The Extra Settings menu now lets you pick the in-game banner theme. Added National Day, Mid-Autumn and Double Ninth themes")));

        changes.addButton(new ChangeButton(Icons.get(Icons.DISPLAY), ("Android"),
                ("Fixed crashes when some Android variants launch the installer")));

        changes.addButton(new ChangeButton(Icons.get(Icons.NEWS), ("Festival system overhaul"),
                ("Festival priority is now: game special events > Chinese traditional festivals > Western traditional festivals")));

        changes.addButton(new ChangeButton(Icons.get(Icons.CHALLENGE_ON), ("Potion Hysteria v0.3"),
                ("All-Meat Flatbread no longer always grants Strength below 12, but Strength Potions are now guaranteed to grant Strength below 11.")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "Magic Ling Pixel Dungeon - Fixes:\n\n" +
                        ("0.8.8.1 - Fixes:\n" +
                                "1.Fixed a serious out-of-bounds error when the Fire Dragon dies\n" +
                                "2.Fixed Gold Butterfly quest 2, Witness of the Butterfly, not working correctly\n" +
                                "3.Fixed Blazing Sun Staff always applying soul mark" +
                                "4.Fixed a series of issues reported through Firebase\n" +
                                "5.Fixed incorrect National Day date calculation\n" +
                                "6.Temporarily disabled the effect of Bzmdr's notes"
                        ),
                (       "0.8.8.0 - Fixes:\n" +
                        "I. Weapons and items\n" +
                        "Fixed: legendary weapon purchases on floor 0\n" +
                        "Fixed: Heart of the Creator freezing the game\n" +
                        "Fixed: Heart of the Creator causing a serious error in specific situations\n\n" +
                        "II. Mobs and NPC behaviour\n" +
                        "Fixed: Hollow Wraith misbehaving\n" +
                        "Fixed: Ghost and Pumpkin Ghost misbehaving\n" +
                        "Fixed: Fire Witch recharge turns\n" +
                        "Fixed: Remnant Scroll not affecting armor")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight(Window.R_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Some NPCs removed"),
                ("At the request of the NPC authors' commissioners, some NPCs have been removed.")));

        changes = new ChangeInfo("v0.8.8.0 passed closed beta testing and is now live", true, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);
    }

    public static void add_V0874_Changes(ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.8.7.3-4", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CLEARPRO), ("Legendary weapon: Scavenger"),
                ("Back and fixed - enjoy!")));

        changes.addButton(new ChangeButton(Icons.get(Icons.NEWS), ("New redeem code: PropsFixed"),
                ("Claim your reward in game through the Luobai Shop or the game menu!\n\nValid: forever")));

        changes.addButton(new ChangeButton(new Image("firebase/FireBase.png",0,0,16,16), ("Firebase game data collection"),
                ("Added player equipment data collection, which is skipped in developer mode. (Android only)")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Radial quickslot"),
                ("With V2 dialog, press T on PC, or long-press the swap area on any device to open it.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "Magic Ling Pixel Dungeon - Fixes:\n\n" +
                        (       "1.With Extinguished Lights, whispers no longer trigger above 60\n" +
                                "2.Fixed a serious crash caused by collectibles\n" +
                                "3.Fixed a crash when looking up items by seed with no text")));

        changes.addButton(new ChangeButton(Icons.get(Icons.CATALOG), ("Balance Patch 3.4, Part 1"),
                ("Balance Patch V3.4, Part 1 has been implemented. Details below:\n\n" +
                        "[Mobs and drops]\n\n" +
                        "1.Frost Rat potion drops are rarer and no longer drop healing XP. The first drop is guaranteed, each later drop is 2/3 as likely\n" +
                        "2.Mystery Doctor is now a rare mob, swapping spawn weights with the Blood Moon Aegis Hunter\n" +
                        "3.Frost Witches no longer drop Scrolls of Upgrade\n" +
                        "4.Imps past the Dwarven General no longer sell Scrolls of Upgrade\n" +
                        "5.Lil' Blue's blessing now grants a random 1-2 levels instead of 1-4"),
                ("[Thorns changes]\n\n" +
                        "Thorns can no longer be transmuted in general. Transmuting Thorns at level 10 returns a Scroll of Upgrade instead (once per run)."),
                "[Mob XP levels]\n\n" +
                        "1.Sewer Spitting Flowers and Salamanders are now level 10\n" +
                        "2.Shadow Thieves are now level 13\n" +
                        "3.Frost Rats are now level 15\n" +
                        "4.Gnoll Priests are now level 17 (spawn on floor 14 - new mob)\n" +
                        "5.Frost Golems are now level 22\n" +
                        "6.Jungle Woodlice, Trilobites and Anomalocaris are now level 23\n" +
                        "7.Blood Moon Aegis/Flame Bounty Hunters and Crimson Bandits are now level 25\n" +
                        "8.Dread Doctors are now level 25\n" +
                        "9.Blood Moon Aegis/Flame Bounty Hunters are now level 27 (their loot level is their XP level +2)\n" +
                        "10.Jungle Woodlouse accuracy is now 26\n" +
                        "11.Legendary weapon drop weight is now at least 3",
                ("[Items and shops]\n\n" +
                        "1.Vending machine purchase limit is now: purchases per region = region count - [Strength - (10 + 2 x region count)] (fixed, does not update live). Prices are now 325 + (region count - 1) x 50\n" +
                        "2.Everything in the Fire Witch shop costs 60% of a normal shop, restocking costs 350, and normal shop prices scale with your deepest progress\n" +
                        "3.Lightning Seeds drop more often (weight raised from 1 to 4)\n" +
                        "4.The Memory Shop now always appears on floor 14"),
                ("[Mechanics and effects]\n\n" +
                        "1.Water effects:\n" +
                        "_-_ Stepping in water in the Prison no longer grants invisibility; fixed Haste not applying, and Haste now wears off when you leave the water\n" +
                        "_-_ Ghostfire can now be cleared by shattered potions\n" +
                        "_-_ The Sludge buff threshold changed from 7 - depth/5 to 10 - depth/5\n" +
                        "_-_ Sludge no longer evaporates from Aqua Blast and works normally again\n" +
                        "2.The quickslot now pages between the first 3 and last 3 slots (reverted to Shattered logic)"),
                ("[Bosses and the Castle]\n\n" +
                        "1.The Divine Punishment reward now includes 2 enchantment runestones, and Dragon Scales come with 1 level already\n" +
                        "2.Sakaban's physical defense is 10 lower, and its laser needs 1 more turn to charge\n" +
                        "3.Castle mob stats:\n" +
                        "_-_ Apprentice Witch: HP 125, evasion 25-37, XP 18, max level 35, damage 25-45, accuracy 35-45\n" +
                        "_-_ Chainsaw Maniac: HP 100, evasion 30-40, XP 16, max level 35, damage 32-42, accuracy 40-50\n" +
                        "_-_ Gingerbread Man: HP 90, evasion 25-35, XP 20, max level 36, damage 25-40, accuracy 20-35\n" +
                        "_-_ Broken Dream Doll: HP 100, evasion 20-40, XP 15, max level 34, damage 25-35, accuracy 35\n" +
                        "_-_ Pumpkin Bomber: HP 120, evasion 25-30, XP 19, max level 35, damage 25-30, accuracy 50\n" +
                        "_-_ Vampire: HP 110, evasion 25-40, speed 2.0, XP 15, max level 35, damage 30-35, accuracy 40")));
    }

    public static void add_V0872_Changes(ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.8.7.2", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("New global system: custom banners"),
                ("The Extra Settings menu now lets you pick the in-game banner theme. Added Ghost Festival theme")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "Magic Ling Pixel Dungeon - Fixes:\n\n" +
                        (       "1.Fixed Heart of the Creator crashing the game in some edge cases\n" +
                                "2.Fixed the Dog floor submitting to the leaderboard twice\n" +
                                "3.Fixed Tianhen Goo's toxic gas causing an out-of-bounds error\n" +
                                "4.Fixed Chaos Censer crashing the game in some edge cases\n" +
                                "5.Fixed duplicate collectibles")));


        changes = new ChangeInfo("v0.8.7.2 passed closed beta testing and is now live", true, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);
    }

    public static void add_V0871_Changes(ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.8.7.1", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("New global system: custom banners"),
                ("The Extra Settings menu now lets you pick the in-game banner theme. Added Qixi Festival theme")));

        changes.addButton(new ChangeButton(Icons.get(Icons.INFO), ("Damage system rework"),
                ("The damage system has been reworked into four damage types: physical, magical, elemental and true")));

        changes.addButton(new ChangeButton(Icons.get(Icons.NEWS), ("EULA added"),
                ("The Magic Ling EULA is now in place; open the game to read the details.")));

        changes.addButton(new ChangeButton(new Image("firebase/FireBase.png",0,0,16,16), ("Firebase game data collection"),
                ("Some basic game data is collected for the developers to analyse later. Android only.\n\nTo mark the occasion, the Merchant Lord on floor 0 is giving out a costume voucher.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.HIGHTWAND_1), "Wand buffs",
                ("Blast: damage growth raised from 1-3 to 1.5-4\n\nCorruption: corruption duration raised from 6 + level*3 to 6 + level*4, so elite mobs can be corrupted instead of doomed\n\nDisintegration: damage growth raised from 1-4 to 1-5, and the bonus for piercing solid blocks now needs 2 blocks pierced instead of 3. Ignores damage reduction\n\nFlamewave: damage growth raised from 1*charge-2*charge to 2*charge-3*charge\n\nGhostfire: high charge now adds 1 more turn of cripple and paralysis\n\nFrost: damage growth raised from 1-5 to 1-6, and it now loses at most 30% of its damage\n\nLightning: damage growth raised from 1-5 to 1-6\n"),
                ("Greater Lightning: self-damage reduced to 25%\n\nEarth: damage growth raised from 1-2 to 1-3, and guardians have 16 + 12*level HP instead of 16 + 8*level, with damage reduction equal to staff level/2\n\nMagic Missile: after firing the staff, your next non-Magic Missile wand use costs no turn. Lasts 5 turns\n\nPrismatic Light: damage growth raised from 1-3 to 1.5-4, bonus damage against undead and demons raised to 50%, and +5 and above always blinds\n\nSoul Infusion: shield raised from 5 + level to 5 + 1.5*level\n\nSentinel: damage growth raised from 1-4 to 2-5")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "Magic Ling Pixel Dungeon - Fixes:\n\n" +
                        (       "_-_ Fixed the Bottled Wraith crash and improved this collectible\n" +
                                "_-_ Fixed armored backpack slots being caught in explosions\n" +
                                "_-_ Fixed ankh issues on the Blacksmith floor and improved the Tianhen Goo map\n" +
                                "_-_ Fixed collectible effects misbehaving after revival")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight(Window.R_COLOR);
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(new BuffIcon(BuffIndicator.CORRUPT, true), "Anti-Magic Elite",
                "Anti-Magic Elites take 25% less damage, and an extra 50% less from spells."));


        changes = new ChangeInfo("v0.8.7.1 passed closed beta testing and is now live", true, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);
    }

    public static void add_V0870_Changes(ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.8.7.0", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image(Assets.Interfaces.HAICONS, 32, 0, 16, 16), "Hard Mode",
                "Hard Mode is back in a big way! Come give it a try!\n" +
                        "[From this version on, collectibles can be dropped after floor 10 outside Hard Mode]"));

        changes.addButton(new ChangeButton(Icons.get(Icons.NEWS), ("New redeem code: little surprise of bzmdr"),
                ("Claim your reward in game through the Luobai Shop or the game menu!\n\nValid: forever")));

        changes.addButton(new ChangeButton(Icons.get(Icons.NEWS), ("New redeem code: RedFish Bomb Gifts"),
                ("Claim your reward in game through the Luobai Shop or the game menu!\n\nValid: forever")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SCROLL_GOLEM), ("Colossus Scroll"),
                ("Can appear in shops in Boss Rush and Gold Butterfly Mode.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Other changes"),
                ("1.The Dwarven General is stronger and now counters cheesing with the small Sakaban\n" +
                        "2.The Castle event runs longer and stage one stays open")));


        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.LOCK_SWORD_DIAMOND), ("Keyblade of Return"),
                ("Can now only be bought in shops and has been removed from the tier-5 weapon pool.")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "Magic Ling Pixel Dungeon - Fixes:\n\n" +
                        (       "_-_ Fixed the Alchemy Prism being usable from the quickslot in Boss Rush\n" +
                                "_-_ Fixed a crash caused by dart effects\n" +
                                "_-_ Fixed being unable to enter special modes through the normal stairs after triggering the floor 0 dialogue and then choosing a mode item\n" +
                                "_-_ Fixed the Forest Crossbow damage bonus\n" +
                                "_-_ Fixed a crash when removing the e-cigarette while buffed\n" +
                                "_-_ Fixed incorrect odds on some collectibles")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SCROLL_GOLD), ("Gold Butterfly Mode V2.3"),
                (
                        "Gold Butterfly Mode - V2.3\n\n" +
                                "Gold Butterfly boss pools:\n\n" +
                                "Floor 5: Fruit, Strange Fruit, Slime Wang, Tianhen" +
                                "\nFloor 10: Shadow, Mimic King, Verdant Elf (complete form), Tengu, DM-300" +
                                "\nFloor 15: Frost Witch, DM-720, Dwarven Warlord, Sakaban Fish" +
                                "\nFloor 20: Dwarven Warlord, Dwarven General, Dwarf King, Murkflame Witch")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CLEARPRO), ("Legendary weapon: Scavenger"),
                ("Temporarily removed from spawning; it will return once fixed.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.FORESTCROSSBOW), ("New legendary weapon: Forest Bow"),
                ("Temporarily removed from spawning; it will return once fixed.")));

        changes = new ChangeInfo("v0.8.7.0 passed closed beta testing and is now live", true, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);
    }

    public static void add_V0860_Changes(ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.8.6.0", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CLEARPRO), ("New legendary weapon: Scavenger"),
                ("New stock in the shop - come take a look.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.FORESTCROSSBOW), ("New legendary weapon: Forest Bow"),
                ("New stock in the shop - come take a look.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.NEWS), ("New redeem code: SHPD-BIRTHDAY"),
                ("Claim your reward in game through the Luobai Shop or the game menu!\n\nValid until: before 2025-08-26 00:00")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SHPD_CHEST), ("Limited-time emerald chests"),
                ("From 2025.8.6 to 2025.8.25, emerald chests spawn with generous item rewards.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SCROLL_GOLEM), ("Tower Defense collab: Colossus Scroll"),
                ("A possible drop from emerald chests - have a taste.\n\nLicensed by: Fixed")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.BONESOUP), ("Glutton collab: Bone Broth"),
                ("A possible drop from emerald chests - have a taste.\n\nLicensed by: Yanmu")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.RATTAIL), ("Glutton collab: Rat Tail Fat"),
                ("A possible drop from emerald chests - have a taste.\n\nLicensed by: Yanmu")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.ZAKOSOUP), ("Glutton collab: Minnow Soup"),
                ("A possible drop from emerald chests - have a taste.\n\nLicensed by: Yanmu")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.KINGHTSTABBINGSWORD), ("Hard Mode - Alpha test"),
                ("Collectibles can drop from emerald chests. Four types are open so far - have a taste.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "Magic Ling Pixel Dungeon - Fixes:\n\n" +
                        (       "_-_ Fixed some issues with Aqua Blast potions\n" +
                                "_-_ Fixed some crashes\n" +
                                "_-_ Fixed the Ancient God recharge turn\n" +
                                "_-_ Fixed the invulnerability radius of the Fist of Ice and Fist of Ghostfire\n" +
                                "_-_ Fixed special modes being able to enter the Castle")));


        changes.addButton(new ChangeButton(Icons.get(Icons.DISPLAY), ("UI updates"),
                ("_-_ The Luobai Shop now has pages\n" +
                        "_-_ Some quickslot tiles are now more three-dimensional")));

        changes = new ChangeInfo("v0.8.6.0 passed closed beta testing and is now live", true, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);
    }

    public static void add_V0852_Changes(ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.8.5.1-2", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);


        Image xs =new DeadDogCerberusSprite();
        xs.scale.set(PixelScene.align(0.6f));
        changes.addButton(new ChangeButton(xs, ("Boss buff: Cerberus"),
                ("Absolute Domain: any non-hero unit sharing your tile is instantly slain. A hero is instead flung several tiles away, taking impact damage based on distance.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.NEWS), ("New redeem code: NFYIG"),
                ("Claim your reward in game through the Luobai Shop or the game menu. Happy Castle investigating!\n\nValid until: before 2025-08-08 00:00")));

        changes.addButton(new ChangeButton(Icons.get(Icons.NEWS), ("New redeem code: ARMYDAY"),
                ("Claim your reward in game through the Luobai Shop or the game menu. Happy Castle investigating!\n\nValid until: before 2025-08-08 00:00")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "Magic Ling Pixel Dungeon - Fixes:\n\n" +
                        (       "_-_ Fixed Castle unlock room generation\n" +
                                "_-_ Improved the Three Wells floor rooms and structure\n" +
                                "_-_ Fixed some special NPCs not spawning on the 15-challenge badge\n" +
                                "_-_ Fixed the Gingerbread Man being immune to knockback\n" +
                                "_-_ Fixed Holy Water Flask on a human-form Vampire putting the game into a loop\n" +
                                "_-_ The Keyblade no longer transmutes and was removed from the list\n" +
                                "_-_ The player no longer enters game over while the Heart of the Creator is in the backpack\n" +
                                "_-_ Jumping down after floor 28 now returns you to the entrance by default\n" +
                                "_-_ Fixed the Moss Cluster and Trap Component trinkets having no effect")));


        Image issxsaxs =new DimandKingSprite();
        issxsaxs.scale.set(PixelScene.align(0.8f));
        changes.addButton(new ChangeButton(issxsaxs, ("Mimic King improvements"),
                ("Before attacking, the Mimic King now stores the player's ankh with the crystal mimic chest and returns it when the fight ends.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight(Window.R_COLOR);
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(new Image(Assets.Environment.TILES_SEWERS, 48, 80, 16
                , 16), "Room changes",
                "In Unpredictable, only one of the Three Wells rooms can be chosen, and you get a confirmation warning.\n\nThe Unpredictable house spawn weight pool is tripled, so regular floors are much more likely (trinkets apply there)"));

        changes = new ChangeInfo("v0.8.5.1-2 passed closed beta testing and are now live", true, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);
    }

    public static void add_V0850_Changes(ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.8.5.0", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.NEWS), ("New permanent redeem code: YLGB"),
                ("Claim your reward in game through the Luobai Shop or the game menu. Happy Castle investigating!")));

        changes.addButton(new ChangeButton(Icons.get(Icons.NEWS), ("New permanent redeem code: MHJH"),
                ("Claim your reward in game through the Luobai Shop or the game menu. Happy Castle investigating!")));

        changes.addButton(new ChangeButton(new ApprenticeWitchSprite(), ("New mob: Apprentice Witch"),
                ("A poor student of the magic academy, still training as a witch.")));

        changes.addButton(new ChangeButton(new FrankensteinSprite(), ("New mob: Broken Dream Doll"),
                ("It is looking for its creator, and to tear apart every living breath it finds.")));

        changes.addButton(new ChangeButton(new GhostHalloweenSprite(), ("New mob: Ghost"),
                ("An unfathomable spectre...")));

        changes.addButton(new ChangeButton(new PumkingGhostSprite(), ("New mob: Pumpkin Ghost"),
                ("An unfathomable spectre... carrying a pumpkin head.")));

        changes.addButton(new ChangeButton(new VampireSprite(), ("New mob: Vampire"),
                ("A monster disguised as a bat in the Castle - very dangerous!")));

        Image xs =new DeadDogCerberusSprite();
        xs.scale.set(PixelScene.align(0.6f));
        changes.addButton(new ChangeButton(xs, ("New boss: Cerberus"),
                ("The floor 31 boss of Castle stage one awaits your challenge")));

        changes.addButton(new ChangeButton(Icons.get(Icons.LANGS), ("Language update: English"),
                ("The English translation is now in place. Special thanks to Biostarbluexray and 1000Mistakes for their translation support")));

        changes.addButton(new ChangeButton(Icons.get(Icons.BADGES),("Added two encrypted badges and one gilded layer"),
                ("More encrypted badges have been added - go find them")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Other changes"),
                ("1.Some text improvements\n" +
                        "2.Some asset detail updates")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "Magic Ling Pixel Dungeon - Fixes:\n\n" +
                        (       "- Boss Rush Fire Dragon map design flaw, reported by sks123456\n- Mimic King juvenile mimic issue in phase two, reported by sks123456\n- Missing text in the Castle scam room, reported by sks123456\n- Heart of the Creator healing boost not working, reported by sks123456\n- Strange Fruit fall death issue, reported by Archetto\n- White Wave Rapier skill button conflict, reported by sks123456\n- Robbery text typos, reported by sks123456\n- Ancient God summoned fist skipping the turn, reported by sks123456\n- Unpredictable badge misbehaving, reported by sks123456\n- Liquid Vigour talent not working, reported by sks123456\n- Fire Dragon map design flaw, reported by sks123456")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight(Window.R_COLOR);
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(new Image(Assets.Environment.TILES_SEWERS, 48, 80, 16
                , 16), "Room changes",
                "In Unpredictable only one of the Three Wells rooms can be picked, and using any other well on the map disables the rest entirely."));

        changes.addButton(new ChangeButton(Icons.get(Icons.BADGES),("Challenge badges"),
                ("Challenge badges for 13 or more challenges can no longer be earned in other special modes")));

        changes = new ChangeInfo("v0.8.5.0 passed closed beta testing and is now live", true, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);
    }

    public static void add_V0848_Changes(ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.8.4.8-9", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.NEWS), ("New redeem code: \"Duanwu Ankang\" (enter it in Chinese in the code box)"),
                ("Claim your reward in game through the Luobai Shop or the game menu. Happy Dragon Boat Festival!")));

        changes.addButton(new ChangeButton(Icons.get(Icons.NEWS), ("New redeem code: Lucky Koi"),
                ("Claim your reward in game through the Luobai Shop or the game menu. Happy Dragon Boat Festival!")));

        changes.addButton(new ChangeButton(new WhiteGirlSprites(), ("Floor 0 NPC improvements: Mio"),
                ("After clearing 13 challenges, Mio spawns on floor 2 of the inn 20% more often, and Mio may instead be found outside the inn (the two are mutually exclusive). Her wands no longer carry curses")));

        Image xs =new SkyDeadSprite();
        xs.scale.set(PixelScene.align(0.8f));
        changes.addButton(new ChangeButton(xs, ("New mini-boss: Divine Punishment"),
                ("A brand new Unpredictable boss, bringing a whole new challenge!\n\nRegion: floor 8")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("New global system: custom banners"),
                ("The Extra Settings menu now lets you pick the in-game banner theme. Added Dragon Boat Festival theme")));

        Image xsx =new Image(Assets.Interfaces.TOOLBAR, 0, 26, 24, 26);
        xsx.scale.set(PixelScene.align(0.8f));
        changes.addButton( new ChangeButton(xsx, "New global system: Magic Ling events page",
                "The events page shows every event, lets you join them, and hands out rewards.\n\n" +
                        "Magic Ling Pixel Dungeon, a \"next-gen online game\" built on single player (not really)"));

        changes.addButton(new ChangeButton(Icons.get(Icons.BADGES),("Added one encrypted badge"),
                ("More encrypted badges have been added - go find them")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Other changes"),
                ("1.Some text improvements\n" +
                        "2.Some asset detail updates")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "Bug fixes - developer summary\n\n" +
                        (       "_-_ Fixed several Shadow boss issues; it no longer reloads the save again\n" +
                                "_-_ Fixed several Fire Dragon boss issues\n" +
                                "_-_ Fixed several Dragon Boat Festival event issues\n" +
                                "_-_ Fixed healing effects not applying to allies\n" +
                                "_-_ Fixed the Heart of the Creator not doubling healing\n" +
                                "_-_ Fixed some potential minor issues with the Ruike 5th Gen\n" +
                                "_-_ Fixed the Mimic King freezing in phase 2 and stopped the Diamond Chest King's juvenile form failing to register in the bestiary\n" +
                                "_-_ Fixed missing text in the big scam room, which now only generates in the Castle")
        ));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "Bug fixes - Order system summary\n\n" +
                        ( "_-_ Fixed the Mimic King failing to switch to phase 3\n" +
                                "_-_ Fixed crashes caused by the mob spawner in old saves\n" +
                                "_-_ Fixed map errors in Gold Butterfly Mode (several entries merged)\n" +
                                "_-_ Fixed the Mini Sun sprite\n" +
                                "_-_ Fixed the Glimmer Guide freezing\n" +
                                "_-_ Fixed leftover immortality from Pain Scratch\n" +
                                "_-_ Fixed the Boss Rush Frost Witch freezing\n" +
                                "_-_ Fixed the Castle Broken Dream Doll misbehaving\n" +
                                "_-_ Fixed the Sorrowful Ghost spawning at the wrong level\n" +
                                "_-_ Fixed the Sakaban boss trigger sequence\n" +
                                "_-_ Fixed the Mechanical Pillar not damaging allies\n" +
                                "_-_ Fixed the Fire Dragon map design flaw")
        ));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight(Window.R_COLOR);
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(new BuffIcon(BuffIndicator.SACRIFICE, true), ("Frostfire Chill"),
                ("Minimum damage stays at 4, but maximum damage cannot exceed 16.")));

        changes.addButton( new ChangeButton(new Image(Assets.Environment.TILES_SEWERS, 48, 80, 16
                , 16), "Room changes",
                "The Unpredictable mini-boss reward room now offers a choice of two out of up to six."));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(new ShieldHuntsmanSprite(), "Blood Moon Aegis Hunter",
                "Fixed its accuracy, which was stuck at Sewer level, and improved its knockback effect on weapon/armor/misc slots.\n\nAdded Focus, HP is now a fixed 72 and base speed is 0.8.\n\nHas a 1 in 6 chance to drop Arcane Shield elixirs, up to 2 per kill."));

        changes = new ChangeInfo("v0.8.4.8 passed closed beta testing and is now live", true, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);


        changes = new ChangeInfo("2025-5-29", true, null);
        changes.hardlight(Window.CPINK);
        changeInfos.add(changes);
    }

    public static void add_V0845_Changes(ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.8.4.5-6", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.NEWS), ("New redeem code: WolvesGoodFish"),
                ("Reward: 400 cobalt coins and an All-Meat Flatbread")));

        changes.addButton(new ChangeButton(Icons.get(Icons.NEWS), ("New redeem code: GoldFish-All-KPL"),
                ("Reward: 390 cobalt coins and a mystery prize")));

        changes.addButton(new ChangeButton(Icons.get(Icons.NEWS), ("New redeem code: GoodGoldFish"),
                ("Reward: 400 cobalt coins and a Baa Baa Amulet")));

        changes.addButton(new ChangeButton(Icons.get(Icons.NEWS), ("New redeem code: ThanksKPLReadPVP"),
                ("Reward: 300 cobalt coins and 4 different types of zongzi")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_8), ("Challenge improvements: Sludge"),
                ("1.Fixed effects not resolving immediately when leaving a water tile" +
                        "\n2.Improved the handling logic with higher priority")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("New global system: custom banners"),
                ("The Extra Settings menu now lets you pick the in-game banner theme. Added Labour Day theme")));

        changes.addButton(new ChangeButton(Icons.get(Icons.ALERT), ("Limited-time rerun"),
                ("Limited-time rerun, 5.3-5.21\n\n" +
                        "Mid-Autumn Festival part one & Dragon Boat Festival Murloc rerun")));

        changes.addButton( new ChangeButton(new Image(Assets.Environment.TILES_SEWERS, 48, 80, 16
                , 16), "Room changes",
                "New rooms: Cross Crypt and Bone Maze added"));

        changes.addButton(new ChangeButton(Icons.get(Icons.AUDIO), ("A brand new music system"),
                ("The four-year-old Frankenstein music system was rebuilt, opening up many more possibilities")));


        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Other changes"),
                ("1.Some text improvements\n" +
                        "2.Some asset detail updates")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "Bug fixes\n\n" +
                        (       "_-_ Fixed some serious Sludge issues\n" +
                                "_-_ Improved details of the Mid-Autumn Festival quest\n" +
                                "_-_ Improved some things about the White Rose")

        ));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "Bug fixes\n\n" +
                        ( "_-_ Fixed a serious bug where the Mimic King would not die at 0 HP, and improved Sludge detection\n" +
                                "_-_ Fixed some serious Sludge issues\n" +
                                "_-_ Fixed the Blazing Sun Staff in elemental storms; it now applies ghostfire and burning to visible mobs\n" +
                                "_-_ After floor 26, trap rooms are now fully replaced by Abyss floating rooms\n" +
                                "_-_ Fixed crashes caused by the old sub-floor drop rules; Abyss items dropped there now appear on the main floor\n" +
                                "_-_ Fixed mimic drop rules and synced them with the new sub-floor Abyss item rules\n" +
                                "_-_ Fixed the Treasure Maze freezing when there were too few mimic chests")

        ));

        changes = new ChangeInfo("v0.8.4.5 passed closed beta testing and is now live", true, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);



        changes = new ChangeInfo("2025-5-03", true, null);
        changes.hardlight(Window.CPINK);
        changeInfos.add(changes);
    }

    public static void add_V0840_Changes(ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.8.4.0", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);


        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_14), ("Limited-time challenge: Bloodline Pact"),
                ("A limited-time challenge that will become a special mode in a later version")));

        changes.addButton(new ChangeButton(Icons.get(Icons.NEWS), ("New redeem code: Tomb-Sweeping-FestivaDay"),
                ("Claim your reward in game through the Luobai Shop or the game menu. Happy Tomb-Sweeping Festival!")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_8), ("Challenge rework: Sludge"),
                ("The dungeon's water is polluted too, so be careful\n\nRunoff from above has fouled the water, so tread carefully\n\n_-_ Water you step in becomes Sludge only you are affected by; entering Sludge applies Corrosive Muck and keeps most of your debuffs at 5 turns or more.\n_-_ Water-walking blessings no longer work, though Water Spirit potions are unchanged.\n_-_ After being found, full-water terrain has an 80% chance to become normal terrain\n_-_ Every region also spawns a piranha room\n_-_ Shops additionally stock Quicklime Ideal Elixir")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("New global system: custom banners"),
                ("The Extra Settings menu now lets you pick the in-game banner theme")));


        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "Bug fixes:\n\n" +
                        ("_-_ Fixed the Mimic King skipping phases when hit by multi-hit damage\n" +
                                "_-_ Added more mimic chests to the Treasure Maze so the 5-kill count can be reached and the game no longer freezes\n" +
                                "_-_ Quicklime Ideal Elixir has a larger radius and can be bought in shops during the Sludge challenge\n" +
                                "_-_ Aqua Blast potions and Storm Fog now evaporate sludge tiles into normal terrain\n" +
                                "_-_ Fixed the summoned guardian description\n" +
                                "_-_ Fixed a serious Fire Dragon terrain bug that carried across saves\n" +
                                "_-_ Fixed not starting in the entry room after taking the stairs to the Castle on floor 26\n" +
                                "_-_ Fixed the Immovable description not updating after its nerf\n" +
                                "_-_ Fixed the Tome of Return from the robbery floor not bringing you back to your floor (it teleported you to floor X-?)\n" +
                                "_-_ Improved shop robberies: your ankh is left where you were before heading to the Canyon, Lena's Flame Crystals no longer auto-target on their own, and some attack effects were improved\n" +
                                "_-_ The developer mode misc spawner now includes Aqua Blast, Feather Fall, Chaos potions and Chaos Crystals\n" +
                                "_-_ Fixed the potion and scroll identification badges failing to unlock after carrying saves over to a later version\n" +
                                "_-_ Fixed some missing text and improved some wording\n" +
                                "_-_ Fixed some rare sub-floor crashes")
        ));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight(Window.R_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.DIEDCROSSBOW), ("Heavy Ballista"),
                ("Fixed ballista shots incorrectly using the weapon's own damage.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.STDR), ("Quicklime Ideal Elixir"),
                ("Its evaporation radius is now 8 directions of 2x2")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.ELIXIR_AQUA), ("Aqua Blast potion"),
                ("If the target tile is sludge, it is evaporated into normal terrain.\n\nNearby sludge in a 3x3 area is evaporated as well.")));

        changes = new ChangeInfo("v0.8.4.0 passed closed beta testing and is now live", true, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);



        changes = new ChangeInfo("2025-4-04", true, null);
        changes.hardlight(Window.CPINK);
        changeInfos.add(changes);
    }

    public static void add_V0831_Changes(ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.8.3.1", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);


        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.RECLAIM_TRAP), ("Developer tool: trap placer"),
                ("Added a trap placer for easily placing traps on the map. Explore in game for more features.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CANDLE), ("Developer tool: mob placer"),
                ("Fully rebuilt; it can place 80% of all mobs on the map. Explore in game for more features.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.CHANGES), ("Developer mode: live score evaluation"),
                ("The scoreboard was improved and can be evaluated live in developer mode, and past leaderboard runs now show the scoring breakdown")));


        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "Version 0.8.3.1:\n\n" +
                        "1.Fixed cobalt coin drops with 0 challenges\n" +
                        "2.Fixed every type of merchant running off after a shop robbery\n" +
                        "3.Some text fixes\n" +
                        "4.Fixed some starting backpack generation issues"

        ));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.ICEGOLD), ("Cobalt coin drop changes"),
                (
                        "_-_ Regular drop formula change:\n" +
                                "_-_ (hero level + dungeon depth) / 5 x [challenges, capped at 5]\n" +
                                "_-_ If challenges are below 5, the multiplier defaults to a minimum of 5\n\n" +
                                "_-_ Limited-time double drops:\n" +
                                "_-_ Global double cobalt coin drops, 2025.3.7-2025.3.31")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.DEV_7), ("Developer tool: elevator"),
                ("The elevator now supports travel to any floor, including floor 0.")));

        Image issxsaxs =new ShopGuardDead.ShopGuardianRedSprite();
        issxsaxs.scale.set(PixelScene.align(1f));
        changes.addButton(new ChangeButton(issxsaxs, ("Shop robbery changes"),
                "After robbing a shop you can now only clear out the shop of one single floor.\n\n" +
                        "Shops on other floors no longer spawn, and _even shops that already spawned are emptied out_.\n\nOnly regular merchants are removed"));

        changes = new ChangeInfo("v0.8.3.1 passed closed beta testing and is now live", true, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);

        changes = new ChangeInfo("2025-3-14", true, null);
        changes.hardlight(Window.CPINK);
        changeInfos.add(changes);
    }


    public static void add_V0830_Changes(ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.8.3.0", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "thanks"), false, null);
        changes.hardlight(Window.Pink_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.RUIKE), ("Ruike 5th Gen"),
                ("A brand new artifact, the Ruike 5th Gen!\n\n" +
                        "First place in the Jinghong Cup artifact category. Want to take a drag too?\n\n" +
                        "Item: Passive: animal friends in the dungeon become neutral\n" +
                        "\n" +
                        "Active: while active the artifact costs 100% / (10 + artifact level) charge per turn, grants you 1 turn of Vigorous each turn, and releases 100 units of thick white smoke on your tile each turn. The smoke blocks enemy sight, and gas potions can be added so the smoke carries their effect (the smoke only affects enemies, each potion lasts 100% charge, and they stack)\n" +
                        "\n" +
                        "Upgrades: each Thunder potion added gives 2 levels, each Scroll of Recharging gives 1 level, up to 10\n" +
                        "\n"),
                ("Charging: automatic, recovering 0.1% + (0.01% x artifact level) per turn, up to 100%\n" +
                        "\n" +
                        "Charging effect: recovers 2% charge per turn\n" +
                        "\n" +
                        "Cursed effect: each turn has a 10% chance to blind you for 2 turns and release 30 turns of toxic gas on your tile; animal friends no longer sleep and track you down, and every scroll name becomes unknown with identical icons and backgrounds\n" +
                        "\n" +
                        "Other details: activating costs 1 turn, deactivating costs none" )));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SMTITEM), ("Glimmer Guide"),
                ("A brand new alchemical item, the Glimmer Guide!\n\n" +
                        "Second place in the Jinghong Cup alchemy category. It points the way forward.\n\n" +
                        "1 HP, cannot be attacked, does not wake sleeping mobs, speed 1.5, sight 5\n" +
                        "The Glimmer Guide shares your sight and, once created, finds and follows the shortest path to the exit,\n" +
                        "dragging blocking mobs behind it and putting them to sleep. On reaching the exit it dies and reveals the exit room." )));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.HIGHTWAND_7), ("Blazing Sun Staff"),
                ("A brand new wand, the Blazing Sun Staff!\n\n" +
                        "First place in the Jinghong Cup wand category. Sunlight to light the dark, wisdom to guide the light.\n\n" +
                        "The first person to bring the sun underground never imagined that the undead and demons are not all that afraid of a false sun.\n" +
                        "\n" +
                        "Releases a blazing orb at the target tile, and you share its circular 7x7 field of view\n" +
                        "Each turn the orb deals 2-8 (+2/+4) damage to every enemy in a 3x3 area, losing 25% damage per extra tile of spread, up to a 7x7 circle\n" +
                        "The orb has no collision, and enemies inside it take 25% more damage from all other orbs\n" +
                        "An orb lasts 3 + wand level*0.3 turns (rounded down). If you have not dismissed it and its duration is about to run out while the wand still has charge, 1 charge is spent automatically to extend it by 3 turns\n" +
                        "\n" +
                        "The Battlemage effect resets the duration of every orb" )));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.GRILLED_FISH), ("Grilled Herring"),
                ("A brand new weapon, the Grilled Herring!\n\n" +
                        "First place in the Jinghong Cup weapon category. Grilled herring to some, a weapon to others.\n\n" +
                        "Tier 4, 16 Strength, 4-25 damage, growth 1-5\n" +
                        "Crisp, sizzling and steaming hot. You are quite sure this is no ordinary grilled herring, but it smells wonderful.\n" +
                        "You can eat the herring 3 times, each restoring 50 satiety. When the charges run out it becomes fish bones.\n" +
                        "You can only eat an identified, uncursed herring. Each upgrade adds 1 more use.\n" +
                        "Secondary weapon: Fish Bones\n" +
                        "Tier 3, 14 Strength, 3-15 damage, growth 1-3\n" +
                        "Attacks cause bleeding equal to 50% of the damage dealt.\n" +
                        "In the end you could not withstand hunger. At least it really was tasty." )));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        Image xs =new PeachGodStateSprite();
        xs.scale.set(PixelScene.align(0.8f));
        changes.addButton(new ChangeButton(xs, ("Peach Blossom Wishes"),
                ("[Limited-time event - Peach Blossom Wishes, 10-pull guaranteed] - Event period: 3.1-3.31\n\n" +
                        "A Wishing Room generates randomly in the depths with 55% chance \n" +
                        "(triggers below 13 challenges, not including 13)\n" +
                        "Wishing rules:\n" +
                        "Each throw costs 50 cobalt coins\n" +
                        "Pity system:\n\n" +
                        "[Soft pity]\n" +
                        "Every 10 wishes guarantees 1 rare reward \n" +
                        "\n[Hard pity] -- [carries across saves]" +
                        "If 40 pulls pass without legendary or better,\nthe next pull is legendary or better\n"),
                ("Reward odds [per single pull]:\n\n"+
                        "Common [40%], Uncommon [35%] \n\n" +
                        "Rare [20%], Legendary [4%], Mythic [1%]\n\n" +
                        "10-pull odds:\n" +
                        "Soft pity guaranteed odds:\n" +
                        "Rare 70%, Legendary 28%, Mythic 2%\n" +
                        "so 9+1 [guaranteed rare or better]\n" +
                        "For a 10-pull after 40 pulls without a legendary:\n" +
                        "Hard pity 10-pull guaranteed odds:\n\n" +
                        "Rare 70%, Legendary 28%, Mythic 2%\n" +
                        "Legendary 95%, Mythic 5%")));

        changes.addButton(new ChangeButton(Icons.get(Icons.BADGES),("Added two encrypted badges"),
                ("More encrypted badges have been added - go find them")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.ICEGOLD), ("Cobalt coin drop changes"),
                (
                        "_-_ Regular drop formula change:\n" +
                                "_-_ ((player level + current floor) / 5) x (1 + challenges / 3)\n\n" +
                                "_-_ Limited-time double drops:\n" +
                                "_-_ Global double cobalt coin drops, 2025.3.7-2025.3.31")));

        changes.addButton(new ChangeButton(new GhostSprite(),("Sorrowful Ghost changes"),
                //50%:+0, 20%:+1, 15%:+2, 12%:+3 3% +4
                ("Sorrowful Ghost weapon quality odds:\n\n"+
                        "_-_ +0 weapon: 50%, was 50%\n" +
                        "_-_ +1 weapon: 20%, was 30%\n" +
                        "_-_ +2 weapon: 15%, was 12%\n" +
                        "_-_ +3 weapon: 12%, was 06%\n" +
                        "_-_ +4 weapon: 03%, was 02%")));

        changes.addButton(new ChangeButton(Icons.get(Icons.DISPLAY), ("UI changes"),
                (       "_-_ Improved the challenges window; the number of challenges is now shown as a progress bar\n" +
                        "_-_ Improved the seed copy window, which now lists the exact challenges\n" +
                        "_-_ Cobalt coin amounts above 9999 are shown in scientific notation")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "0.8.3.0 - Bug fix list 1:\n\n" +
                        ("_-_ Fixed Charon sometimes selling containers you already own\n" +
                                "_-_ Fixed the Mage's wand recycling talent\n" +
                                "_-_ Fixed Common Fruit and Strange Fruit becoming invulnerable due to a bad phase check\n" +
                                "_-_ Fixed Mage talents not working\n" +
                                "_-_ Fixed Duelist talents not working\n" +
                                "_-_ Fixed the changes window\n" +
                                "_-_ Fixed the Mimic King boss floor map\n" +
                                "_-_ Fixed the Quell text\n" +
                                "_-_ Fixed Common Fruit becoming invulnerable"),
                ("0.8.3.0 - Bug fix list 2:\n\n" +
                        "_-_ Fixed the Faina dialogue on floor 0\n" +
                        "_-_ Fixed the Gold Butterfly quest text\n" +
                        "_-_ Fixed Sakaban skipping phases and one-shotting\n" +
                        "_-_ Fixed the Bloodstained Coin terminal text\n" +
                        "_-_ Fixed the Mage infusion value display\n" +
                        "_-_ Fixed the Glimmer Guide freezing\n" +
                        "_-_ Fixed Common Fruit HP display mismatch\n" +
                        "_-_ Fixed Strange Fruit HP display mismatch\n" +
                        "_-_ Fixed Common Fruit not switching phases in Boss Rush"),
                ("0.8.3.0 - Bug fix list 3:\n\n" +
                        "_-_ Fixed the Fire Dragon looping in phase two and fixed Fire Dragon floor terrain carrying across saves\n" +
                        "_-_ Fixed bees getting stuck targeting Sakaban pets\n" +
                        "_-_ Fixed an out-of-bounds error with the Blazing Sun Staff\n" +
                        "_-_ Fixed artifact charging having no effect on the Ruike 5th Gen\n" +
                        "_-_ Fixed the hero seeing through walls in rare cases\n" +
                        "_-_ Fixed mobs spawned by the Lonely City challenge not all waking up at first\n" +
                        "_-_ Fixed the stairs not working when the floor 20 boss in Gold Butterfly Mode rolled Little Cerb"),
                ("0.8.3.0 - Bug fix list 4:\n\n" +
                        "_-_ Fixed some Gold Butterfly text\n" +
                        "_-_ Fixed some missing text\n" +
                        "_-_ Fixed the light cleanup logic\n" +
                        "_-_ Fixed the timer on the trinket projection\n" +
                        "_-_ Fixed Mini Sun sight going out of bounds\n" +
                        "_-_ Fixed the Fruit freezing the game\n" +
                        "_-_ Fixed Bubble keeping leftover New Year reward logic\n"+
                        "_-_ Fixed some weapons not being usable in alchemy\n" +
                        "_-_ Floor 0 weapons now always generate as tier 2\n" +
                        "_-_ Improved some Gold Butterfly text\n" +
                        "_-_ Fixed duplicate trinkets in Gold Butterfly Mode\n" +
                        "_-_ Fixed guide pages appearing in odd places")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.LOCK_SWORD_DIAMOND), "Keyblade of Return",
                "Keys now grant double the XP they used to, with growth adjusted to 1-5.\n\n" +
                        "The Keyblade now always appears in the floor 16 shop. If you have the _Ancient Pathfinder_ achievement,\n\n" +
                        "the floor 16 Keyblade is guaranteed at +3 and costs about half as much."));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.DEV_7), ("Developer tool: elevator"),
                ("The elevator now supports travel to any floor, including floor 0.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.STAIRS), ("Global room improvements"),
                ("The entrance room is no longer merged into other rooms and stands on its own.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight(Window.R_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.DIEDCROSSBOW), ("Heavy Ballista"),
                ("Fixed ballista shots incorrectly using the weapon's own damage.")));

        Image issxsaxs =new ShopGuardDead.ShopGuardianRedSprite();
        issxsaxs.scale.set(PixelScene.align(1f));
        changes.addButton(new ChangeButton(issxsaxs, ("Shop robbery changes"),
                "After robbing a shop you can now only clear out the shop of one single floor.\n\n" +
                        "Shops on other floors no longer spawn, and _even shops that already spawned are emptied out_."));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_14), ("Light Pack challenge retired"),
                ("This challenge has been retired.")));

        changes = new ChangeInfo("v0.8.3.0 passed closed beta testing and is now live", true, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);

        changes = new ChangeInfo("2025 2-28-->3-07", true, null);
        changes.hardlight(Window.CPINK);
        changeInfos.add(changes);
    }

    public static void add_V0822_Changes(ArrayList<ChangeInfo> changeInfos ) {

        ChangeInfo changes = new ChangeInfo("v0.8.2.1-2", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new GhostSprite(), ("Sorrowful Ghost quest improvements"),
                ("The Sorrowful Ghost's target mob now shows a health bar so you can track it, and it disappears once the quest is done.")));

        Image s =new CrivusStarFruitsSprite();
        s.scale.set(PixelScene.align(0.8f));
        changes.addButton(new ChangeButton(s, ("Boss improvements: Fruit of Clivus"),
                "Strange Fruit changes:\n" +
                        "1.Phase two HP is now 200\n" +
                        "2.The phase three shield no longer disappears; above 93 HP it periodically damages enemies\n" +
                        "Strange Fruit extra rewards:\n" +
                        "Potion of Haste x1, Holy Healing Elixir x1, Power Crystal Pillar x1"));

        Image xs =new RivalSprite();
        xs.scale.set(PixelScene.align(0.8f));
        changes.addButton(new ChangeButton(xs, ("Boss improvements: Shadow"),
                "1. Below half HP it prefers throwing weapons and closes in once the ammo runs out.  \n" +
                        "2. Above half HP it prefers wand attacks and is forced into melee when out of charge.  \n" +
                        "3. With a ranged option it backs off to keep its distance.  \n" +
                        "4. With no ammo it no longer freezes and simply switches to melee.  \n" +
                        "5. Fixed the game hanging while the boss had no ammo."));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "0.8.2.1-2:\n\n" +
                        "1.Fruit-series bosses stalled on their complete form [serious blocker]\n" +
                        "2.The Sorrowful Ghost quest BGM was missing [general]\n" +
                        "3.Some Boss Rush text fixes [general]\n" +
                        "4.Blood Slime stats on floor 4 of Boss Rush Hell difficulty [general]\n" +
                        "5.Fixed the Shadow's hidden floor\n" +
                        "6.Some weapons that should be usable in alchemy could not be placed in the pot"));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight(Window.R_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.WRALIPS), ("Darkgold Gem Amulet"),
                ("_-_ XP gained changed from 40/20 to 25/20 (below level 5 / above level 5)\n" +
                        "_-_ Cooldown changed from 40-level to 40-1.65*level\n" +
                        "_-_ Charge formula changed:\n90 base to 120 base, level multiplier from 3x to 4x\n" +
                        "_-_ Cursed damage reduced from 4-6x to 2-4x level\n" +
                        "_-_ Upgrade condition: fixed double upgrades\n" +
                        "_-_ Assassination still costs 6 charges" )));

        changes.addButton(new ChangeButton(new QuestionSprite(), ("Mr. Question Mark temporarily retired"),
                (
                        "Mr. Question Mark rebuilt his own NPC code, but it is full of bugs, some of which crash the game. " +
                                "\n\nHe is retired for now and no longer spawns on floor 0. Wait for a later update.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.HIGHTWAND_1), ("Venom-Infused Staff"),
                ("Boss toxin buildup now resets when the boss leaves the gas\n" +
                        "Gas amount reduced from 150 + 50*level to 50 + 10*level\n" +
                        "Fixed gas-immune mobs still being affected by the venom staff")));

        changes = new ChangeInfo("v0.8.2.2 passed closed beta testing and is now live", true, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);

        changes = new ChangeInfo("2025-2-14", true, null);
        changes.hardlight(Window.CPINK);
        changeInfos.add(changes);
    }

    public static void add_V0820_Changes(ArrayList<ChangeInfo> changeInfos ) {

        ChangeInfo changes = new ChangeInfo("v0.8.2.0", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo("Preload", false, null);
        changes.hardlight(Window.CBLACK);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.EMOTIONALAGGREGATION), ("Collectible system V0.1"),
                ("Lays the groundwork for the coming Hard Mode, and can be tried out from the developer mode misc spawner")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.NEWS), ("New redeem code: MLPD-YX4YearsBirthday"),
                ("Claim your reward in game through the Luobai Shop or the game menu. Happy Lantern Festival!")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Misc changes"),
                ("1.The asset system was initialised. The Lantern Festival and Magic Ling dates clash this year: with the Magic Ling theme on you get the 4th anniversary look, with it off you get the Lantern Festival logo.\n" +
                        "2.Some detail updates\n" +
                        "3.Some interface improvements")));

        changes.addButton(new ChangeButton(new QuestionSprite(), ("Mr. Question Mark 2.0"),
                (
                        "Mr. Question Mark rebuilt his own NPC code, packed with fun new features\n\n" +
                                "If you want to have a go, look for him by the lake near the inn.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.BOSSRUSH_GOLD), ("Boss Rush 3.0 release"),
                (
                        "Boss Rush has been completely rebuilt\n\n" +
                                "1.Fight up to 20 bosses, and every Boss Rush run is a new adventure\n" +
                                "2.Youmei always spawns on floor 4; finish her quest and she joins you\n" +
                                "3.The Merchant Lord appears with merchants on floors 12, 18, 22, 24, 32 and 40, where you can buy supplies\n" +
                                "4.Most bosses have been buffed - check the star icons on the right for details\n" +
                                "5.Charon now accepts gold vouchers, and supply floors were heavily reworked - check the floor icons on the right for details\n" +
                                "6.Boss Rush acid pools now spawn at 5%, and explosive blobs were replaced with complete forms\n" +
                                "7.Boss Rush elites are now only Ghostfire, Tracking, Blessed and Blazing")));

        changes.addButton(new ChangeButton(Icons.get(Icons.TALENT), ("Boss Rush 3.0 - boss change list"),
                ("Random music [implemented]\n" +
                        "Boss Rush boss music is fully randomised, except for Shadow, Yog-Zot, the Mimic King and the Dwarven General\n" +
                        "\n" +
                        "Water blessing, Sludge and Fragmented [implemented]\n" +
                        "no longer work\n" +
                        "Drinking a Water Spirit potion converts half the hero's current HP into arcane shield. [implemented]\n" +
                        "\n"),
                ("Gold voucher shop [implemented]\n" +
                        "Merchant Lord added on 12, 18, 22, 24, 32 and 40\n" +
                        "\n" +
                        "Liquid gold voucher farming [implemented]\n" +
                        "no longer works; you must buy in bundles. At most 10, and later liquid gold purchases no longer give vouchers.\n" +
                        "\n" +
                        "Shadow changes [implemented]\n" +
                        "Each time the map changes, Shadow summons enemies from regions 2/3/4/5 to help it\n" +
                        "Amount: a random 2-6\n" +
                        "Balance: region 5 enemies have half evasion and 75% of their former HP\n" +
                        "Shadow gains resistance: Corrosive, Chilled, Frostfire\n" +
                        "Shadow's summoned enemies gain resistance: Corrosive, Chilled\n" +
                        "Shadow's final wand is now the Venom staff [Gold Butterfly included]\n" +
                        "Shadow's final wand drop is now a random wand at level 0-2 [Gold Butterfly included]\n" +
                        "\n" +
                        "Verdant changes [implemented]\n" +
                        "Moved to floor 19" +
                        "\nMob pool: random Slimes, Ice Golems, Vampire Bats\n" +
                        "HP: 450\n" +
                        "\n"),
                ("Progenitor Piranha [implemented]\n" +
                        "On floor 21,\n" +
                        "Mob pool: Phantom Piranhas, Piranha Apostles, Sticky Rice Rats\n" +
                        "This is a bonus floor where you can mine dark gold to trade for more gold vouchers below,\n" +
                        "careful - there are plenty of traps here, and the piranhas will not let you leave in style!\n" +
                        "Bonus floor note: while no boss fight is active it behaves like a regular floor\n" +
                        "\n" +
                        "Murkflame Witch [implemented]\n" +
                        "Moved to floor 25. Since Lena is a growth boss herself,\n" +
                        "she gets no buff here, but anyone eating tower lasers\n" +
                        "pays a much heavier price\n" +
                        "Her applied effects are identical to the Dwarven Sludge challenge\n" +
                        "Gains resistance: Corrosive, Chilled, Dazed, ordinary flames (it is only natural that Lena is fireproof, no?)\n" +
                        "\n" +
                        "DM-300 changes [implemented]\n" +
                        "HP: 850\n" +
                        "Defense range: 7-10\n" +
                        "All towers must be destroyed\n" +
                        "Damage range changed to 25-50\n" +
                        "All skills use Badder Bosses scaling (whether or not it is enabled)\n" +
                        "Extra reward: Dragon Tear x1\n" +
                        "\n"),
                ("Frost Witch [implemented]\n" +
                        "Moved to floor 27 with adjusted stats\n" +
                        "Damage range: 25-46 [buffed]\n" +
                        "Accuracy: 50 [buffed]\n" +
                        "Evasion: 20 [buffed]\n" +
                        "HP: 1000 [buffed]\n" +
                        "Physical defense: 4-8 [unchanged]\n" +
                        "\n"),
                ("Frost Witch crystal tower changes\n" +
                        "1.Tower HP raised to 90 from 45\n" +
                        "2.New towers:\n" +
                        "Illusion Barrier Crystal - Gluttony\n" +
                        "Attack: fires a beam at the target tile, then next turn relays the target and fires from where it last hit. Applies ghostfire to the target\n" +
                        "\n" +
                        "Illusion Barrier Crystal - Greed\n" +
                        "Attack: fires a beam at the target tile, then next turn relays the target and fires from where it last hit. Degrades the target\n" +
                        "\n" +
                        "Illusion Barrier Crystal - Curse\n" +
                        "Attack: fires a beam at the target tile, then next turn relays the target and fires from where it last hit. Dooms the target [removed when the Frost Witch dies]\n" +
                        "\n" +
                        "3.Gains resistance: Frozen, Frostfire\n" +
                        "\n"),
                ("DM720\n" +
                        "Moved to floor 27 with adjusted stats\n" +
                        "HP: 720\n" +
                        "Damage range: 24-36\n" +
                        "Accuracy: 35\n" +
                        "All skills and buffs use Badder Bosses scaling (whether or not it is enabled)\n" +
                        "\n"),
                ("Blood Moon Elder\n" +
                        "1.Gains the Blessed elite\n" +
                        "2.HP: 120 (was 180)\n" +
                        "3.Damage range: 15-50\n" +
                        "All skills use Badder Bosses scaling (whether or not it is enabled)\n" +
                        "\n" +
                        "Sakaban Fish [implemented]\n" +
                        "Moved to floor 31 with adjusted stats\n" +
                        "1.HP: 648 (was 480)\n" +
                        "2.Evasion: 20 (was 10)\n" +
                        "\n" +
                        "Death Laser\n" +
                        "Damage raised to 50-70\n" +
                        "Gains resistance: Blinded, Dazed, Confused\n" +
                        "\n" +
                        "Bug fixes:\n" +
                        "1.Both minions were awake right after being summoned; fixed in all modes\n" +
                        "2.Both minions had a missing zero in their accuracy - 5 instead of 50; fixed in all modes\n" +
                        "\n"),
                ("Dwarven General [implemented]\n" +
                        "1.Summons one extra banner\n" +
                        "2.Added phase gating so it can no longer be one-shot (in all modes)\n" +
                        "\n" +
                        "Dwarven Warlord [implemented]\n" +
                        "1.Mob pool changed to: Dwarven bombardiers, Medusa, Dwarven Monks\n" +
                        "2.Added phase gating so it can no longer be one-shot (in all modes)\n" +
                        "\n" +
                        "Yog\n" +
                        "1.All with Badder Bosses scaling\n" +
                        "\n" +
                        "Ghostflame Fist\n" +
                        "1.Laser damage doubled\n" +
                        "\n" +
                        "Yog-Zot [implemented]\n" +
                        "1.Extra enemies in the final phase\n" +
                        "2.With Lonely City on, every enemy carries the Lonely City mark")));

        Image dragonSprite = new FireDragonSprite();
        dragonSprite.scale.set(PixelScene.align(0.72f));
        changes.addButton(new ChangeButton(dragonSprite, ("Molten Fire Dragon - Boss Rush"),
                ("Drop changes:\n" +
                        "In Boss Rush the Fire Dragon no longer drops ankhs, artifacts, rings, potions or Dragon Tears\n" +
                        "\n" +
                        "Basic attack physical damage changed to 12-16 [buffed]\n" +
                        "Accuracy changed to 30 [buffed]\n" +
                        "Evasion changed to 12 [buffed]\n" +
                        "Max HP changed to 260 [buffed]\n" +
                        "Physical defense changed to 4-5 [buffed]\n" +
                        "\n" +
                        "Gains resistance:\n" +
                        "Fear, Frozen [done]\n" +
                        "\n" +
                        "New skills\n" +
                        "Dragon Majesty (active): [done]\n" +
                        "On first reaching 0 HP it instantly summons and absorbs 5 elements, healing 160 HP.\n" +
                        "\n" +
                        "Mysterious Ritual (passive): [done]\n" +
                        "When it loses track of an enemy it instantly returns to the altar and absorbs up to 2 elements. 20 turn cooldown\n" +
                        "\n" +
                        "Dragon Curse Lock (active): [done]\n" +
                        "On spotting an enemy it instantly pulls them out. 35 turn cooldown (ignores all terrain)\n" +
                        "\n" +
                        "Treacherous Terrain (terrain): [done]\n" +
                        "The healing area is locked and unlocks once the Fire Dragon is defeated")));

        changes.addButton(new ChangeButton(Icons.get(Icons.STAIRS), ("Boss Rush 3.0 - supply floor list"),
                ("T1 supply floors (floors 3, 5, 7, 8, 10)\n" +
                        "1 Potion of Strength, 2 Potions of Healing, 1 random chest, 1 Scroll of Upgrade, 1 Potion of Experience, 2 random foods\n" +
                        "\n" +
                        "T2 supply floors (floors 12, 14, 15)\n" +
                        "1 Potion of Experience, 1 Potion of Healing, 1 random food,\n" +
                        "1 random weapon, 1 random armor, 40% chance of a random chest\n" +
                        "Added (Boss Rush 3.0)\n: 1 Scroll of Upgrade, 1 random tier 2 throwable, 1 Scroll of Transmutation\n" +
                        "\n" +
                        "T2+ supply floors (floors 19, 20)\n" +
                        "1 Potion of Experience, 1 Potion of Healing, 1 random food, 1 random weapon,\n" +
                        "1 random armor, 1 Scroll of Upgrade, 40% chance of a random chest\n" +
                        "Added (Boss Rush 3.0)\n: 1 random tier 3 throwable, 1 Scroll of Transmutation, 1 random potion\n" +
                        "\n" +
                        "T3 supply floors (floors 22, 25)\n" +
                        "1 Scroll of Upgrade, 1 Potion of Strength,\n" +
                        "1 Potion of Healing, 1 random food, 1 random weapon\n" +
                        "\n" +
                        "T3+ supply floors (floors 28, 30)\n" +
                        "1 Potion of Strength, 1 Potion of Healing, 1 random food,\n" +
                        "1 random weapon, 20% chance of a random chest, 1 random armor\n" +
                        "Added (Boss Rush 3.0)\n: 1 random brew (Aqua Blast / Sludge / Ice Blast / Inferno / Thunder)," +
                        "1 Scroll of Upgrade, 2 Scrolls of Transmutation, 1 random potion\n" +
                        "\n" +
                        "T4 supply floors (floors 32, 34, 36, 38, 40, 41)\n" +
                        "1 Arcane Shield elixir," +
                        "1-2 random secret scrolls (Duel / Rainbow Guard / Metamorphosis / Spirit Blast / Siren Song)" +
                        "\n2 random chests, 1 random potion, 1 random tier 4 throwable, 1 Scroll of Transmutation")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "0.8.2.0 fixes the following:\n\n" +
                        "1. Fixed a serious Gold Butterfly cloning bug - reported by Archetto - fixed by JDSALing\n" +
                        "2. Fixed some mob stat errors; Fragmented no longer applies in Gold Butterfly Mode - reported by sks123456 - fixed by JDSALing\n" +
                        "3. Improved transmutation; artifacts no longer gain levels from it - reported by xiaomeng - fixed by JDSALing\n" +
                        "4. Fixed the Goblin Priest - reported by Archetto - fixed by JDSALing\n" +
                        "5. Fixed old wand charging - reported by Archetto - fixed by JDSALing\n" +
                        "6. Fixed the Vampire Knife stat display - reported by Archetto - fixed by JDSALing\n" +
                        "7. Fixed Phantom Piranhas on the Fool's Ship floor having elite effects - reported by xiaomeng - fixed by JDSALing\n" +
                        "8. Fixed the invulnerability buff - reported by sks123456 - fixed by JDSALing\n" +
                        "9. Fixed Sakaban map generation - reported by sks123456 - fixed by JDSALing\n" +
                        "10. Fixed the wrong music in the Strange Fruit boss fight - reported by sks123456 - fixed by JDSALing\n" +
                        "11. Fixed the Mimic King taking Boss Rush portals to sub-floor 13-d - reported by xiaomeng - fixed by JDSALing\n" +
                        "12. Fixed NPC generation in Boss Rush - reported by sks123456 - fixed by JDSALing\n" +
                        "13. Fixed Boss Rush sewage - reported by sks123456 - fixed by JDSALing\n" +
                        "14. Fixed the Boss Rush Frost Witch - reported by Archetto - fixed by JDSALing\n" +
                        "15. Fixed Boss Rush Strange Fruit - reported by Archetto - fixed by JDSALing\n" +
                        "16. Fixed missing text on some Unpredictable floors - reported by JDSALing - fixed by JDSALing\n" +
                        "17. Fixed Muscle Elixir having no effect on some weapons - reported by QinYue - fixed by JDSALing"));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight(Window.R_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.DIEDCROSSBOW), ("Heavy Ballista"),
                ("Ballista skill change: deals 115% melee damage in a 5x5 area, and now benefits from dart damage and enchantments")));

        changes.addButton( new ChangeButton(new TalentIcon(Talent.STRONGMAN), "Talent changes",
                "The Gladiator talent Stay Alert reverted to Shattered's Battling Zeal\n\n" +
                        " Overwhelming Force numbers:\n" +
                        " Gains 0.137%/0.33%/0.5% damage bonus, capped at 50%\n" +
                        " Gains 0.33%/0.66%/1% accuracy bonus, capped at 75%"));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.HIGHTWAND_1), ("Venom-Infused Staff"),
                ("Anything that enters the Crimson Miasma takes ongoing damage starting at _X points_ and builds up toxin. At _X*8_ accumulated damage a unit is permanently blinded inside the mist, and at _X*20_ permanently paralysed \n\n" +
                        "Drinking a _Potion of Healing_ or _Full Purification Elixir_ clears accumulated toxin.")));

        changes = new ChangeInfo("v0.8.2 passed closed beta testing and is now live", true, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);

        changes = new ChangeInfo("2025-2-12", true, null);
        changes.hardlight(Window.CPINK);
        changeInfos.add(changes);


    }

    public static void add_V0810_Changes(ArrayList<ChangeInfo> changeInfos ) {

        ChangeInfo changes = new ChangeInfo("v0.8.1.0-1", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.Dragon_Lei), ("New item: Dragon Tear"),
                ("Always grants 20 dewdrop worth of healing")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SCROLL_GOLD), ("Gold Butterfly Mode V2.1-2.2"),
                (
                        "Gold Butterfly Mode - V2.2\n\n" +
                                "1.Fixed a serious Gold Butterfly cloning bug\n" +
                                "2.Fixed some mob stat errors; Fragmented no longer applies in Gold Butterfly Mode\n" +
                                "3.Improved the transmutation turn, added invulnerability turns, and artifacts no longer gain levels from transmutation (with limited uses, but unlimited transmutes)"),
                "Gold Butterfly Mode - V2.1\n\n" +
                        "1.More mobs added - see the Gold Butterfly special enemy list in the log"));

        changes.addButton(new ChangeButton(new HermitCrabSprite(), ("Hermit Crab"),
                ("Hermit Crab stats tuned: 0.95 speed before its shell breaks, 2.0 after.\n\n" +
                        "When the shell breaks it gains 6 turns of Haste and Fear. Damage reduced")));

        changes.addButton(new ChangeButton(new ArtilleristSprite(), ("Dwarven Bombardier"),
                ("Fixed a serious bug that set its attack power to 1000%")));

        changes.addButton(new ChangeButton(new GnollBlindSprite(), ("Elder Gnoll"),
                ("Elder Gnolls have 0 defense on floor 1 and 0-2 elsewhere.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Other changes"),
                ("1.Redeem codes now auto-clean and use NTP verification\n" +
                        "2.Some text improvements\n" +
                        "3.Some asset detail updates")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "0.8.1.0-1:\n\n" +
                        "-Fixed some old wand transmutation issues\n" +
                        "-Improved trinket transmutation; trinkets above level 6 can now be transmuted\n" +
                        "-Improved the transmutation internals and the related text\n" +
                        "-Improved Shattered artifact upgrade internals; upgrades now cap at +10. Old saves cannot sync, so if a save above +10 from an older version freezes, that is on you to sort out."));

    }

    public static void add_V0808_Changes(ArrayList<ChangeInfo> changeInfos ) {

        ChangeInfo changes = new ChangeInfo("v0.8.0.8", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SCROLL_GOLD), ("Gold Butterfly Mode V2.0"),
                ("Completely rebuilt - see the in-game Gold Butterfly notes")));

        changes.addButton(new ChangeButton(Icons.get(Icons.NEWS), ("New redeem code: MLPD-SnakeYearsOld"),
                ("Claim your reward in game through the Luobai Shop or the game menu. Happy New Year!")));

        changes.addButton(new ChangeButton(Icons.get(Icons.NEWS), ("New redeem code: MLPD-4YearsOld"),
                ("Claim your reward in game through the Luobai Shop or the game menu. Happy New Year!")));

        changes.addButton(new ChangeButton(Icons.get(Icons.BADGES),("New badges"),
                ("One hidden badge")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_17), ("Challenge improvements: Lonely City Maze"),
                ("Challenge improvements:\n" +
                        "1.Floor 0 was renovated, and Nyazaki gives you a friendly warning if you head for the normal entrance\n" +
                        "2.Lonely City Bzmdr\n" +
                        "3.Special modes can be played in Lonely City")));

        changes.addButton(new ChangeButton(new DreamSprite(), ("New NPC: Xiaomeng"),
                ("Rain or shine, floor 0 waits for you")));

        changes.addButton(new ChangeButton(new RedNecromancerSprite(), ("BossRush2.4"),
                ("Bosses no longer gain growth elite effects.")));

        Image issxsaxs =new QliphothSprite();
        issxsaxs.scale.set(PixelScene.align(0.8f));
        changes.addButton(new ChangeButton(issxsaxs, ("Fruit-series boss improvements"),
                ("The Fruit is no longer auto-targeted while it cannot attack, and the Strange Fruit's vines now open with 10 turns of blindness")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "0.8.0.8:\n\n" +
                        "1.Fixed Duelist subclass weapons not charging at all\n" +
                        "2.Fixed various Gold Butterfly beta issues\n" +
                        "3.Floor 0 golems no longer teleport\n" +
                        "4.Other small crash fixes, too many to list here"));
    }

    public static void add_V0805_Changes(ArrayList<ChangeInfo> changeInfos ) {

        ChangeInfo changes = new ChangeInfo("v0.8.0.5", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        Image dragonSprite = new FireDragonSprite();
        dragonSprite.scale.set(PixelScene.align(0.72f));
        changes.addButton(new ChangeButton(dragonSprite, ("Molten Fire Dragon - Badder Bosses"),
                ("Adjusted the Molten Fire Dragon map terrain to make it more thrilling")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SCROLL_GOLD), ("Gold Butterfly Mode V1.5"),
                ("1.Weapons in the backpack no longer transmute\n" +
                        "2.Fixed some potential issues and improved the underlying modules")));

        changes.addButton(new ChangeButton(Icons.get(Icons.NEWS), ("New redeem code: MLPD_XiaonianYei"),
                ("Claim your reward in game through the Luobai Shop or the game menu. Happy Little New Year!")));

        changes.addButton(new ChangeButton(new RedNecromancerSprite(), ("BossRush2.2"),
                ("The first region boss order changed: Goo -> Common Fruit -> Strange Fruit -> Tianhen (Hard Mode), and the maximum floor is no longer 100.")));

        Image issxsaxs =new DimandKingSprite();
        issxsaxs.scale.set(PixelScene.align(0.8f));
        changes.addButton(new ChangeButton(issxsaxs, ("Mimic King 2.0"),
                ("Now that its music is in, some Mimic King phases were reworked, and the maze no longer uses hidden doors" +
                        "especially phase two. Badder Bosses was also adjusted - see for yourself in game")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "0.8.0.5:\n\n" +
                        "1.Fixed Muscle Elixir not working on some weapons\n" +
                        "2.Fixed dying from Pain Scratch while using a blessed ankh, and fixed being able to quit repeatedly\n" +
                        "3.Fixed hero elite effects not working\n" +
                        "4.Other small crash fixes, too many to list here"));
    }

    public static void add_V0801_Changes(ArrayList<ChangeInfo> changeInfos ) {

        ChangeInfo changes = new ChangeInfo("v0.8.0.1-2", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        Image dragonSprite = new FireDragonSprite();
        dragonSprite.scale.set(PixelScene.align(0.72f));
        changes.addButton(new ChangeButton(dragonSprite, ("Molten Fire Dragon - Badder Bosses"),
                ("Added Molten Fire Dragon Badder Bosses mode and fixed some buffs not applying")));

        changes.addButton(new ChangeButton(new RedNecromancerSprite(), ("BossRush2.1"),
                ("The first region boss order changed: Common Fruit -> Slime King -> Strange Fruit, and the maximum floor is no longer 100.")));

        Image issxsaxs =new DimandKingSprite();
        issxsaxs.scale.set(PixelScene.align(0.8f));
        changes.addButton(new ChangeButton(issxsaxs, ("Mimic King 2.0"),
                ("Now that its music is in, some Mimic King phases were reworked," +
                        "especially phase two. Badder Bosses was also adjusted - see for yourself in game")));

        changes.addButton(new ChangeButton(Icons.get(Icons.AUDIO), ("New original music: Mimic King - Treasure Maze"),
                ("An original boss BGM composed by Tatsro")));

        changes.addButton(new ChangeButton(Icons.get(Icons.AUDIO), ("New third-party music: Titanic (Titan Souls)"),
                ("The Titan Souls soundtrack, used for the Molten Fire Dragon boss fight")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.HIGHTWAND_1), ("Wand changes: Venom-Infused Staff"),
                ("Reverted the code to a stable version, but damage dropped to 70% of before")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.LANTERNB), ("Extinguished Lights V1.6"),
                ("1.Lamp oil is cheaper - from four times the price down to double!" +
                        "2.Lights now drain 4 turns slower")));

        changes.addButton(new ChangeButton(Icons.get(Icons.DISPLAY), ("UI changes"),
                ("1.Encrypted badges now show how many you have out of the total\n" +
                        "2.The 13-challenge badge shows your highest recorded challenge count, but you need to complete one run on this version for it to count.\n" +
                        "3.Special modes now show their own icons and details")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "0.8.0.1:\n\n" +
                        "1.Fixed a crash when items drop on sub-floors\n" +
                        "2.The Treasure Maze now works in Boss Rush\n" +
                        "3.Other small bug fixes, too many to list here"));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "0.8.0.0:\n\n" +
                        "1.Fixed minor issues from dropping items on sub-floors\n" +
                        "2.Fixed terrain issues on Boss Rush Rift floors\n" +
                        "3.Fixed issues on some Boss Rush floors\n" +
                        "4.Fixed items being revealed when standing on white gravestones and black chests\n" +
                        "5.Fixed severe lag on some devices caused by music conflicts\n" +
                        "6.Fixed Fire Dragon buffs not applying and invulnerability failing\n" +
                        "7.Fixed Faina blocking the way\n" +
                        "8.Fixed the Scroll of Rose not working\n" +
                        "9.Fixed jumping down on sub-floors\n" +
                        "10.Fixed some visual effects"));

    }

    public static void add_V0800M1_Changes(ArrayList<ChangeInfo> changeInfos ) {

        ChangeInfo changes = new ChangeInfo("v0.8.0.0-M1", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "middle"), false, null);
        changes.hardlight(Window.Pink_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new VampireSprite(), ("Halloween Castle alpha - closed beta"),
                ("The Halloween Castle alpha is being tested by the closed beta group. The Castle release is coming soon!")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.HOLY_WATER), ("New item: Holy Water Flask"),
                ("Devastates some enemies and disables others. 1-3 flasks spawn per floor")));

        changes.addButton(new ChangeButton(new GhostHalloweenSprite(), ("New mob: Ghost"),
                ("A ghost wandering the Halloween Hall. It cannot damage enemies, but it can shatter their minds.")));

        changes.addButton(new ChangeButton(new PumkingGhostSprite(), ("New mob: Pumpkin Ghost"),
                ("A ghost wandering the Halloween Hall. It cannot damage enemies, but it can shatter their minds.")));

        changes.addButton(new ChangeButton(new ApprenticeWitchSprite(), ("New mob: Apprentice Witch"),
                ("She was once a student at a magic academy, but she was too mischievous to pass her exams, so she never became a proper mage.")));

        changes.addButton(new ChangeButton(new ButcherSprite(), ("New mob: Chainsaw Maniac"),
                ("The Chainsaw Maniac was once an adventurer too, but for reasons of his own he has lost his mind. He roams around the Castle looking for anything that can be torn apart.")));

        changes.addButton(new ChangeButton(new FrankensteinSprite(), ("New mob: Broken Dream Doll"),
                ("Unfinished dolls wandering the Halloween Hall. Their makers are said to have abandoned them for their failed looks and sluggish pace. Now they have gone mad, hunting every living thing to shred its soul.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new LuoWhiteSprite(), ("Redeem code system V2.0"),
                ("The redeem code system is now reachable from the game interface!")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.LANTERNB), ("Extinguished Lights V1.5"),
                ("1.The extra drain for being in darkness changed from + 2*challenges/5 to a flat +2, and only applies to automatic drain\n\n" +
                        "2.Maximum lights raised to 72")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "Version 0.7.9.9-SP4:\n\n" +
                        "1.Fixed some missing text\n" +
                        "2.Fixed the Sentinel staff\n" +
                        "3.Improved the Pure Crystal Elemental AI on floor 4\n" +
                        "4.Fire Dragon, Lena and Dwarven Warlord phase changes now grant invulnerability"));

    }

}
