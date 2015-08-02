package uk.co.haxyshideout.novachisel;

import nova.core.block.BlockManager;
import nova.core.item.ItemManager;
import nova.core.loader.Loadable;
import nova.core.loader.Mod;
import nova.core.network.NetworkManager;
import nova.core.recipes.RecipeManager;
import nova.core.render.RenderManager;
import uk.co.haxyshideout.novachisel.blocks.BlockDatabase;
import uk.co.haxyshideout.novachisel.textures.TextureDatabase;

/**
 * Created by clienthax on 2/8/2015.
 */
@Mod(name = NovaChisel.MODNAME, id = NovaChisel.MODID, version = NovaChisel.MODVERSION, novaVersion = "0.1.0")
public class NovaChisel implements Loadable {

	public static final String MODID = "novachisel";
	public static final String MODNAME = "NovaChisel";
	public static final String MODVERSION = "1";

	NovaChisel INSTANCE;

	private final ItemManager itemManager;
	private final BlockManager blockManager;
	private final RenderManager renderManager;
	private final RecipeManager recipeManager;
	private final NetworkManager networkManager;
	private TextureDatabase textureDatabase;
	private BlockDatabase blockDatabase;

	public NovaChisel(ItemManager itemManager, BlockManager blockManager, RenderManager renderManager, RecipeManager recipeManager, NetworkManager networkManager) {
		INSTANCE = this;
		this.itemManager = itemManager;
		this.blockManager = blockManager;
		this.renderManager = renderManager;
		this.recipeManager = recipeManager;
		this.networkManager = networkManager;
	}

	@Override
	public void preInit() {
		this.textureDatabase = new TextureDatabase(renderManager);
		this.blockDatabase = new BlockDatabase(blockManager);
	}

}
