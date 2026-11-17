package com.shatteredpixel.shatteredpixeldungeon.ui.changelist;

import com.shatteredpixel.shatteredpixeldungeon.Assets;
import com.shatteredpixel.shatteredpixeldungeon.messages.Messages;
import com.shatteredpixel.shatteredpixeldungeon.scenes.ChangesScene;
import com.shatteredpixel.shatteredpixeldungeon.scenes.PixelScene;
import com.shatteredpixel.shatteredpixeldungeon.sprites.CausticSlimeSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.CharSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.DM720Sprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.FireGhostSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.GhostSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSpriteSheet;
import com.shatteredpixel.shatteredpixeldungeon.sprites.KagenoNusujinSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.KingSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.MolotovHuntsmanSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.MurdererSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.RatSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.RedSprites;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ShieldHuntsmanSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.SlimeKingSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.SlylSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.SnakeSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.SzSprites;
import com.shatteredpixel.shatteredpixeldungeon.sprites.TenguSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.YogSprite;
import com.shatteredpixel.shatteredpixeldungeon.ui.Icons;
import com.shatteredpixel.shatteredpixeldungeon.ui.Window;
import com.watabou.noosa.Image;

import java.util.ArrayList;

public class S_Changes {

    public static void addAllChanges( ArrayList<ChangeInfo> changeInfos ){
        V0_d_XChanges(changeInfos);
        V0_c_XChanges(changeInfos);
        V0_b_XChanges(changeInfos);
        V0_a_XChanges(changeInfos);
        V0_0_XChanges(changeInfos);
        V0_1_XChanges(changeInfos);
        V0_2_XChanges(changeInfos);
        V0_4_XChanges(changeInfos);
        V0_4_6Changes(changeInfos);
        V0_4_0Changes(changeInfos);
        V0_0_2Changes4(changeInfos);
        V0_0_2Changes3(changeInfos);
        V0_0_2Changes2(changeInfos);
        V0_0_2Changes1(changeInfos);
        V0_0_1Changes(changeInfos);
        Dev_Changes4(changeInfos);
        Dev_Changes3(changeInfos);
        Dev_Changes2(changeInfos);
        Dev_Changes(changeInfos);
        V0_0_2Changes(changeInfos);
    }

