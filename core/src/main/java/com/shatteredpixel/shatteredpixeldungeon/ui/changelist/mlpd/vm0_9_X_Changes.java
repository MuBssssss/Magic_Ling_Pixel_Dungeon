package com.shatteredpixel.shatteredpixeldungeon.ui.changelist.mlpd;

import com.shatteredpixel.shatteredpixeldungeon.Assets;
import com.shatteredpixel.shatteredpixeldungeon.actors.hero.HeroClass;
import com.shatteredpixel.shatteredpixeldungeon.actors.hero.Talent;
import com.shatteredpixel.shatteredpixeldungeon.actors.mobs.gold.TribemanOldSprite;
import com.shatteredpixel.shatteredpixeldungeon.actors.mobs.lb.RivalSprite;
import com.shatteredpixel.shatteredpixeldungeon.actors.mobs.npcs.PinkLingSprite;
import com.shatteredpixel.shatteredpixeldungeon.custom.utils.NetIcons;
import com.shatteredpixel.shatteredpixeldungeon.items.artifacts.DriedRose;
import com.shatteredpixel.shatteredpixeldungeon.items.bags.KingBag;
import com.shatteredpixel.shatteredpixeldungeon.items.potions.MolotovCocktail;
import com.shatteredpixel.shatteredpixeldungeon.items.potions.elixirs.ElixirOfDragonKing;
import com.shatteredpixel.shatteredpixeldungeon.items.potions.elixirs.GhostLingElixir;
import com.shatteredpixel.shatteredpixeldungeon.items.props.ArmorScalesOfBzmdr;
import com.shatteredpixel.shatteredpixeldungeon.items.props.BottleWraith;
import com.shatteredpixel.shatteredpixeldungeon.items.props.BrokenBone;
import com.shatteredpixel.shatteredpixeldungeon.items.props.BrokenRing;
import com.shatteredpixel.shatteredpixeldungeon.items.props.CatGirlCosplay;
import com.shatteredpixel.shatteredpixeldungeon.items.props.DeadOrAlive;
import com.shatteredpixel.shatteredpixeldungeon.items.props.DeliciousRecipe;
import com.shatteredpixel.shatteredpixeldungeon.items.props.Dirt_KnifeStand;
import com.shatteredpixel.shatteredpixeldungeon.items.props.DreamSeed;
import com.shatteredpixel.shatteredpixeldungeon.items.props.FaintGlimmer;
import com.shatteredpixel.shatteredpixeldungeon.items.props.FreeCrack;
import com.shatteredpixel.shatteredpixeldungeon.items.props.HeartOfCrystalFractal;
import com.shatteredpixel.shatteredpixeldungeon.items.props.HellButterfly;
import com.shatteredpixel.shatteredpixeldungeon.items.props.KillEye;
import com.shatteredpixel.shatteredpixeldungeon.items.props.KnightStabbingSword;
import com.shatteredpixel.shatteredpixeldungeon.items.props.Monocular;
import com.shatteredpixel.shatteredpixeldungeon.items.props.NoteOfBzmdr;
import com.shatteredpixel.shatteredpixeldungeon.items.props.PortableWhetstone;
import com.shatteredpixel.shatteredpixeldungeon.items.props.PureRouge;
import com.shatteredpixel.shatteredpixeldungeon.items.props.RapidEarthRoot;
import com.shatteredpixel.shatteredpixeldungeon.items.props.StarDust;
import com.shatteredpixel.shatteredpixeldungeon.items.props.WenStudyingPaperOne;
import com.shatteredpixel.shatteredpixeldungeon.items.props.YanStudyingPaperOne;
import com.shatteredpixel.shatteredpixeldungeon.items.props.YanStudyingPaperTwo;
import com.shatteredpixel.shatteredpixeldungeon.items.stones.StoneOfAggression;
import com.shatteredpixel.shatteredpixeldungeon.items.thanks.CelestialBrush;
import com.shatteredpixel.shatteredpixeldungeon.items.thanks.DistressSignalNesting;
import com.shatteredpixel.shatteredpixeldungeon.items.wands.WandOfAnmy;
import com.shatteredpixel.shatteredpixeldungeon.items.wands.WandOfGodIce;
import com.shatteredpixel.shatteredpixeldungeon.items.weapon.melee.WashCrime;
import com.shatteredpixel.shatteredpixeldungeon.messages.Messages;
import com.shatteredpixel.shatteredpixeldungeon.plants.AikeLaier;
import com.shatteredpixel.shatteredpixeldungeon.scenes.ChangesScene;
import com.shatteredpixel.shatteredpixeldungeon.scenes.PixelScene;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ATRISprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.AoReadyDragonSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ArchettoSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.BloodsSwarmSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.CharSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ClearElemtGuardGirlSprites;
import com.shatteredpixel.shatteredpixeldungeon.sprites.CrabSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.CrivusStarFruitsSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.DM111Sprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.DeadEyeSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.DogDogMusicSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ElementalSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.FireCrystalSprites;
import com.shatteredpixel.shatteredpixeldungeon.sprites.FodderSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.GhoulPlusSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.GiantFlowerSlimeSprites;
import com.shatteredpixel.shatteredpixeldungeon.sprites.GuardCapitalSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.HeroSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSpriteSheet;
import com.shatteredpixel.shatteredpixeldungeon.sprites.KusumiMagicGirlSprites;
import com.shatteredpixel.shatteredpixeldungeon.sprites.KusumiSprites;
import com.shatteredpixel.shatteredpixeldungeon.sprites.MageHandSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.MiniSakaFishBossSprites;
import com.shatteredpixel.shatteredpixeldungeon.sprites.MoonCatSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.MorpheusSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.MyCoreHeartSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.NyarlathotepSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.PeachGodStateSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.PumkingBomberSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.RedNecromancerSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.SRPDHBLRTT;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ShopkKingSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ShopkeeperSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ShubNiggurathSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.SliceGirlSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.SpawnereEvilSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.TowerMachineSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.VeryColdRatSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.WarlockHeadSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.WhiteGirlSprites;
import com.shatteredpixel.shatteredpixeldungeon.sprites.WispSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.YogSoulSprite;
import com.shatteredpixel.shatteredpixeldungeon.ui.BuffIcon;
import com.shatteredpixel.shatteredpixeldungeon.ui.BuffIndicator;
import com.shatteredpixel.shatteredpixeldungeon.ui.Icons;
import com.shatteredpixel.shatteredpixeldungeon.ui.TalentIcon;
import com.shatteredpixel.shatteredpixeldungeon.ui.Window;
import com.shatteredpixel.shatteredpixeldungeon.ui.changelist.ChangeButton;
import com.shatteredpixel.shatteredpixeldungeon.ui.changelist.ChangeInfo;
import com.watabou.noosa.Image;

import java.util.ArrayList;

public class vm0_9_X_Changes {

    public static void addAllChanges(ArrayList<ChangeInfo> changeInfos) {
        add_V0980_Changes(changeInfos);
        add_V0970_Changes(changeInfos);
        add_V0961_Changes(changeInfos);
        add_V0960_Changes(changeInfos);
        add_V0950_Changes(changeInfos);
        add_V0948_Changes(changeInfos);
        add_V0945_Changes(changeInfos);
        add_V0942_Changes(changeInfos);
        add_V0940_Changes(changeInfos);
        add_V0931_Changes(changeInfos);
        add_V0925_Changes(changeInfos);
        add_V0920_Changes(changeInfos);
        add_V0915_Changes(changeInfos);
        add_V0910_Changes(changeInfos);
        add_V0900_Changes(changeInfos);
    }

