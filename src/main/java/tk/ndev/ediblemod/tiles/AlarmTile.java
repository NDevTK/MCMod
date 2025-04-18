package tk.ndev.ediblemod.tiles;

import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class AlarmTile extends TileEntity implements ITickableTileEntity {
	public AlarmTile(final TileEntityType<?> tileEntityTypeIn) {
		super(tileEntityTypeIn);
	}

	public AlarmTile() {
		this(ModTiles.alarmtile.get());
	}

	@Override
	public void tick() {
        if (world.isRemote) {
            return;
        }		
	}
	


}
