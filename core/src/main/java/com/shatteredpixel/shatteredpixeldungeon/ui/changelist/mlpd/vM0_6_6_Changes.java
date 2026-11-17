package com.shatteredpixel.shatteredpixeldungeon.ui.changelist.mlpd;

import com.shatteredpixel.shatteredpixeldungeon.Assets;
import com.shatteredpixel.shatteredpixeldungeon.Badges;
import com.shatteredpixel.shatteredpixeldungeon.PaswordBadges;
import com.shatteredpixel.shatteredpixeldungeon.actors.hero.HeroClass;
import com.shatteredpixel.shatteredpixeldungeon.actors.mobs.lb.ShadowSprite;
import com.shatteredpixel.shatteredpixeldungeon.custom.utils.NetIcons;
import com.shatteredpixel.shatteredpixeldungeon.effects.BadgeBanner;
import com.shatteredpixel.shatteredpixeldungeon.effects.PasswordBadgeBanner;
import com.shatteredpixel.shatteredpixeldungeon.messages.Messages;
import com.shatteredpixel.shatteredpixeldungeon.scenes.ChangesScene;
import com.shatteredpixel.shatteredpixeldungeon.scenes.PixelScene;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ApprenticeWitchSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.AutoShopRoBotSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ButcherSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.CerberusSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.CharSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ColdRatSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.CrivusFruitsSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.DM300AttackSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.DM720Sprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.DeathRongSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.DiedMonkLoaderSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.DimandKingSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.DrTerrorSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.DragonGirlBlueSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.FlowerSlimeSprites;
import com.shatteredpixel.shatteredpixeldungeon.sprites.FrankensteinSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.GunHuntsmanSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.HeroSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.IceSlowGirlSprites;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSpriteSheet;
import com.shatteredpixel.shatteredpixeldungeon.sprites.KatydidSprites;
import com.shatteredpixel.shatteredpixeldungeon.sprites.MimicSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.MiniSakaFishBossSprites;
import com.shatteredpixel.shatteredpixeldungeon.sprites.MolotovHuntsmanSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.MurdererSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.NxhySprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.PoltergeistSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.PumkingBomberSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.RedDragonSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.RedNecromancerSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ShamanSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.SpectralNecromancerSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.SuccubusQueenSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.TyphonSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.YogSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ZeroBoatDiedSprite;
import com.shatteredpixel.shatteredpixeldungeon.ui.BuffIcon;
import com.shatteredpixel.shatteredpixeldungeon.ui.BuffIndicator;
import com.shatteredpixel.shatteredpixeldungeon.ui.Icons;
import com.shatteredpixel.shatteredpixeldungeon.ui.Window;
import com.shatteredpixel.shatteredpixeldungeon.ui.changelist.ChangeButton;
import com.shatteredpixel.shatteredpixeldungeon.ui.changelist.ChangeInfo;
import com.watabou.noosa.Image;

import java.util.ArrayList;

public class vM0_6_6_Changes {

    public static void addAllChanges(ArrayList<ChangeInfo> changeInfos) {
        add_SC5_Changes(changeInfos);
        add_SC4_Changes(changeInfos);
        add_SC3_Changes(changeInfos);
        add_SC2_Changes(changeInfos);
        add_SC1_Changes(changeInfos);
        add_SC_Changes(changeInfos);
        add_v0_6_8_0_Changes(changeInfos);
        add_v0_6_7_0_Changes(changeInfos);
        add_v0_6_6_0_Changes(changeInfos);
    }

    public static void add_CS_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("Coming Soon", true, "");
        changes.hardlight(Window.CBLACK);
        changeInfos.add(changes);

