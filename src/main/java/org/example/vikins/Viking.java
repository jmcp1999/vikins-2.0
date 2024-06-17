package org.example.vikins;

import org.example.soldier.Soldier;

public class Viking extends Soldier {
    public Viking(String name, int health, int strength, String msg) {
        super(health, strength);
              this.name = name;
              this.health = health;
              this.strength = strength;
              this.msg = msg;
    }
    public String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer health;
    public int getHealth() {
        return health;
    }
    public void setHealth(Integer health) {
        this.health = health;
    }
    public Integer strength;
    public int getStrength() {
        return strength;
    }
    public void setStrength(Integer strength) {
        this.strength = strength;
    }
    public String msg;
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
