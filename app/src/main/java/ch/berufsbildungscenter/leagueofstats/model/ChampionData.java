package ch.berufsbildungscenter.leagueofstats.model;

import android.util.Log;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;

import ch.berufsbildungscenter.leagueofstats.ImageDownloader;

/**
 * Created by zkillt on 18.06.2015.
 */
public class ChampionData {

    private ArrayList<ChampionStat> championStats = new ArrayList<ChampionStat>();

    private String title = "";
    private String name = "";
    private int id = 0;
    private String image;

    // bar variables
    private int attack;
    private int magic;
    private int defense;
    private int difficulty;

    // stat variables
    private double mana;
    private double manaPerLevel;

    private double attackrange;
    private double attackDamage;
    private double attackDamagePerLevel;
    private double attackSpeedPerLevel;
    private double attackSpeedOffset;


    private double hp;
    private double hpPerLevel;

    private double movementSpeed;

    private double armor;
    private double armorPerLevel;
    private double magicResistance;

    private String allyTips;
    private String enemyTips;
    private String lore;

    public void getChampionIconImageButton(ImageButton image) {
        Log.e("Image", "Image: " + this.image);
        String url = "http://ddragon.leagueoflegends.com/cdn/5.12.1/img/champion/" + this.image;
        new ImageDownloader(image).execute(url);
    }
    public void getChampionIconImageView(ImageView image) {
        Log.e("Image", "Image: " + this.image);
        String url = "http://ddragon.leagueoflegends.com/cdn/5.12.1/img/champion/" + this.image;
        new ImageDownloader(image).execute(url);
    }

    public double getAttackSpeedOffset() {
        return attackSpeedOffset;
    }

    public void setAttackSpeedOffset(double attackSpeedOffset) {
        this.attackSpeedOffset = attackSpeedOffset;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public double getManaPerLevel() {
        return manaPerLevel;
    }

    public void setManaPerLevel(double manaPerLevelUp) {
        this.manaPerLevel = manaPerLevel;
    }


    public double getAttackrange() {
        return attackrange;
    }

    public void setAttackrange(double attackrange) {
        this.attackrange = attackrange;
    }

    public double getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(double attackDamage) {
        this.attackDamage = attackDamage;
    }

    public double getAttackDamagePerLevel() {
        return attackDamagePerLevel;
    }

    public void setAttackDamagePerLevel(double attackDamagePerLevel) {
        this.attackDamagePerLevel = attackDamagePerLevel;
    }

    public double getAttackSpeedPerLevel() {
        return attackSpeedPerLevel;
    }

    public void setAttackSpeedPerLevel(double attackSpeedPerLevel) {
        this.attackSpeedPerLevel = attackSpeedPerLevel;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getHpPerLevel() {
        return hpPerLevel;
    }

    public void setHpPerLevel(double hpPerLevel) {
        this.hpPerLevel = hpPerLevel;
    }

    public double getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(double movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public double getArmorPerLevel() {
        return armorPerLevel;
    }

    public void setArmorPerLevel(double armorPerLevel) {
        this.armorPerLevel = armorPerLevel;
    }

    public double getMagicResistance() {
        return magicResistance;
    }

    public void setMagicResistance(double magicResistance) {
        this.magicResistance = magicResistance;
    }

    public double getMagicResistancePerLevel() {
        return magicResistancePerLevel;
    }

    public void setMagicResistancePerLevel(double magicResistancePerLevel) {
        this.magicResistancePerLevel = magicResistancePerLevel;
    }

    private double magicResistancePerLevel;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<ChampionStat> getChampionStats() {
        return championStats;
    }

    public void setChampionStats(ArrayList<ChampionStat> championStats) {
        this.championStats = championStats;
    }

    public String getAllyTips() {
        return allyTips;
    }

    public void setAllyTips(String allyTips) {
        this.allyTips = allyTips;
    }

    public String getEnemyTips() {
        return enemyTips;
    }

    public void setEnemyTips(String enemyTips) {
        this.enemyTips = enemyTips;
    }

    public String getLore() {
        return lore;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }
}


