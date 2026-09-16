package nano.spook1998.rust.object;

import java.util.ArrayList;
import java.util.List;

public class Clan {

    private String name;
    private String tag;
    private User owner;
    private final List<User> members = new ArrayList<>();
    private final List<User> inventory = new ArrayList<>();
    private boolean pvp;
    private int points;

    public Clan(String name, String tag, User owner) {
        this.name = name;
        this.tag = tag;
        this.owner = owner;
        if (owner != null) {
            this.members.add(owner);
            owner.setClan(this);
        }
        this.points = 0;
        this.pvp = false;
    }

    public void addUser(User user) {
        if (user != null && !members.contains(user)) {
            members.add(user);
            user.setClan(this);
        }
    }

    public void removeUser(User user) {
        if (user != null) {
            members.remove(user);
            if (user.equals(owner)) {
                owner = null;
            }
        }
    }

    public boolean addToInv(User user) {
        if (user != null && !inventory.contains(user)) {
            inventory.add(user);
            return true;
        }
        return false;
    }

    public boolean removeFromInv(User user) {
        if (user != null && inventory.contains(user)) {
            inventory.remove(user);
            return true;
        }
        return false;
    }

    public boolean isInClan(User user) {
        return user != null && members.contains(user);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public List<User> getUsers() {
        return members;
    }

    public void setUsers(List<User> users) {
        this.members.clear();
        if (users != null) {
            this.members.addAll(users);
        }
    }

    public List<User> getInv() {
        return inventory;
    }

    public void setInv(List<User> inventory) {
        this.inventory.clear();
        if (inventory != null) {
            this.inventory.addAll(inventory);
        }
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public boolean isPvP() {
        return pvp;
    }

    public void setPvP(boolean pvp) {
        this.pvp = pvp;
    }
}
