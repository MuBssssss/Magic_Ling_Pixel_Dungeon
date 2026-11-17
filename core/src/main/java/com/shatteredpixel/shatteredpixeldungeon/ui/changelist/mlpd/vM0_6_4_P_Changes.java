package com.shatteredpixel.shatteredpixeldungeon.ui.changelist.mlpd;

import com.shatteredpixel.shatteredpixeldungeon.Assets;
import com.shatteredpixel.shatteredpixeldungeon.Badges;
import com.shatteredpixel.shatteredpixeldungeon.PaswordBadges;
import com.shatteredpixel.shatteredpixeldungeon.actors.mobs.npcs.PinkLingSprite;
import com.shatteredpixel.shatteredpixeldungeon.effects.BadgeBanner;
import com.shatteredpixel.shatteredpixeldungeon.effects.PasswordBadgeBanner;
import com.shatteredpixel.shatteredpixeldungeon.messages.Messages;
import com.shatteredpixel.shatteredpixeldungeon.scenes.ChangesScene;
import com.shatteredpixel.shatteredpixeldungeon.scenes.PixelScene;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ApprenticeWitchSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.CerberusSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.CrivusFruitsSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.FireDragonSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.FlowerSlimeSprites;
import com.shatteredpixel.shatteredpixeldungeon.sprites.FrankensteinSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.GhostSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSpriteSheet;
import com.shatteredpixel.shatteredpixeldungeon.sprites.MorpheusSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.SakaFishBossSprites;
import com.shatteredpixel.shatteredpixeldungeon.sprites.SalamanderSprites;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ShopkeeperSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.SlimeKingSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.TyphonSprite;
import com.shatteredpixel.shatteredpixeldungeon.ui.Icons;
import com.shatteredpixel.shatteredpixeldungeon.ui.Window;
import com.shatteredpixel.shatteredpixeldungeon.ui.changelist.ChangeButton;
import com.shatteredpixel.shatteredpixeldungeon.ui.changelist.ChangeInfo;
import com.watabou.noosa.Image;

import java.util.ArrayList;

