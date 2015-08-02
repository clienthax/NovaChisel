package uk.co.haxyshideout.novachisel.blocks;

import nova.core.block.BlockFactory;
import nova.core.block.BlockManager;
import uk.co.haxyshideout.novachisel.textures.TextureDatabase;

/**
 * Created by clienthax on 2/8/2015.
 */
public class BlockDatabase {

	public static BlockFactory blueAntiblock;

	public BlockDatabase(BlockManager blockManager) {
		blueAntiblock = blockManager.register(args -> new GenericCTMBlock("blueAntiblock", TextureDatabase.blueAntiBlock, TextureDatabase.blueAntiBlockCTM, "antiblocks"));
	}

}