    public static void  V0_d_XChanges( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.4.8.0-Release", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton (new ChangeButton(new Image("sprites/spinner.png", 144, 0, 16, 16),
                "Bug Fixes",
                "_-_ _2021-6-5_\n" +
                        "_-_ 1. Fixed a pile of bugs, including:\n" +
                        "_-_ A. Being full no longer leaves you hungry\n" +
                        "_-_ B. Fixed the spawn weights of some monsters" +
                        "\n" +
                        "Dev:_JDSA-Ling_"));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(CharSprite.POSITIVE);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), "New Weapons",
                "_-_ A. Jungle Stinger\n" +
                        "_-_ B. Kite Shield" +
                        "\n" ));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight( CharSprite.NEGATIVE );
        changeInfos.add(changes);

        Image i = new Image(new MolotovHuntsmanSprite());
        i.scale.set(PixelScene.align(0.74f));
        changes.addButton( new ChangeButton(new MolotovHuntsmanSprite(), "Blood Moon Torch Hunter",
                "Nerfed the _Blood Moon Torch Hunter_!\n" +
                        "Health cut from _169_ to _60_\n" +
                        "Attack went from _4x_ to _2x_)\n" +
                        "Dev:JDSA Ling"));

        Image a = new Image(new DM720Sprite());
        i.scale.set(PixelScene.align(0.74f));
        changes.addButton( new ChangeButton(new DM720Sprite(), "DM-720",
                "Nerfed _DM-720_!\n" +
                        "Health cut from _3000_ to _200_\n" +
                        "Attack went from _2x_ to _1.3x_\n" +
                        "_Shock damage_ reduced\n" +
                        "Dev:JDSA Ling"));

    }

    public static void  V0_c_XChanges( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.4.8.4 CS Edition", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton (new ChangeButton(new Image("sprites/spinner.png", 144, 0, 16, 16),
                "Bug Fixes",
                "_-_ _2021-6-4_\n" +
                        "_-_ 1. Fixed a pile of bugs, including:\n" +
                        "_-_ A. Fixed the crash from falling down stairs (other cases may remain)\n" +
                        "_-_ B. Fixed the prison thief getting stuck during its dash" +
                        "\n" +
                        "Dev:_JDSA-Ling_"));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(CharSprite.POSITIVE);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), "Pre-fight Records",
                "Boss floors now keep pre-fight records"));

    }

    public static void  V0_b_XChanges( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.4.8.3 CS Edition", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image("sprites/spinner.png", 144, 0, 16, 16), "Bug Fixes",
                "_-_ _2021-6-4_\n" +
                        "_-_ 1. Fixed a pile of bugs, including:\n" +
                        "_-_ A. Fixed the ghost quest\n" +
                        "_-_ B. Adjusted the experience dropped by some monsters" +
                        "\n" +
                        "Dev:_JDSA-Ling_"));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(CharSprite.POSITIVE);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new DM720Sprite(), "DM720",
                "DM300 has been reworked and strengthened\n\n" +
                        "and renamed to DM-720\n\n" +
                        "New DM-720 features\n" +
                        "1. It regenerates health while moving on water\n" +
                        "2. A stronger _knockback_\n" +
                        "3. It repairs itself at _low health_\n" +
                        "4. Its _arcane shielding_ is _much stronger_\n" +
                        "5. _Energy pylons_ in _elimination mode_ gain _extra health_\n\n" +
                        "PS: the _art_ here is not used in game, it is only here to _look nice_"));

        changes.addButton(new ChangeButton(new Image(Assets.Environment.TILES_SEWERS, 48, 48, 16
                , 16), "Floor 15 Changes",
                "Floor 15 has seen some changes\n" +
                        "See the group update notes for details\n\n" +
                        "_-_ MLPD\n\n"));
    }

    public static void  V0_a_XChanges( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.4.8.2 CS Edition", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image("Ling.png", 0, 0, 16, 16), "Bug Fixes",
                "_-_ _2021-6-3_\n" +
                        "_-_ 1. Fixed a pile of bugs, including:\n" +
                        "_-_ 2. DM300 fixes\n" +
                        "\n" +
                        "Dev:_JDSA-Ling_"));

    }

    public static void  V0_0_XChanges( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.4.8.1 CS Edition", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new Image("Ling.png", 0, 0, 16, 16), "Bug Fixes",
                "_-_ _2021-6-3_\n" +
                        "_-_ 1. Fixed a pile of bugs\n" +
                        "_-_ 2. DM201 now appears in the Caves\n" +
                        "_-_ 3. Removed the red slime\n" +
                        "_-_ 4. Developer mode fixes" +
                        "\n" +
                        "Dev:_JDSA-Ling_"));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(CharSprite.POSITIVE);
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(new GhostSprite(), "Ghost Quest",
                "The ghost quest no longer has an angry crab; the crab now waits in a special room. The ghost also gives a richer reward."));

    }

    public static void  V0_1_XChanges( ArrayList<ChangeInfo> changeInfos ){
        ChangeInfo changes = new ChangeInfo("v0.4.8.0 CS Edition", true, "");
        changes.hardlight( Window.TITLE_COLOR );
        changeInfos.add(changes);

        changes = new ChangeInfo( Messages.get( ChangesScene.class, "changes"), false, null);
        changes.hardlight( Window.TITLE_COLOR );
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(new Image("Ling.png", 0, 0, 16, 16), "Dev Log",
                "_-_ _2021-6-2_\n" +
                        "_-_ 1. Fixed a pile of bugs\n" +
                        "_-_ 2. UI fixes\n" +
                        "_-_ 3. Adjusted the dungeon's floor count\n" +
                        "\n" +
                        "Dev:_JDSA-Ling_"));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight( CharSprite.POSITIVE );
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(Icons.get(Icons.CHALLENGE_ON),
                "New Challenge: Famine Pact",
                "\n"+
                        "They say a body needs its bread. Skip a meal and you drop dead. Welcome to the Famine Pact!\n" +
                        "Pact details: while starving,\n" +
                        "you take true damage equal to 50% of your health every so often.\n" +
                        "You also start with 6 emergency rations"+
                        "\n"));
    }

    public static void  V0_2_XChanges( ArrayList<ChangeInfo> changeInfos ){
        ChangeInfo changes = new ChangeInfo("v0.4.2.0 Full Release", true, "");
        changes.hardlight( Window.TITLE_COLOR );
        changeInfos.add(changes);

        changes = new ChangeInfo( Messages.get( ChangesScene.class, "changes"), false, null);
        changes.hardlight( Window.TITLE_COLOR );
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(new Image("Ling.png", 0, 0, 16, 16), "Dev Log",
                "_-_ _2021-3-29_\n" +
                        "_-_ 1. Fixed a pile of bugs\n" +
                        "_-_ 2. Prettier UI\n" +
                        "\n" +
                        "Dev:_JDSA-Ling_"));

        changes.addButton( new ChangeButton(Icons.get(Icons.PREFS), Messages.get(ChangesScene.class, "misc"),
                "Every hero now starts with:\n"+
                        "1. 7 Potions of Healing\n"+
                        "2. 5 Potions of Mind Vision\n"+
                        "3. 3 Scrolls of Identify\n"+
                        "4. 1 Scroll of Upgrade\n"+
                        "5. 12 rations"));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight( CharSprite.POSITIVE );
        changeInfos.add(changes);

        Image i = new Image(new ShieldHuntsmanSprite());
        i.scale.set(PixelScene.align(0.74f));
        changes.addButton( new ChangeButton(new ShieldHuntsmanSprite(), "Blood Moon Shield Bounty Hunter",
                "A horribly twisted creature that starts appearing in the Dwarven Metropolis!\n"+
                        "Be careful: this monster can _knock your weapon away_!\n"+
                        "It may also _root you in place_!"));

    }
    public static void  V0_4_XChanges( ArrayList<ChangeInfo> changeInfos ){
        ChangeInfo changes = new ChangeInfo("v0.4.0.X-Beta", true, "");
        changes.hardlight( Window.TITLE_COLOR );
        changeInfos.add(changes);

        changes = new ChangeInfo( Messages.get( ChangesScene.class, "changes"), false, null);
        changes.hardlight( Window.TITLE_COLOR );
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(new Image("Ling.png", 0, 0, 16, 16), "Dev Log",
                "_-_ _2021-3-28_\n" +
                        "_-_ 1. Fixed the crash on floor 31\n" +
                        "_-_ 2. Major UI overhaul\n" +
                        "\n" +
                        "Dev:_JDSA-Ling_"));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight( CharSprite.NEGATIVE );
        changeInfos.add(changes);

        Image i = new Image(new SzSprites());
        i.scale.set(PixelScene.align(0.74f));
        changes.addButton( new ChangeButton(new RedSprites(), "_Crimson Slime Guardian",
                "Nerfed the _Crimson Slime Guardian_!"));

    }
    public static void  V0_4_6Changes( ArrayList<ChangeInfo> changeInfos ){
        ChangeInfo changes = new ChangeInfo("v0.4.0.6-Release", true, "");
        changes.hardlight( Window.TITLE_COLOR );
        changeInfos.add(changes);

        changes = new ChangeInfo( Messages.get( ChangesScene.class, "changes"), false, null);
        changes.hardlight( Window.TITLE_COLOR );
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(new Image("Ling.png", 0, 0, 16, 16), "Dev Log",
                "_-_ _2021-3-25_\n" +
                        "_-_ 1. Fixed countless bugs\n" +
                        "_-_ 2. New boss: the Slime King\n" +
                        "\n" +
                        "Dev:_JDSA-Ling_"));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight( CharSprite.POSITIVE );
        changeInfos.add(changes);

        Image i = new Image(new SzSprites());
        i.scale.set(PixelScene.align(0.74f));
        changes.addButton( new ChangeButton(new SzSprites(), "Slime Guardian",
                "Slime Guardians are for the floor 10 boss!"));

        Image a = new SlimeKingSprite();
        a.scale.set(PixelScene.align(0.82f));
        changes.addButton(new ChangeButton(a,  "Slime King",
                "Floor 10 boss!"));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
        changes.hardlight( CharSprite.POSITIVE );
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(new Image(new RatSprite()), "Rats Buffed",
                "Rats gained both _attack and survivability_"));

        changes.addButton( new ChangeButton(new Image(new SnakeSprite()), "Sewer Snake Buffed",
                "The snake gained both _attack and survivability_"));

    }

    public static void  V0_4_0Changes( ArrayList<ChangeInfo> changeInfos ){
        ChangeInfo changes = new ChangeInfo("v0.4.0-Release", true, "");
        changes.hardlight( Window.TITLE_COLOR );
        changeInfos.add(changes);

        changes = new ChangeInfo( Messages.get( ChangesScene.class, "new"), false, null);
        changes.hardlight( Window.TITLE_COLOR );
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(new Image("Ling.png", 0, 0, 16, 16), "Dev Log",
                "_-_ _2021-3-24_\n" +
                        "_-_ 7 days since the last update - previous version was _0.3.0.8D_\n" +
                        "_-_ 18 days since the last update - previous version was _0.3.0.1_\n" +
                        "\n" +
                        "Dev:_JDSA-Ling_"));

        changes.addButton( new ChangeButton(Icons.get(Icons.CHALLENGE_ON), "New Challenges",
                "_New challenges added:\n" +
                        "_-_ 1. _Demonic Water_:\n" +
                        "_-_ You take damage from stepping in water, but you start with ten pieces of quicklime! The quicklime code comes from Komeiji Satori Dungeon!\n\n" +
                        "_-_ 2. _Elite Battlefield_:\n" +
                        "_Monsters grow too, so watch your step!\n\n" +
                        "_3._ Empty Pockets & Deep in Debt_\n"+
                        "_One stops gold from spawning in the dungeon, the other removes gold entirely_"));

        changes.addButton( new ChangeButton(new ItemSprite(ItemSpriteSheet.HERB_BAG), "_Food Bag_",
                "You have a chance to get this item from _Goo_\n\nor you may find it at the _shop_"));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight( CharSprite.WARNING );
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(new ItemSprite(ItemSpriteSheet.RedBloodMoon), "Crimson Blood Moon Sword",
                "It can now summon _Blood Moon Puppets_ with _3 health_, and the puppets grow automatically with your weapon!"));

        changes.addButton( new ChangeButton(new ItemSprite(ItemSpriteSheet.BOMB_SWORD), "Bomb Dagger",
                "Weapons dropped by the Bomb Dagger no longer _explode instantly_!"));

        changes.addButton( new ChangeButton(new MurdererSprite(), "Blood Moon Thief",
                "_Removed for now!_"));

        changes.addButton( new ChangeButton(new FireGhostSprite(), "Flame Wraith",
                "_Removed for now!_"));

        changes.addButton( new ChangeButton(new Image( Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "In short, _countless bugs_ were fixed and I am _too lazy to write them all up_!"));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
        changes.hardlight( CharSprite.POSITIVE );
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(new Image(new CausticSlimeSprite()), "Goo Buffed",
                "Goo's _health_ was increased"));

        changes.addButton( new ChangeButton(new TenguSprite(), "Tengu Buffed",
                "Tengu's _health_ was increased"));

        changes.addButton( new ChangeButton(new KingSprite(), "Dwarf King Buffed",
                "The King's _health and attack_ were increased"));

        changes.addButton( new ChangeButton(new YogSprite(), "Yog Buffed",
                "Yog's _health_ was increased"));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight( CharSprite.NEGATIVE );
        changeInfos.add(changes);

        changes.addButton( new  ChangeButton(new KagenoNusujinSprite(),"Shadow Thief",
                "The Shadow Thief's _attack_ was reduced"));
    }

    public static void V0_0_2Changes4(ArrayList<ChangeInfo> arrayList) {
        ChangeInfo changeInfo = new ChangeInfo("V0.3.0.8-9 Hotfix", true, "");
        changeInfo.hardlight(16776960);
        arrayList.add(changeInfo);
        changeInfo.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.HIGHTWAND_3), "Removal", "Removal notice:\n\n" +
                "This thing was full of bugs, so I have removed it for now! It will come back later, stay tuned!\n\n"));
        changeInfo.addButton(new ChangeButton(new Image("sprites/spinner.png", 144, 0, 16, 16),
                "Bug Fixes", "Bugs fixed across 0.3.0.7-0.3.0.8:\n1. The crash on _floor 15_\n2. New NPCs could be killed by the _mage's staff_\n3. A crash in _DM300_'s act\n4. Save corruption from the _staff of living earth_\n5. Bad frame slicing on the _new NPCs_\n\n"));
        ChangeInfo changeInfo2 = new ChangeInfo("V0.3.0.5 New NPC", true, "");
        changeInfo2.hardlight(65280);
        arrayList.add(changeInfo2);
        changeInfo2.addButton(new ChangeButton(new Image(Assets.Sprites.REN, 0, 0, 13, 16), "REN",
                "A face you seem to know. You must have met him somewhere.\n\n"));
        changeInfo2.addButton( new ChangeButton(new SlylSprite(), "Frostfall Yuliang", "Empress of the _Ice Holy City_. Nobody knows her true power!\n" +
                "\n"));
        changeInfo2.addButton(new ChangeButton(new Image("sprites/npc/rt.png", 0, 0, 16, 16), "Observe_Sir", "A traveller from another world. His bowler hat is his weapon of choice.\n\n"));
        ChangeInfo changeInfo3 = new ChangeInfo("V0.3.0.4 Hotfix", true, "");
        changeInfo3.hardlight(16711680);
        arrayList.add(changeInfo3);
        changeInfo3.addButton(new ChangeButton(new Image("sprites/spinner.png", 144, 0, 16, 16),
                "Bug Fixes", "Fixed the crash caused by a bad _private_ variable in the Bomb Dagger. It is _public_ now.\n\n"));
        ChangeInfo changeInfo4 = new ChangeInfo("New Font!", true, "");
        changeInfo4.hardlight(65280);
        arrayList.add(changeInfo4);
        changeInfo4.addButton(new ChangeButton(new Image("ttf.png", 0, 0, 16, 16), "New Font", "Font updated! The font is _Black Ruyt_\n\nTo use it, turn off the system font in the game settings\n\n"));
        ChangeInfo changeInfo5 = new ChangeInfo("V0.3.0.3", true, "");
        changeInfo5.hardlight(16711680);
        arrayList.add(changeInfo5);
        changeInfo5.addButton(new ChangeButton(new Image("sprites/spinner.png", 144, 0, 16, 16), "Bug Fixes", "Fixed the crash when transmuting weapons"));
        changeInfo5.addButton(new ChangeButton(new Image("Ling.png", 0, 0, 16, 16), "Changes", "The Crimson Blood Moon Sword is now a _tier-4 weapon_\nMusic has been optimized and replaced\n\nMusic from _BilBovDev_'s skill dungeon was added with the author's permission\n\nSome UI textures were cleaned up and polished\n\n"));
        ChangeInfo changeInfo6 = new ChangeInfo("v0.3.0.1b", true, "");
        changeInfo6.hardlight(16711935);
        arrayList.add(changeInfo6);
        ChangeInfo changeInfo7 = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changeInfo7.hardlight(16711935);
        arrayList.add(changeInfo7);
        changeInfo7.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.MAGIC_INFUSE, null), "New Monster", "1. Added a monster\n\n"));
        changeInfo7.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CURSE_INFUSE, null), "New Mechanic", "Some dungeon mechanics have changed\n\n"));
        ChangeInfo changeInfo8 = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changeInfo8.hardlight(16745258);
        arrayList.add(changeInfo8);
        changeInfo8.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHEST, null), "Bug Fixes", "Fixed the following:\n\n1. The crash on floor 26 from the last version\n\n2. Some UI issues\n\n"));
        changeInfo8.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.RING_OPAL, null), "Weapon Changes", "Weapon: _Blood Red Demon Sword_\n- It was a _tier-5 weapon_ on release and is now a _tier-8 weapon_\n\n"));
        ChangeInfo changeInfo9 = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
        changeInfo9.hardlight(16711935);
        arrayList.add(changeInfo9);
        changeInfo9.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.HOLSTER, null), "Buff Log A", "0.2.7 Buffed the blue sword\n\n0.2.8 Buffed the staff of blue flame\n\n"));
        changeInfo9.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.ARTIFACT_HOURGLASS, null), "Buff Log B", "Up\n\n"));
        ChangeInfo changeInfo10 = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changeInfo10.hardlight(16711680);
        arrayList.add(changeInfo10);
        changeInfo10.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.WAND_FROST, null), "Nerf Log A", "1. Azure Judgment Sword\n- Its accuracy and damage were reduced this version; it now deals around 20-35 damage\n\n"));
        changeInfo10.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.WAND_LIGHTNING, null), "Nerf Log B", "Up"));
        ChangeInfo changeInfo11 = new ChangeInfo("V0.3.0.0 Major Update", true, "");
        changeInfo11.hardlight(65280);
        arrayList.add(changeInfo11);
        changeInfo11.addButton(new ChangeButton(new Image("Ling.png", 0, 0, 16, 16), "0.0.3 Reborn", "V0.0.3 changelog:\nBug fixes:\n1. Fixed a _crash_ from a UI variable\nNew content:\n1. Added _technical advisor: Red Dragon_ to floor 0\n2. Floor 0 NPC [Those Memories]\n3. More floors, _for now_\nChanges:\n1. _The beacon of time and space returns_\n2. Power saving mode is now overclock mode\n3. Better inventory UI layout\n4. Changed starting items\n\nFrom the developer:\nThis is _JDSA-Ling_. That is everything in this update. Because of school, the next update will come after my last year of high school ends. Don't worry, it won't be long. I'm on the vocational early admission track. Have fun with the new version, and we'll meet again after that. ByeBye\nDev date: 2021-2-28 JDSA-Ling\n\n"));
        ChangeInfo changeInfo12 = new ChangeInfo("V0.2.9.0", true, "");
        changeInfo12.hardlight(65280);
        arrayList.add(changeInfo12);
        changeInfo12.addButton(new ChangeButton(new Image("sprites/npc/Nxhy.png", 0, 0, 16, 16), "New NPC", "The Those Memories merchant can now be _found on floor 1_\n\nand you can trade with him\n\nNote: in the upcoming _0.3_ version he will move _to floor 0_"));
        ChangeInfo changeInfo13 = new ChangeInfo("V0.2.8.0-5", true, "");
        changeInfo13.hardlight(16711680);
        arrayList.add(changeInfo13);
        changeInfo13.addButton(new ChangeButton(new Image("sprites/spinner.png", 144, 0, 16, 16), "Bug Fixes", "Fixed a crash caused by a bad line in the level generator\n\n-0.2.8.3"));
        changeInfo13.addButton(new ChangeButton(new Image("sprites/SRPD/BlackGhost.png", 0, 0, 16, 16), "New Monster", "_Black Wraith_\n\n_Starts spawning in the Prison_\n\n-0.2.8.5"));
        ChangeInfo changeInfo14 = new ChangeInfo("V0.2.7.0", true, "");
        changeInfo14.hardlight(16736000);
        arrayList.add(changeInfo14);
        changeInfo14.addButton(new ChangeButton(new Image("sprites/spinner.png", 144, 0, 16, 16), "Bug Fixes", "1. Fixed a crash from the _staff of corrosion_\n\n2. Fixed a variable problem in the _Keyblade_ [fixed by _Ren_]\n\n3. Fixed the _crash on floor reset_; this should be solved in theory"));
        changeInfo14.addButton(new ChangeButton(new Image("sprites/snake.png", 0, 0, 14, 16), "New Monster", "_Sewer Snake_\n\n_Starts spawning on floor 3_"));
        changeInfo14.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.HIGHTWAND_3), "New Staff", "Phantom Blue _Fireblast_ Staff\n\nThe staff is made of _blue phosphorus_ and trimmed with _violet leaves_, which makes it look rather imposing. Its tip crackles and hisses, eager to unleash its _mighty magic._"));
        ChangeInfo changeInfo15 = new ChangeInfo("V0.2.5-6", true, "");
        changeInfo15.hardlight(65535);
        arrayList.add(changeInfo15);
        changeInfo15.addButton(new ChangeButton(new Image("Ling.png", 0, 0, 16, 16), "Dev Log", "Today was not _an update day,_ but I took my phone down, so here is a small update.\n\nSpecial thanks to _Ren_ for the _new weapon_ and _new monsters_\n\nUpdate date: _2021-2-23_"));
        changeInfo15.addButton(new ChangeButton(new Image("sprites/SRPD/MolotovHuntsman.png", 0, 0, 16, 16), "New Monster", "_Blood Moon Torch Bounty Hunter_\n\n_Starts spawning in the Caves_"));
        changeInfo15.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.MagicBlueSword), "Weapon Changes", "The Crimson Blood Moon Sword is now a _tier-7_ weapon and attacks slowly\n\nThe Phantom Blue Judgment Sword had its _damage reduced_."));
        ChangeInfo changeInfo16 = new ChangeInfo("V0.0.2.c-Ren-Create", true, "");
        changeInfo16.hardlight(65535);
        arrayList.add(changeInfo16);
        changeInfo16.addButton(new ChangeButton(new Image(Assets.Sprites.REN, 0, 0, 13, 16), "Handover", "...." +
                "...........\n.......\n\n.....Hello....\n  I am MR.REN.\nMy LING assistant is hurrying away to carry out a mission;\n  to complete a whisper from far-off Sakhalin, he will circle magnetic fields at the limits of negentropy and the Curie point, and pray to the copper coils in the great cheer box...\nChild of hardship, your figure gliding in the air layer above the moon: entrust everything behind you, everything behind you, to me for a while, and call my name!!!...\n......Signal lost....\n...........\n......"));
        changeInfo16.addButton(new ChangeButton(new Image("sprites/king.png", 0, 0, 13, 16),
                "Monster Changes", "Some monster issues were fixed, as follows:\n-_Dwarf King\n-_Little Goo - Test Subject\n-_DM-3000\n-_Tengu - Fire Beacon_ _-_ MLPD\nAll of them spawn on floor 24"));
        changeInfo16.addButton(new ChangeButton(new Image("sprites/zei.png", 0, 0, 12, 13), "New Monsters", "Several monsters were added:\n-_Red Wraith\n-_Shadow Thief"));
        changeInfo16.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.DAIRI_KYAN), "New Weapons", "New weapons:\n-_Barbarian Battle Axe\n-_Bomb Dagger\n-_Keyblade"));
        ChangeInfo changeInfo17 = new ChangeInfo("V0.3.0.0", true, "");
        changeInfo17.hardlight(65535);
        arrayList.add(changeInfo17);
        changeInfo17.addButton(new ChangeButton(new Image("sprites/king.png", 0, 0, 14, 16), "New Monster", "New monsters:\n-_Dwarf King\n-_Little Goo - Test Subject\n-_DM-3000\n-_Tengu - Fire Beacon_ _-_ MLPD\nAll of them spawn on floor 24"));
        changeInfo17.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.POUCH), "Changes", "Starting items changed:\n-_40 Potions of Mind Vision\n-_40 rations\n-_10 Scrolls of Upgrade & Identify_ _-_ MLPD"));
    }

    public static void V0_0_2Changes3(ArrayList<ChangeInfo> var0) {
        ChangeInfo var1 = new ChangeInfo("V0.0.1.7-9", true, "");
        var1.hardlight(65535);
        var0.add(var1);
        var1.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.POUCH), "Changes", "Starting items added:\n-_5_ Potions of Mind Vision\n-_2_ Scrolls of Upgrade\n-_2_ Scrolls of Identify\n-_6000_ starting gold _-_ MLPD\n\n"));
        var1.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.RedBloodMoon), "New Weapons", "New weapons:\n-_Azure Judgment Sword\n-_Black Dog Claw\n-_Crimson Blood Moon Sword_ _-_ MLPD\n\n"));
    }

    public static void  V0_0_2Changes2( ArrayList<ChangeInfo> changeInfos ){
        ChangeInfo changes = new ChangeInfo("New Monsters & Bug Fixes", false, "");
        changes.hardlight(0x00ff00);
        changeInfos.add(changes);
        changes.addButton( new ChangeButton(new Image("sprites/SRPD/TorchHuntsman.png", 0, 0, 16, 16), "Monster Changes",
                "New monsters!!!\n" +
                        "-Sewers:\n-_Brown Rat,\n-_Grey Rat,\n-_Old Rat,\n(from OGPD)" +
                        "\n-Prison: _Bounty Hunter_\n(from SRPD)"+
                        "\n-Caves: _Flame-B01_\n(from OGPD)"+
                        "\nLater floors are in development, stay tuned\n\n"+
                        "_-_ MLPD\n\n"));

        changes.addButton( new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16),
                Messages.get(ChangesScene.class, "bugfixes"),
                "Fixed the following bugs:\n" +
                        "_-_ A pathfinding issue could crash the game when you fell down stairs\n" +
                        "_-_ Fixed brown rats one-shotting you\n" +
                        "_-_ Improved the music interface\n\n" ));

    }

    public static void V0_0_2Changes1( ArrayList<ChangeInfo> changeInfos ){
        ChangeInfo changes = new ChangeInfo("Dungeon Changes", false, "");
        changes.hardlight(0x00ffff);
        changeInfos.add(changes);
        changes.addButton( new ChangeButton(new Image(Assets.Sprites.WARRIOR, 0, 15, 12, 15), "Hero Stat Changes",
                "\n-Max level is now 100, so you never have to worry about capping at 30\n\n"+
                        "_-_ MLPD"));

        changes.addButton( new ChangeButton(new Image(Assets.Environment.TILES_SEWERS, 48, 48, 16
                , 16), "Room Changes",
                "Room counts have been adjusted, as shown below\n" +
                        "-Sewers: _9 rooms_, _20_ default spawns, _7_ extra spawns\n" +
                        "-Prison: _8 rooms_, _26_ default spawns, _11_ extra spawns\n"+
                        "-Caves: _10 rooms_, _30_ default spawns, _16_ extra spawns\n"+
                        "-Dwarven Metropolis: _12 rooms_, _21_ default spawns, _6_ extra spawns\n"+
                        "-Demon Halls: _6 rooms_, _10_ default spawns, _26_ extra spawns\n"+
                        "Later floors are in development, stay tuned\n\n"+
                        "_-_ MLPD\n\n"));
    }

    public static void V0_0_1Changes(ArrayList<ChangeInfo> changeInfos){
        ChangeInfo changes = new ChangeInfo("v0.0.1-6", true, "");
        changes.hardlight(0x00ff00 );
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight( 0xff00ff );
        changeInfos.add(changes);
        changes.addButton( new ChangeButton(new ItemSprite(ItemSpriteSheet.MAGIC_INFUSE, null), "All-New Content A",
                "1. Every floor has its own BGM, and boss fights have their own tracks\n-2. Added a crash screen, possibly the cutest crash screen ever\n-3. UI tweaks; the default palette is sky blue + purple\n\n"));
        changes.addButton( new ChangeButton(new ItemSprite(ItemSpriteSheet.CURSE_INFUSE, null), "All-New Content B",
                "1. Added the Azure Judgment Sword\n-2. Added the Blood Moon Reaper Sword\n-3. Added Blackie's claws\n-4. Added rat ninjas\n-5. Backpack upgraded to 36 slots\n\n"));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight( 0xff832a );
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(new ItemSprite(ItemSpriteSheet.ARTIFACT_BEACON, null), "Special Thanks",
                "Special thanks:\n- _Alexstrasza_ for the huge help\n- _Ren_ for code guidance\n- _Fw no Fang_ for the assets\n- _kemosquito_ for the logo polish\n- 2021★MLPD\n\n"));
        changes.addButton( new ChangeButton(new ItemSprite(ItemSpriteSheet.RING_OPAL, null), "Weapon Changes",
                "Weapon: _Azure Judgment Sword_\n- It was a _tier-5 weapon_ on release and has dropped to _tier 3_\n\n"));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
        changes.hardlight( 0x00ff00);
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(new ItemSprite(ItemSpriteSheet.HOLSTER, null), "Buff Log A",
                "Nothing yet\n\n"));
        changes.addButton( new ChangeButton(new ItemSprite(ItemSpriteSheet.ARTIFACT_HOURGLASS, null), "Buff Log B",
                "Nothing yet\n\n"));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight( 0xff0000);
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(new ItemSprite(ItemSpriteSheet.WAND_FROST, null), "Nerf Log A",
                "1. Azure Judgment Sword\n- Its accuracy and damage were reduced this version; it now deals around 20-35 damage\n\n"));
        changes.addButton( new ChangeButton(new ItemSprite(ItemSpriteSheet.WAND_LIGHTNING, null), "Nerf Log B",
                "Nothing yet\n\n"));
    }

    public static void Dev_Changes4( ArrayList<ChangeInfo> changeInfos ){
        ChangeInfo changes = new ChangeInfo("v0.0.1.4", false, "");
        changes.hardlight(0xff00ff);
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(Icons.get(Icons.GOLD), "Dev Log",
                "_-_ 2021-2-16\n" +
                        "_-_I came back to the city today for make-up classes in a few days\n" +
                        "_-_So I turned on the computer, installed AS, and successfully imported the project\n" +
                        "_-_And with _Red Dragon_'s guidance I started writing the dungeon in _AS_\n" +
                        "_-_I never understood dungeon code before, and now I can actually read some of it in _AS_\n" +
                        "_-_If _Ren_ had not taught me step by step, I might still just be a _dungeon player_\n" +
                        "_-_My thanks to _Ren_ and _Red Dragon_ for their guidance and help\n" +
                        "_-_Without you, _MLPD_ might have vanished, or never existed at all\n" +
                        "_-_I have make-up classes in a few days; once _my last year of high school ends_, the _MLPD_ project starts in earnest!\n" +
                        "_Feb 16, 2021_, thanks to _Red Dragon_ and _Ren_\n\n"));
    }

    public static void Dev_Changes3( ArrayList<ChangeInfo> changeInfos ){
        ChangeInfo changes = new ChangeInfo("v0.0.1.3", false, "");
        changes.hardlight(0xff0000);
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(Icons.get(Icons.GOLD), "Dev Log",
                "_-_ 2021-2-15\n" +
                        "_-_Argh, I only wanted to change the _language screen_, why is it so much trouble! Change anything in _SMAIL_ and it crashes!\n" +
                        "_-_So I contacted _Red Dragon_, and he helped me right away, and even upgraded _MLPD_ for me\n" +
                        "_Feb 15, 2021_, thanks to _Red Dragon_ for the AS upgrade\n\n"));
    }

    public static void Dev_Changes2( ArrayList<ChangeInfo> changeInfos ){
        ChangeInfo changes = new ChangeInfo("v0.0.1.2", false, "");
        changes.hardlight(0x00ff00);
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(Icons.get(Icons.GOLD), "Dev Log",
                "_-_ 2021-2-14\n" +
                        "_-_Because of my own blindness, adding one weapon took two days, and with my _rotten luck_ it never dropped either\n" +
                        "_-_In the end _Ren_ had to help before I saw my first weapon, so thanks a lot _Ren_!\n" +
                        "_Feb 14, 2021_, a beginner dungeon dev is growing!\n\n"));
    }

    public static void Dev_Changes( ArrayList<ChangeInfo> changeInfos ){
        ChangeInfo changes = new ChangeInfo("v0.0.1.1", false, "");
        changes.hardlight(0x00ffff);
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(Icons.get(Icons.GOLD), "Dev Log",
                "_-_ 2021-2-12\n" +
                        "_-_My _MLPD_ dungeon plan started with REN\n" +
                        "_-_It was a brand new and beautiful day, and I want to tell REN how grateful I am for the guidance\n" +
                        "_Feb 12, 2021_, a new dungeon developer is sprouting!\n\n"));
    }

    public static void V0_0_2Changes(ArrayList<ChangeInfo> changeInfos){
        ChangeInfo changes = new ChangeInfo("V0.0.0", true, "");
        changes.hardlight( 0xff0000 );
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(Icons.get(Icons.GOLD), "Anniversary",
                "2021-2-12\n" +
                        "My dungeon coding career began with _REN_\n" +
                        "_-_ A version to remember, thanks to everyone who supports me\n\n"));


    }
}