public class vM0_6_4_P_Changes {
    public static void addAllChanges(ArrayList<ChangeInfo> changeInfos) {
        add_v0_6_56_Changes(changeInfos);
        add_v0_6_55_Changes(changeInfos);
        add_v0_6_54_Changes(changeInfos);
    }
    public static void add_v0_6_56_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.6.5.0-Alpha6-Patch7", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo("Preloaded", false, null);
        changes.hardlight(Window.CBLACK);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new TyphonSprite(), ("Mother of All Demons"),
                ("This world may be outside my domain, but the things in that castle have no business existing here.\n\nThis data is preloaded and will go live in the Halloween event")));

        Image mp = new MorpheusSprite();
        mp.scale.set(PixelScene.align(0.7f));
        changes.addButton(new ChangeButton(mp, ("Lord of the Shadow Realm"),
                ("Then let the grand performance begin.\n\nThis data is preloaded and will go live in the Halloween event")));

        Image cr = new CerberusSprite();
        cr.scale.set(PixelScene.align(0.7f));
        changes.addButton(new ChangeButton(cr, ("Infernal Nightmare"),
                ("...\n\nThis data is preloaded and will go live in the Halloween event")));

        changes = new ChangeInfo("New Content", false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_13), ("Badder Bosses Overhaul"),
                ( "1. The Old God's second phase now summons two extra fists: a frost fist and a ghostfire fist.\n\n" +
                        "2. In Badder Bosses the Dwarf King's golems are replaced with ice golems, and heavy-armor gnolls are added on top.\n\n" +
                        "3. Tengu gains extra shielding in his second phase, his fire walls become ghostfire walls, and the fight is faster and deadlier.")));

        changes = new ChangeInfo("Changes", false, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes"),
                ("1. Fixed oil flasks being infinitely reusable through the troll blacksmith\n" +
                        "2. Developer mode v0.8: fixed some issues\n" +
                        "3. Improved the credits list and added Diling, Yinura, Qinyue, Shejishi and Canned Fox (some people gave me no icon, so they appear as plain text)\n" +
                        "4. The lights system now supports fractional reduction." )));

        changes.addButton(new ChangeButton(new Image("sprites/spinner.png", 144, 0, 16, 16),
                Messages.get(ChangesScene.class, "bugfixes"), Messages.get(vM0_6_7_X_Changes.class, "bug_06X89")));


        changes = new ChangeInfo("v0.6.5.0-Alpha6-Patch6", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo("Preloaded", false, null);
        changes.hardlight(Window.CBLACK);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ApprenticeWitchSprite(), ("New Neutral Monster: Apprentice Witch"),
                ("A poor student of the magic academy, still apprenticed as a witch.\n\nThis data is preloaded and will go live in the Halloween event.")));

        changes.addButton(new ChangeButton(new FrankensteinSprite(), ("New Monster: Unfinished Dream Puppet"),
                ("It is looking for its creator, and for every breath of life it can tear apart.\n\nThis data is preloaded and will go live in the Halloween event.")));

        changes = new ChangeInfo("New Content", false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.LANTERNB), ("The Lights Ahead: v3.2"),
                ("1. Above 6 challenges the lights now act as an extra forced challenge,\n\n" +
                        "2. Your lights and lantern now start already reduced, though this does not affect the first region.\n\n" +
                        "3. Fixed the serious bug where monsters did not reduce the lights, an issue that has been unfixed since the lights system was added")));

        changes = new ChangeInfo("Changes", false, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.INFO), ("Score Reference"),
                ("Here is when each score turns blue; blue means the best rating or better:\n\n" +
                        "Game score: above 50000\n\n" +
                        "Treasure score: above 20000\n\n" +
                        "Exploration score: above 20000\n\n" +
                        "Boss score: above 18000\n\n" +
                        "Quest score: above 14000.\n\n" +
                        "SSS+ rating: 240000 * challenge multiplier * (won ? 1 : 5)\n\n" +
                        "Winning gives a multiplier of 1, losing gives 5 (in other words, it is basically unobtainable)." )));


        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.BLESS_SCROLL), ("Developer Mode v0.7"),
                ("In developer mode, floor 1 of Fragmented is a test monster set.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.BloodDied), "Bloodthirsty Thorns",
                "1. Fixed sacrifices under special circumstances; you can now sacrifice up to +10\n\n" +
                        "2. If thorns still get stuck, above +14 (not including +14) you will see 0 damage and the old sewers-thorns penalty based on 5x strength."));


        changes = new ChangeInfo("v0.6.5.0-Alpha6-Patch5", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo("New Content", false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.LANTERNB), ("The Lights Ahead: v3.1"),
                ("The lights now cap at 100%, and only one beneficial buff roll can be active at a time.\n\n" +
                        "High challenge counts may get harder, but low counts feel normal.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.BLESS_SCROLL), ("Developer Mode v0.6"),
                ("Fixed some bugs")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_16), ("Unpredictable v0.4"),
                ("1. Fixed teleporting failing in some cases\n\n" +
                        "2. Fixed mind vision not working on certain mini-boss floors\n\n" +
                        "3. Iterated on the changelog UI")));

        changes = new ChangeInfo("Changes", false, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes"),
                ("1. Fixed some text issues\n\n" +
                        "2. Fixed some errors\n\n" +
                        "3. Polished some assets" )));

        changes.addButton(new ChangeButton(new FlowerSlimeSprites(), ("Jungle Bloom Slime"),
                ("Seed drop chance reduced from 25% to 5%.")));


        changes = new ChangeInfo("v0.6.5.0-Alpha6-Patch4", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);


        changes = new ChangeInfo("New Content", false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.BLESS_SCROLL), ("Developer Mode v0.5"),
                ("Added the weapon generation scroll, thanks to Pandora for the code and the annotated version.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.CHALLENGE_ON), ("Challenge: Unpredictable v0.3"),
                ("Fixed a pile of issues and improved some of the experience")));

        changes = new ChangeInfo("Changes", false, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes"),
                ("1. Fixed some text issues\n\n" +
                        "2. Adjusted some underlying code" )));

        changes = new ChangeInfo("v0.6.5.0-Alpha6.9-6.93-LAST", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo("New Content", false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton((new Image("Ling.png", 0, 0, 16, 16)), ("From the Developer"),
                ("v0.6.5.0-Alpha6.9-LAST - finished 2023-10-6\n\n" +
                        "Today is a special day for me, because it is my 21st birthday.\n\n" +
                        "Looking back on two years of MLPD, I have gone from a soon-to-be university student to one about to graduate\n\n" +
                        "Life is busy, society tests you, internships are hard. Luckily I have players who love me and this game\n\n" +
                        "Alpha6.9 is the last MLPD release for now. Next, she (Magic Ling) goes into a rest period,\n\n" +
                        "but there is plenty of content to play, and of course I will fix any bugs that turn up.\n\n" +
                        "There just won't be any big updates for a while. Lastly, since my birthday is near, I have prepared a Crystal Necklace for every player.\n\n" +
                        "It should help you enjoy the game more, and I hope the Crystal Necklace treats you well.\n\n" +
                        "Finally, let us meet again in the big winter update. See you!!!\n\n" +
                        "--- MLPD lead developer: JDSALing" )));

        changes.addButton(new ChangeButton(Icons.get(Icons.DISPLAY_LAND), ("Lunar Calendar System"),
                ("MLPD now supports the lunar calendar; the Mid-Autumn Festival, the Dragon Boat Festival and the author's birthday all use it.\n" +
                        "Ling's birthday: lunar 8.22\n\nActive range: 8.22-8.25\n\n" +
                        "Mid-Autumn Festival: lunar 8.15\n\nActive range: 10 days before to 12 days after\n\n" +
                        "Dragon Boat Festival: lunar 5.5\n\nActive range: 3 days before to 7 days after\n\nNote: if it clashes with a western holiday, the Chinese festival takes priority!")));

        changes.addButton(new ChangeButton(Icons.get(Icons.AUDIO), ("New Theme BGM"),
                ("After winning once in the new version, the title screen may play a new BGM along with a hint at the next chapter.")));

        changes.addButton(new ChangeButton(new FlowerSlimeSprites(), ("New Creature: Jungle Bloom Slime"),
                ("It replaces the ordinary rat: rats now only spawn at the jungle's edge (floor 1), and this creature appears after that.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.REDWHITEROSE), ("A New Vessel Fully Implemented"),
                ("Effect: +2 Strength, +10% movement speed, restore 1 HP every 5 turns")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CRYSTAL_LING), ("New Developer Item: Crystal Necklace"),
                ("During Ling's birthday each year you start with it, it carries the effect of a Ring of Tenacity, and healing is slightly improved.")));

        changes.addButton(new ChangeButton(PasswordBadgeBanner.image(PaswordBadges.Badge.NIGHT_CAT.image), (
                "New Hidden Badge: Sleepless Night"),
                ("Riddle fragment: a dark and windy night, and the Old God falls.")));

        changes.addButton(new ChangeButton(BadgeBanner.image(Badges.Badge.HIDEEN_BADAGEX.image), ("New Badge: Secret Exploration"),
                ("How to get it: find where hidden badges are kept")));

        changes = new ChangeInfo("Changes", false, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);

        Image xax = new SakaFishBossSprites();
        xax.scale.set(PixelScene.align(0.72f));
        changes.addButton(new ChangeButton(xax,  "Sakaban Fish",
                "Now immune to terror!"));

        changes.addButton(new ChangeButton(new CrivusFruitsSprite(), ("Fruit of Clivus"),
                ("The purification potion now has a special version, and the Badder Bosses arena is different.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.CHALLENGE_ON), ("Developer Mode v0.4"),
                ("Small developer mode improvements, and a new monster: the Jungle Bloom Slime")));

        changes.addButton(new ChangeButton(Icons.get(Icons.CHALLENGE_ON), ("Challenge: Unpredictable v0.2"),
                ("Fixed a pile of issues:\n\n" +
                        "1. Keys could be lost\n\n2. Repeated boss alarms\n\n3. Seeing a person without teleporting\n\n4. Improved the stats and arenas of Goo and the DM-300 prototype.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes 1"),
                ("1. Improved the theme background screen and added a night state: from 22:00 to 07:00 you get the night background, otherwise the day one.\n\n" +
                        "2. Fixed a few tiles in the Holy Forest and reworked some enemy art\n\n" +
                        "3. Fixed some fallback bugs from the last version")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes 2"),
                ("1. Fixed torch energy not being saved while using the lantern\n" +
                        "2. Fixed issues with the Unpredictable challenge\n" +
                        "3. Fixed the DM-300 prototype's infinite shielding\n" +
                        "4. Fixed a possible crash in the badges screen\n" +
                        "5. Fixed missing animations for the enthrall effect\n" +
                        "6. Polished some tile textures\n" +
                        "7. Fixed DM-300 and DM-720 counting as cleared on entry\n" +
                        "8. Fixed the hidden badge Sleepless Night being unobtainable\n" +
                        "9. Added a night-time text reminder")));


        changes = new ChangeInfo("v0.6.5.0-Alpha6-6.8-National Day", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo("New Content", false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.CHALLENGE_ON), ("New Challenge: Unpredictable v0.1"),
                ("Added two random terrain styles, fights mostly take place on large maps, more monsters spawn, and two mini-boss fights were added.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes 2"),
                ("1. Fixed duplicate spawns of the three wells in the Three Wells Pact\n" +
                        "2. Improved the Unpredictable mini-boss arenas and loot\n" +
                        "3. Seeds are now split into A, B and Boss Rush types\n" +
                        "4. Iterated on some UI and balanced the Unpredictable challenge\n" +
                        "5. Fixed the Rat King being able to modify certain armors, such as shell armor")));



        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes"),
                ("1. Reworked UI materials\n\n2. Optimized some code")));

        changes.addButton(new ChangeButton(Icons.get(Icons.DEPTH_WELLS), ("More Terrain Awareness"),
                ("Added more terrain awareness to Unpredictable!")));

        changes = new ChangeInfo("Changes", false, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.CHALLENGE_ON), ("Mutation"),
                ("Swarm flies and heavy-armor gnolls can no longer gain mutations")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.LANTERNB), ("Lights Balance"),
                ("The lights system got a balance pass, so it is more fun to play.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_9), ("Nightmare Leaders"),
                ("Nightmare Leaders were adjusted and renamed to Badder Bosses")));

        changes.addButton(new ChangeButton(new Image("sprites/spinner.png", 144, 0, 16, 16),
                Messages.get(ChangesScene.class, "bugfixes"), Messages.get(vM0_6_7_X_Changes.class, "bug_06X88")));

        changes.addButton(new ChangeButton(new Image("sprites/spinner.png", 144, 0, 16, 16),
                Messages.get(ChangesScene.class, "bugfixes"), Messages.get(vM0_6_7_X_Changes.class, "bug_06X87")));

        changes = new ChangeInfo("v0.6.5.0-Alpha5.2-National Day", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo("Changes", false, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image("sprites/spinner.png", 144, 0, 16, 16),
                Messages.get(ChangesScene.class, "bugfixes"), Messages.get(vM0_6_7_X_Changes.class, "bug_06X86")));

        changes = new ChangeInfo("v0.6.5.0-Alpha5-Mid-Autumn", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo("New Content", false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new GhostSprite.PinkGhostSprites(), ("New Limited Quest: Sorrow of the Sundered Moon"),
                ("Between Mid-Autumn and National Day, explore the story of the sorrowful ghosts...")));

        changes = new ChangeInfo("Changes", false, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.INFO), ("Fixes"),
                ("Fixed some errors from the last version")));

        changes = new ChangeInfo("v0.6.5.0-Alpha4.5", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo("New Content", false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(new ItemSprite(ItemSpriteSheet.GREATSWORD,
                new ItemSprite.Glowing( 0xcc7770 )), "New Enchantment: Blast",
                "This enchantment drives the wielder wild, letting explosive energy burst from the weapon: the target takes an area blast, or is briefly crippled. (PS: the blast does not destroy items)\n"));

        changes.addButton(new ChangeButton(PasswordBadgeBanner.image(PaswordBadges.Badge.ZQJ_GHOST.image), ("Two Hidden Badges Preloaded"),
                ("Two hidden badges are preloaded and will be released in a later version.")));

        changes = new ChangeInfo("Changes", false, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);

        Image isa = new SlimeKingSprite();
        isa.scale.set(PixelScene.align(0.89f));
        changes.addButton( new ChangeButton(isa, "Slime Prince",
                "Fixed a cast exception caused by a wrong superclass"));

        changes.addButton(new ChangeButton(Icons.get(Icons.DISPLAY), ("UI Fixes"),
                ("Fixed odd layouts in some screens in the new version")));

        changes.addButton(new ChangeButton(Icons.get(Icons.CHALLENGE_ON), ("Potion Hysteria v0.2"),
                ("The meat pie now always grants strength below 12 Strength, and the overall luck of gaining strength was raised.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Other Changes"),
                ("1. Ghostfire and Blast are now rare enchantments\n\n" +
                        "2. Fixed odd lifesteal from the Vampiric Blade - contributed by:\nzxcPandora\n\n"+
                        "3. Fixed the Potion Hysteria description, the bad Pure Blessing - Guardian Shield description, and added the probe function to the developer elevator -\ncontributed by: zxcPandora")));

        changes = new ChangeInfo("v0.6.5.0-Alpha4", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo("New Content", false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.CHALLENGE_ON), ("Digital Cricket Fights v0.2"),
                ("The developer mode monster placer has more features, give it a try! Also added Goo, the Slime King, the Gnoll Alchemist, the Gnoll Shaman and Flame-C01")));

        changes.addButton(new ChangeButton(Icons.get(Icons.DISPLAY), ("Scrolling Info Bar"),
                ("This is useful when the game is zoomed in or there are many entries.")));