    public static void add_V0980_Changes(ArrayList<ChangeInfo> changeInfos ) {

        ChangeInfo changes = new ChangeInfo("Lost - Lost Tomb - coming soon - Tomb", true,"");
        changes.hardlight(0xCCCCCC);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "Opening words",
                "Thank you all for walking with us and supporting Magic Ling Pixel Dungeon!\n" +
                        "After the experience we built up on the Castle side story, a brand new side chapter is officially in the works - the Lost Tomb.\n\n" +
                        "This grand gothic mausoleum once stood on the surface, but a catastrophe buried it deep underground. Between the eternal, lightless hall of silence and the cracked stone corridors, wraiths and twisted monsters roam, waiting for adventurers to uncover the truth buried below."));

        changes.addButton(new ChangeButton(HeroSprite.avatar(HeroClass.SPELLSWORD, 1), "New hero: Spellblade",
                "A brand new playable hero who descends into the perilous Lost Tomb alongside the adventurer to stand against the undead below."));

        changes.addButton(new ChangeButton(new Image(Assets.Environment.TILES_PLACE, 48, 80, 16
                , 16), "Scene art",
                "A full set of tomb pixel art made to measure for this chapter:\n" +
                        "Cold grey and deep blue gothic pixels, tuned to render the crushing atmosphere of a mausoleum that has never seen daylight. Look forward to the Lost Tomb chapter."));

        changes.addButton(new ChangeButton( new WispSprite(), "Mobs exclusive to the tomb",
                "The Lost Tomb region will feature several area-exclusive undead monsters, plus a number of new bosses\n" +
                        "Look forward to the Lost Tomb chapter - more unknown enemies will be revealed as we go."));

        changes.addButton(new ChangeButton(Icons.get(Icons.AUDIO), "Fully original soundtrack",
                "The whole Lost Tomb chapter has its own original background music, composed entirely by lead composer Quanluo, to set the lonely, eerie mood of exploring a tomb underground."));

        changes.addButton(new ChangeButton(new Image(Icons.get(Icons.NEWS)), "Development roadmap",
                "The Lost Tomb side story is steadily in development. More scenes, monsters, exclusive weapons and story content will be revealed, so watch for news of future versions!"));

        changes = new ChangeInfo("v0.9.8.0", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(NetIcons.get(NetIcons.PLAYERS), ("Multiplayer v0.2"),
                ("...the dungeon door never opened for just one person.\n\n" +
                        "When another torch lights up at the end of the corridor, you will know - this time, someone else is down here with you.\n\n" +
                        "May your torches light each other in the same dungeon.\n" +
                        "\n" +
                        "- Multiplayer developer: knox"),
                        (
                        "1. Meeting in the hall\n\n" +
                        "Tap \"Multiplayer\" on the title screen to enter the multiplayer hall.\n" +
                        "Anyone who wants to host taps \"Create Room\" in the top right and the server assigns a six digit room number;\n" +
                        "share that number with your friends, who tap \"Join Room\" and enter it, or simply tap a room in the list; hosts can also set a password to lock the room.\n" +
                        "A room holds up to four people: one host and three visitors."),
                ("2. Before setting off\n\n" +
                 "In \"Profile\" you can change your name, view your identity and personal best score, and wear up to three badges. The badge page lists every badge you have unlocked, and tapping one shows its description. Your companions in the room can see your badges and best score too.\n\n" +
                 "The host picks a save in the room: continue an existing adventure, or configure class, seed and challenges in the original new game screen and then come back to the room.\n\n" +
                 "Visitors pick their own hero. If you already have a hero in this world it is reused; if not, you choose a class first. Each visitor's hero and backpack are completely independent.\n\n" +
                 "When the host taps \"Start Game\" or \"Continue Run\", everyone in the room enters the dungeon together."),(
                        "3. Inside the dungeon\n\n" +
                        "Teammates appear on the same floor as fellow travellers. You can only see each other while you are both inside each other's sight; step out and the figure fades into the dark.\n\n" +
                        "Position, floor and HP sync in real time. Backpack, equipment, quickslot and talents belong to each player and are unaffected by others.\n\n" +
                        "In the current version, mobs, combat and floor drops are resolved separately in each player's world; what you share is position, HP, chat and multiplayer events, plus personal progress saved per world seed.\n\n" +
                                "So your teammates will not fight mobs for you and will not compete for the same loot - but you can call out positions, warn each other of danger, and walk the same dungeon side by side."),(
                                "4. Commands and tips\n\n" +
                                "A. Chat\n" +
                                "Press T, or tap the chat button, to open the chat window. Rooms and runs share one chat window that keeps the last two hundred messages of this session; leaving the room or disconnecting clears it."+
                                "Rooms have a room log, and during a run the top left shows a multiplayer log with recent chat and multiplayer events;\n" +
                                "the bottom left is still the usual game event log.\n" +
                                "B. Commands\n" +
                                "/list - shows the current party: class, name, HP, floor and ping. Tap any player to see their hero details - talents, equipment, status and items. Use the\n" +
                                "magnifying glass on a teammate's figure to open the same details.\n" +
                                "/kick name - host only, removes a player from the room.\n" +
                                "/op name and /dop name - host only, grant or revoke admin. Admins can also use /kick.\n"),(
                                "5. Falling and going again\n\n" +
                                "When a player goes down, everyone sees the announcement.\n\n" +
                                "If the host goes down, companions get a message and wait. Once the host starts a new run, they follow into the new world; if it is a new world seed, they must pick a class again.\n\n" +
                                "You can return to the room from the menu. After the host taps \"Return to Room\", companions come back to the room too; tap \"Continue Run\" in the room to set off again. If you already have local progress in this world, you can tap \"Enter Game\" in the room and set off on your own.\n\n" +
                                "When a visitor leaves or reconnects, their hero and exploration progress are saved per world. Return to the same world and you pick up where you left off."),
                ("6. FAQ\n\n" +
                        "If you cannot see a teammate, first check that you are on the same floor and inside each other's sight.\n\n" +
                        "A teammate standing still or not attacking is not a disconnect - in this version mobs and combat are resolved in each player's own world, and teammates sync position, HP and messages.\n\n" +
                        "Having to pick a class again after reconnecting usually means the host switched to a new world seed.\n\n" +
                        "Putting the phone in the background for more than about fifteen seconds may disconnect you; just rejoin the room and carry on.")
        ));

        changes.addButton(new ChangeButton(new Image(new PinkLingSprite()), ("New system: Daily Hunt"),
                ("Daily challenges are now open.\n\n" +
                        "1.Challenges refresh at 08:00 Beijing time (UTC 00:00).\n" +
                        "2.Runs finished on other days still record and upload their score normally, but you cannot have two daily challenges open at once. To start a new one you must first settle the old daily challenge.\n" +
                        "3.The challenge count and difficulty of a daily challenge are completely random, and only your first run of the day counts. You may retry, but later scores do not enter the ranking.\n" +
                        "4.Reaching floor 15/25 in a daily challenge grants extra cobalt coins. Leaderboards are split into daily and weekly.")));


        Image img = new Image(Assets.Sprites.CRIMSON);
        img.frame(0, 0, 28, 22);
        img.scale.set(0.8f);
        changes.addButton(new ChangeButton(img, ("New skin: Fatebound Crimson"),
                ("Chaos has swallowed the world, and after the church's plan failed, \"the world\" branded everyone a high-risk entity. She stopped caring about that verdict long ago. The shackles of fate cannot hold her; she walks in crimson and tears this silent trial apart with her own hands.\n\nHow to get it: clear Boss Rush on any difficulty (except developer mode)")));

        changes.addButton(new ChangeButton( new Image(Assets.Interfaces.HERO_ICONS,32,16,16,16), ("Swift Shadow Linghong - third class"),
                (       "Nether Hunter:" +
                        "_-_ Nether power strengthens the Shadow Cloak into the Nether Cloak, granting stronger and longer lasting invisibility.\n" +
                        "_-_ Compared to the Shadow Cloak, the Nether Cloak lasts up to 5 turns per point of charge, and artifact charging effects restore 0.5 charge per turn.\n" +
                        "_-_ Using the Nether Cloak no longer costs time.\n\n" +
                        "_-_ Nether Stride:\n"+
                        "_-_ +1: each point of Nether Cloak charge grants _6 turns of invisibility_\n" +
                        "_-_ +2: the Nether Cloak grants _12 stealth_ while equipped\n" +
                        "_-_ +3: after spending at least _2 points of charge_ in a row, the Nether Cloak _refunds 1 charge_ when its use ends\n"),(
                        "_-_ Fleeting Shadow:\n"+
                        "_+1:_ killing a unit grants _6% bonus to all damage_ for 5 turns. Kills with melee or thrown weapons also grant _2 turns of invisibility_.\n\n" +
                        "_+2:_ killing a unit grants _9% bonus to all damage_ for 5 turns. Kills with melee or thrown weapons also grant _2 turns of Haste_ on top of +1.\n\n" +
                        "_+3:_ killing a unit grants _12% bonus to all damage_ for 5 turns. Kills with melee or thrown weapons also grant _10 turns of Purifying Barrier_ on top of +2.\n\n" +
                        "Damage bonuses and durations stack without limit."),(
                        "_-_ Blood Mist Veil:\n"+
                        "_+1:_ killing with a sneak attack converts overkill damage into permanent shield, up to _15 points_. While the shield holds you gain defense from _0 up to the current shield value_.\n\n" +
                        "_+2:_ killing with a sneak attack converts overkill damage into permanent shield, up to _20 points_. While the shield holds you gain defense from _0 up to the current shield value_.\n\n" +
                        "_+3:_ killing with a sneak attack converts overkill damage into permanent shield, up to _25 points_. While the shield holds you gain defense from _0 up to the current shield value_."),(
                        "_-_ Wraith's Grasp\n"+
                        "_+1:_ during sneak attacks, weapon sneak attack bonus is raised by _10%_.\n\n" +
                        "_+2:_ during sneak attacks, weapon sneak attack bonus is raised by _15%_.\n\n" +
                        "_+3:_ during sneak attacks, weapon sneak attack bonus is raised by _20%_.\n\n" +
                        "For how the sneak attack bonus works, see the \"Sneak attack\" entry in the dungeon exploration guide.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton( new Image(Assets.Interfaces.HERO_ICONS,0,0,16,16), ("Berserk Lord - talent rework"),
                (       "_-_ Pain Scratch -> Wrathful Riposte (rework)\n" +
                        "_-_ Wrathful Riposte: for every current region - 1 physical damage the Berserk Lord takes, they build 1/2/3% rage.\n" +
                        "\n" +
                        "_-_ Fervent Casting -> Rampage Armor (rework)\n" +
                        "_-_ Rampage Armor: for every 85/70/55% rage the Berserk Lord currently has, equipped weapons and armor count as having +1 virtual level.")));

        changes.addButton(new ChangeButton( new Image(Assets.Interfaces.HERO_ICONS,16,0,16,16), ("Gladiator King - talent improvements"),
                (       "Masterful Skill -> Final Blow (buff)\n" +
                        "Final Blow:\n" +
                        "The Gladiator King gains +1/2/3 combo the moment they use a finisher, and the talent grants further effects by level.\n" +
                        "+1: the minimum combo needed to use a finisher drops to 5.\n" +
                        "+2: after using a finisher, the Broken Emblem shield instantly recovers to\n" +
                        "its maximum.\n" +
                        "+3: after using a finisher, the Gladiator King gains 10 turns of Mighty Force.\n" +
                        "Mighty Force: your Strength is temporarily doubled."),
                        ("Fight to Feed the Fight (buff)\n" +
                        "If the Gladiator King uses a finisher within 4 turns of a combat skill, they gain +1/2/3 combo and 0/1/2 turns of Adrenaline Surge.\n" +
                        "If the Gladiator King uses a combat skill within 4 turns of a finisher, they gain +1/2/3 combo and 0/1/2 turns of Adrenaline Surge.\n" +
                        "\n" +
                        "Combo Premeditation (new)\n" +
                        "When the Gladiator King starts an attack with no combo built up, that attack grants an extra +1/2/3 combo.")));

        changes.addButton(new ChangeButton( new Image(Assets.Interfaces.HERO_ICONS,32,0,16,16), ("Celestial Maiden - rework"),
                ("1. Removed\n\n" +
                        "_-_ the Mage Hand controller's \"teleport\" and \"attack\"\n" +
                        "_-_ the Mage Hand's melee and self-casting abilities\n" +
                        "_-_ the Mage Hand applying hostility to the Celestial Maiden on attacking or being hit\n" +
                        "_-_ the Mage Hand's immunity to all buffs\n"), (
                        "2. Added\n\n" +
                        "_-_ When possible, the Mage Hand follows up on the same target after the Celestial Maiden casts (without triggering Magic Missile effects). The Mage Hand does not pick targets on its own.\n" +
                        "_-_ When you gain wand charging effects, the wand held by the Mage Hand benefits from them too.\n"), (
                        "3. Changed\n\n" +
                        "_-_ The Mage Hand's AI changed from melee AI to follow AI.\n" +
                        "_-_ The Mage Hand no longer teleports when hit; instead, taking damage drains 1 charge from the wand it holds. If there is no charge left, the next hit dissipates the Mage Hand and starts a 10 turn summon cooldown.\n"),(
                        "4. Improved\n\n" +
                        "_-_ the Mage Hand's wand use logic\n" +
                        "_-_ resummoning restrictions are looser, and a failure message is shown\n" +
                        "_-_ the Mage Hand's wand is stored in the Mage Hand controller, so it is no longer lost if the hand dissipates and you reload the save")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                ("V0.9.8.0:\n\n" +
                        "_-_ Fixed e-cigarettes permanently converting affected animal enemies into allies after being equipped and removed\n" +
                        "_-_ Fixed the Shattered Ring costing a turn to block items, which could get you comboed forever in extreme cases\n" +
                        "_-_ Toned down the red flashing of the Cloak of Thorns\n" +
                        "_-_ Fixed the Know-It-All badge not completing for the Battle Shrine Maiden\n" +
                        "_-_ Improved seed copying in the Seed Finder lookup\n"+
                        "_-_ Fixed switching skins mid-run failing to clean up effect glows, leaving them stuck on the ground\n"),(
                        "_-_ Fixed Honorata digging a chest out of a merchant's goods with the shovel ability and then taking the goods underneath for free\n" +
                        "_-_ Fixed the Martial Master failing to trigger Soft Chime when moving the Soft Chime Bell from offhand to main hand\n" +
                        "_-_ Fixed the Celestial Brush dropping back to 2 charge after saving with more than 2\n" +
                        "_-_ Fixed the Stillness that appears after talking to Cerberus on floor 29 not actually vanishing once the dialogue ends - nobody is there, but you can talk again, and doing so crashes the game\n" +
                        "_-_ Fixed the Strange Fruit self-destructing unconditionally\n"),(
                                "_-_ Fixed the Rogue tier 2 talent Terrain Awareness not detecting the hidden rooms added by Magic Ling\n" +
                                        "_-_ Fixed the Sakaban Fish floor occasionally being unable to start the game properly\n" +
                                        "_-_ Fixed the Swift Slash talent sometimes having no effect\n"+
                                        "_-_ Fixed leaderboard score ordering and improved the score display.")));

        changes.addButton(new ChangeButton( new TalentIcon(Talent.PSIONIC_STRIDE), "Celestial Maiden - talent rework",
                "Versatile Strikes -> Psionic Step\n" +
                        "Psionic Step: after each cast by the Celestial Maiden or her Mage Hand, both gain 1/2/3 turns of Haste. This has a 30/25/20 turn cooldown. The Maiden and the Hand can each trigger it separately, durations stack when both trigger, and the cooldowns are tracked separately\n" +
                        "\n" +
                        "Mana Recompense -> Cycles\n" +
                        "Cycles: every 4 casts by the Mage Hand grants the Celestial Maiden 1/2/3 turns of wand charging\n" +
                        "\n" +
                        "Tangible Hand -> Twin Presence\n" +
                        "Twin Presence: after every 3/2/1 casts by the Mage Hand, the Celestial Maiden may use any one wand without spending a turn. Casts triggered this way do not make the Mage Hand follow up.\n" +
                        "\n" +
                        "Mana Siphon -> Psionic Acceleration\n" +
                        "Psionic Acceleration: the wand held by the Mage Hand recharges 50/100/150% faster."));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Misc improvements"),
                ("_-_ [Potion Hysteria]: the Binding Potion no longer restores Potion of Haste effects while a Blood Sentinel is on the floor\n" +
                 "_-_ Improved some of Lena's and the Merchant Lord's text\n" +
                 "_-_ The \"Ambush\" entry in the dungeon exploration guide now explains the ambush bonus stat\n" +
                 "_-_ Fixed blue-highlighting text errors in the Magic Torch description\n" +
                        "_-_ Various UI and asset updates")));

        changes.addButton( new ChangeButton(new TalentIcon(Talent.BLOODLINE_BOON), "Talent changes",
                "1. Overwhelming Force changes:\n" +
                        "_-_ Overwhelming Force moved to the Berserk Lord's exclusive talents\n\n" +
                        "2. Other changes\n" +
                        "_-_ [New] Bloodline Ward:\n" +
                        "Leiling Anjie's Emblem restores 1/2/3 extra shield per turn, and the Emblem gains 4/8/12 extra shield capacity.\n" +
                        "If someone else takes this talent it instead grants 1 shield per turn, stacking up to 6/8/10.\n\n" +
                        "_-_ Living Arrow:\n" +
                        "shooting ordinary grass now also grows high grass\n\n" +
                        "_-_ Stealth Technique:\n" +
                        "the stealth it grants drops from 1/4 -> 1/2 to 1/6 -> 1/4" ));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.RING_TOPAZ), ("Ring changes"),
                ("The Ring of Arcana upgrade scaling has been reverted to the pre-nerf version.")));
    }

    public static void add_V0970_Changes(ArrayList<ChangeInfo> changeInfos ) {

        ChangeInfo changes = new ChangeInfo("v0.9.7.0-2", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.LANGS), ("Language update: English (EN)"),
                ("The English translation has been updated and now covers 99.65%. Thanks to the English translation team.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.LANGS), ("Language update: Russian (RU)"),
                ("The Russian translation has been updated and now covers 99.72%. Thanks to the Russian translation team.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.LANGS), ("Language update: Portuguese (PTBR)"),
                ("The Portuguese translation has been updated, though coverage is still low at only 7%. Many thanks to the Portuguese translation team all the same.")));

        Image img = new Image(Assets.Sprites.BUNNY);
        img.frame(0, 0, 20, 22);
        img.scale.set(0.8f);
        changes.addButton (new ChangeButton (img, "New skin: Neon Bunny",
                "Price: 1000 cobalt coins\n\nOriginal design: Baicai\n\nArt: Noah-7385 & Daniel-Calan\n\nOn another timeline there is no magic or curse, only modern technology and endless possibility. Amid the neon clamour she no longer dons armor to fight, but savours this hard-won human world."));

        changes.addButton( new ChangeButton(new Image(Assets.Environment.TERRAIN_FEATURES, 32, 128, 16, 16), "New plant: Golden Chrysanthemum",
                "Starting with the Double Ninth Festival version a new plant goes live - the Golden Chrysanthemum, Magic Ling's 19th plant.\n" +
                        "\n" +
                        "- when stepped on, a blessing of longevity protects whoever trod on it for a while"));

        changes.addButton( new ChangeButton(new ItemSprite(ItemSpriteSheet.WHITE_BAST), "White Wave Rapier rework",
                ("[Main skills]:\n\nEthereal: passive. While the White Wave Rapier is equipped, every enemy is continually paralysed while levitating (reapplied the moment paralysis ends, an unbreakable lock), and hitting an enemy makes it levitate for 1 turn. 7 turn cooldown.\n\nFeather Slayer: passive. Physical damage dealt to airborne enemies ignores 50%% of their defense. After a miss or a block the rapier immediately makes one extra attack (costing no turn); this cannot chain.\n\nVerdict: active. Levitates every enemy that is not already airborne in the eight tiles around you for 2 turns, then makes 3 guaranteed hits on each of them. This skill needs 30 charge to activate; each attack (hit or miss) grants 1 charge, and airborne enemies dying grant 4."),
                ("[Ability: Wind Strike]:\n\n" +
                        "Honorata can use the White Wave Rapier to perform _Wind Strike_ on an enemy within 1 tile, levitating the target for one turn and making two guaranteed hits.\n\nThe skill costs 2 charge."
                )));



        changes.addButton( new ChangeButton(new ItemSprite(ItemSpriteSheet.SEED_MARIGOLD), "New seed: Golden Chrysanthemum Seed",
                "The seed released alongside the Golden Chrysanthemum."));

        changes.addButton( new ChangeButton(new ItemSprite(ItemSpriteSheet.MARIGOLD_POTION), "New potion: Bottled Chrysanthemum Wine",
                "The potion released alongside the Golden Chrysanthemum. It cannot spawn naturally, but can be brewed with alchemy - see the alchemy table for details.\n" +
                        "\n" +
                        "This item can be bought from merchants."));

        changes.addButton( new ChangeButton(new ItemSprite(ItemSpriteSheet.MARIGOLD_EXC_POTION), "New elixir: Alcohol Elixir",
                "The elixir released alongside the Golden Chrysanthemum.\n" +
                        "\n" +
                        "This item can be bought from merchants."));

        changes.addButton( new ChangeButton(new ItemSprite(ItemSpriteSheet.MARIGOLD_WORLD_POTION), "New special item: Heirloom Brew",
                "The event item released alongside the Golden Chrysanthemum. It can only be brewed with the matching alchemy recipe during the Double Ninth Festival and some other events.\n" +
                        "\n" +
                        "Merchants buy this item at a very high price."));

        changes.addButton( new ChangeButton(new ItemSprite(ItemSpriteSheet.MARGOLD_TR), "New dart: Golden Chrysanthemum Dart",
                "A new dart released alongside the Golden Chrysanthemum.\n" +
                        "\n" +
                        "These darts are coated in a drug made from the flower: hitting an ally grants a brief chrysanthemum blessing, while throwing them at enemies causes dazed for a while."));

        changes.addButton( new ChangeButton(new ItemSprite(ItemSpriteSheet.MOTO_FIRE), "New item: Molotov Cocktail",
                "A new item released alongside the Golden Chrysanthemum. Thrown, it creates a 5x5 burning area.\n" +
                        "\n" +
                        "See the item catalogue for more details."));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.WASH_CRIME), ("Absolution changes"),
                ("Fixed where Absolution places its wraiths and fixed the cripple not applying; the wraith cap is now 5 and the spawn chance is (30 + 5 * weapon level)%")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_12), ("Potion Hysteria v0.5"),
                ("_-_ Taunt Potion -> Revealing Potion\n" +
                        "_-_ Effect changed: for 5 turns every enemy on the floor gains the hero's sight. (Implemented with a new \"Reveal\" buff.)\n" +
                        "_-_ Broken Leg Potion -> Binding Potion (text only)" )));


        changes.addButton(new ChangeButton(new ItemSprite(new DistressSignalNesting()), ("Dynamic item sprites: V0.2"),
                ("Drawing on how Shattered Pixel Dungeon animates, this has been improved and the whole item sprite should no longer be drawn incorrectly in the dungeon.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SEED_AIKELAIER), ("Seed Finder - V4.4"),
                ("_-_ 1.Fixed ring lookups and some minor errors\n" +
                        "_-_ 2.Fixed the analyser")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Feature improvements"),
                ("_-_ New improvement: multi-item quickslots\n" +
                        "_-_ Fixed some minor issues on some pages\n" +
                        "_-_ The changes window now supports keyword search\n" +
                        "_-_ Lena's post-robbery dialogue gained two new cases: double-hit and enraged")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                ("V0.9.7.1:\n\n" +
                        "_-_ Fixed skin compatibility for Mirror Image and the Rainbow Guard\n" +
                        "_-_ Fixed Lena still running off after you pass her trial and ask for shop items\n" +
                        "_-_ Fixed seed lookups disagreeing when Mio is absent\n" +
                        "_-_ Fixed the Tianhen Goo map freezing\n" +
                        "_-_ Improved the search bar in the changelog\n" +
                        "_-_ Fixed Eagle Eye farsight vision"+
                        "_-_ Fixed natural health regeneration failing while starving\n"),
                (
                        "_-_ Fixed the Crossbow sometimes dropping from certain mobs\n" +
                                "_-_ Fixed multi-ability equipment clearing quickslots when unequipped and re-equipped while set to \"choose on insert\"; old wands and lanterns no longer use multi-ability quickslot logic under \"choose on use\"\n" +
                                "_-_ Fixed Stealth Technique not working for other classes\n" +
                                "_-_ Fixed Terrain Awareness finding hidden rooms incorrectly\n" +
                                "_-_ Improved the Elite Mutation message so it no longer floods the log on entering a new floor and crowds out other messages\n" +
                                "_-_ Fixed some special scrolls being transmutable and making some talents apply forever\n" +
                                "_-_ Improved the White Wave Rapier paralysis logic (fixed paralysis lasting too long, though applying it the instant a target becomes airborne is not implemented yet - in other words an enemy still completes its turn as it starts to levitate)")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                ("V0.9.7.0:\n\n" +
                        "_-_ Fixed the Deep Sea Knight's anchor effect: from Full Purification Elixir to Demon Emperor Grass\n" +
                        "_-_ Improved some Mage Hand logic\n" +
                        "_-_ Fixed an LMKD error caused by too many Android particle effects\n" +
                        "_-_ Fixed Honorata being unable to put Tree Scar in the quickslot while it has no charge\n" +
                        "_-_ Fixed the Scavenger body-snatching issue\n" +
                        "_-_ Fixed a crash from the Hollow Wraith - Ghostfire sometimes summoned by the Ghostfire Wand's Battlemage effect\n" +
                        "_-_ Fixed a crash when examining Morpheus with the magnifying glass\n" +
                        "_-_ Fixed skipping waves too fast in the final phase of Morpheus, where you guard the Heart of the Universe, losing Pillar of the World repairs and softlocking the fight"),
                (
                        "_-_ Fixed a resident NPC occasionally getting stuck inside a wall\n" +
                        "_-_ Fixed using the Tome of Return while the floor is sealed causing missing text\n" +
                        "_-_ Fixed: the puppy summoned by the Dog Whistle now disappears properly when the player stands still for a long time.\n" +
                        "_-_ Fixed: added a sub-floor restriction to the Scroll of Return.\n" +
                        "_-_ Fixed the true ending putting the player into a relic state on completion and losing the collectible score.\n" +
                        "_-_ Fixed the catgirl cosplay collectible wrongly activating the boss on its own.\n" +
                        "_-_ Fixed the Blood Moon Aegis Hunter being able to kick away cursed items.\n" +
                        "_-_ Fixed unblessed ankhs on the Sakaban floor not producing a relic.\n" +
                        "_-_ Fixed the Tome of Return teleporting to the wrong place outside robbery floors.\n" +
                        "_-_ Fixed regular merchants leaving after a robbery without taking their goods with them."
                )));


        changes.addButton(new ChangeButton(new ItemSprite(new HellButterfly()), ("Purgatory Red Butterfly"),
                (       "Fixed the Purgatory Red Butterfly counting mini-bosses as regular units. Its effect on mini-bosses now matches its effect on bosses.")));


        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.RING_TOPAZ), ("Some ring changes"),
                ("The upgrade scaling of the Ring of Arcana and Ring of Energy was changed, and it is smoother now. Both are stronger at low levels and, correspondingly, weaker at high levels.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight(Window.R_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(new BottleWraith()), ("Bottled Wraith"),
                (       "No wraiths will spawn on any Fruit floor now.")));

        changes.addButton(new ChangeButton(new ItemSprite(new MolotovCocktail()), ("Molotov Cocktail"),
                (       "The Molotov Cocktail can no longer be broken down into alchemical energy.")));

        changes.addButton(new ChangeButton(new ItemSprite(new FreeCrack()), ("Shard of Space"),
                (       "The Shard of Space was improved and now gives a warning before teleporting you.")));

        changes.addButton(new ChangeButton(new Image(new MageHandSprite()), ("Mage Hand"),
                ("_-_ Using either old wands or wands now triggers hostility runestones")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
        changes.hardlight(Window.G_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(HeroSprite.avatar(HeroClass.HUNTRESS, 7), ("Yilian Meihua - Nature Sprite"),
                ("The team judged the Nature Sprite to be weak in the current version, so the subclass has been reworked.\n\n" +
                        "_-_ New passive effect:\n" +
                        "_-_ seeds can be used directly to gain their benefit (tap the new \"Bind\" button on a seed). If the bound seed is a Rotten Berry, it is not consumed. \n\n" +
                        "_-_ Point Blank buffed:\n" +
                        "_-_ the effect changed from -30%/-10% +10% to -30%/0%/+30%."),
                (       "_-_ New talent: Living Arrow \n" +
                        "_-_ when the Nature Sprite's arrow hits the ground, high grass grows where it lands. 25/20/15 turn cooldown.\n" +
                        "\nIf passive regeneration is disabled or the hero gains no XP for a long time, this talent only grows withered grass."
                ),(
                "Talent changes:\n\n" +
                        "Lasting Potion -> Essence Extraction \n" +
                        "The Nature Sprite's coated darts have 2/3/4 times the durability and always hit. (They cannot be dodged, but can still be blocked by Focus.)\n\n" +
                        "Dewshield -> Fine Pruning: benefits gained through Bind last 1.3/1.5/1.7 times as long. \n"
        )));

        changes.addButton(new ChangeButton(HeroSprite.avatar(HeroClass.ROGUE, 7), ("Swift Shadow Linghong - tier 2 talent improvements"),
                (       "_-_ Wide Search -> Keen Instinct:\n" +
                        "_-_ +1: Swift Shadow Linghong has +50% chance to spot hidden doors and hidden traps automatically\n" +
                        "_-_ +2: Swift Shadow Linghong has +100% chance to spot hidden doors and hidden traps automatically \n\n" +
                        "_-_ Silent Step -> Stealth Technique:\n" +
                        "_-_ +1: Swift Shadow Linghong gains stealth equal to level/4 \n" +
                        "_-_ +2: Swift Shadow Linghong gains stealth equal to level/2 \n\n" +
                        "_-_ Thieving Premonition -> Terrain Awareness:\n" +
                        "_-_ +1: Swift Shadow Linghong has a 75% chance to know whether a hidden room exists, and if so a 25% chance to reveal its location outright \n" +
                        "_-_ +2: Swift Shadow Linghong has a 100% chance to know whether a hidden room exists, and if so a 50% chance to reveal its location outright"
                )
        ));
    }

    public static void add_V0961_Changes(ArrayList<ChangeInfo> changeInfos ) {

        ChangeInfo changes = new ChangeInfo("v0.9.6.1-5", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.BLESS_SCROLL), ("Developer mode v0.9"),
                ("1. Thrown weapons can now use the enchantment/curse interface\n" +
                        "2. Status effectors are now live")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SEED_AIKELAIER), ("Seed Finder - V4.3"),
                ("1.The new Seed Finder is live. Special thanks to the Girls' Frontline team for their help\n" +
                        "2.Concurrent seed searching, for better lookup speed\n" +
                        "3.Smarter lookups: the Ritual Dagger is no longer only searched at +1, but guaranteed at +1 or better")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.FORESTCROSSBOW), ("New legendary weapon: Forest Bow"),
                ("A few bugs were fixed and it is now live. Enjoy!")));

        changes.addButton(new ChangeButton(new FireCrystalSprites(), ("Enraged Lena"),
                ("While enraged, Lena changes as follows:\n" +
                        "_—_ Path of Karma Fire:\n"+
                        "Ghostfire circles Lena and can evaporate water tiles\n" +
                        "Lena can summon Sinners and Snowfrost Guardians\n\n" +
                        "_-_ Red Lotus Karma Fire:\n" +
                        "Lena can summon the Red Lotus Karma Fire, a full screen attack. It can only be stopped by destroying two Murkflame Cores while she charges." +
                        "Otherwise it instantly cuts the target to one fifth of their HP, or executes them outright if they are already below that\n\n" +
                        "_-_ Wrathflame:\n" +
                        "In phase three Lena can cover a large triangular area in ghostfire\n\n" +
                        "_-_ Life Link:\n" +
                        "Lena can link with summoned mobs so they share the damage she takes\n\n" +
                        "_-_ Pincer:\n" +
                        "Lena can instantly summon two mobs next to her target\n\n" +
                        "_-_ Fireball:\n" +
                        "Lena can throw ghostfire fireballs from range")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.ARTIFACT_ARMBAND), ("Master Thief Bracers"),
                ("The Master Thief Brassard has been renamed and is back stronger than ever." +
                        "\n\nThe following Magic Ling adjustments apply:\n\n" +
                        "_-_ If a theft fails against a regular merchant, the first time you are instantly teleported to the Canyon and Lena turns enraged immediately. Later failed thefts make merchants run off.\n\n" +
                        "_-_ Against other merchants, a failed theft makes them run off immediately\n" +
                        "_-_ Nyazaki, Charon and the Luobai Shop cannot be robbed")));

        changes.addButton(new ChangeButton(new ShopkKingSprite(), ("Robbery event - Enraged Lena"),
                (
                        "Players have reported at length that the double fight is too hard. On review, Enraged Lena has been added as a separate branch from the double fight\n" +
                        "If you run into an enraged Lena, the double fight will never trigger.\n\n" +
                        "_-_ +30% chance if you stole something this run (Master Thief Brassard & Gambler's Gloves)\n" +
                        "_-_ +30% chance if you beat up a merchant this run\n" +
                        "_-_ +40% chance if you defeated Dongling this run\n" +
                        "If you run into an enraged Lena you see a warning before the fight:\n" +
                        "The air around you grows hotter and hotter...\n\n" +
                                "Also, the double fight and the enraged fight now always drop a Scroll of Upgrade plus 1012 gold.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.ARMOR_CLOTH,new ItemSprite.Glowing(0x0)), ("Bedrock changes"),
                ("Bedrock Glyph has always been in an awkward spot, so on review it has become Bedrock Curse.\n\n" +
                        "Bedrock Curse wraps the whole suit in heavy magic that stops the wearer from dodging, but each point of evasion the wearer has grants 0.75% damage reduction, combined with other reductions and capped at 75% total")));

        changes.addButton(new ChangeButton(new ItemSprite(new ElixirOfDragonKing()), ("New brew: Dragon King's Wrath"),
                (       "Once drunk, this elixir fills the drinker's veins with the power of ghostfire. It makes them completely immune to all fire, and lets their physical attacks set enemies alight with ghostfire.\n\n" +
                        "Recipe: Dragon King Breath Elixir + 10 alchemical energy")));

        changes.addButton(new ChangeButton(new ItemSprite(new GhostLingElixir()), ("New brew: Ghostfire Elixir"),
                ("Combining the volatile nature of ghostfire with the power of Chaos Crystals and Scrolls of Upgrade. Use it to wash thrown weapons, melee weapons or armor in a 3x3 area. Used on the hero, they also get 8 turns of invulnerability on top.\n\n" +
                        "Recipe: Chaos Crystal + Scroll of Upgrade + Ghostfire Potion + 8 alchemical energy")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.EXOTIC_AZURE), ("Dragon King Breath Elixir"),
                ("It no longer applies an enchantment; it is the upgraded version of Fire Dragon Breath Elixir.")));

        changes.addButton(new ChangeButton(new ShopkeeperSprite(), ("Regular merchants"),
                ("Regular merchants now warn the player once, then shut up shop and run off.")));

        changes.addButton(new ChangeButton(new SliceGirlSprite(), "Regular scoring",
                "[Dwarven General]\n" +
                        "- Mountain Splitter hitting the hero in the centre: -200 points\n" +
                        "- Taking the Useless Shield: -100 points\n" +
                        "- Defeating the boss: +7500 points\n\n" +
                        "[Lena]\n" +
                        "- Defeating the boss: from 1000 * (current floor / 5) to 3000 * (current floor / 5)"));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.KINGHTSTABBINGSWORD), "Swift Knight Rapier",
                "Improved the knight rapier logic and fixed this collectible letting Mirror Images and similar units attack endlessly in one turn."));

        Image ss =new ShubNiggurathSprite();
        ss.scale.set(PixelScene.align(0.4f));
        changes.addButton(new ChangeButton(ss, ("Shub-Niggurath"),
                "It was invincible this version, so it has been reverted to V0.9.5.1"));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.FORCE_CUBE), ("Thrown weapon changes"),
                (       "_-_ Naturally spawned thrown weapons can now roll level upgrades, curses or enchantments\n" +
                        "_-_ A level upgrade raises a whole stack of thrown weapons, not just one\n" +
                        "_-_ Durability scaling reduced: from +3x durability per level to +1.5x per level\n" +
                        "_-_ Upgrading fully restores durability, and thrown weapons can now be enchanted and cursed\n" +
                        "_-_ Natural spawn odds (without Remnant Scroll bonuses):\n" +
                        "Level bonus:\n" +
                        "_-_ +0: 80.00%\n" +
                        "_-_ +1: ~15.24%\n" +
                        "_-_ +2: ~4.44%\n" +
                        "_-_ +3: ~0.32%\n" +
                        "Other bonuses:\n" +
                        "_—_ cursed: 15%, positively enchanted: 7%, plain: 78%")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Misc improvements"),
                ("_-_ Message collapsing improved further\n" +
                        "_-_ Various UI and asset updates")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                ("V0.9.6.3:\n\n" +
                        "_-_ Fixed the Forest Crossbow and Sharpshooter damage not stacking\n" +
                        "_-_ Fixed the enraged Fire Witch robbery priority\n" +
                        "_-_ Fixed identical thrown weapons sometimes not stacking\n" +
                        "_-_ Fixed seed errors caused by Mio\n" +
                        "_-_ Fixed darts spawning with enchantments or levels\n" +
                        "_-_ Fixed the Heart of the Universe occasionally going negative\n" +
                        "_-_ Fixed the dynamic item sprite issue\n" +
                        "_-_ The Unsigned Invitation can no longer be dropped\n" +
                        "_-_ Fixed a deadlock on the Sakaban Fish floor in extreme cases"),
                ("V0.9.6.2:\n\n" +
                        "_-_ Fixed a turn order bug with one carrier\n" +
                        "_-_ Fixed the full size UI becoming unresponsive\n" +
                        "_-_ Fixed a crash when the field of view was null\n" +
                        "_-_ Fixed some multithreaded seed lookup errors"),
                ("V0.9.6.1:\n\n" +
                        "_-_ Fixed some logic checks in second generation weapon descriptions\n" +
                        "_-_ Fixed high lights containing a curse\n" +
                        "_-_ Fixed dynamic sprite rendering issues\n" +
                        "_-_ Fixed time acceleration not stopping after using an unblessed ankh at the Ancient God in Lonely City\n" +
                        "_-_ Fixed levelled thrown weapons not auto-filling the quickslot\n" +
                        "_-_ Fixed thrown weapons being cursed far too often due to the weapon enchantment logic")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
        changes.hardlight(Window.G_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(new DriedRose()), ("Withered Rose changes"),
                (       "After testing, the rose goes from 45 turns to 150 turns, which normal players can live with.")));

        changes.addButton(new ChangeButton(new ItemSprite(new WandOfAnmy()), ("Symbiosis Staff changes"),
                (       "The blessing is no longer limited to the Sewers; the first three regions all work.\n\n" +
                        "However it can no longer be transmuted, disassembled, put in the alchemy pot or infused")));

        changes.addButton(new ChangeButton(new ItemSprite(new YanStudyingPaperOne()), ("Yan's Research Manuscript I"),
                (       "This collectible now makes the potion holster undroppable.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight(Window.R_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(new WandOfGodIce()), ("Winter Spirit Frostfall Staff"),
                ("The great ice wand no longer freezes enemies on water instantly, though frostbite builds twice as fast on enemies standing in water")));
    }

    public static void add_V0960_Changes(ArrayList<ChangeInfo> changeInfos ) {

        ChangeInfo changes = new ChangeInfo("v0.9.6.0", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);
        changes.addButton(new ChangeButton(new Image("Ling.png", 0, 0, 16, 16), "A word from the developer",
                "v0.9.6.0 - finished 2026-09-21 23:59\n\n" +
                        "It has been a month since the last update. Work on the Tomb is still ongoing, but that has not stopped this update from being a big one!\n" +
                        "This update focuses on the big weapon overhaul and the thrown weapon rework, alongside plenty of smaller improvements for you to find.\n" +
                        "Also, the Mid-Autumn Festival, Ling's birthday and National Day trio is coming soon, some limited-time events will return, and more perks will be handed out by redeem code. Have fun!\n\n" +
                        "- MLPD lead developer: JDSALing\n" +
                        "Translation: Jiuzhu"));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.WATER_SWORD), ("Broken weapon overhaul - round two"),
                ("15 broken weapons are being replaced, and old saves will sync automatically.\n" +
                        "See the list below:\n\n" +
                        "T2 weapons:\n" +
                        "_-_ Long Dagger -> Kingslayer\n" +
                        "_-_ Short Sickle -> Spiked Wheel"),
                (
                "T3 weapons:\n" +
                        "_-_ Scimitar -> Dripper\n" +
                        "_-_ Round Shield -> Cursed Blade\n" +
                        "_-_ Kite Shield -> Rapier"
                ),
                (
                 "T4 weapons:\n" +
                        "_-_ Flail -> Exorcist Maul\n" +
                        "_-_ Longsword -> Lifesever\n" +
                        "_-_ Battle Axe -> Staff of All\n" +
                        "_-_ Katana -> Morningstar\n" +
                        "_-_ Assassin's Blade -> Dernor's Scythe\n" +
                        "_-_ Crossbow -> Compass Sword"
                ),(
                "T5 weapons:\n" +
                        "_-_ Greatsword -> Door Slab\n" +
                        "_-_ White Beam Sword -> Deep Sea Knight's Anchor\n" +
                        "_-_ Greataxe -> Doom Sceptre\n" +
                        "_-_ War Scythe -> Nailed Spear"
                )

        ));

        changes.addButton(new ChangeButton(Icons.get(Icons.AUDIO), ("New music: Styx Terror"),
                ("By Misogi\n\nBrand new music for the Castle's Cerberus. Enjoy.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SEED_AIKELAIER), ("Seed Finder - V4.0"),
                ("1.Power Search has been rebuilt and now supports multithreaded seed searching\n" +
                        "2.Improved the seed lookup threads so a stalled thread no longer freezes rendering")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.DOGSTICK), ("New item: Dog Whistle"),
                ("Chance to appear in shops once you have the Pet Me A Billion More Times hidden badge.\n" +
                        "Summons a Little Cerberus that can bark at enemies, though it does no real damage yet.\n\n" +
                        "We do have some ideas for a pet system, so expect it in a future version.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SHOVEL), ("New weapon: Shovel"),
                ("Tier 2, 12 Strength\n" +
                        "2-15 base, growth 1-3\n" +
                        "Killing an enemy with this weapon has a (20 + 3 * level)% chance to leave a pile of remains there, and no wraiths spawn when you open graves while holding it.\n" +
                        "Digs up the graves of the living.\n"),(
                        "Ability: Treasure Hunt.\n" +
                                "Costs 2 charge to dig up a regular chest on your tile. There is a 5% chance to dig up a golden chest you can open right away! At most 5 digs per floor.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.VOID_SWORD), ("New weapon: Void Sword"),
                ("Tier 4, 15 Strength\n" +
                        "6-30 base, growth 2-5\n" +
                        "After each attack it instantly pulls a random reachable enemy in sight to the tile in front of you.\n" +
                        "A powerful pull emanates from the blade, as if you stood inside a silent black hole."),
                (
                        "Ability: Singularity Collapse, costs all charge (at least 3),\n" +
                        "places a singularity at the target tile that roots enemies in a 5x5 area. Every 3 extra charge spent widens the area by one ring,\n" +
                        "and each turn every enemy and item in range is forced one tile toward the singularity.\n" +
                        "Each turn the singularity destroys adjacent or overlapping items; non-boss units touching it die instantly and grant no XP,\n" +
                        "while boss units touching it take (30 + 10 * lv) true damage and then cut 30 turns off its duration.\n" +
                        "Each point of charge spent on casting adds 6 turns to its maximum duration.")));

        changes.addButton(new ChangeButton(new ItemSprite(new DistressSignalNesting()), ("New system: dynamic sprites"),
                ("Three years in the making and carefully researched - all right, item animations are finally here.\n\nThis version ships with the Support Signal Kit and the Bomb Sword.\n\nExtremely cool.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.CATALOG), ("New system: effect codex"),
                ("A new effect codex in the catalogue lists every visible buff currently in the game, plus the total count of buffs used in Magic Ling Pixel Dungeon.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.WARNING), ("Error Report V3"),
                ("Added Android-specific ANR capture to make unresponsive issues easier to trace.\n\nNote: Android ANRs and desktop freezing are two different things - ANRs cannot trace desktop problems. If the PC version freezes, contact the team instead.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(new AikeLaier.Seed()), ("Lightning Flower changes"),
                (       "_-_ Lightning Flower healing changed to 10% of max HP, rounded up\n" +
                        "_-_ When the Lightning Flower or Radiant Dart makes one of your mobs elite, that effect now lasts at most 500 turns\n" +
                        "_-_ The Lightning Flower in Nature's Tread now needs 35% charge instead of 10% before it can be used")));

        changes.addButton(new ChangeButton(new ShopkKingSprite(), ("Robbery event improvements"),
                ("_-_ The Merchant Lord's shop now prices items off your deepest progress\n" +
                        "_-_ The Merchant Lord's shop restocking now costs 350 + 250 x restocks, counting the first as 0 and adding one each time\n" +
                        "_-_ After defeating the Murkflame Witch Lena, later robberies no longer use the frontline map and go straight to a special arena for quick choices and combat\n" +
                        "_-_ Purification Darts can no longer break Lena's shield")));

        changes.addButton(new ChangeButton(new ItemSprite(new WashCrime()), ("Absolution changes"),
                ("Max kill stacks raised to 100, with attack speed and bonus damage per stack reduced; wraith stat caps raised, so summons are stronger at high stacks.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.BADGES), ("Badge improvements"),
                ("On review, 13 former hidden badges were judged fit to leave the hidden badge group.\n\n" +
                        "Anyone who earned them on an older version is migrated to the regular badge group automatically.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Misc improvements"),
                ("_-_ Badges now page properly instead of crowding together\n" +
                        "_-_ All recent Android versions except the very old ones are forced into fullscreen mode\n" +
                        "_-_ Magic Ling now ships a non-password TAG, fixing Meizu screenshot and screen recording, and the secure keyboard problem on some devices\n" +
                        "_-_ The translation screen now shows progress for the current language as a percentage\n" +
                        "_-_ Because early difficulty design conflicts with current design, Easy mode has been removed after team discussion\n" +
                        "_-_ Full size mode is back on PC with its bugs fixed, so PC players get a better experience\n" +
                        "_-_ Various UI and asset updates")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                ("V0.9.6.0:\n\n" +
                        "_-_ Fixed serious crashes caused by inherited UI state\n" +
                        "_-_ Fixed serious crashes caused by some Shattered Ring priority checks\n" +
                        "_-_ Fixed Bzmdr's gift not resetting at the Dwarven General\n" +
                        "_-_ Fixed time acceleration not stopping after using an unblessed ankh at the Ancient God in Lonely City\n" +
                        "_-_ Fixed the UI above the backpack being click-through in full size mode\n" +
                        "_-_ Fixed Arcane enchantment not working on Ghostfire enchantment\n" +
                        "_-_ Fixed serious crashes caused by the Jiuzhu NPC"),
                (
                        "_-_ Fixed sub-floor boss resetting\n" +
                                "_-_ Fixed the choose 3 of 6 room being wrongly kept after a reset\n" +
                                "_-_ Improved the timing of the Mimic King's levitation buff removal; it now happens later\n" +
                                "_-_ Fixed the wrong relic backpack coordinates when the Mimic King dies in extreme cases\n" +
                                "_-_ Fixed some armor generator IDs not matching\n" +
                                "_-_ Fixed the game hanging while online redeem codes loaded for too long\n" +
                                "_-_ Fixed ammo farming with the Support Signal Kit\n" +
                                "_-_ Fixed Prismatic Light, Spirit Soil and Shockwave growth bugs, and fixed e-cigarette faction issues\n" +
                                "_-_ Fixed a crash from rendering child widgets before the game UI was ready"),

                (       "_-_ Fixed items being deleted incorrectly when the Celestial Brush devours equipped items\n" +
                        "_-_ The Gold Butterfly upgrade mechanic no longer deletes and re-returns the same item when transmuting into \"still itself\"\n" +
                        "_-_ Fixed gold being drained instead of granted by the Support Signal Kit\n" +
                        "_-_ Fixed the seed lookup log scene freezing or crashing from a stale static reference and a thread not being interrupted on exit\n" +
                        "_-_ Fixed a crash when closing the story popup from the log screen (bad cast in WndStory)\n" +
                        "_-_ Fixed a crash from mob coordinates going out of bounds under magical vision (bounds guard added, only reported with cheats/debug on)\n" +
                        "_-_ Fixed Anti-Magic Elites not getting their extra spell damage reduction"

                )));


        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight(Window.R_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(new CelestialBrush()),("Celestial Brush"),(
                "_-_ Max charge reduced by 1 at all levels, so fewer paintings can be stored\n" +
                        "_-_ The HP sacrifice needed for the level 2 upgrade went from 15 to 20\n" +
                        "_-_ Ancient Flame Hue max damage lowered to reduce the cone AOE burst; min damage rises slightly with level" +
                        "_-_ Passive charging formula changed: the brush recharges faster when nearly full, and slower than before when empty")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.WHITE_BAST), ("White Wave Rapier"),
                ("Growth reduced from 3-7 to 2-6.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.THEDIED), ("Quell"),
                ("The blink distance of the ability went from 5 tiles to 4")));

        changes.addButton(new ChangeButton(new MiniSakaFishBossSprites(), ("Ally system improvements"),
                ("Since some players were using this mechanic to body-block mobs (especially the Wealth), the following restriction has been added:\n" +
                        "An ally that acts on its own for 45 turns in a row dies immediately.\n" +
                        "\n\n" +
                        "Note: if you take any action on turn 44, the counter resets. Remember to act yourself - see the ally catalogue for details.")));

        changes.addButton(new ChangeButton(new ItemSprite(new StoneOfAggression()), ("Hostility Runestone"),
                ("Hostility Runestones now have half the effect on bosses.")));

        changes.addButton(new ChangeButton(new ItemSprite(new YanStudyingPaperOne()), (new YanStudyingPaperOne().name()),
                ("Rewrote this collectible's implementation; the old logic had issues.")));

        changes.addButton(new ChangeButton(new ItemSprite(new KingBag()), ("Backpack changes"),
                (       "_-_ The Leather Book Bag has been removed; books are now managed in the scroll holder\n" +
                        "_-_ The armored backpack has been removed; armor is now managed in the magic holster\n" +
                        "_-_ All backpack capacities are now a uniform 49 slots")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.LONGSWORD), "Some system improvements",
                  "_-_ Hero elite effects (various blessings) now count toward damage bonuses\n" +
                            "_-_ Those bonuses are now applied before armor is resolved\n" +
                            "_-_ Inner demon damage above 50 no longer also multiplies mob damage by 0.65\n" +
                            "_-_ The Strange Folder now applies the hero blessing buff for 200 turns\n" +
                            "_-_ Hero blessings are now a flat 200% damage bonus and a flat 50% damage reduction\n" +
                            "_-_ Enemies wearing a Ring of Fury no longer attack faster as the ring's level drops; they now speed up normally\n" +
                            "_-_ Blessing buffs that mirror elite effects now apply before armor is resolved when attacking\n" +
                            "_-_ The attacker's Witch's Whisper - Judgement and Blessing of Purity - Repose damage modifiers now apply before armor is resolved"));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
        changes.hardlight(Window.G_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(new CelestialBrush()),("Celestial Brush"),(
                "Harsh Winter Hue's slow lasts far longer now, making it a much better control tool")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.FORCE_CUBE), ("Thrown weapon upgrades"),
                (       "_-_ Naturally spawned throwables can roll upgrades, curses and enchantments\n" +
                        "_-_ An upgrade raises a whole stack instead of just one\n" +
                        "_-_ Durability per level drops from _+3x for one level_ to _+1.5x for one level_\n" +
                        "_-_ Upgrading now restores all durability, and throwables can now be enchanted and cursed")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.GOLDLANGGUN), ("Golden Spear"),
                ("The Golden Spear now carries a blessing that triggers when you hit a non-adjacent enemy with it")));

        changes.addButton(new ChangeButton(new ItemSprite(new DistressSignalNesting()), ("Support Signal Kit"),(
                "_-_ Using the kit now grants 12/24/36/48 stacks of Sniper Support (kit level 0/1/2/3)\n" +
                "_-_ Kit max charge changed from a fixed 1 to 1 at base, +1 per upgrade (4 at max), and upgrading tops it up\n" +
                "_-_ Each flare reloads the kit to its current max charge without exceeding it\n" +
                "_-_ Hunting Frenzy now consumes all remaining charge, each point giving 40 turns of effect (instead of a fixed 3 charge for 90 turns)\n" +
                "_-_ Sniper Support cooldown shortened from 8 turns to 4\n" +
                "_-_ Hunting Frenzy now fires Frost Slow, Armor-Piercing Incendiary or Electromagnetic Shock arrows at random enemies on the floor each turn. Each enemy can only be targeted by one arrow type per turn, the three cooldowns run in parallel and are tracked separately, priority is Frost > Incendiary > Shock, and the buff bar shows each sniper's cooldown\n"),
                (
                "_-_ Frost Slow arrows now chill for 5 turns\n" +
                "_-_ Armor-Piercing Incendiary arrows now burn for 2 + kit level turns\n" +
                "_-_ Electromagnetic Shock arrows leave a field for 3 + kit level turns, with a damage coefficient of 20/30/40/50%\n" +
                "_-_ The flare recipe no longer costs alchemical energy\n" +
                "_-_ Using the kit now costs 500 gold per use (both flares and Hunting Frenzy)\n" +
                "_-_ The kit's base price is now 500 gold\n" +
                "_-_ The kit cannot be used in the Castle (above floor 26); entering the Castle or unequipping, transmuting or devouring it ends Sniper Support and Hunting Frenzy early")));

    }

    public static void add_V0950_Changes(ArrayList<ChangeInfo> changeInfos ) {

        ChangeInfo changes = new ChangeInfo("v0.9.5.0", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);
        changes.addButton(new ChangeButton(new Image("Ling.png", 0, 0, 16, 16), "A word from the developer",
                "v0.9.5.0 - finished 2026-08-14 13:45\n\n" +
                        "Hard to believe the last Magic Ling update was two months ago. Lately the team has been working flat out on the Tomb.\n" +
                        "Along the way we made new friends, and as a stopgap update this version ships every winning entry from the early Jinghong Cup, along with a pile of bug fixes and improvements. Enjoy!\n\n" +
                        "- MLPD lead developer: JDSALing\n" +
                        "Translation: Jiuzhu"));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new KusumiSprites(), ("New NPC"),
                ("A mysterious girl of unknown origin and unknown history...")));

        changes.addButton(new ChangeButton(new KusumiMagicGirlSprites(), ("New NPC"),
                ("A mysterious girl of unknown origin and unknown history...")));

        changes.addButton(new ChangeButton(new ArchettoSprite(), "Xian event progress",
                "Xian seems to have new clothes lately...?"));

        changes.addButton(new ChangeButton(Icons.get(Icons.AUDIO), ("New music: Ice Ruins"),
                ("By Misogi\n\nBrand new music for region three. Enjoy.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SOS_3), "New item: Support Signal Kit",
                ("A sniper squad of three legendary marksmen sells these kits around here. Light the crystal inside and fire a usable flare into the sky, and they will lend a hand from the shadows. Their booking fee is the price of this little box.\n" +
                        "\n" +
                        "+0: an oak box holding a single magic crystal. Light the crystal before firing a flare or it does not count.\n" +
                        "+1, same as +3: compared to the standard version the crystal is clearer and the box is edged with gold patterns.\n" +
                        "+2, same as +7: a finely carved mahogany box with a blue magic crystal resting on velvet.\n" +
                        "+3, same as +10: a finely carved crystal box with a red magic crystal on velvet. The inside of the lid lists the platinum collector's edition hidden package they offer.\n" +
                        "\n" +
                        "This item can only be bought in shops for 1500 gold. Talk to the shopkeeper to upgrade it to +1/+2/+3 for 500/1000/1500 gold.\n" +
                        "\n" +
                        "Liquid Fire Potion + Levitation Potion + Alchemical Catalyst + 5 alchemical energy brews a flare, and flares have a load button that loads them into the kit.\n" +
                        "\n"),
                (
                        "The kit holds only 1 charge and is loaded with flares. It comes with 1 charge when bought, and each shop upgrade adds one extra flare.\n" +
                        "\n" +
                        "Using it grants 6/11/17/17 stacks (0/+1/+2/+3) of the \"Sniper Support\" buff.\n" +
                        "\n" +
                        "Sniper Support: every 15 turns a random enemy in your sight takes a sniper hit. The damage type is random among the three and scales with floor. If no enemy is in sight when the cooldown ends, it triggers the moment one appears.\n" +
                        "\n"),(
                        "Frost Slow Arrow: deals (floor ~ 10 + floor/2) damage and 10 turns of frost. At floor 21 the bounds flip.\n" +
                        "\n" +
                        "Armor-Piercing Incendiary Arrow: deals (5 + floor ~ 10 + floor) damage, ignores armor and sets the enemy alight with ghostfire.\n" +
                        "\n" +
                        "Electromagnetic Shock Arrow: deals (floor ~ 10 + floor/2) damage and leaves a 5 turn electric field at the impact point. At floor 21 the bounds flip.\n" +
                        "\n" +
                        "When the kit is upgraded to +3 its charge rises to 3, and once loaded you can fire 3 flares at once for 75 turns of the \"Hunting Frenzy\" buff.\n" +
                        "\n" +
                        "Hunting Frenzy: every 4/7/10 turns it fires Frost Slow / Electromagnetic Shock / Armor-Piercing Incendiary arrows at random enemies on the floor. All three cooldowns run in parallel and separately, and the buff details show each sniper's cooldown.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SKY_PEN_PLUS), "New artifact: Celestial Brush",
                ("This brush radiates a colour that has already faded, and it is said only it can paint the lost gods - for once a god dies, its colour is nowhere to be found.\n" +
                        "\n" +
                        "Not maxed: the brush's own magic can create a few \"paintings\", but its power has not fully returned. Perhaps you should offer up your respect for the past...\n" +
                        "Maxed: the brush's magic can create \"paintings\", and its power has fully returned. You have offered all your respect, and every lost colour now flows from the brush once more.\n" +
                        "\n" +
                        "Cursed effect: identifying items is twice as slow, passive trap detection is halved, and normal sight is reduced by 1 tile.\n"),(
                        "\n" +
                        "Painting:\n" +
                        "Ancient Flame Hue - the brush releases the flames it has outlived, sending a wave of fire to burn nearby enemies. The range matches a Flamewave Staff of the same level, damage is 8~16 * (1 + the artifact's effective level), and it applies 1 + effective level/2 turns of cripple.\n" +
                        "\n" +
                        "Harsh Winter Hue - the brush releases the winter it has outlived, exhaling frost that stops enemies in their tracks. Releases a blizzard at the target tile, slowing enemies in a 3x3 area for 2 + effective level turns; aimed as a projectile.\n" +
                        "\n" +
                        "Skyline Hue - the brush releases the dream it has outlived, cloaking itself in the shadow of dreams. Creates night mist around you with a gas amount of 100 + effective level * 25.\n" +
                        "\n" +
                        "Use:\n" +
                        "The brush stores energy as charge, up to 3 + effective level, gaining one charge every (120 - effective level*5 - lost charge*8) turns. Each painting costs exactly one charge.\n" +
                        "\n"),
                (
                        "The effective level caps at 4 and displays as +2/+5/+7/+10.\n" +
                        "\n" +
                        "Upgrade:\n" +
                        "The brush must be fed the following in order to offer up your memories -\n" +
                        "1.An Ice Blast brew (the brush craves a memory of cold; offer an Ice Blast brew)\n" +
                        "2.An identified, uncursed weapon of tier 2 or higher upgraded at least +2 (the brush craves a memory of dread; offer a fine weapon)\n" +
                        "3.15 points of max HP (the brush craves a memory from before birth; offer a part of yourself)\n" +
                        "4.An identified, uncursed ring upgraded at least +2 (the brush craves a memory of pride; offer a fine ring)\n" +
                        "\n" +
                        "Each upgrade confuses the player for 50 turns, and trying to upgrade again while confused shows \"You are lost in memory and cannot bring yourself to do it.\"\n" +
                        "\n" +
                        "Artifact charging: 0.1 charge per turn.")));

        changes.addButton (new ChangeButton (HeroSprite.avatar (HeroClass.MAGE, 13), "New skin: Academy Days",
                "Price: 1500 cobalt coins\n\nOriginal design: Priestess\n\nArt: Noah-7385 & Daniel-Calan\n\nJasmine's uniform from her time at the mage academy, where she was one of the very best students. Rumor has it she spent her days alone in the deepest part of the library, studying long-lost ancient spells..."));

        changes.addButton( new ChangeButton( new TalentIcon(Talent.TESTED_HYPOTHESIS), Talent.TESTED_HYPOTHESIS.title(),
                "Mage tier 1 talent Experimental Hypothesis replaced with Flash of Insight"));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton (new ChangeButton (new ItemSprite(ItemSpriteSheet.BEACON), "Skin removal notice",
                "Because the artist behind the Dinner Invitation and Devoted Scribe skins went off the rails on their own, the team has permanently ended the partnership and permanently removed everything connected to them.\n" +
                        "We are deeply sorry to players who loved those two skins, but this was outside our control. Anyone who already owned Dinner Invitation will receive the new Academy Days skin free after the update.\n" +
                        "Anyone who already owned Devoted Scribe will automatically be granted 500 cobalt coins when they launch the game after the update."));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SCROLL_GOLD), ("Gold Butterfly Mode V2.5"),
                (
                        "Gold Butterfly Mode - V2.5\n\n" +
                                "_-_ Improved artifact transmutation in Gold Butterfly; only unequipped artifacts can be transmuted now\n" +
                                "_-_ Talking to the fox in Gold Butterfly has a chance to grant a brand new special weapon and unlock a special mode!")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                ("V0.9.5.0:\n\n" +
                        "_-_ Fixed a serious bug where the White Wave Rapier ability could target walls, work at unlimited range and cost no charge\n" +
                        "_-_ Added a check to the Pale Wreath: it can no longer be taken by the Mimic King or the Murkflame Witch, so this cannot be used to cheese achievements\n" +
                        "_-_ Fixed carrying bzm's gift stopping lights from increasing your sight\n" +
                        "_-_ Fixed the Diamond Greatsword and Soft Chime Bell gaining fake upgrades under the Grandmaster's \"Companion Strengthening\" talent; the virtual level is now display only and no longer wrongly affects stats or effects\n" +
                        "_-_ Fixed the Witch's Mark - Murkflame Blessing effect; it is described as 20% damage reduction from all sources, but had wrongly implemented immunity to spell damage. It is now the correct 20% reduction\n" +
                        "_-_ Fixed some design issues with the Scroll of Soul and a bug with the Diamond Greatsword ability\n"),
                (
                        "_-_ Fixed some Lena boss skills potentially softlocking players\n" +
                        "_-_ Fixed pathfinding in extreme cases permanently corrupting a save; loading a save with this version restores it\n" +
                        "_-_ Fixed getting stuck in a room during the Castle full search teleport; as on floor 0, tapping now teleports you back to the search entry point\n" +
                        "_-_ Fixed the Shard of Space interacting with the three Castle minigames and causing various problems\n" +
                        "_-_ Fixed a serious bug where the great ice wand softlocked the game at high levels by cutting speed to 100%\n" +
                        "_-_ Fixed a serious bug where some Honorata skills could crash the game\n" +
                        "_-_ Fixed misaligned sprite dimensions on the Reed Flute\n" +
                                "_-_ Fixed the Ring Enhancement talent not applying to some artifacts")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.BROKEN_RING), "Shattered Ring - T3 - buffed",
                Messages.get(BrokenRing.class,"desc")));


        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight(Window.R_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.ARTIFACT_CAPE), "Cloak of Thorns",
                "_-_ Direct physical damage reduced from level to level/2\n" +
                          "_-_ Thorn force field radius reduced from level/2 to level/4, _rounded up_\n" +
                          "_-_ Activating the thorn force field while invisible now breaks invisibility"));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.FAINT_GLIMMER), "Flawless Glimmer - T3 - nerfed",
                Messages.get(FaintGlimmer.class,"desc")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.HELL_BUTTERFLY), "Purgatory Red Butterfly - T3 - nerfed",
                Messages.get(HellButterfly.class,"desc")));
    }

    public static void add_V0948_Changes(ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.9.4.8-9", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);
        changes.addButton(new ChangeButton(new Image("Ling.png", 0, 0, 16, 16), "A word from the developer",
                "v0.9.4.8 - finished 2026-06-18 23:45\n\n" +
                        "The last time I wrote one of these was 2023-10-06. Nearly three years have flown by.\n" +
                        "The clueless student I was has come a long way - out to the country's borders and through its busiest cities.\n" +
                        "I have seen every walk of life and tasted plenty of setbacks, but I never wanted to stop walking, pushing on like a weed that will not be trampled.\n\n" +
                        "Looking back, Magic Ling Pixel Dungeon has grown from an unremarkable little mod into a name of its own in the dungeon community, and that genuinely delights me.\n" +
                        "What warms me more is that the team keeps growing, with more and more people joining:\n" +
                        "Bzmdr, Kuzumi, Sotis, Sothoth, Shoudian\n" +
                        "Daniel Calan, Jishen, Quanluo, Xiaoye, Archetto and the rest of the team\n\n" +
                        "And every group member and player who has come along with us - you are the whole reason Magic Ling keeps going. Without you there would be no Magic Ling as it is today.\n\n" +
                        "I turn 23 this year, and in a few more years life may not leave me time to update this often or stay active in the community.\n" +
                        "But that day is still far off and there is endless time worth treasuring now. May we all live each day well.\n\n" +
                        "This update cycle ran long and I apologize - real life has been hectic lately and has eaten a lot of development time.\n" +
                        "The update is not huge in volume, but there is plenty to dig into. Once it is out, the project moves into focused development of the Lost Tomb DLC.\n" +
                        "When we next meet, I hope we can talk again over the Tomb version. Until then, happy exploring!\n\n" +
                        "- MLPD lead developer: JDSALing"));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ArchettoSprite(), "Xian event changes",
                "Giving Xian something precious now grants a _Scroll of Soul_."));

        changes.addButton (new ChangeButton (new ItemSprite(ItemSpriteSheet.BEACON), "New item: Dream Communicator",
                "A fully hidden item that can only be obtained from another dimension (redeem code). It can be exchanged for any one outfit skin."));

        changes.addButton (new ChangeButton (new ItemSprite(ItemSpriteSheet.SKIN_14), "New skin: Maid Red Fox",
                "Price: 1500 cobalt coins\n\nCredits: Priestess & Sothoth & Daniel Calan\n\nThe coffee is ready by the fire - would master care for a cup and a rest?"));

        changes.addButton (new ChangeButton (HeroSprite.avatar (HeroClass.DUELIST, 14), "New skin: Cleopatra",
                "Price: 1500 cobalt coins\n\nCredits: Baicai & Sothoth & Daniel Calan\n\nThe desert wind carries the glint of gold, and the queen of the oasis awaits you."));

        changes.addButton (new ChangeButton (HeroSprite.avatar (HeroClass.DUELIST, 7), "Weapon abilities - round two",
                "The following weapons gained abilities:\n" +
                        "King's Greatsword, Inverted Tree of Life, Diamond Greatsword, Jungle Sting, White Wave Rapier, Grilled Herring, Glutinous Greatsword, Five-Nut Mooncake,\n" +
                        "Red Demon Greatsword, Imperial Sword, Cooked Imperial Sword, Bloodthirsty Thorns, Bomb Dagger, Quell, Heavy Ballista, Absolution, Charon's Oar, Seeking Spear, Dragon Scale \n\n" +
                        "Enjoy!"));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.HHBlade), "New boss weapon: Diamond Greatsword",
                "Guaranteed on your first kill of the Mimic King if you have not beaten it yet. Afterwards it joins the spawn pool and the Mimic King has a small chance to drop it.\n\n" +
                        "Weapon data:\n\n" +
                        "The Mimic King's blade, a greatsword cut from diamond - beautiful and deadly.\n" +
                        "A trace of the Mimic King's magic clings to it. That limits it somewhat, but it seems to bring a fine effect as well\n" +
                        "Tier 4, 5-25, growth 1-6, 1.5 delay, 2 reach, 17 Strength\n" +
                        "Deals physical damage to targets 1 tile away and applies poison for 1/5 of the damage in turns\n" +
                        "Deals spell damage to targets 2 tiles away and applies bleeding for 1/5 of the damage in turns\n" +
                        "\n" +
                        "Cannot gain extra attack range"));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.KING_SWORD), "New boss weapon: King's Greatsword",
                "Guaranteed the first time you complete the \"Sovereign Without a Blade\" achievement at the Dwarf King, if you have not yet earned it. Afterwards it joins the spawn pool and the Dwarf King has a small chance to drop it.\n\n" +
                        "Weapon data:\n\n" +
                        "The Dwarf King's ceremonial blade. It is a true heavy sword for a dwarf, and even so it takes some effort to swing\n" +
                        "Deals 50% more damage to demons and elites\n" +
                        "Has a 40% + level x 5 chance to inflict vulnerable on the enemy for 5 + level/2 turns\n" +
                        " Tier 4, 17 Strength, growth 1-7, 1.5 base delay, 10-35 base damage\n" +
                        "Note: this weapon is an iteration of the Sage's Sword, and old saves sync automatically!"));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.JUNGLE_SWORD), "New boss weapon: Jungle Sting",
                "Guaranteed on your first kill of Clivus, Will of the Forest, if you have not beaten it yet. Afterwards it joins the spawn pool and Clivus has a small chance to drop it.\n\n" +
                        "Weapon data:\n\n" +
                        "A sturdy branch torn from the Fruit of Clivus, steeped in potent venom and the power of those tentacles. It swings nicely, though it is not especially sharp\n" +
                        "Tier 3, 6-12, growth 1-2, 0.5 delay\n" +
                        "1 reach, 14 Strength\n" +
                        "Each attack stacks (2 LV + 3) poison\n" +
                        "Once poison stacks reach a third of the target's max HP, the target is entangled and blinded for as many turns as it has poison stacks\n" +
                        "Note: the Tree of Life was reworked as well"));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.ARTIFACT_CAPE), ("Artifact rework: Cloak of Thorns"),
                ("Upgrades like the Shadow Cloak (10% charge equals 1 cloak charge), used actively, can be switched off, charge is percentage based\n" +
                        "Natural charging 4t/1%, taking damage adds (that damage/2)%, artifact charging 1t/5%\n" +
                        "\n" +
                        "Use costs 1t/5%\n" +
                        "\n" +
                        "While active it grants (20 + 2 LV)% to (30 + 4 LV)% damage reduction\n" +
                        "While active it deals LV physical damage each turn to enemies in a circle of radius (LV/2, rounded down) and applies 1.5 LV turns of bleeding (does not stack; take the highest)\n" +
                        "\n" +
                        "Being hit reflects the raw damage back at the attacker and stacks LV turns of bleeding")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.MAGNETIC_CROWN), ("New artifact: Crown of Gravity"),
                ("Wearing this crown you feel a faint magnetism in space, a force that might drag you and other creatures toward some point...\n" +
                        "\n" +
                        "Using it costs 1 charge: tap any visible tile and the unit closest to that tile is dragged there, moving at most 3 + level*0.5 tiles per use this way.\n" +
                        "(If distances tie, enemies are pulled first)\n" +
                        "\n" +
                        "Gaining 10 XP when a one-shot trap in sight is triggered levels the artifact up every 50 + 7 * level XP.\n" +
                        "Starts with 3 charge, max 10, and each level adds one max charge. Recovers one charge every 50 - level turns.\n" +
                        "\n" +
                        "Artifact charging recovers 0.3 charge per turn.\n" +
                        "Cursed effect: cannot be used.")));

        changes.addButton( new ChangeButton( new TalentIcon(Talent.RUNIC_TRANSFERENCE), Talent.RUNIC_TRANSFERENCE.title(),
                "This talent now has transmutation paths for other heroes; see that hero's metamorphosis description for details."));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.FLOWERY), "New book: Chronicle of Elements",
                        "High chance to grant magical vision, low chance to grant an elemental blessing.\n" +
                        "It can appear in the Memory Shop, and when it does the Codex of the Verdant Sanctum will not appear in that shop"));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SEED_AIKELAIER), ("Seed Finder V3.1"),
                ("1.Power Search removed\n" +
                        "2.Fixed the search sometimes hanging\n" +
                        "3.Multithreading speeds up lookups (also why Power Search is gone)\n" +
                        "4.Lookups now show which floor the item is on")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.ARTIFACT_HORN4), "Horn of Plenty",
                "Storing food now jumps straight to the food bag!"));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.RANDOM_CHEST), "Save extraction system",
                "Since the 0.9.4.8 save crashes were frequent but save cloning caused too many problems, this was added: if you really need an old save, extract it yourself and contact us for a manual restore."));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.LONGSWORD), "Damage system v0.3",
                "True damage now breaks shields, so be very careful!"));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.LANTERNB), "Lights Ahead: v3.3",
                "Below 25 lights, regular mobs no longer drop items."));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.RING_DIAMOND), "Ring rework",
                "The four rings of Tenacity, Elements, Accuracy and Evasion were weak in practice, so this update folds them into two brand new rings:\n\n" +
                        "_-_ Ring of Sanctuary: grants both Tenacity and elemental resistance\n" +
                        "_-_ Ring of Focus: improves both accuracy and evasion\n\n" +
                        "Note: the old rings in existing saves convert automatically. If an effect fails, unequip and re-equip the ring to fix it."));

        changes.addButton(new ChangeButton(Icons.get(Icons.DISPLAY), ("UI improvements"),
                ("_-_ Buff display improved, with special thanks to Shower for the help\n" +
                        "_-_ Boss health bars synced to Shattered 3.3.8, with animations added, and the small health bars now match\n" +
                        "_-_ Various UI screens updated")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                ("V0.9.4.9:\n\n" +
                        "_-_ Fixed various errors caused by old save compatibility\n" +
                        "_-_ Fixed some crashes with the Crown of Gravity\n" +
                        "_-_ Fixed mobs not dropping anything\n" +
                        "_-_ Fixed the Huntress third skin dealing wrong damage\n" +
                        "_-_ Fixed the hero's sight being wrong with Bzmdr's gift\n" +
                        "_-_ Fixed the Blood Chalice being usable to sacrifice while Thorns is active\n" +
                        "_-_ Fixed stat display errors on some rings\n" +
                        "_-_ Fixed the hero sprite missing 1px, a quirk from watabou (2014-07-27) addressed 4349 days later\n" +
                        "_-_ Fixed some badges failing to display\n" +
                        "_-_ Fixed metamorphosis talent text not showing\n"+
                        "_-_ Zongzi spawn chance lowered to 0.85f, a little rarer than a meat pie, instead of the previous weight of 3"),
                (	    "V0.9.4.8:\n\n" +
                        "_-_ Fixed the Strange Fruit floor explosion destroying items\n" +
                        "_-_ Fixed teleport traps and Shards of Space on Boss Rush floor 1 deleting items on the ground around you (3x3 area) as they teleported\n" +
                        "_-_ Removed multi-boss health bars, as they caused many crashes\n" +
                        "_-_ Fixed some text on the Oil Well\n" +
                        "_-_ Fixed the Stardust collectible halving the duration of every active effect\n" +
                        "_-_ Fixed the merchant sabre also getting a discount when resold\n" +
                        "_-_ Fixed the new floor 0 letting you use the return pillar crystal\n" +
                        "_-_ The Heart of the Creator can no longer be blessed\n" +
                        "_-_ Fixed recent tickets, crashes and related issues")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight(Window.R_COLOR);
        changeInfos.add(changes);

        Image s =new CrivusStarFruitsSprite();
        s.scale.set(PixelScene.align(0.8f));
        changes.addButton(new ChangeButton(s, ("Strange Fruit changes"),
                ("_-_ The phase two tentacles can now be attacked, and attacking them gives the hero a little spirit vision, which is removed when the Strange Fruit fight ends (however many turns you had left)\n" +
                        "_-_ The Strange Fruit gained the Jungle Sting boss weapon")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.GREENBOOKS), "Codex of the Verdant Sanctum changes",
                "Its regular effect changed to granting 0-20 barkskin."));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.WAND_HAND_CONTROL), "Mage Hand changes",
                "Since the Mage Hand is slightly overtuned, its shared hero sight has been removed."));

        changes.addButton(new ChangeButton(new PumkingBomberSprite(), "Pumpkin Gingerbread Man changes",
                "Since it currently softlocks badly with Time Bubbles and that cannot be fixed quickly, in Hard Mode it now dies automatically, though it grants no XP."));

    }

    public static void add_V0945_Changes(ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.9.4.5", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.AUDIO), ("New original music: Palace Council - General"),
                ("Music for the Dwarven General has officially arrived.\n\nBy Tatsro")));

        changes.addButton( new ChangeButton(HeroSprite.avatar(HeroClass.MAGE, 1), "Key art update",
                "The default skin's key art has been updated"));

        changes.addButton(new ChangeButton(new ShopkKingSprite(), ("Shop robbery improvements"),
                ("If you pick up the Tome of Return you cannot go through with a robbery.")));

        Image s =new CrivusStarFruitsSprite();
        s.scale.set(PixelScene.align(0.8f));
        changes.addButton(new ChangeButton(s, ("Strange Fruit improvements"),
                ("It now leaves a delayed explosion on death.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                (	    "V0.9.4.5:\n\n" +
                        "_-_ Fixed a crash from a possible null pointer in the Greater Lightning Staff ARC effect\n" +
                        "_-_ Fixed the Disintegration Staff not piercing damage immunity\n" +
                        "_-_ Fixed the Hell Red Butterfly in the following cases\n" +
                        "_-_ 1.Ghostfire Darts hitting an Illusion Barrier Crystal can now apply hellfire\n" +
                        "_-_ 2.Hellfire can now clear the phase three shield of the Strange Fruit\n" +
                        "_-_ Fixed the Telescope collectible breaking the thrown item panel\n" +
                        "_-_ Fixed recent crashes")));
    }

    public static void add_V0942_Changes(ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.9.4.2", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.LANGS), ("Language update: Traditional Chinese"),
                ("The Traditional Chinese pack from Sotis has been updated\n\nCurrent Traditional Chinese pack version: 2026/4/16")));

        changes.addButton( new ChangeButton(new BuffIcon(BuffIndicator.ANCIENT_SURVEY, true), "Ancient Ruins buff",
                "Playing Ancient Ruins now shows your investigation points live."));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.INFO), ("Damage system v0.2"),
                ("Fixed the damage system defaulting to the magic damage icon; the actual damage source was always correct.\n\nTrue damage also has its own icon now: a green sword")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                (	    "V0.9.4.2:\n\n" +
                        "_-_ Fixed a crash from a possible null pointer in the Lightning Staff ARC effect\n" +
                        "_-_ Fixed a possible null pointer in hero armor that crashed the game\n" +
                        "_-_ Fixed some potential issues in multi-boss health bar rendering\n" +
                        "_-_ Fixed crashes after the badge update for some very old saves, though badges from extremely old versions may be voided\n" +
                        "_-_ Fixed some potential crashes with the Glutinous Greatsword\n" +
                        "_-_ Fixed some Ancient Ruins mob skills after the damage system change\n" +
                        "_-_ Improved the Mage Hand catalogue display requirements\n" +
                        "_-_ Improved the low-level teleport code")));


        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight(Window.R_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new NyarlathotepSprite(), ("Nya changes in the Castle"),
                ("Nyazaki's generated traps no longer include disarming traps")));
    }

    public static void add_V0940_Changes(ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.9.4.0-1", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.LANGS), ("Language update: English"),
                ("The English translation has been updated, reviewed by PDTR and the English team. There may still be issues, but coverage has reached 95%")));

        changes.addButton(new ChangeButton(Icons.get(Icons.AUDIO), ("Music changes"),
                ("Magic Ling Pixel Dungeon music is being replaced with original tracks, so some music has changed.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.BADGES), ("New hidden badge"),
                ("A new hidden badge is live. Play the game to earn it!\n\n" +
                        "Hidden badge: Walk With You")));

        changes.addButton(new ChangeButton(Icons.get(Icons.NEWS), "Online redeem code system",
                "The brand new online redeem code system is live; claim rewards through the Luobai Shop or the game menu.\n\n" +
                        "From 0.9.4.0 on, redeem codes are announced in game news and official group updates."));

        changes.addButton(new ChangeButton(Icons.get(Icons.CATALOG), "Leaderboard favorites",
                "Leaderboard favorites are live, so you can bookmark runs you care about.\n\nUp to 20 entries"));

        changes.addButton(new ChangeButton(new DogDogMusicSprite(),"Floor 0 content update",
                "Work on the regular floor 0 continues, with lots of new NPCs and interactions.\n" +
                        "- New floor 0 NPCs: Quan, A-Shen, Stillness\n" +
                        "- Bolü appears at the inn 30% of the time each run\n" +
                        "- Quanluo always appears at the inn\n" +
                        "- The inn's four tables now have random NPC line-ups"));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CICRE_MUSIC), "New weapon: Soft Chime Bell",
                "Moving breaks the ringing combo.\nAttacks ring out the \"soft chime\", and consecutive attacks stir an \"echo\""));

        changes.addButton(new ChangeButton(new KusumiSprites(), "Jiuzhu event progress",
                "Jiuzhu's story continues to grow, with new events waiting to be found."));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.HELL_BUTTERFLY), "New collectible: Purgatory Red Butterfly",
                "You gain immunity to <#E5579A>ghostfire and hellfire<RGB>, and when the enemy would be given _ghostfire_ it becomes <#E94134>hellfire<RGB> instead. Mobs carrying hellfire take <#E94134>20% of max HP<RGB> as magic damage each turn; for mobs with no <#E94134>elite or mutation traits at all, the damage type becomes true<RGB>.\n\nOn boss units hellfire instead deals <#E94134>20 magic damage<RGB> per turn and clears any shield they have. Hellfire spreads like ghostfire.\n\n\"Type 1 for a free hellfire\"\n\n\"Just kidding, it is free either way. Hee hee.\""));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SPACE_DEBRIS), "New collectible: Shard of Space",
                "A fragment torn from somewhere in space, and it seems its power cannot be borrowed...\n\nEvery <#52B9D8>50 turns it teleports you randomly on your floor (never into a room sealed by a key door)<RGB>. If you teleport across floors yourself, you shift 3 floors from where you would have landed (you do not enter a new floor).\n\nWhile you hold it, every shard teleport, Scroll of Teleportation, or teleport/wormhole/warping trap <#52B9D8>costs 10% of your current HP<RGB> (fatal at 1 HP), and shard teleports also grant <#52B9D8>2 turns of daze<RGB>"));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.EASTER_EGG), "Tomb-Sweeping + Easter double event",
                "The Tomb-Sweeping limited Easter event is open, with matching rewards for taking part."));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SHOP_SWORD), "New weapon: Merchant Sabre",
                "The Merchant Sabre is in and automatically replaces the hand axe in old saves.\n\nIt is normally a prop merchants use to prove who each other are, but in a pinch you can wield it as a weapon.\n\nThis weapon currently gets you a 10% merchant discount, up to 90%%."));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.UNLESSFLOWER), "New item: Undying Wreath",
                "A wreath that looks to be woven from unknown flowers and tough vines. You can barely feel its weight on your head.\n\nA brand new ankh-type item; it has the highest priority on death"));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new MoonCatSprite(), "Floor 0 NPC rules",
                "Innkeeper: after 13 or more challenges she grants an extra purification potion\n\n" +
                        "The following are standard and need no challenges:\n"+
                        "Table one (2 random): Rainy Night, Little Knight, Xiaomeng\n" +
                        "Table two (2 random): Yuehua, Fox, Magic Sheep, Nyanon Momiji\n" +
                        "Table three (2 random): Ziling, Lil' Blue, Deep Sea, Qianyue Shenbai\n" +
                        "Table four (Dou Dizhu regulars): Xiaoye, Kotori, Choco"));

        changes.addButton(new ChangeButton(new ATRISprite(), "Floor 2 NPC spawns",
                "Mio: chance to appear, no restrictions\n" +
                        "Room 2: Luobozi is always there, and rations can be traded for skins\n" +
                        "Room 1: 30% chance of Lena (after the robbery event), rewarding a Flame Potion\n" +
                        "Room 3: 30% chance of Dongling (after beating the Frost Witch), rewarding a Frost Potion"));

        changes.addButton(new ChangeButton(new SliceGirlSprite(), "Castle scoring",
                "[Cerberus]\n" +
                        "- Rabid Pounce hitting the player: -200 points\n" +
                        "- Each Clot Crystal absorbed: -100 points\n" +
                        "- Defeating the boss: +6000 points\n\n" +
                        "[Morpheus]\n" +
                        "- After the minigame: gain total score x 0.25\n" +
                        "- Mechanical Pillar projectile hitting dead centre: -300 points\n" +
                        "- Pillar of Time laser hit: -400 points\n" +
                        "- Banishing the boss: +10000 points"));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                (	    "V0.9.4.1:\n\n" +
                        "_-_ Fixed the Shard of Space teleport not being fatal at 1 HP\n" +
                        "_-_ Fixed Faina not spawning on floor 0\n" +
                        "_-_ Fixed Shard of Space teleports draining HP many times over and dropping health fast\n" +
                        "_-_ Fixed the guide book not spawning on floor 0\n" +
                        "_-_ Fixed buying items back from a merchant costing no gold\n" +
                        "_-_ Fixed inconsistent alchemical energy values in the alchemy guide\n" +
                        "_-_ Fixed the Soft Chime Bell weapon effect\n" +
                        "_-_ Fixed the floor 0 outfit voucher not spawning\n" +
                        "_-_ Fixed Stillness not spawning in Lonely City\n" +
                        "_-_ Fixed Xiaoye wrongly spawning at the Dwarven General")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                ("_-_ Fixed the Lucky Gloves buyback bug\n" +
                        "_-_ Fixed cheesing boss floors with the Glimmer Guide\n" +
                        "_-_ Fixed the Useless Shield having no effect\n" +
                        "_-_ Improved some low-level dungeon code\n" +
                        "_-_ The developer mode status viewer now shows regular and combined drop rates\n" +
                        "_-_ Improved the Strange Fruit floor check so allies can be summoned on floors that are not locked\n" +
                        "_-_ Absolute blindness is now live\n" +
                        "_-_ Renamed the new battlemage: Celestial Maiden\n" +
                        "_-_ Fixed being unable to pick up the Tangible Hand's wand on the Pac-Man map\n" +
                        "_-_ Fixed the Heart of the Creator leaving you undead\n" +
                        "_-_ Fixed drop errors with Symbiosis and Rouge items\n" +
                        "_-_ Fixed non-secret Castle endings not granting the challenge badge\n" +
                        "_-_ Fixed some Ghostflame Dart issues\n" +
                        "_-_ Fixed Xiaoye blocking stairs across saves")));

        changes.addButton( new ChangeButton(new Image(Assets.Environment.TILES_SEWERS, 48, 80, 16
                , 16), "Room and event changes",
                        "Improved the Insight Gravestone room and the Black Soul event\n\n" +
                                "Triggering either event now leaves a matching hint in an unblessed ankh"));

        changes.addButton(new ChangeButton(Icons.get(Icons.CHALLENGE_ON), ("Potion Hysteria v0.4"),
                ("The All-Meat Flatbread now shows the chance range for activating Strength.")));

        changes.addButton(new ChangeButton(new RivalSprite(), ("Black Soul event"),
                ("Below 40 lights, black souls appear on unblessed ankhs. You can see them now, and their description has been improved too")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SKELETONGOLD), ("Bloodstained Coin control terminal"),
                ("Your selections persist now, so you no longer re-tick bosses every run.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight(Window.R_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.WARNING), "Delayed content",
                "The Crab King boss update is delayed; its release date will be decided later."));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SPACE_DEBRIS), "Shard of Space",
                "Only intentional teleports cost HP now, and the range is 8-15%"));

        changes.addButton(new ChangeButton(new FodderSprite(), "Demon Feast",
                "Because of how its AI works, when Rouge triggers Fallen Demon Feast the feast now dies immediately."));

        changes.addButton( new ChangeButton(new TalentIcon(Talent.STRONGMAN), "Talent changes",
                        "Overwhelming Force change:\n" +
                        "Fixed an Overwhelming Force bonus bug that let a bug at +1 give it full accuracy."));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CATGIRL_COSPLAY), "Catgirl cosplay",
                "Trigger chance from 12% to 3.25%"));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.BROKENBONE), "Broken Bone",
                "Lucky drop changed from 30% to 70%"));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.BROKEN_RING), "Shattered Ring",
                "We are reworking how this collectible feels, so it is temporarily removed from spawning this version"));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.BOMB), "Bomb buffs",
                "Shock Bomb renamed Thunder Bomb, Arcane renamed Arcane Phosphor Bomb"));

        changes.addButton(new ChangeButton(Icons.get(Icons.UP_DICT), "Indirect Shattered sync",
                "_-_ Synced the Torrent enchantment effect\n" +
                        "_-_ Synced Flamewave, Shockwave, Lightning and battlemage skills\n" +
                        "_-_ Greater Lightning and Ghostfire battlemage skills iterated to match Lightning and Flamewave\n" +
                        "_-_ Synced new Shattered trinkets: Ferret Tuft and Phantom Mirror\n" +
                        "_-_ Fully synced Shattered bombs\n" +
                        "_-_ Fully synced Shattered evasion icons and added the fish scale evasion icon"));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.HIGHTWAND_3), "Ghostflame Staff buff",
                "Its range now matches the Flamewave Staff, but ghostfire burns longer than flamewave and it pierces."));
    }

    public static void add_V0931_Changes(ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.9.3.1", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image(Assets.Interfaces.HAICONS, 32, 0, 16, 16), "Hard Mode - 2026",
                "Hard Mode is back in a big way! Come give it a try!\n" +
                        "See the difficulty description for details."));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.KILL_EYES), "Hunter's Eye - T3 - positive",
                Messages.get(KillEye.class,"desc")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.PURE_ROUGE), "Precious Rouge - T3 - positive",
                Messages.get(PureRouge.class,"desc")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.FAINT_GLIMMER), "Flawless Glimmer - T3 - positive",
                Messages.get(FaintGlimmer.class,"desc")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.DIRT_KNIFE_STAND), "Dirt Knife Rack - T2 - negative",
                Messages.get(Dirt_KnifeStand.class,"desc")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CATGIRL_COSPLAY), "Catgirl Cosplay Handbook - UNDEF",
                Messages.get(CatGirlCosplay.class,"desc")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.RESOLVE_DIE), "Resolve Unto Death - UNDEF",
                Messages.get(DeadOrAlive.class,"desc")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.DREAM_SEED), "Dream Seed - UNDEF",
                Messages.get(DreamSeed.class,"desc")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.NOTEOFBZMDR), "Bzmdr's Notes - T3 - negative",
                Messages.get(NoteOfBzmdr.class,"desc")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.BROKEN_RING), "Shattered Ring - T3 - negative",
                Messages.get(BrokenRing.class,"desc")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.STAR_DUST), "Stardust - T3 - negative",
                Messages.get(StarDust.class,"desc")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SEED_FADELEAF), "Seed system improvements",
                "The same seed generating different dungeons has been a problem for a long time.\n\n" +
                        "I have improved it in this version, guaranteeing 95% agreement on main floors; sub-floors still need a solution."));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Misc changes"),
                ("1.Asset updates\n" +
                        "2.Gravestone epitaphs rewritten\n" +
                        "3.Hero remains in bone rooms changed to chests")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                ("_-_ Fixed the Rogue skin having no effect\n" +
                        "_-_ Fixed the Gold Butterfly 0-score multiplier\n" +
                        "_-_ Fixed collectible errors on high SDK devices\n" +
                        "_-_ Fixed the Dirt Knife Rack stopping health regen while starving\n" +
                        "_-_ Fixed the Ancient God boss becoming invulnerable in extreme cases\n" +
                        "_-_ Fixed trapdoor rooms generating wrongly on sub-floors\n" +
                        "_-_ Fixed the Hunter's Monocle armor piercing not applying to the Hunter's own guaranteed ambush\n" +
                        "_-_ Fixed sometimes getting junk when choosing a tier 3 collectible from Xiaoye (the pool was not empty)\n" +
                        "_-_ Fixed softlocks from skipping Xiaoye and going down on some floors")
        ));

        changes.addButton(new ChangeButton(Icons.get(Icons.DISPLAY), ("Display changes"),
                ("_-_ Multi-boss health bars are supported again\n" +
                        "_-_ Special skins no longer show grass")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight(Window.R_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.TREELIST), ("Changes"),
                ("Each hit builds 2 + level/5 points of life shield, up to 20 + level*2\n" +
                        "Stored shield only absorbs arcane shield, not life shield")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.ARMORSCALESOFBZMDR), "Bzmdr's Armor Scales - dropped to T1",
                Messages.get(ArmorScalesOfBzmdr.class,"desc")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.HEARTOFCRYSTALFRACTAL), "Nightmare of the Crystal Heart - T1 - negative",
                Messages.get(HeartOfCrystalFractal.class,"desc")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.PORTABLEWHETSTONE), "Portable Whetstone - T1 - positive",
                Messages.get(PortableWhetstone.class,"desc")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.BROKENBONE), "Broken Bone - T1 - negative",
                Messages.get(BrokenBone.class,"desc")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.DELICIOUSRECIPE), "People's Cookbook - T1 - positive",
                Messages.get(DeliciousRecipe.class,"desc")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.MONOCULAR), "Monocular - T2 - positive",
                Messages.get(Monocular.class,"desc")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.YANSTUDYINGPAPERTWO), "Yan's Research Manuscript (part two) - T2 - positive",
                Messages.get(YanStudyingPaperTwo.class,"desc")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.WENSTUDYINGPAPERONE), "Wen's Research Manuscript (part one) - T2 - positive",
                Messages.get(WenStudyingPaperOne.class,"desc")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.YANSTUDYINGPAPERONE), "Yan's Research Manuscript (part one) - T2 - negative",
                Messages.get(YanStudyingPaperOne.class,"desc")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.KINGHTSTABBINGSWORD), "Swift Knight Rapier - T2 - positive",
                Messages.get(KnightStabbingSword.class,"desc")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.RAPIDEARTHROOT), "Fast-Growing Binding Root - raised to T2",
                Messages.get(RapidEarthRoot.class,"desc")));

    }

    public static void add_V0925_Changes(ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.9.2.5-6", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new WhiteGirlSprites(), ("Magic Ling is 5!"),
                ("2021-2-12 to 2026-2-12\n\nFive years together, a new road ahead\n" +
                        "May every Magic Ling player get what they wish for, with fortune smiling and success at every turn.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.WARNING), ("New system: random events"),
                ("The new random event system has gone into testing, adding more unpredictability to your adventure.\n\n" +
                        "_-_ No.1 - random event - A Song of Ice and Fire\n" +
                        "_-_ Trigger: a 20% + challenges x 5% chance during the Lena fight.\n" +
                        "_-_ Event: the Frost Witch Dongling joins the fight, and her behaviour changes.")));

        changes.addButton(new ChangeButton(new ElementalSprite.HaloFire(), ("New mob: Ghostflame Elite"),
                ("Fire Elementals have a 10% chance to spawn as this mob, and killing one always drops a Dragon King Blessing Elixir.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.NEWS), ("New redeem code: FiveYearsOld"),
                ("Claim your reward in game through the Luobai Shop or the game menu!\n\nValid until: before 2026-03-04 00:00")));

        changes.addButton(new ChangeButton(Icons.get(Icons.DISPLAY), ("New system: anniversary UI"),
                ("You can now pick the anniversary look, defaulting to the fifth; anything from the second to the fifth works.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.LANGS), ("Language update: Traditional Chinese"),
                ("The Traditional Chinese pack provided by Sotis has been updated.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.UP_DICT), ("Floor 0 renovation"),
                ("Floor 0 has been renovated again, with close to 30 NPCs added and all sorts of New Year gifts. Come and have a look!")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.BZMDR_GIFT), ("New item: Bzmdr's New Year Gift"),
                ("Want to push your limits? Then fight!")));

        changes.addButton(new ChangeButton(Icons.get(Icons.CATALOG), ("Stair text update"),
                ("The fifth anniversary adds 38 brand new texts, contributed by many players.\n\nGoing up and down stairs is a new experience now!")));

        changes.addButton(new ChangeButton(new ClearElemtGuardGirlSprites(), ("Faina's story continues"),
                ("After the Fire Dragon events, with the New Year approaching, Faina suddenly left town. Where did she go?\n\nHead to the Fire Dragon's old lair and you may find a lead.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.MOTO_BREW), ("New item: Molotov Flame Special"),
                ("A bottle of amber spirit crackling with sparks, its stopper wrapped in oil-soaked tinder.\n\nDrinking it grants healing, Adrenaline Surge, Haste and the power of flame, but it is strong stuff and leaves you dizzy for a short while.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.BADGES), ("New regular & hidden badges"),
                ("A new batch of regular and hidden badges is live. Play the game to earn them!\n\n" +
                        "Regular badge: Exhaustion\n\n" +
                        "Hidden badge: Mark of the Brave")));

        changes.addButton(new ChangeButton(new KusumiSprites(), ("Jiuzhu New Year special"),
                ("With the New Year arriving, all she can do is wait quietly in an endless cycle for destruction. If you go and see her, she may well thank you.\n\n" +
                        "Carrying a special token downstairs from floor 9 gives you a chance to get there.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.Flower_Cake), ("New food: Peach Blossom Cake"),
                ("Obtained by talking to Baiyan in the New Year town.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.BLESS_SCROLL), ("New item: Scroll of Blessing"),
                ("Obtained by talking to Xiaoye in the New Year town.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                            ("_-_ Fixed the Mimic King invulnerability bug\n" +
                             "_-_ Fixed crashes caused by some White Wave Rapier checks\n" +
                             "_-_ Fixed the Mage Hand freezing in extreme cases"),

                            ("_-_ Fixed rendering crashes with some assets\n" +
                            "_-_ Fixed crashes on older Android versions from new APIs that cannot be called\n" +
                            "_-_ Fixed a series of crashes reported through Firebase\n" +
                            "_-_ Fixed the Blazing Sun and Darkgold amulets still being usable under magic immunity\n" +
                            "_-_ Fixed duplicate collectibles")

        ));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.TREELIST), ("Changes"),
                ("Tier 2, 13 Strength\n" +
                        "\n" +
                        "3-14 base, growth 1-1\n" +
                        "\n" +
                        "0-3 base armor, growth 0-1\n" +
                        "\n" +
                        "This weapon stores life energy to release a life shield, up to 30 + 5 * weapon level\n" +
                        "\n" +
                        "Attacks build 2 + 0.2 * level points of shield. You can spend 1 turn to release it.\n" +
                        "\n" +
                        "A plant that grows by drawing magic out of the air.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Misc changes"),
                ("1.Asset updates\n" +
                        "2.Some text updates\n" +
                        "3.The V3 dialogue box was rebuilt and can be skipped (except for some key story scenes)\n" +
                        "4.Improved the Fire Dragon story and removed the lying branch\n" +
                        "5.Improved the scroll area of the game news screen; scroll on the right side")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight(Window.R_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.BADGES), ("Badges removed"),
                ("Potion Researcher, Item Expert and Scroll Researcher have been removed as they can no longer be obtained.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.HIGHTWAND_7), ("Wand changes"),
                ("_-_ The great ice wand slows 5% more per level\n" +
                        "_-_ Blazing Sun can summon one extra sun every five levels; it starts at one sun, and each point of charge only extends its life by 2 turns\n" +
                        "_-_ On becoming a Battle Shrine Maiden (old version) the old wand gains a big base stat boost and a small growth adjustment\n" +
                        "_-_ The Symbiosis Staff can no longer be charged by any means; it charges once per half level of XP gained")));

        changes.addButton(new ChangeButton(new AoReadyDragonSprite(), ("Orzu Dragon"),
                ("A mix-up in the story team brought this mob into being. It conflicts with the current story framework, so it has been removed.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.LINGPEA), ("Prism Crystal changes"),
                ("Generates 20 turns of Jungle Guardian Shield every 75 turns.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.WEAPON_HOLDER), ("Frost Fan"),
                ("This weapon has been removed.")));
        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.WEAPON_HOLDER), ("The End"),
                ("This weapon has been removed.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.FIVEREN), ("Five-Nut Mooncake"),
                ("After completing the Mid-Autumn Festival event and getting the true ending, this weapon can spawn in game.")));


    }

    public static void add_V0920_Changes(ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.9.2.0", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.NEWS), ("New redeem code: Pre-5YearsOld"),
                ("Claim your reward in game through the Luobai Shop or the game menu!\n\nValid until: before 2026-02-12 22:00")));

        changes.addButton(new ChangeButton(Icons.get(Icons.CATALOG), ("New system: effect codex"),
                ("Added an effect codex to the catalogue. It is not complete yet and will be filled in over future versions.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SKIN_11), ("New skin: Dinner Invitation"),
                ("Available from the skin merchant for 1500 cobalt coins")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.OLDSUNSHADOW), ("New item: Past Projection"),
                ("The crystal reflects all sorts of possibilities - can you find the plane that is yours?")));

        changes.addButton(new ChangeButton(Icons.get(Icons.DISPLAY), ("Texture pack system 1.0"),
                ("The texture pack system is live. Five packs are bundled, and you can make your own.\n\n" +
                        "To make your own pack, see the pinned texture pack guide in the game news.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.BOMB_SWORD), ("New weapon: Bomb Dagger"),
                ("The Bomb Dagger is back after a rework, with animations!\n\nThis weapon has a chance to gain a round of ammo on kill; upgrading it improves the odds and unlocks stronger bombs." )));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.WAND_HAND_CONTROL), ("Battlemage changes"),
                ("Added the following\n\n" +
                        "1.On some special maps (the Strange Fruit, minigame maps) it dies automatically and drops its items under the hero\n" +
                        "2.Equipped wand charge is now visible\n" +
                        "3.Equipped wands now have right side hotkeys\n" +
                        "4.When the old wand runs dry it switches to melee, and each attack gives the hero 1 turn of hostility\n" +
                        "5.When the Mage Hand controller detects the hand is gone, its sprite flashes red and the hotkey becomes [Summon]\n" +
                        "6.The Mage Hand no longer looks for enemies that do not exist\n" +
                        "7.The Mage Hand now uses old wands smartly at range and up close instead of idling during cooldown\n" +
                        "8.The Mana Recompense talent is retired\n" +
                        "9.The Mana Siphon talent is implemented\n" +
                        "10.Sentinel integration: Mage Hand patrol AI and shared sight\n" +
                        "11.Versatile Strikes now triggers as long as the hero's backpack or the Mage Hand has an old wand")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.STORYBOOKS), ("New developer tool: Book of Thoughts"),
                ("Step into the minds of the various leaders and relive your decisive battles with them.")));


        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SEAL), ("Delicate Emblem talent changes"),
                ("While the Delicate Emblem talent is active you can use a Scroll of Cleansing on the Emblem, and Cursed Prisms can now give a cursed Emblem one permanent upgrade.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SCROLL_GOLD), ("Gold Butterfly Mode changes"),
                ("1.Gold Butterfly quest 2: each region grants at most 1 extra transmutation for killing Gold Butterfly mobs, for 5 total across the five regions\n" +
                        "2.Fixed a serious bug that let robberies go upstairs")));

        changes.addButton(new ChangeButton(new NyarlathotepSprite(), ("Nya changes in the Castle"),
                ("Nyazaki's generated traps no longer include collapse traps")));

        Image sss =new MyCoreHeartSprite();
        sss.scale.set(PixelScene.align(0.4f));
        changes.addButton(new ChangeButton(sss, ("Castle Heart of the Universe changes"),
                ("If _Phantom of the Past_ turns friendly, the Heart of the Universe executes it")));


        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                ("1.Fixed rendering crashes with some assets\n" +
                        "2.Fixed a crash in the hero-alive load priority\n" +
                        "3.Fixed some crashes with the Storm Lightning Staff\n" +
                        "4.Fixed Mage Hand teleport crashes and the endless freeze\n" +
                        "5.Fixed the Mage Hand pointing at odd things\n"),
                ("6.Fixed the Mage Hand being unable to charge\n" +
                        "7.Fixed the stat viewer breaking hero buff display\n" +
                        "8.Fixed an out-of-bounds error with the Torrent trap\n" +
                        "9.The elevator now descends at most to sub-floor 5\n" +
                        "10.Fixed the Disintegration battlemage attack range bonus\n" ),

                ("11.Added missing battlemage effect text for the old wand\n" +
                        "12.Fixed a few text errors\n" +
                        "13.Fixed the Bloodthirst enchantment; it no longer affects neutral and friendly creatures\n" +
                        "14.Fixed the Smoke Body targeting range\n" +
                        "15.Fixed some Infernal enchantment interactions with Arcane bonuses"),

                ("16.Fixed falling to death on the Mimic King floor bricking the save\n" +
                        "17.Fixed the Space Beacon not checking for locked floors\n" +
                        "18.Relic backpacks from deaths on sub-floors now spawn where you died\n" +
                        "19.Fixed the wrong numbers shown in the Dragonblood Scales description\n" +
                        "20.Fixed the trinket text in the Xiayu Wuming dialogue not matching what you actually get"),

                ("21.Fixed some enchantments on the Broken Emblem not working\n" +
                        "22.Fixed the Darkgold Gem Amulet curse effect not working\n" +
                        "23.Fixed the fist losing its proper invulnerability near the Ancient God during a normal Ancient God fight with Lonely City on\n" +
                        "24.Fixed the ballista showing spell damage\n" +
                        "25.Rooted units are now invulnerable, and quickslot buttons do nothing at 0 shield")

        ));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Misc changes"),
                ("1.Safer bounds checks for mobs\n" +
                        "2.Sakaban Fish now only spawns once you enter the arena, and clears all frostfire particles on the map when it dies\n" +
                        "3.Trap rooms no longer have rifts in the sub-floor system\n" +
                        "4.The Sakaban Fish alive check is more precise\n" +
                        "5.The developer mode status viewer shows immunities\n" +
                        "6.When the DM-720 pylons activate, it now points at them\n" +
                        "7.The Three Wells floor shows all three wells in the exploration notes, and using one removes all three from the notes\n" +
                        "8.Special mode bosses no longer drop the Tengu Mask; collect it at the floor entrance on floor 11 in Gold Butterfly and floor 10 in Boss Rush\n" +
                        "9.Cobalt coins can be obtained in developer mode but do nothing")));


        Image ss =new ShubNiggurathSprite();
        ss.scale.set(PixelScene.align(0.4f));
        changes.addButton(new ChangeButton(ss, ("Shub-Niggurath"),
                "1.Sharing a tile with Morpheus is instant death\n" +
                        "2.Summon cap changed to 18"));

        Image st =new TowerMachineSprite();
        st.scale.set(PixelScene.align(0.4f));
        changes.addButton(new ChangeButton(st, ("Castle pillar changes"),
                "1.Fixed the Mechanical Pillar's area damage\n" +
                        "2.All four pillars now have 0 melee damage\n" +
                        "3.Fixed bugs related to the thought modules\n" +
                        "4.Fixed Mechanical Pillar shells printing the death text several times\n" +
                        "5.Fixed the Pillar of the Divine elemental resistance; it is now 50% above half HP and 75% below"));
    }

    public static void add_V0915_Changes(ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.9.1.5", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.WAND_HAND_CONTROL), ("Mage Hand controller"),
                ("Added the following\n\n" +
                        "1.You can designate an enemy and the Mage Hand will prioritise it\n\n" +
                        "2.If a summon fails, you can resummon from here")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                ("1.Fixed crashes caused by the Tangible Hand talent\n" +
                        "2.Hidden widgets temporarily removed\n" +
                        "3.Fixed a crash in the Dwarven Corpse Swarm check caused by multithreading\n" +
                        "4.Fixed a crash from the Heart of the Creator's priority checks\n" +
                        "5.Fixed crashes caused by concurrent checks\n" +
                        "6.Fixed crashes from Pain Scratch priority checks\n" +
                        "7.Fixed crashes from the Molten Fire Dragon sight check\n" +
                        "8.Fixed the Badder Bosses Mimic King bleeding formula\n"),
                ("9.Fixed crashes from the Thought Pillar priority check\n" +
                        "10.When a Sentinel sprite cannot be read it now destroys the entity outright\n" +
                        "11.Fixed an out-of-bounds check on the Dwarven Corpse Mountain\n" +
                        "12.Spirit Soil, Lightning, Soul Infusion and Corruption now always credit the hero as the user, even from the Mage Hand\n" +
                        "13.Fixed a possible stack overflow when Boss Rush Verdant Elf King damage repeatedly calls teleport\n" +
                        "14.Fixed various leftovers from the 2.5 Shattered backport\n" +
                        "15.Fixed some enemy checks on the Mechanical Pillar\n" +
                        "16.The Mage Hand now has the valuable item tag\n" ),

                ("17.Fixed a crash from Stillness's faulty dialogue logic\n" +
                        "18.Fixed crashes related to Mana Recompense\n" +
                        "19.Fixed missing fire wall text on the Pure Crystal Captain\n" +
                        "20.Some text fixes and improvements")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight(Window.R_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new DeadEyeSprite(), ("Doom Eye"),
                ("It can now disintegrate items in your backpack, widening the pool it destroys (including items inside containers, though it still excludes valuables, dew, the King's Bag and other special items)")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Lava Cave"),
                ("It now always generates exactly 2 random scrolls, 1 runestone, 1 food and 1 potion")));

        Image ss =new ShubNiggurathSprite();
        ss.scale.set(PixelScene.align(0.4f));
        changes.addButton(new ChangeButton(ss, ("Shub-Niggurath"),
                "_-_ Clone limit: at most 9 Black Goat clones\n" +
                        "_-_ Healing: while clones exist the body can heal 1000 HP, but only 5 times\n" +
                        "_-_ Death condition: on the sixth attempt to heal, the body and all clones die outright, or the Black Goat dies directly when it has no clones"));

        changes = new ChangeInfo("Preload", false, null);
        changes.hardlight(Window.CBLACK);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.NEWS), ("1.0.0-MLPD"),
                ("1.0.0 resource preload")));
    }


    public static void add_V0910_Changes(ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.9.1.0-1", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);



        changes.addButton( new ChangeButton(HeroSprite.avatar(HeroClass.MAGE, 13), "New skin: Dinner Invitation",
                "Complete the special commission between 2025.12.25 and 2026.01.01 to earn this skin.\n\n" +
                        "Anyone who does not finish the commission during the event can buy it from the skin merchant for _1500_ cobalt coins after the 0.9.2 update\n\n" +
                        "             --Art Design By: Seagull"));

        changes.addButton(new ChangeButton(Icons.get(Icons.NEWS), ("New redeem code: MerryChristmas"),
                ("Claim your reward in game through the Luobai Shop or the game menu!\n\nValid until: before 2026-01-01 00:00.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.STAR_CRYSTAL), ("New item: Starry Crystal"),
                ("After the Castle true ending, Charon's shop stocks this. Entering floor 31 of the Crimson Theatre route takes you straight to the final battle.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.MAGNETIC_CROWN), ("New artifact: Crown of Gravity"),
                ("Wearing this crown you feel a faint magnetism in space, a force that might drag you and other creatures toward some point...\n" +
                        "\n" +
                        "Using it costs 1 charge: tap any visible tile and the unit closest to that tile is dragged there, moving at most 3 + level*0.5 tiles per use this way.\n" +
                        "(If distances tie, enemies are pulled first)\n" +
                        "\n" +
                        "Gaining 10 XP when a one-shot trap in sight is triggered levels the artifact up every 50 + 7 * level XP.\n" +
                        "Starts with 3 charge, max 10, and each level adds one max charge. Recovers one charge every 50 - level turns.\n" +
                        "\n" +
                        "Artifact charging recovers 0.3 charge per turn.\n" +
                        "Cursed effect: cannot be used.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.RITUAL_SWORD_M), ("New weapon: Ritual Dagger"),
                ("Tier 2, 12 Strength\n" +
                        "\n" +
                        "3-15 base, growth 1-3\n" +
                        "\n" +
                        "This weapon cannot be cursed and makes sacrifice rituals more efficient (it only needs one kill).\n" +
                        "\n" +
                        "Once used by a bishop to conduct many religious rites.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.TREELIST), ("New weapon: Tree Scar"),
                ("Tier 2, 13 Strength\n" +
                        "\n" +
                        "3-14 base, growth 1-3\n" +
                        "\n" +
                        "0-3 base armor, growth 0-1\n" +
                        "\n" +
                        "This weapon absorbs shield lost naturally, up to 25 + 15 * regions\n" +
                        "\n" +
                        "10 * level, and attacks also build 2 + 0.2 * level points of shield. You can spend 1 turn to release it.\n" +
                        "\n" +
                        "A plant that grows by drawing magic out of the air.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SAD_MAGIC_BOOK), ("New weapon: Codex of Sorrow"),
                ("Tier 3, 14 Strength\n" +
                        "\n" +
                        "2-20 base, growth 2-2\n" +
                        "\n" +
                        "Killing an enemy with this weapon has a (10 + 3 * level)% chance to identify a random item in your backpack.\n" +
                        "\n" +
                        "The book records tales of true misery: eating crudely butchered monster meat out of hunger, slowly turning to stone, even being reshaped into unthinking metal.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SHEPHERD_FLUTE), ("New weapon: Reed Flute"),
                ("Tier 3, 14 Strength\n" +
                        "\n" +
                        "2-9 base, growth 1-2, 10 attack range\n" +
                        "\n" +
                        "For every tile of distance the target takes 10% less attack damage; attacks ignore physical defense and deal spell damage.\n" +
                        "\n" +
                        "A flute song drifts from the outskirts to that lonely village, and there our fate takes root.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.WEAPON_HOLDER), ("New weapon: Army Breaker"),
                ("Tier 5, 18 Strength\n" +
                        "\n" +
                        "6-28 base, growth 1-6\n" +
                        "\n" +
                        "While equipped you deal (30 + 3 * level)% more damage to enemies below 50% HP, rising to (100 + 10 * level)% when attacking with this weapon\n" +
                        "\n" +
                        "Children, wait for me...")));

        Image gf = new Image(new GiantFlowerSlimeSprites());
        gf.scale.set(PixelScene.align(0.8f));
        changes.addButton(new ChangeButton(gf, ("New mob: Giant Blossom Slime"),
                ("A relatively rare Blossom Slime, so large that more plants and seeds stuck to it, so its attacks may produce plant effects\n" +
                        "14 HP, 2 evasion, 1 speed, 8 accuracy, 2 XP, XP up to level 5\n" +
                        "On attack there is a 1/3 chance of 2 turns of burning, 1/3 of 3 turns of frostbite, 1/3 of 5 turns of entanglement, and a 1/5 chance of 5 turns of plant healing or 2 turns of air bubble\n" +
                        "Drops two seeds.")));

        changes.addButton(new ChangeButton(new Image(new CrabSprite.NewBornCrabSprite()), ("New mob: Newborn Crab"),
                ("A juvenile Jungle Crab whose shell has not matured, so its defense is weaker but it is faster and more nimble\n" +
                        "12 HP, 1-7 attack, 0-3 defense, 2.5 speed, 6 evasion, 12 accuracy, same drop level as a crab\n" +
                        "Drops a piece of strange meat")));

        changes.addButton(new ChangeButton(new Image(new DM111Sprite()), ("New mob: DM-111"),
                ("An upgraded DM-100 - the first upgrade in fact, since the second is already called DM-200. It has stronger firepower and heavier armor and can charge up a discharge to subdue prisoners, but the engine never caught up, so it moves slower\n" +
                        "35 HP, 4-10 attack, 5-13 ranged, 0-6 defense. It can charge for two turns to fire a 5-15 ranged attack that paralyses for 3 turns; the charged shot conducts through water, carrying damage but not paralysis. 0.5 speed, and it cannot attack for 2-8 turns after a charged shot\n" +
                        "Drops a Scroll of Recharging, 7 XP, max level 13")));

        changes.addButton(new ChangeButton(new Image(new GuardCapitalSprite()), ("New mob: Warden Captain"),
                ("The leader among the wardens, stronger than the rest, but instead of pulling prisoners in with chains it prefers to knock them back or support other wardens from range\n" +
                        "50 HP, 6-16 attack, 0-7 defense, 12 evasion, 12 accuracy, 6-12 ranged damage\n" +
                        "When the player comes close it knocks them back 3 tiles without dropping them off ledges, prefers to seek out other wardens, keeps its distance when alone and keeps attacking near other wardens. The knockback has a 20 turn cooldown. 7 XP, level 14\n" +
                        "Drops a random armor or weapon")));

        changes.addButton(new ChangeButton(new Image(new VeryColdRatSprite()), ("New mob: Frost Rat"),
                ("Long exposure to cold and ice magic has left the mana in its body frenzied and highly unstable\n" +
                        "70 HP, 15-25 attack, 5 evasion, 20 accuracy, 1.5 speed, 0-3 defense\n" +
                        "It constantly radiates freezing gas (like the Rot Rat),\n" +
                        "and its attacks have a 25% chance to freeze\n" +
                        "While fighting it loses 5% of max HP per turn, and with no target it heals 5% of max HP per turn\n" +
                        "It always drops a Frost Bomb on death, and _after 4 turns_ it explodes with the same radius and effect as a Frost Bomb\n" +
                        "8 XP, max level 16")));

        changes.addButton(new ChangeButton(new Image(new BloodsSwarmSprite()), ("New mob: Blood Fly Swarm"),
                ("It is so cold that Blood Flies huddle for warmth and act together, and attacking them splits the swarm apart - very dangerous\n" +
                        "Taking 20% of its current HP in damage splits off a Fire Fly, which acts with the swarm and attacks at range like any Fire Fly\n" +
                        "80 HP, 5-10 attack, 0-2 defense, 15 evasion, 20 accuracy, same drop level as Fire Flies, and always drops a ghostfire potion")));

        Image js = new Image(new GhoulPlusSprite());
        js.scale.set(PixelScene.align(0.8f));
        changes.addButton(new ChangeButton(js, ("New mob: Dwarven Corpse Mountain"),
                ("Dwarven Corpse Swarms can fight endlessly, but magic is never reliable, so while healing they stuck together, endlessly absorbing other swarms\n" +
                        "It seeks out other swarms, and if any are nearby it weakens them and strengthens itself\n" +
                        "When generated it replaces a pair of swarms - instead of two swarms only one Mountain spawns, and the Mountain moves toward other swarms and acts with them\n" +
                        "For each swarm within 5x5 the Mountain gains 15% damage reduction and 15% attack bonus; nearby swarms take 30% more damage, and when a nearby swarm dies the Mountain heals 50 HP and gains 30 max HP, 10 attack and 5 defense\n" +
                        "Starts at 100 HP, 15-20 attack, 0-3 defense, 10 evasion, 25 accuracy, always drops 4x a swarm's gold and XP, same XP level as a swarm")));

        changes.addButton(new ChangeButton(new Image(new WarlockHeadSprite()), ("New mob: Dwarven Head Warlock"),
                ("Dwarven warlocks are the power brokers among dwarves, and this one leads them all. His command of dark magic far surpasses the rest and he can inflict far worse effects on a target\n" +
                        "85 HP, 18-23 attack\n" +
                        "0-10 defense, 18 evasion, 28 accuracy\n" +
                        "Ranged attacks have a 2/3 chance to degrade the target for 40 turns, 1/3 to bleed them for 5-8, 1/3 to confuse them for 30 turns and 1/5 to blind them for 12 turns; whenever one of these triggers it also applies 5 turns of weakness\n" +
                        "In melee it gains 10-20 arcane shield\n" +
                        "Always drops a Potion of Experience, 11 XP, max XP level 21")));

        changes.addButton(new ChangeButton(new Image(new SpawnereEvilSprite()), ("New mob: Vile Blood Nest"),
                ("This lump of dwarven flesh is more active than other nests, and its thick reek of blood and death is the finest food for demons.\n" +
                        "\n" +
                        "Max HP 140, 0-12 defense\n" +
                        "Summons a Demon Feast every 50/40/35/30 turns\n" +
                        "Heavily reduces damage above 14\n" +
                        "Each point of damage taken cuts 1 turn off the summon cooldown\n" +
                        "Always drops a Potion of Healing x1 and a flatbread x1\n" +
                        "Same drop level as other nests")));

        changes.addButton(new ChangeButton(new Image(new FodderSprite()), ("New mob: 'Demon Feast'"),
                ("A being not native to the demon world, naturally weaker than a normal demon. Eaten by other demons, it becomes part of a stronger one.\n" +
                        "Like a Demon Render but at half speed. It can be targeted by any other enemy, and when killed by another enemy that enemy is fully healed, given arcane shield equal to half its max HP, and given a random elite/mutation pair of traits. 50 max HP, 10-20 attack, 30 accuracy, 0 defense, 0.5 attack delay, 15 evasion. It does not attack other mobs, always takes hits from them, drops nothing and grants no XP")));

        Image vs = new Image(new DeadEyeSprite());
        vs.scale.set(PixelScene.align(0.8f));
        changes.addButton(new ChangeButton(vs, ("New mob: Doom Eye"),
                ("The Doom Eye is a variant of the Evil Eye with the same abilities, but it spots enemies more easily and its death gaze is more destructive - you probably should not take it head on\n" +
                        "110 HP, 22-35 attack, 0-10 defense, 20 evasion, 30 accuracy, 8 sight\n" +
                        "Charges for 2 turns then fires a death gaze for 30-50 damage, taking a quarter damage while charging. It disintegrates 2-3 items from the backpacks of players hit by the gaze, excluding valuables and the armored backpack, and drops a Revenge, 13 XP, XP up to level 26")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image(new MageHandSprite()), ("Mage Hand AI improvements"),
                ("_-_ If the hero is in the line of fire, it first moves to a spot the hero is not exposed to, though area wands can still hit the hero\n\n" +
                        "_-_ Threat priority is now: mobs attacking the hero > elite buff mobs > mobs by (HP + damage), high to low > random\n\n" +
                        "_-_ It evaluates its own position to better support its master")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.NEWSTEM), ("Newborn Branch"),
                ("A sprouting dead twig, longing for the day it grows again.\n\nOutside of severe hunger it grants an extra _+1 HP_ when regenerating naturally")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CONfUSEDMIEMIETALISMAN), ("Baa Baa Amulet"),
                ("The maker presumably meant to use the Magic Sheep to protect himself, but clearly he was no craftsman.\n\nYou have a <#F00>2% chance each turn<RGB> to trigger the sheep runestone effect,\nwith <#F00>10 turns<RGB> of warning beforehand.\nOnce triggered it cannot trigger again for _75 turns_.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.CHALLENGE_ON), ("Challenge changes"),
                ("Unpredictable: rare mob spawn chance increased by a global 10%")));

        changes.addButton(new ChangeButton(Icons.get(Icons.WARNING), ("Error report history"),
                ("Crash reports are now stored locally so developers get more data to track problems down.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Misc changes"),
                ("_-_ The news screen now scrolls (on mobile, swipe in the gaps between news cards; this UI will be improved further in 0.9.2)\n" +
                        "_-_ The news screen now reads pinned and link cards\n" +
                        "_-_ Skin system backend upgraded\n" +
                        "_-_ Some asset updates")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "Many issues from the last version have been fixed."));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight(Window.R_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new RedNecromancerSprite(), ("Gnoll Priest"),
                ("Removed from spawning, but still kept in developer mode and the catalogue.")));

        changes.addButton(new ChangeButton(new SRPDHBLRTT(), ("Torch Hunter"),
                ("Removed from spawning and now only appears in special rooms, but still kept in developer mode and the catalogue.")));

        Image ss =new ShubNiggurathSprite();
        ss.scale.set(PixelScene.align(0.4f));
        changes.addButton(new ChangeButton(ss, ("Shub-Niggurath"),
                ("Clones are capped at 9; beyond that it stops splitting automatically and attacks cannot split it either")));
    }

    public static void add_V0900_Changes(ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.9.0.3", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.CHANGES), ("Major update"),
                ("Magic Ling is now at version 0.9.0.0! Thank you to everyone who supports Magic Ling Pixel Dungeon.\n\nThe brand new Abyssal Castle side chapter is open - come and have a taste!")));

        changes.addButton(new ChangeButton(NetIcons.get(NetIcons.GLOBE), ("Online update system V2.1"),
                ("Because of protocol changes, from 0.9.0.3 a new update endpoint is used and the old ones are being retired.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.BADGES), ("New regular & hidden badges"),
                ("A new batch of regular and hidden badges is live. Play the game to earn them!\n\n" +
                        "Regular badges: Theatre Star -> Famous Actor -> Golden Actor, Dream of Stillness\n\n" +
                        "Hidden badges: I Returned from Hell, Holy Verdict, Trick or Treat, Pet Me a Billion More Times, Ghost Hunter")));

        changes.addButton(new ChangeButton(Icons.get(Icons.AUDIO), ("New original music: Battle of the Star Sea"),
                ("By Quanluo\n\nThe battle BGM for the Castle's final boss. Enjoy!")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SZJ_REBACK), ("New thrown weapon: Cross Boomerang"),
                ("Weapon design: Xiaoye\n\nWhere it hits an enemy it leaves an electric wall for several turns, damaging enemies in the wall each turn.\n\nHeretics must be judged - let the verdict be declared here!!!\n\n<#FFA500>Limited weapon unlocked by the Holy Verdict badge in the Abyssal Castle side story. Thank you again for playing Magic Ling's first side story.<RGB>")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.DEATHRONG_BOAT), ("New weapon: Charon's Oar"),
                ("Weapon design: Xiaoye\n\nIf you are standing on water, attack damage to your target conducts to every enemy on the water, losing some damage per extra tile.\n\nThe little boat rows its oars, let us push through the waves~\n\n<#FFA500>Abyssal Castle side story limited weapon for defeating Cerberus. Thank you again for playing Magic Ling's first side story.<RGB>")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.IRON_KEY), ("New mechanic: spare key cleanup"),
                ("After the full search minigame ends, all spare keys are removed.")));

        Image mp = new MorpheusSprite();
        mp.scale.set(PixelScene.align(0.6f));
        changes.addButton(new ChangeButton(mp, ("New boss: Morpheus"),
                ("The grand performance is about to begin - the crimson banquet starts now!")));

        changes.addButton(new ChangeButton(Icons.get(Icons.LANGS), ("Language update: Traditional Chinese"),
                ("The Traditional Chinese pack from Sotis has been updated")));

        changes.addButton(new ChangeButton(Icons.get(Icons.DISPLAY_LAND), ("UI update"),
                ("Full size desktop mode by BrogField is live. Enjoy!")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CASTLE_AIRPORT), ("First side story: Abyssal Castle"),
                (
                        "Magic Ling Pixel Dungeon - Abyssal Castle side story started in October 2023 and went through far too many problems and conflicts, but finally it was completed on 2025-11-01!\n\n" +
                                "Credits:\n\n" +
                                "_-_ Director: JDSALing\n" +
                                "_-_ Coding support: JDSALing, Shoudian, Pandora\n" +
                                "_-_ Story concept: JDSALing\n" +
                                "_-_ Art design: Daniel Calan\n" +
                                "_-_ Leader design: Jishen\n" +
                                "_-_ Writing: Jiuzhu, Xiaoye\n" +
                                "_-_ Weapon design: Xiaoye\n" +
                                "_-_ Music: Quanluo, Tatsuro\n" +
                                "_-_ Lead testing: Archetto, Big Cat, Taishang Wangqing\n\n" +
                                "This side story is dedicated to everyone who loves Magic Ling Pixel Dungeon!!!\n\n" +
                                "Have fun, and may the road of adventure never end!")));

        changes.addButton(new ChangeButton(Icons.get(Icons.NEWS), ("New redeem code: NINENINEZEROONE"),
                ("Claim your reward in game through the Luobai Shop or the game menu!\n\nValid: forever")));

        changes.addButton(new ChangeButton(Icons.get(Icons.NEWS), ("New redeem code: HELLO-MLPD-V0.9"),
                ("Claim your reward in game through the Luobai Shop or the game menu!\n\nValid: forever")));

        changes.addButton( new ChangeButton(new BuffIcon(BuffIndicator.PACMAN_GAME, true), "The three minigames arrive",
                "Pac-Man, Sokoban and Full Search are here. Explore the Abyssal Castle side story and play them."));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.LIBGDX), ("LibGDX 1.11"),
                ("Magic Ling now runs on LibGDX 1.11, which is well compatible with every platform.")));

        Image xs =new PeachGodStateSprite();
        xs.scale.set(PixelScene.align(0.8f));
        changes.addButton(new ChangeButton(xs, ("Peach Blossom Wishes - rerun"),
                ("[Limited-time event - Peach Blossom Wishes, 10-pull guaranteed] - rerun period: 2025.11.2-2025.11.30\n\n" +
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

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "Magic Ling Pixel Dungeon - Fixes:\n\n" +
                        ("0.9.0.3 - Fixes:\n" +
                                "_-_ Fixed seed runs scoring 0\n" +
                                "_-_ Fixed seed lookup crashes\n" +
                                "_-_ Better backpack handouts from Morpheus\n" +
                                "_-_ The Pac-Man fight now starts with no gear by default, so banned items cannot be carried in\n" +
                                "_-_ Seed runs now show the Castle ending icon too\n" +
                                "_-_ Fixed a serious Pac-Man softlock\n" +
                                "_-_ Improved how shop robberies handle ankhs\n" +
                                "_-_ Nya no longer generates hunting traps\n" +
                                "_-_ Black Goat clones now die automatically if they overlap the body"
                        )));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "Magic Ling Pixel Dungeon - Fixes:\n\n" +
                        ("0.9.0.2 - Fixes:\n" +
                                "_-_ Fixed flow issues in the three minigames; even a crash no longer freezes the game process\n" +
                                "_-_ Fixed Seed Finder crashes caused by inconsistent widget calls\n" +
                                "_-_ Fixed crashes from some Gladiator combo checks\n" +
                                "_-_ Fixed crashes from some extraction point checks\n" +
                                "_-_ Fixed Sokoban buttons getting mixed up in some states from a bad coordinate algorithm\n" +
                                "_-_ Ankhs of any kind now do nothing in minigames, but the hero can never die in them either\n" +
                                "_-_ Fixed ankhs not being returned properly after a robbery"
                        )));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "Magic Ling Pixel Dungeon - Fixes:\n\n" +
                        ("0.9.0.1 - Fixes:\n" +
                                "_-_ Fixed the teleport pillar crystal letting you return to floor 0\n" +
                                "_-_ Fixed Thorns transmutation issues when using Gold Butterfly on floor 0\n" +
                                "_-_ Fixed the four pillars in Morpheus phase three\n" +
                                "_-_ Fixed some Castle items not unlocking in the catalogue\n" +
                                "_-_ Fixed the Soul Infusion staff failing to add shield\n" +
                                "_-_ Fixed traps applying inner demon damage\n" +
                                "_-_ Fixed score farming in Full Search\n" +
                                "_-_ Fixed Pac-Man letting you use the void chain"
                        )));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "Magic Ling Pixel Dungeon - Fixes:\n\n" +
                        ("0.9.0.0 - Fixes:\n" +
                                "All closed beta feedback has been fully fixed.\n" +
                                "Closed beta lead testers: Archetto, Big Cat, Taishang Wangqing"
                        )));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Misc changes"),
                ("1.Asset updates\n" +
                        "2.Castle tile improvements")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        Image s =new ShubNiggurathSprite();
        s.scale.set(PixelScene.align(0.4f));
        changes.addButton(new ChangeButton(s, ("Shub-Niggurath"),
                ("Spirit Blast scroll damage against it reduced by 60%.")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight(Window.R_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new TribemanOldSprite(), ("Gnoll Bandit"),
                ("Attack speed changed to 2.0 from 0.5.")));

        Image ss =new ShubNiggurathSprite();
        ss.scale.set(PixelScene.align(0.4f));
        changes.addButton(new ChangeButton(ss, ("Shub-Niggurath"),
                ("1.Clones are capped at 18; beyond that it stops splitting automatically and attacks cannot split it either\n" +
                        "2.The body now carries a special mutation explosive blob tag\n" +
                        "3.It can now take Spirit Blast scroll damage\n" +
                        "\n4.When only the Black Goat and its clones remain, attacking _the Black Goat body_ resets its HP and grants the hero 50000 turns of spirit vision.\nAlso, when _the Black Goat body_ dies, the hero's spirit vision is removed.")));

        changes.addButton(new ChangeButton(new YogSoulSprite(), ("Yog-Sothoth"),
                ("While near Yog-Sothoth it no longer uses any skills.")));
    }
}
