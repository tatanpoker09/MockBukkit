package be.seeseemelk.mockbukkit.inventory.meta;

import org.bukkit.Color;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.ArrayList;

public class LeatherArmorMetaMock extends ItemMetaMock implements LeatherArmorMeta {
    private Color color;

    public LeatherArmorMetaMock(){
        super();
    }

    public LeatherArmorMetaMock(LeatherArmorMetaMock meta) {
        super(meta);
        color = meta.getColor();
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public LeatherArmorMetaMock clone() {
        LeatherArmorMetaMock mock = (LeatherArmorMetaMock) super.clone();
        mock.setColor(this.color);
        return mock;
    }
}
