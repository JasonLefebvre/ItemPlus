package org.jason.itemsplus.Listeners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Objects;

public class HammerEvent implements Listener {

    BlockFace blockFace;

    @EventHandler
    public void onClick(PlayerInteractEvent event){
        if (event.getAction().equals(Action.LEFT_CLICK_BLOCK)){
            blockFace = event.getBlockFace();
        }
    }
    public void breakBlock(Block block){
        if (!block.getType().equals(Material.BEDROCK)){
            block.breakNaturally();
        }
    }

    public boolean test(BlockBreakEvent event, String s){
        return Objects.equals(event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName(), s);
    }

    @EventHandler
    public void onBreak(BlockBreakEvent event){
        Block block = event.getBlock();
        if (test(event, "Hammer en fer") || test(event, "Hammer en diamant") || test(event, "Hammer en netherite")){
            if (blockFace.equals(BlockFace.UP) || blockFace.equals(BlockFace.DOWN)) {

                Block block1 = block.getRelative(BlockFace.EAST);
                Block block2 = block.getRelative(BlockFace.WEST);
                Block block3 = block.getRelative(BlockFace.NORTH);
                Block block4 = block.getRelative(BlockFace.SOUTH);
                Block block5 = block.getRelative(BlockFace.SOUTH_EAST);
                Block block6 = block.getRelative(BlockFace.SOUTH_WEST);
                Block block7 = block.getRelative(BlockFace.NORTH_EAST);
                Block block8 = block.getRelative(BlockFace.NORTH_WEST);
                Block block9 = block.getRelative(BlockFace.SELF);

                breakBlock(block1);
                breakBlock(block2);
                breakBlock(block3);
                breakBlock(block4);
                breakBlock(block5);
                breakBlock(block6);
                breakBlock(block7);
                breakBlock(block8);
                breakBlock(block9);
            }

            if (blockFace.equals(BlockFace.EAST) || blockFace.equals(BlockFace.WEST)){

                Block block1 = block.getRelative(BlockFace.UP);
                Block block2 = block.getRelative(BlockFace.DOWN);
                Block block3 = block.getRelative(BlockFace.NORTH);
                Block block4 = block.getRelative(BlockFace.SOUTH);
                Block block5 = block1.getRelative(BlockFace.NORTH);
                Block block6 = block1.getRelative(BlockFace.SOUTH);
                Block block7 = block2.getRelative(BlockFace.NORTH);
                Block block8 = block2.getRelative(BlockFace.SOUTH);
                Block block9 = block.getRelative(BlockFace.SELF);

                breakBlock(block1);
                breakBlock(block2);
                breakBlock(block3);
                breakBlock(block4);
                breakBlock(block5);
                breakBlock(block6);
                breakBlock(block7);
                breakBlock(block8);
                breakBlock(block9);
            }

            if (blockFace.equals(BlockFace.NORTH) || blockFace.equals(BlockFace.SOUTH)){

                Block block1 = block.getRelative(BlockFace.UP);
                Block block2 = block.getRelative(BlockFace.DOWN);
                Block block3 = block.getRelative(BlockFace.EAST);
                Block block4 = block.getRelative(BlockFace.WEST);
                Block block5 = block1.getRelative(BlockFace.EAST);
                Block block6 = block1.getRelative(BlockFace.WEST);
                Block block7 = block2.getRelative(BlockFace.EAST);
                Block block8 = block2.getRelative(BlockFace.WEST);
                Block block9 = block.getRelative(BlockFace.SELF);

                breakBlock(block1);
                breakBlock(block2);
                breakBlock(block3);
                breakBlock(block4);
                breakBlock(block5);
                breakBlock(block6);
                breakBlock(block7);
                breakBlock(block8);
                breakBlock(block9);
            }
        } else {
            breakBlock(block);
        }
    }
}
