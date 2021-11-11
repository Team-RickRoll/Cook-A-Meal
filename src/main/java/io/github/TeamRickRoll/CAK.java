package io.github.TeamRickRoll;

import net.minestom.server.MinecraftServer;
import net.minestom.server.coordinate.Pos;
import net.minestom.server.entity.Player;
import net.minestom.server.event.GlobalEventHandler;
import net.minestom.server.event.player.PlayerLoginEvent;
import net.minestom.server.extras.MojangAuth;
import net.minestom.server.instance.*;
import net.minestom.server.instance.batch.ChunkBatch;
import net.minestom.server.instance.block.Block;
import net.minestom.server.world.biomes.Biome;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.List;

public class CAK {
    public static void main(String[] args){
        MinecraftServer minestom = MinecraftServer.init();
        MojangAuth.init();
        InstanceManager instanceManager = MinecraftServer.getInstanceManager();
        InstanceContainer instanceContainer = instanceManager.createInstanceContainer();
        GlobalEventHandler globalEventHandler = MinecraftServer.getGlobalEventHandler();
        instanceContainer.setChunkGenerator(new ChunkGenerator() {
            @Override
            public void generateChunkData(@NotNull ChunkBatch batch, int chunkX, int chunkZ) {
                // Set chunk blocks
                for (byte x = 0; x < Chunk.CHUNK_SIZE_X; x++) {
                    for (byte z = 0; z < Chunk.CHUNK_SIZE_Z; z++) {
                        for (byte y = 0; y < 40; y++) {
                            batch.setBlock(x, y, z, Block.STONE);
                        }
                    }
                }
            }
            @Override
            public void fillBiomes(Biome[] biomes, int chunkX, int chunkZ) {
                Arrays.fill(biomes, Biome.PLAINS);
            }
            @Override
            public List<ChunkPopulator> getPopulators() {
                return null;
            }
        });
        globalEventHandler.addListener(PlayerLoginEvent.class, event -> {
            final Player player = event.getPlayer();
            event.setSpawningInstance(instanceContainer);
            player.setRespawnPoint(new Pos(0, 40, 0));
        });

        new KotlinTestFile().testFunc();

        minestom.start("0.0.0.0", 25565);
    }
}
