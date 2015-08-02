package uk.co.haxyshideout.novachisel.textures;

import nova.core.render.RenderManager;
import nova.core.render.texture.BlockTexture;
import uk.co.haxyshideout.novachisel.NovaChisel;

/**
 * Created by clienthax on 2/8/2015.
 */
public class TextureDatabase {

	public static BlockTexture blueAntiBlock;
	public static BlockTexture blueAntiBlockCTM;

	public TextureDatabase(RenderManager renderManager) {
		blueAntiBlock = renderManager.registerTexture(new BlockTexture(NovaChisel.MODID, "antiblock/blue-antiBlock"));
		blueAntiBlockCTM = renderManager.registerTexture(new BlockTexture(NovaChisel.MODID, "antiblock/blue-antiBlock-ctm"));
	}

}
