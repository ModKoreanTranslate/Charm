package svenhjol.charm.block;

import net.minecraft.block.*;
import net.minecraft.block.entity.TileEntity;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.collection.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.IBlockReader;
import svenhjol.charm.base.CharmModule;
import svenhjol.charm.base.block.CharmBlockWithEntity;
import svenhjol.charm.TileEntity.EntitySpawnerTileEntity;

import javax.annotation.Nullable;

public class EntitySpawnerBlock extends CharmBlockWithEntity {
    public EntitySpawnerBlock(CharmModule module) {
        super(module, "entity_spawner", AbstractBlock.Settings
            .of(Material.AIR)
            .noCollision()
            .dropsNothing());
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new EntitySpawnerTileEntity();
    }

    @Override
    public void createBlockItem(ResourceLocation id) {
        // don't
    }

    @Override
    public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> list) {
        // don't
    }

    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.INVISIBLE;
    }

    public VoxelShape getOutlineShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
        return VoxelShapes.empty();
    }
}