        changes = new ChangeInfo("Planned", false, null);
        changes.hardlight(Window.CBLACK);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new RedNecromancerSprite(), ("BossRush2.0"),
                ("The dungeon has been turned upside down, and everything points to the undead legion...")));

        changes.addButton(new ChangeButton(new Image(Assets.Interfaces.HAICONS, 16, 16, 16, 16), ("Golden Age Changes Preview"),
                ("Gold sinks into the sand and flows underground as molten metal.\n" +
                        "The dark dungeon starts to glow with gold.\n" +
                        "Tree shadows melt into the night,\n" +
                        "wealth sleeps here,\n" +
                        "quicksand, gold and blood entwined,\n" +
                        "like a golden waltz.\n" +
                        "Adventurer, the dungeon and its riches are waiting for you.\n" +
                        "Though your dance partners are not exactly friendly...\n" +
                        "The Golden Age is being reworked.\n" +
                        "Designed by QinYue. Not part of the main story")));

        Image i = new Image("sprites/boss/fireDragon.png", 0, 0, 24, 24);
        i.scale.set(PixelScene.align(0.74f));
        changes.addButton(new ChangeButton(i, ("Lava Fire Dragon"),
                ("The truth behind the jungle riot")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_14), ("Cold System v3.0"),
                ("The cold system will be fully implemented; look forward to the winter version")));

        changes = new ChangeInfo("Improvements", false, null);
        changes.hardlight(Window.CBLACK);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new CrivusFruitsSprite(), ("Fruit of Clivus Rework"),
                ("As the MLPD boss that replaces Goo, it still has a long way to go.")));


        Image s = new DM300AttackSprite();
        s.scale.set(PixelScene.align(0.74f));
        changes.addButton(new ChangeButton(s, ("DM-ZERO"),
                ("Time stops flowing here. The showdown with DM-ZERO is coming")));

        Image c = new IceSlowGirlSprites();
        c.scale.set(PixelScene.align(0.74f));
        changes.addButton(new ChangeButton(c, ("Ice Witch Rework"),
                ("The stone records everything about her: her past, her present, her future. When you face her, can you see her true self?")));
    }

    public static void add_SC5_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.6.9.8-RC->PD", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(new Image(Assets.Environment.TILES_SEWERS, 48, 80, 16
                , 16), "Room Changes",
                "New special rooms:\n\n" +
                        "Four mysterious supply rooms now always generate before the Lonely City Demon Halls floors to keep you going."));

        Image issxsaxs =new YogSprite();
        issxsaxs.scale.set(PixelScene.align(0.8f));
        changes.addButton(new ChangeButton(issxsaxs, ("Yog-Zot Phase 5"),
                ("Yog-Zot's fifth phase has been adjusted: the four Unpredictable kings and the ghostfire-frost twin fists appear, and a final wave of monsters is summoned\n\n" +
                        "Yog-Zot no longer summons extra monsters in phase five, and time in the Lonely City falls into chaos.")));


        changes.addButton(new ChangeButton(new KatydidSprites(), ("New Monster: Giant Katydid"),
                ("A small creature of the jungle, made vicious by the changes there. It often spits at intruders, and its spit is highly corrosive, so it is still very dangerous. It is nimble too, so you must catch it off guard to kill it.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.LANTERNB), "Some Lights Buffs Adjusted",
                "Several lights buffs have been adjusted:\n" +
                        "1. Pure Blessing - Fade has been reworked; see the in-game description\n\n" +
                        "2. Witch's Whisper - Weakness removed"));

        changes.addButton(new ChangeButton(new MurdererSprite.RedMuderer(), ("Fragmented Monster Changes"),
                ("Some Fragmented monsters were tuned so the challenge stays hard without being unwinnable:\n\n" +
                        "Details:\n" +
                        "1. The Beast Hunter has slightly less health, its reload takes 9 to 16 turns, and it only has a chance to spawn on floor 14\n\n" +
                        "2. The gnoll guard from the Caves quest joins the region 3 battlefield\n\n" +
                        "3. The Crimson Bandit no longer spawns normally and is now the elite form of the fire wraith. Likewise the eerie phosphorus spirit is the elite form of elemental monsters - (only in the Fragmented challenge)")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes"),
                ("1. Polished some assets\n" +
                        "2. Developer mode improvements; all recent monsters can now be spawned")));

        changes.addButton(new ChangeButton(new AutoShopRoBotSprite(), ("Automatic Food Vendor"),
                ("Cooked meat is now raw meat, plus a few bug fixes" )));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "RC build:\n\n" +
                        "1. Fixed some issues with the eerie phosphorus spirit\n" +
                        "2. Improved the Mimic King window\n" +
                        "3. Night speed is back to normal\n" +
                        "4. Fixed water sprite healing failing completely without the potion-fear challenge\n" +
                        "5. Fixed brown bats always targeting the hero while blinded, and improved their survivability\n" +
                        "6. Fixed the wrong curse-wraith message when using an exorcism scroll on Dr. Terror\n" +
                        "7. Thieves that roll the phase body now become the explosive body instead\n" +
                        "8. Improved mutation text, and the target-seeking elite description is in place\n" +
                        "9. Fixed Fragmented issues with Little Blue and the pink wraith\n" +
                        "10. Fixed falling down stairs in the Mimic King room",
                        "ZC build:\n\n" +
                        "1. Fixed the lantern being transmuted into other artifacts by transmutation wells; note this still uses up a well charge\n" +
                        "2. The lantern now always recharges at least 10%\n" +
                        "3. Fixed some odd crashes with brown bats\n" +
                        "4. Fixed extreme crashes with the Dwarf King in some cases\n" +
                        "5. Fixed extreme crashes with DM-275 in some cases",
                        "RS build:\n\n" +
                        "1. Fixed target-seeking issues with the Deep Blue Salamander - fixed by Pandora\n" +
                        "2. Fixed the Lonely City speeding up at night and slowing by day\n" +
                        "3. Reduced lag on the title screen\n" +
                        "4. Fixed some crashes with the Mimic King\n" +
                        "5. Fixed some small issues in the castle\n" +
                        "6. Fixed some mutants not receiving their movement speed bonus",
                        "PD build:\n\n" +
                        "1. Fixed a few Mimic King bugs\n" +
                        "2. Improved some things at the castle entrance\n" +
                        "3. Fixed the damage reduction of full mutants not matching its description"

        ));

    }

    public static void add_SC4_Changes( ArrayList<ChangeInfo> changeInfos ) {


        ChangeInfo changes = new ChangeInfo("v0.6.9.7-RC", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(BadgeBanner.image(Badges.Badge.ALONECITY.image), ("New Badge: Final Hymn"),
                ("Earn it by completing the Lonely City challenge.")));

        changes.addButton( new ChangeButton(new ItemSprite(ItemSpriteSheet.GREATAXE,
                new ItemSprite.Glowing( 0x00FFFF )), "New Rare Enchantment: Ghostfire",
                "This enchantment lets wisp fire burst from your weapon, setting enemies alight and poisoning enemies that are already burning.\n\nArcane ring bonus: increases the ghostfire chance"));

        changes.addButton( new ChangeButton(new ItemSprite(ItemSpriteSheet.GREATSWORD,
                new ItemSprite.Glowing( 0xcc7770 )), "New Common Enchantment: Blast",
                "This enchantment drives the wielder wild, letting explosive energy burst from the weapon: the target takes an area blast, or is briefly crippled.\n\nArcane ring bonus: increases damage"));

        changes.addButton(new ChangeButton(new GunHuntsmanSprite(), ("New Enemy: Blood Moon Beast Hunter"),
                ("Exclusive to region 3 of Fragmented. It mainly attacks at range.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.WATERSOUL), ("Water Sprite Changes"),
                ("Healing from the murky water sprite potion is no longer affected by potion hysteria, cannot poison you, and lasts 250 turns. Its recipe has changed.")));

        changes.addButton(new ChangeButton(new DeathRongSprite(), ("New Merchant: Charon"),
                ("She found that ferrying souls across the Styx was getting harder, so she opened a shop in the Halloween Hall, and soon she was rolling in money.")));

        changes.addButton(new ChangeButton(new DrTerrorSprite(), ("New Enemy: Dr. Terror"),
                ("Once a celebrity, now fallen this far. If anything shows how things change, it is this.")));

        changes.addButton( new ChangeButton(new Image(Assets.Environment.TILES_SEWERS, 48, 80, 16
                , 16), "Room Changes",
                "New hidden rooms:\n\n" +
                        "1. Two Bees Fighting\n\n" +
                        "2. The Tale of the Fish and the Dart"));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_17), ("Challenge Update: Lonely City Maze"),
                ("1. At night the hero is no longer blinded; night mainly strengthens some monsters\n\n" +
                        "2. From dawn to noon: +10% physical damage, +10% movement speed, and 8% less damage taken\n\n" +
                        "3. At dusk: +5% physical damage, +5% movement speed, and 6% less damage taken\n\n" +
                        "4. Added a day counter\n\n" +
                        "5. Elite spawn chance is increased, but not 100%\n\n" +
                        "6. Resource generation changed from a flat -10 to halved\n\n" +
                        "7. Floor 1 now has 5 rats, but they give double experience\n\n" +
                        "8. Improved the time display logic")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_10), ("Challenge Update: Fragmented"),
                ("Fragmented has been reworked and is more fun now. Details:\n\n" +
                        "1. The last two floors of each region may be invaded by enemies from the region below\n\n" +
                        "2. After floor 6 you will meet more new enemies\n\n" +
                        "3. Overall difficulty tuned")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.LANTERNB), ("The Lights Ahead - v4.1"),
                ("1. Lights now start at no less than 55, so you always get a positive buff.\n\n" +
                        "2. Fixed some small issues with the Fade blessing")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes"),
                ("1. Polished some assets\n" +
                        "2. Developer mode improvements; all recent monsters can now be spawned")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "Fixed the following bugs:\n\n" +
                        "1. Fixed a crash with the Succubus Queen.\n" +
                        "2. Fixed odd crashes with the lantern\n" +
                        "3. Fixed handling of Purgatory elites\n" +
                        "4. Fixed a crash with the Gnoll Alchemist\n" +
                        "5. Fixed dart issues in The Tale of the Fish and the Dart"
        ));

        changes.addButton( new ChangeButton(new BuffIcon(BuffIndicator.CORRUPT, true), ("Mutation"),
                ("Removed the acid body, including in Unpredictable.")));

    }

    public static void add_SC3_Changes( ArrayList<ChangeInfo> changeInfos ) {


        ChangeInfo changes = new ChangeInfo("v0.6.9.6-RC", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(Icons.get(Icons.LANGS), Messages.get(ChangesScene.class, "language"),
                "Language Update: Traditional Chinese\n\nSynced with the 0.6.9.6 translation - contributed by: Sotis"));

        changes.addButton(new ChangeButton(new ShadowSprite(), ("Shadow"),
                ("At 40 lights or below, dying spawns your own shadow, which steals your gold and backpack.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_17), ("Challenge Update: Lonely City Maze"),
                ("Magic Ling Pixel Dungeon - v0.6.9.6-HF1 Notes:\n" +
                        "Challenge tuning:\n" +
                        "1. All-elite mode now starts after floor 6\n" +
                        "2. Fixed bad elite spawning in the Lonely City and bad monster spawning on floor 1 of Fragmented\n" +
                        "3. Lighting the lantern at night now grants immunity to blindness\n" +
                        "4. Fixed leader damage not applying at night")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "Fixed the following bugs:\n\n" +
                        "1. Fixed the crash on the fruit floor in 0.6.9.6.\n" +
                        "2. Fixed odd dialogue from some NPCs in the Lonely City challenge\n" +
                        "3. Fixed the oil well room appearing outside the lights system\n" +
                        "4. Fixed the shadow appearing as living dead"
        ));

        changes = new ChangeInfo("v0.6.9.6", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        Image issxsaxs =new DimandKingSprite();
        issxsaxs.scale.set(PixelScene.align(0.8f));
        changes.addButton(new ChangeButton(issxsaxs, ("Mimic King"),
                ("The Mimic King's second phase has been improved, and the mysterious portal has been adjusted: in some cases the portal can attack you.")));

        changes.addButton(new ChangeButton(new SuccubusQueenSprite(), ("Unpredictable v0.4"),
                ("Added unique monsters to elite terrain. Region 4 was going to get a mimic demon, but that is on hold for now.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.LANTERNB), ("The Lights Ahead - v4.0"),
                ("Lights now count as 1 challenge above 10 challenges, and the difficulty has been tuned to:" +
                        "\n\nNew room: Oil Well\n" +
                        "Throwing your lantern into the well in this room refills some lamp oil.\n\n" +
                        "The deeper the challenge, the harder it is for torches to charge the lamp oil.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_17), ("New Challenge: Lonely City Maze"),
                ("This is the last Magic Ling Pixel Dungeon challenge, and it is very hard, so tread carefully.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SEED_SKYBLUEFIRE), ("Seed Copying v2.0"),
                ("Copied seeds now carry some key information")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_9), ("New Elite: Purgatory"),
                ("Purgatory elites are back, and Agony elite issues were fixed")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_10), ("Challenge Update: Fragmented"),
                ("Fragmented returns, and it brings more horrors with it.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.WHITEROSE), ("White Rose"),
                ("Fixed some odd errors")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.REDWHITEROSE), ("A Vessel"),
                ("Removed the natural health regeneration bonus")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes"),
                ("1. Iterated on some assets\n" +
                        "2. Removed some unused music\n" +
                        "3. Polished various details\n" +
                        "4. Iterated on some screens\n" +
                        "5. Updated the font data source")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "Fixed the following bugs:\n\n" +
                        "1. Fixed Typhon refusing to speak\n" +
                        "2. Fixed some odd issues with Little Blue's quest\n" +
                        "3. Other small fixes"
        ));

    }

    public static void add_SC2_Changes( ArrayList<ChangeInfo> changeInfos ) {

        ChangeInfo changes = new ChangeInfo("v0.6.9.5", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        Image issxsaxs =new DimandKingSprite();
        issxsaxs.scale.set(PixelScene.align(0.8f));
        changes.addButton(new ChangeButton(issxsaxs, ("Mimic King"),
                ("The Mimic King's second phase has been improved, and the mysterious portal has been adjusted.")));

        changes.addButton( new ChangeButton(new Image(Assets.Environment.TILES_COLD, 48, 80, 16
                , 16), "Statue Improvements",
                "Statues in the first three regions now have their own descriptions."));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes"),
                ("1. Iterated on some assets\n" +
                        "2. Removed some unused music\n" +
                        "3. Polished various details\n" +
                        "4. Iterated on some screens\n" +
                        "5. Updated the font data source")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "Fixed the following bugs:\n\n" +
                        "1. Fixed issues with the falling-floor room\n" +
                        "2. Fixed some crashes on floor 30"
        ));

        changes = new ChangeInfo("v0.6.9.4", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "inter"), false, null);
        changes.hardlight(Window.GDX_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(NetIcons.get(NetIcons.GLOBE), ("Network Time Sync v2"),
                ("Entering the game now syncs network time automatically, to stop time-editing cheats in events. Time zone offsets are also handled.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.GREEN_DARK), ("New Thrown Weapon: Glimmer Dart"),
                ("Fixed some errors.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.RED_BLOOD), ("New Thrown Weapon: Wrath of the Earth"),
                ("Fixed some errors.")));

        changes = new ChangeInfo("v0.6.9.2-3", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(Icons.get(Icons.LANGS), Messages.get(ChangesScene.class, "language"),
                "Added the Traditional Chinese translation - thanks to Sotis for the text"));

        changes.addButton( new ChangeButton(new Image(Assets.Environment.TILES_COLD, 48, 80, 16
                , 16), "Room Changes & Asset Polish",
                "New secret room: the Mysterious Alchemy Lab\n\n" +
                        "Honeypot room improvements:\n\n" +
                        "With an unblessed cross, your remains now always appear at the entrance of each floor.\n\n" +
                        "Dwarven region art updated!!!"));

        changes.addButton(new ChangeButton(PasswordBadgeBanner.image(PaswordBadges.Badge.ZQJ_GHOST.image), ("Mid-Autumn Rerun Extended"),
                ("The rerun has been extended again, and this time network time is verified, so finish the event in the window to earn the badge.\n\nThe rerun ends at 00:00 on February 5, so hurry. If you miss it you will have to wait for permanent currency.")));

        changes.addButton(new ChangeButton(NetIcons.get(NetIcons.GLOBE), ("Network Time Sync"),
                ("Entering the game now syncs network time automatically, to stop time-editing cheats in events.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.GREEN_DARK), ("New Thrown Weapon: Glimmer Dart"),
                ("A dart with a blade carved from jade, razor sharp, light and durable\n\n" +
                 "Tier 4, 8-18 damage, 2-4 damage growth, 20 durability (upgrades do not add durability)\n\n" +
                 "When it hits the ground or a creature it releases a dazzling flash, blinding enemies in a 5x5 area for 4+(level/4) turns (it blinds you too)\n\n" +
                 "(stays embedded in the enemy)\n\n" +
                        "Note: there is a small bug where using the last point of durability does not destroy it but leaves you picking up 0. Picked it up? Sure you did.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.RED_BLOOD), ("New Thrown Weapon: Wrath of the Earth"),
                ("Was this left behind when they built this place? The Holy Hammer of Civil Engineering!\n\n" +
                 "Tier 3, 16-24 damage, 2-6 damage growth, 8 durability, attacks take two turns\n\n" +
                 "Hitting an enemy stuns it for 3+(level/4) turns\n\n" +
                 "(does not stay embedded in the enemy)")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new DragonGirlBlueSprite(), ("Ancient Ruins v1.2"),
                ("You can upgrade only once; talking again converts the rest to gold at 10:1, so 10 points becomes 1 gold.")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "Fixed the following bugs:\n\n" +
                        "1. Fixed out-of-bounds secret rooms in region 6\n" +
                        "2. Fixed Typhon becoming unresponsive after his dog is force-killed\n" +
                        "3. Fixed odd badge displays for the Duelist\n" +
                        "4. Fixed ghost amulets leaving shielding behind when enemies with rage phases (such as gnoll brutes) die to scripted kills\n" +
                        "5. Fixed the various errors reported by Firebase\n" +
                        "6. Fixed the falling-floor room generating in the pink wraith's ancient garden\n" +
                        "7. Fixed upgrade scrolls spawning on some sublevels\n" +
                        "8. Fixed odd lights effects"
        ));

        changes.addButton(new ChangeButton(Icons.get(Icons.AUDIO), ("Music Changes"),
                ("1. New ice region music - Titan Souls frozen soil\n\n" +
                        "2. New Demon Halls music - Shattered Pixel Dungeon hell track 2")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes"),
                ("1. Iterated on some assets\n" +
                 "2. Removed some unused music\n" +
                 "3. Polished various details\n" +
                 "4. Iterated on some screens\n" +
                 "5. Updated the font data source")));

        changes.addButton(new ChangeButton(new RedDragonSprite(), ("Red Dragon King"),
                ("The Red Dragon King's reward window can no longer be closed by accident, and its UI was adjusted.")));

        Image issxsaxss =new DimandKingSprite();
        issxsaxss.scale.set(PixelScene.align(0.8f));
        changes.addButton(new ChangeButton(issxsaxss, ("Mimic King"),
                ("The Mimic King's second phase has been improved, and the mysterious portal has been adjusted.")));

        changes.addButton(new ChangeButton(new FrankensteinSprite(), ("Monster Change: Unfinished Dream Puppet"),
                ("Its movement speed was increased.")));

        changes.addButton(new ChangeButton(new ApprenticeWitchSprite(), ("Monster Change: Apprentice Witch"),
                ("Attack tuned")));

        changes.addButton(new ChangeButton(new ButcherSprite(), ("Monster Change: Chainsaw Maniac"),
                ("It now has phase teleport")));

        changes.addButton(new ChangeButton(new PumkingBomberSprite(), ("Monster Change: Pumpkin Gingerbread Bomber"),
                ("Its explosions are stronger now")));

        changes.addButton(new ChangeButton(new MimicSprite.HollowWall(), ("Wall Monster"),
                ("Wall monsters now spawn at a random door in region 6")));
    }

    public static void add_SC1_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.6.9.1", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes"),
                ("1. Polished some assets\n" +
                        "2. Developer mode improvements")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "Fixed the following bugs:\n\n" +
                        "1. Fixed out-of-bounds issues in region 6\n" +
                        "2. Fixed the honeypot room using the non-special version in region 6\n" +
                        "3. Fixed missing keys in some rooms"
        ));

        Image cr = new CerberusSprite();
        cr.scale.set(PixelScene.align(0.7f));
        changes.addButton(new ChangeButton(cr, ("Infernal Nightmare - Cerberus"),
                ("Added a death execution animation and Typhon's related dialogue.")));

        changes.addButton(new ChangeButton(new PumkingBomberSprite(), ("New Monster - Pumpkin Gingerbread Bomber"),
                ("Slower, but with more health")));

        changes = new ChangeInfo("New NPC", false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new TyphonSprite(), ("Mother of All Demons - Typhon"),
                ("This world may be outside my domain, but the things in that castle have no business existing here.")));


    }


    public static void add_SC_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.6.9.0", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.TALENT), ("Meta-Loss Mechanic"),
                ("Added the meta-loss mechanic. Tread carefully.")));

        changes = new ChangeInfo("New Boss", false, null);
        changes.hardlight(Window.R_COLOR);
        changeInfos.add(changes);