//        changes.addButton(new ChangeButton(BadgeBanner.image(Badges.Badge.BOMBBOW_DIED.image), ("New Badge: Shattered Shards"),
//                ("Another death badge, newcomer: Lament, which means death lovers get one more badge (and anyone missing it has more work to do)")));

        changes = new ChangeInfo("Changes", false, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new SalamanderSprites(), ("Deep Blue Salamander"),
                ("Fixed losses to the Deep Blue Salamander not being recorded on the leaderboard.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.DIEDCROSSBOW), ("Heavy Ballista"),
                ("Fixed using it still consuming darts.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.WAND_REGROWTH), ("Symbiotic Staff"),
                ("Fixed the Symbiotic Staff being usable forever.")));

        changes.addButton(new ChangeButton(new Image("sprites/spinner.png", 144, 0, 16, 16),
                Messages.get(ChangesScene.class, "bugfixes"), Messages.get(vM0_6_7_X_Changes.class, "bug_06X85")));

        changes = new ChangeInfo("v0.6.5.0-Alpha3", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo("New Content", false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.CHALLENGE_ON), ("Developer Mode Update"),
                ("Added more developer options, fixed some issues, and the monster placer now supports Digital Cricket Fights")));

        Image dragonSprite = new FireDragonSprite();
        dragonSprite.scale.set(PixelScene.align(0.72f));
        changes.addButton(new ChangeButton(dragonSprite, ("Lava Fire Dragon Preloaded"),
                ("Jungle extra boss - the Lava Fire Dragon is preloaded and should arrive in Alpha7.")));

        changes = new ChangeInfo("Changes", false, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.DIEDCROSSBOW), ("Heavy Ballista"),
                ("It no longer needs darts as ammo, but it has a reload time.")));

        Image xa = new SakaFishBossSprites();
        xa.scale.set(PixelScene.align(0.72f));
        changes.addButton(new ChangeButton(xa,  "Sakaban Fish",
                "Base defense set to 35, and regular damage reduced."));

        changes.addButton(new ChangeButton(new Image("sprites/spinner.png", 144, 0, 16, 16),
                Messages.get(ChangesScene.class, "bugfixes"), Messages.get(vM0_6_7_X_Changes.class, "bug_06X84")));

        changes = new ChangeInfo("v0.6.5.0-Alpha1-2", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo("New Content", false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.DIEDCROSSBOW), ("Legendary Weapons"),
                ("Testing of the new legendary weapon category has begun. Later versions will require currency to unlock them.")));

        changes.addButton(new ChangeButton(Icons.get(Icons.BADGES), ("Encrypted Badges"),
                ("Added encrypted badges, opened with a long press on the badges button. They track hidden achievements.\n\n_Note:_ these achievements stay hidden until you earn them")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes"),
                ("1. Added the ability to pause the changelog UI\n\n" +
                        "2. A few bug fixes")));

        changes = new ChangeInfo("Changes", false, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);

        Image a = new SakaFishBossSprites();
        a.scale.set(PixelScene.align(0.72f));
        changes.addButton(new ChangeButton(a,  "Sakaban Fish",
                "Some numbers were balanced."));

        changes.addButton(new ChangeButton(new Image("sprites/spinner.png", 144, 0, 16, 16),
                Messages.get(ChangesScene.class, "bugfixes"), Messages.get(vM0_6_7_X_Changes.class, "bug_06X83")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Tweaks"),
                ("1. Books no longer stack, and some achievements changed\n\n" +
                        "2. Other bug fixes")));
    }

    public static void add_v0_6_55_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.6.4.0-BetaI-XIII", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo("New Content", false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton((new Image("Ling.png", 0, 0, 16, 16)), ("From the Developer"),
                ("Hello, I have not written a developer note in a long time. Lately I have been really busy.\n" +
                        "I only get to work on Magic Ling in the evening, and I always stay up late.\n" +
                        "I am not sure how much longer I can keep this up.\n" +
                        "I think I need a rest.\n" +
                        "And I will slow down the update rate; Magic Ling has been updating too fast.\n"+
                        "So future updates may come a little slower.\n"+
                        "Still, I hope you all enjoy playing. After all, no one can live inside a virtual world forever.\n" +
                        "Real life has plenty waiting, and it is time for me to rebalance.\n"+
                        "So, best of luck with your adventures!")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Quick Slots v1/v2"),
                ("Quick slots are down to 9. v1 is the original Magic Ling bar, v2 is the optimized one borrowed from Carbon. Take your pick.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.ALCH_PAGE), ("Alchemy UI Improvements"),
                ("Improved the alchemy guide.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.TORCH), ("Torch Changes"),
                ("Torches now act as fuel for the lights.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.ARMOR_ANCITY), ("Shell Armor"),
                ("Armor from ancient times. Will you use it now, or save it for the right moment?")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.RING_DIAMOND), ("Ring of Wealth"),
                ("The Ring of Wealth has been synced with Shattered.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.FIREFISHSWORD), ("Imperial Sword"),
                ("The Imperial Sword has been rebalanced and now has two forms you can switch between. How exactly, you will have to find out yourselves")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.LANTERNB), ("Deep Investigation"),
                ("Casual mode is now Deep Investigation, and a new Golden Age casual mode was added.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SCROLL_LAGUZ), ("Scroll of Upgrade"),
                ("Added a button to use all upgrade scrolls")));

        changes.addButton(new ChangeButton(Icons.get(Icons.DISPLAY), ("In-Game Region Text"),
                ("Every region now has its own text, for a more immersive feel.")));

        Image a = new SakaFishBossSprites();
        a.scale.set(PixelScene.align(0.72f));
        changes.addButton(new ChangeButton(a,  "New Boss: Sakaban Fish",
                "A leader-class boss of the ancient ruins. Come and give it a try."));

        changes = new ChangeInfo("Changes", false, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SAI), ("Vampiric Blade - Beta13"),
                ("Fixed some lifesteal weighting issues.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.WRALIPS), ("Dark Gold Gem Amulet"),
                ("Its cap is now +10, and some issues were fixed")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SCROLL_ODAL), ("Scroll of Upgrade"),
                ("Fixed upgrade scrolls sometimes being lost, and added balanced distribution: if you find 4 upgrades in region 1, you get only two in the Prison. The total stays the same.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.WAND_REGROWTH), ("Staff of Regrowth"),
                ("Fixed some issues, and it can now be used continuously.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_15), ("Challenge Bonus"),
                ("At high challenge counts the lantern holds more, shops sell more lamp oil, but each drop in the lights may be worse!")));

        changes.addButton(new ChangeButton(Icons.get(Icons.CHALLENGE_ON), ("Fragmented"),
                ("Fragmented got some monster set tuning, and the troll blacksmith quest was adjusted (troll bat quests in Fragmented do grant mutation buffs)")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("Miscellaneous Changes"),
                ("Added a pity system for boss-exclusive weapons: after three runs without one, the next drop is guaranteed")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.GREATSHIELD), ("Tier-5 Weapons"),
                ("Tier-5 weapon generation is now more even")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SAI), ("Vampiric Blade - Beta12"),
                ("Numbers tuned and lifesteal weighting adjusted.")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.LOCK_SWORD_DIAMOND), ("Keyblade of Return"),
                ("It now gives very little experience from monsters; most experience comes from picking up keys to absorb energy while wielding it.")));

        changes.addButton(new ChangeButton(new Image("sprites/spinner.png", 144, 0, 16, 16),
                Messages.get(ChangesScene.class, "bugfixes"), Messages.get(vM0_6_7_X_Changes.class, "bug_06X82")));

    }

    public static void add_v0_6_54_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.6.4.0-Beta1", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo("New Content", false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(new Image(Assets.Environment.TILES_SEWERS, 48, 80, 16
                , 16), "Room Changes",
                "New rooms: the Insight Tombstone room and the Taiji Bagua room"));

        changes.addButton(new ChangeButton(new ShopkeeperSprite(), ("Buyback System"),
                ("Shops now have a buyback system; everything except the Shop Lord and Nyazaki sells back at full price")));

        changes = new ChangeInfo("Changes", false, null);
        changes.hardlight(Window.CYELLOW);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new PinkLingSprite(), ("Miscellaneous Changes"),
                ("Optimized parts of the dungeon data and laid the groundwork for the upcoming daily hunts and more.")));

        changes.addButton(new ChangeButton(new Image("sprites/spinner.png", 144, 0, 16, 16),
                Messages.get(ChangesScene.class, "bugfixes"), Messages.get(vM0_6_7_X_Changes.class, "bug_06X81")));

    }
}