//        Image mp = new MorpheusSprite();
//        mp.scale.set(PixelScene.align(0.6f));
//        changes.addButton(new ChangeButton(mp, ("Lord of the Shadow Realm - Morpheus"),
//                ("Then let the grand performance begin.\n\nThis data is preloaded and will go live in the Halloween event")));

        Image cr = new CerberusSprite();
        cr.scale.set(PixelScene.align(0.7f));
        changes.addButton(new ChangeButton(cr, ("Infernal Nightmare - Cerberus"),
                ("Death finds everyone, and you will die first.")));

        changes = new ChangeInfo("New Monster", false, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new FrankensteinSprite(), ("New Monster - Unfinished Dream Puppet"),
                ("No name to speak of, no work finished, abandoned by its master, vanishing unknown...")));

        changes.addButton(new ChangeButton(new ApprenticeWitchSprite(), ("New Monster - Apprentice Witch"),
                ("Trick or treat!")));

        changes.addButton(new ChangeButton(new ButcherSprite(), ("New Monster - Chainsaw Maniac"),
                ("Here is Johny!!!")));

        changes.addButton(new ChangeButton(new PumkingBomberSprite(), ("New Monster - Pumpkin Gingerbread Bomber"),
                ("Happy Happy Happy")));

        changes = new ChangeInfo("New NPC", false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

//        changes.addButton(new ChangeButton(new SliceGirlSprite(), ("Outer God Fragment - Solitude"),
//                ("Everything in the castle is illusion. Adventurer, do you really know your own situation?")));
//
//        changes.addButton(new ChangeButton(new TyphonSprite(), ("Mother of All Demons - Typhon"),
//                ("This world may be outside my domain, but the things in that castle have no business existing here.\n\nThis data is preloaded and will go live in the Halloween event")));

        Image crx = new ZeroBoatDiedSprite();
        crx.scale.set(PixelScene.align(0.7f));
        changes.addButton(new ChangeButton(crx, ("Soul Ferryman - Charon"),
                ("Want to cross the Styx? Pay up first (")));


        changes = new ChangeInfo("Notes", false, null);
        changes.hardlight(Window.SHPX_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new MimicSprite.HollowWall(), ("Region 6 Notes"),
                ("Region 6 is a special area made for players who want to push their limits.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes"),
                ("1. Iterated on some assets\n" +
                        "2. Removed some unused music\n" +
                        "3. Polished various details\n" +
                        "4. Iterated on some screens\n" +
                        "5. Updated the font data source")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "Fixed the following bugs:\n\n" +
                        "1. Fixed odd behaviour when using the rose scroll\n" +
                        "2. Fixed some visual effect issues\n" +
                        "3. Fixed some lights issues\n" +
                        "4. Fixed issues with the sleeping runestone\n" +
                        "5. Fixed many crashes\n" +
                        "6. Seeded runs can now count for the leaderboard, but your final score is halved"
        ));
    }

    public static void add_v0_6_8_0_Changes( ArrayList<ChangeInfo> changeInfos ) {

        ChangeInfo changes = new ChangeInfo("v0.6.8.0-Release2", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.TALENT), ("New Gas: Holy Curse"),
                ("In holy curse gas, the hero may be cursed and weakened, while monsters may gain shielding.\n\n" +
                        "For now this is tied to the new black wraith; new plants and buff changes will follow.")));

        changes.addButton(new ChangeButton(new SpectralNecromancerSprite(), ("New Monster - Spirit Caller"),
                ("Like necromancers they love calling on the undead for help, except they never think they have summoned enough.")));

        changes.addButton(new ChangeButton(new PoltergeistSprite(), ("Black Wraith Rework"),
                ("The black wraith is no longer a regular Prison monster and is now an elite: the elite form of the spirit caller.\n\n" +
                        "Save compatibility: old saves keep the previous black wraith.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ShamanSprite.Purple(), ("Shaman Pack"),
                ("Spawns on floor 14 of the Caves.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes"),
                ("1. Iterated on some assets\n" +
                        "2. Removed some unused music\n" +
                        "3. Polished various details\n" +
                        "4. Iterated on some screens")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_5), ("Monster Set Tuning"),
                ("Prison monster sets were tuned: no more Warden on floor 6, or DM-100 (except in Fragmented)\n\n" +
                        "Fragmented will be reworked later.")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "Fixed the following bugs:\n\n" +
                        "1. Fixed some small crashes with alarm traps\n" +
                        "2. Some text fixes\n" +
                        "3. Fixed the odd reward from \"Purify the Wraith Source\""
        ));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
        changes.hardlight( CharSprite.POSITIVE );
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new DragonGirlBlueSprite(), ("Ancient Ruins v1.1"),
                ("Until you earn \"Ancient Pioneer\", it always appears on floor 18.\n\n" +
                        "Once you have that badge, it appears later with a 49% chance.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight( CharSprite.NEGATIVE );
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ColdRatSprite(), ("Frost Rat"),
                ("Its armor is no longer a flat 10; it now ranges from 5 to 10.\n\n" +
                        "Its accuracy went up by two, and its max level dropped from 18 to 17\n\n" +
                        "Experience gained dropped from 12 to 9,\n\n" +
                        "Blindness reduced from 30 turns to 6\n\n" +
                        "It now has a 20% chance to drop gold.")));

        changes.addButton(new ChangeButton(new NxhySprite(), ("Those Memories Big Shop"),
                ("It no longer always spawns; this extra shop now has only a 20% chance.")));

        changes = new ChangeInfo("v0.6.8.0-Release", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "Fixed the following bugs:\n\n" +
                        "1. Fixed a crash from using the v1 quick slots before finishing the tutorial\n" +
                        "2. Some text fixes\n" +
                        "3. Fixed floor resets on the Sakaban Fish boss floor with an unblessed cross\n" +
                        "4. Fixed some boss badges being awarded to the wrong class"
        ));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes"),
                ("1. Iterated on some assets\n" +
                        "2. Polished various small details")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.ARTIFACT_ROSE3), ("Withered Rose"),
                ("The sorrowful ghost has much more to say,\n\n" +
                        "including for DM-720, the Ice Witch and the Mimic King")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight( CharSprite.NEGATIVE );
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.LANTERNB), ("The Lights Ahead - v3.4"),
                ("The following buffs were nerfed:\n\n" +
                        "The Lights Ahead now stops working when starving, and only works at 90 lights or above.\n" +
                        "Lantern:\n\n" +
                        "Fixed the recharge text, and torches now give 50% recharge.")));

        changes.addButton( new ChangeButton(new Image(Assets.Environment.TILES_SEWERS, 48, 80, 16, 16 ), "Room Changes",
                "The Taiji room now caps at +2,\n" +
                        "the rift area always gives a highly-cursed item,\nand the water area is never cursed but may be plain."));

        changes = new ChangeInfo("v0.6.8.0-Beta3", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new MiniSakaFishBossSprites(), ("Pet System - v0.1"),
                ("The pet system is starting to arrive in game, with one purely cosmetic pet for now. Go try it out.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.FISHSKELETON), ("Sakaban Fish Bones Rework"),
                ("This item was reworked and is now also the first pet item.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes"),
                ("1. Iterated on some assets\n" +
                        "2. Removed some unused music\n" +
                        "3. Polished various details\n" +
                        "4. Iterated on some screens")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "Fixed the following bugs:\n\n" +
                        "1. Fixed some missing text\n" +
                        "2. Fixed crashes when browsing some screens\n" +
                        "3. Fixed some PC hotkeys not working\n" +
                        "4. Fixed bad coordinates on some floors and allies being unable to join fights\n" +
                        "5. Fixed the Keyblade being shared globally\n" +
                        "5. Other crash fixes"
        ));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
        changes.hardlight( CharSprite.POSITIVE );
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.RANDOM_CHEST), ("Supply Crate"),
                ("Price reduced to 350 gold,\n\n" +
                        "and the Keyblade,\npotions and scrolls,\nand Sakaban Fish Bones (requires the Ancient Creature Investigator badge) were added to the pool\n\n" +
                        "Backpack types were removed from the reward pool.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight( CharSprite.NEGATIVE );
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.LOCK_SWORD_DIAMOND), ("Keyblade"),
                ("The Keyblade can now only be upgraded with keys,\nand only these keys give experience:\n\n" +
                        "1. Iron key: 5 experience\n" +
                        "2. Golden key: 15 experience\n" +
                        "3. Crystal key: 25 experience")));

        changes = new ChangeInfo("v0.6.8.0-Beta2", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes"),
                ("1. Iterated on some assets\n" +
                        "2. Some UI improvements")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "Fixed the following bugs:\n\n" +
                        "1. Fixed some missing text\n" +
                        "2. Fixed crashes when browsing some screens\n" +
                        "3. Fixed legendary book issues"
        ));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
        changes.hardlight( CharSprite.POSITIVE );
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(BadgeBanner.image(Badges.Badge.NYZ_SHOP.image), ("Badge Changes"),
                ("This badge now raises starting gold from 320 to 400")));

        changes.addButton(new ChangeButton(BadgeBanner.image(Badges.Badge.EXSG_WIN.image), ("Badge Changes"),
                ("This badge changes starting gold from 720 to 648")));

        changes = new ChangeInfo("v0.6.8.0-Beta1", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(HeroSprite.avatar(HeroClass.DUELIST, 7), ("Weapon Skills: First Round"),
                ("Weapon skills for some weapons are in. Give them a try")));

        changes.addButton(new ChangeButton(new DragonGirlBlueSprite(), ("Ancient Ruins Return"),
                ("A major Ancient Ruins update: 3 new monsters, 3+1 badges and more surprises. Come and see.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.RANDOM_CHEST), ("Random Chest"),
                ("Floor 0's cross and stylus are now a random chest. Lucky or unlucky? Come and find out.")));


        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(HeroSprite.avatar(HeroClass.MAGE, 7), ("Hero Changes"),
                ("Heroes no longer all start with a Potion of Healing:\n\n" +
                        "1. The Warrior starts with a Potion of Healing\n" +
                        "2. The Mage starts with a Liquid Flame potion\n" +
                        "3. The Huntress starts with a Potion of Mind Vision\n" +
                        "4. The Rogue starts with a Potion of Invisibility\n" +
                        "5. The Duelist starts with a Scroll of Mirror Image")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.ARTIFACT_ROSE3), ("Floor 0 Changes"),
                ("Artifacts are no longer given at the start; you get a leather book bag instead.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.WHIP), ("Frostfall Dagger"),
                ("The old Frost Whip is now the Frostfall Dagger with the same damage. Its weapon skill visuals were improved.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.MAGIC_TORCH), ("Magic Torch"),
                ("Improved the weapon skill visuals and completed the skill")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes"),
                ("1. Iterated on some assets\n" +
                        "2. Removed some unused music\n" +
                        "3. A few bug fixes\n" +
                        "4. Polished various small details")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "Fixed the following bugs:\n\n" +
                        "1. Fixed odd Huntress unlock behaviour\n" +
                        "2. Fixed Dwarf King issues\n" +
                        "3. Fixed the extra health on the boss's additional fists\n" +
                        "4. Fixed some missing text\n" +
                        "5. Fixed odd health on the Rogue's blood shadow bat"
        ));


        changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
        changes.hardlight( CharSprite.POSITIVE );
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.WAR_HAMMER), ("Whitethorn Sword"),
                ("The old platinum-and-truesilver warhammer greatsword is now the Whitethorn Sword, with better accuracy and otherwise unchanged")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.DAIRI_KYAN), ("Barbarian Battle Axe"),
                ("Improved the weapon skill visuals, completed the skill, and buffed the weapon")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight( CharSprite.NEGATIVE );
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.YELLOWBOOKS), ("Legendary Books"),
                ("You can no longer read other legendary books while a hero elite effect is active. Legendary book prices went up at merchants. The Nyazaki terminal still costs 720 gold.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.LOCK_SWORD_DIAMOND), ("Keyblade"),
                ("The Keyblade can now only be upgraded with keys. It only has a chance to appear at regular merchants, and it may come at a higher level for a higher price")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.LANTERNB), ("The Lights Ahead - v3.3"),
                ("The following buffs were nerfed:\n\n" +
                        "1. The Lights Ahead now stops working when starving\n" +
                        "2. Symbiosis only has a chance to appear in region 1\n" +
                        "3. Abundance changed from a 70% discount to 40%\n" +
                        "4. Guardian shielding refresh changed from 150 turns to 270")));

        changes.addButton( new ChangeButton(new BuffIcon(BuffIndicator.CORRUPT, true), ("Mutation"),
                ("Acid Body Removed")));

    }

    public static void add_v0_6_7_0_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.6.7.0", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(HeroSprite.avatar(HeroClass.DUELIST, 7), ("Honorata"),
                ("Duelist issues are fixed, and more weapon skills are coming. Stay tuned")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes"),
                ("1. Iterated on some assets\n" +
                        "2. Removed some unused music\n" +
                        "3. A few bug fixes\n" +
                        "4. Polished various small details")));

        changes.addButton(new ChangeButton(Icons.get(Icons.DISPLAY), ("UI Improvements"),
                ("Some screens were improved for a better experience")));

        changes.addButton(new ChangeButton(Icons.get(Icons.DISPLAY_PORT), ("Hotkey Improvements"),
                ("PC key bindings had some issues, now fixed")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.MASTERY), ("Tutorial & More Guides"),
                ("1. Opening Magic Ling for the first time now shows a tutorial\n" +
                        "2. Added more guides to explore")));


        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight( CharSprite.NEGATIVE );
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new DiedMonkLoaderSprite(), ("Dwarf General Rework"),
                ("The Dwarf General is being reworked. Stay tuned for a later update.")));

        changes.addButton(new ChangeButton(new FlowerSlimeSprites(), ("Bloom Slime"),
                ("So players can get through the early game more easily, the Bloom Slime was tuned:\n\n" +
                        "Health: 12 -> random 5 to 9\n" +
                        "Damage: 2-5 -> 1-5\n" +
                        "Seed drop chance: 5% -> 9%")));

        changes.addButton(new ChangeButton(new CrivusFruitsSprite(), ("Fruit of Clivus"),
                ("After the second-phase tentacles attack, you are guaranteed 4 turns of recovery")));

    }

    public static void add_v0_6_6_0_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.6.6.0", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes"),
                ("Seed changes:\n" +
                        "1. Seeded saves show a green save marker\n" +
                        "2. The seed is visible directly in the save info screen\n" +
                        "3. Seeded runs score half at the final tally\n" +
                        "4. Seeded runs look different on the leaderboard\n" +
                        "\nOther changes:\n" +
                        "1. Weapon and staff renaming is back\n" +
                        "2. Iterated on some assets\n" +
                        "3. Underlying code optimization")));

        changes.addButton( new ChangeButton(new BuffIcon(BuffIndicator.IMMUNITY, true), ("Crystal Will"),
                ("Magic Ling's return journey. Ready for the trial?")));

        changes.addButton(new ChangeButton(Icons.get(Icons.CHANGES), ("Major Update"),
                ("Magic Ling is now built on Shattered V2.2.1!" +
                        "Thanks:\n\n" +
                        "- Lead internal tester: bzmdr\n" +
                        "- Asset polish: Danicel\n\n" +
                        "and to everyone on the MLPD team and all our players,\n" +
                        "Two years on, MLPD thanks you for being here")));

        changes.addButton(new ChangeButton(HeroSprite.avatar(HeroClass.DUELIST, 7), ("New Hero: Honorata"),
                ("The Duelist from Shattered is now officially part of MLPD.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
        changes.hardlight( CharSprite.POSITIVE );
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.ARTIFACT_CHALICE3), ("Chalice of Blood"),
                ("Synced back to the 1.2.3 Chalice")));

        changes.addButton( new ChangeButton(new BuffIcon(BuffIndicator.ARMOR, true), ("The Lights Ahead - Guardian"),
                ("Shielding no longer decays on its own, and as long as it holds it slowly regenerates.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.GAUNTLETS), ("Verdant Ash Twin Blades"),
                ("Damage increased, and it is now a tier-4 weapon")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SEED_AIKELAIER), ("Lightning Flower"),
                ("The tasteless fruit made from it is now the Thunderstorm Fruit and has a chain lightning effect.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.HIGHTWAND_5), ("Staff of the Storm"),
                ("Attacking on water with the staff has a 10% chance to trigger 3 chain lightning reactions")));

        changes.addButton( new ChangeButton(new BuffIcon(BuffIndicator.CORRUPT, true), ("Ghostfire Elite"),
                ("It now releases wisp fire when it dies.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight( CharSprite.NEGATIVE );
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(new BuffIcon(BuffIndicator.LIGHT_DIED, true), ("Chain Lightning"),
                ("It can now only hit enemies you can see," +
                        "damage was raised slightly, and the chain no longer decays on its own.")));

        changes.addButton( new ChangeButton(new BuffIcon(BuffIndicator.CORRUPT, true), ("Elite Challenge Tuning"),
                        "_-_A. Elite Foes\n\n" +
                        "1. Flame elite: no longer leaves fire behind when dying on water tiles\n\n" +
                        "2. Target-seeking elite: range is no longer unlimited, but 4 tiles\n\n" +
                        "3. Ghostfire elite: attacks no longer always add wisp fire, but have a 10% chance; on death it ignites ghostfire in a 3x3 area around itself whether or not there is water.",
                        "_-_B. Mutation\n\n" +
                        "1. Acid body mutation: now a 5% spawn chance, at most 3 per region, tallied after a key boss is defeated. Its acid is limited, and once spent it attacks normally.\n\n" +
                        "2. New mutants:\n\n" +
                        "Phase body mutation: after its first 4 successful attacks it teleports randomly, and it slowly regenerates while out of your sight."));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(new RedDragonSprite(), ("Red Dragon Quest"),
                ("The Red Dragon quest was improved and is now part of 0.6.6.0.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.LANTERNB), ("DLC Mode Rework"),
                ("Boss Rush and other DLC modes are being reworked. Stay tuned.")));

        Image i = new YogSprite();
        i.scale.set(0.8f);
        changes.addButton(new ChangeButton(i, ("YogDzewa"),
                ("Nightmare Leaders were improved")));

        Image s = new DM720Sprite();
        s.scale.set(0.8f);
        changes.addButton(new ChangeButton(s, ("DM720"),
                ("Reblessing with the cross on DM-720 no longer rerolls you onto the DM-300 fight floor, and vice versa")));

        changes.addButton(new ChangeButton(new MolotovHuntsmanSprite(), ("Blood Moon Bounty Hunter Elder"),
                ("Improved the DM-720 and elder sprites and fixed some bugs")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "Fixed the following bugs:\n\n" +
                        "Special thanks to lead tester _bzmdr_ for the huge support\n\n" +
                        "Demo1 (internal test):\n\n" +
                        "_-_ 1. Fixed the floor 25 crash after the version migration\n" +
                        "_-_ 2. Fixed armor sprites and scrambled stats\n" +
                        "_-_ 3. Fixed the leaderboard always crashing\n" +
                        "_-_ 4. Fixed odd attack range on the Warrior's starting weapon\n" +
                        "_-_ 5. Fixed missing buff display fields in some edge cases\n" +
                        "_-_ 6. Fixed a crash when opening the leaderboard after ending a game\n" +
                        "_-_ 7. Fixed misplaced plate armor sprites\n" +
                        "_-_ 8. Fixed some assets being in the wrong place\n" +
                        "_-_ 9. Fixed a crash in the bestiary\n" +
                        "_-_ 10. Fixed missing talent text\n" +
                        "_-_ 11. Fixed some issues with the developer mode monster spawner",

                "Demo2 (internal test):\n\n" +
                        "_-_ 1. Fixed crown transfer working on fish armor, and added missing text\n" +
                        "_-_ 2. Fixed positioning on some hero sprites\n" +
                        "_-_ 3. Fixed Mutation, Fragmented and Potion Hysteria not working after the migration\n" +
                        "_-_ 4. Fixed the Dwarf General not appearing properly after the migration\n" +
                        "_-_ 5. Fixed the Frostflame Judgment scroll not being consumed\n" +
                        "_-_ 6. Fixed bad text from a broken toString loop\n" +
                        "_-_ 7. Fixed missing text and fish meat sprites on the phantom piranha\n" +
                        "_-_ 8. Fixed missing Ring of Might text\n" +
                        "_-_ 9. Fixed text bubble issues\n" +
                        "_-_ 10. Fixed missing Dazzling curse text",

                "Demo3 (internal test):\n\n" +
                        "_-_ 1. Fixed scrolls consuming an extra use\n" +
                        "_-_ 2. Fixed missing Honorata skill text\n" +
                        "_-_ 3. Fixed scrambled badge sprites and odd text\n" +
                        "_-_ 4. Fixed misplaced buff icons",

                "Demo4 (internal test):\n\n" +
                        "1: Elemental monsters caused a stack overflow crash - verdict: unoptimized after the Mob migration\n" +
                        "2: Duelist floor 1 talent text \n- verdict: minor - missing text\n" +
                        "3: Short scythe sprite and position in the weapon generator\n" +
                        "4: Text for the new uncursed cursed-enchantment weapon - verdict: minor - missing text\n" +
                        "5: Crystal spires could be damaged by weapons other than the pickaxe - verdict: minor - logic bug\n" +
                        "6. Developer elevator item probing missing - verdict: minor - logic bug\n" +
                        "7. Books could not be read when you only had one - verdict: minor - logic bug\n" +
                        "8. Items thrown into transmutation wells were not converted - verdict: minor - broken feature\n" +
                        "9. DM-275 attack strategy tuning - verdict: minor - experience improvement\n" +
                        "10. Improved the dialogue framework for Those Memories and Nyazaki (currently laggy)\n" +
                        "verdict: minor - experience improvement\n" +
                        "11. Fixed serious sprite scrambling in some screens - verdict: minor - experience improvement\n" +
                        "12. Fixed a missing tier-4 weapon sprite - verdict: minor - experience improvement\n" +
                        "13. Fixed curse wraiths failing to spawn\n\n" +
                        "All of the above are fixed",

                "Demo5 (first public group test):\n\n"+
                "1. Fixed a crash when imbuing the sandals\n" +
                        "2. Fixed a Tengu crash\n" +
                        "3. Fixed issues with the new dialogue box\n" +
                        "4. Fixed missing phantom piranha meat sprites and text\n" +
                        "5. Fixed missing talent text" +
                        "6. Fixed many errors reported by Firebase",


                "Demo6-7:\n\n" +
                        "1. Fixed missing phantom piranha text and sprites\n" +
                        "2. Fixed hero elite buffs not taking effect\n" +
                        "3. Synced the Chalice of Blood to vanilla 1.2.3\n" +
                        "4. Fixed Boss Rush conflicts\n" +
                        "5. Fixed the Duelist crash on floor 10\n" +
                        "6. Fixed errors going down from sublevels\n" +
                        "7. Fixed a batch of other bugs reported by Firebase",
                "Demo8:\n\n" +
                        "1. Fixed map issues with DM-275 and the Dwarf General; applies to new saves\n" +
                        "2. Fixed jungle stingers spawning with their unfinished version\n" +
                        "3. Polished some sprites\n" +
                        "4. Fixed a batch of other bugs reported by Firebase",
                "RC:\n\n" +
                        "1. Fixed return journey issues\n" +
                        "2. Fixed some Unpredictable issues\n" +
                        "3. Polished some sprites\n" +
                        "4. Fixed a batch of other bugs reported by Firebase"));




    }

}
