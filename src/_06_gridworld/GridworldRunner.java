package _06_gridworld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridworldRunner {
	public static void main(String[] args) {
		World world = new World();
		world.show();

		for (int row = 0; row < 10; row++) {
			for (int col = 0; col < 10; col++) {
				Location loc2 = new Location(row, col);
				Flower flower = new Flower();
				world.add(loc2, flower);

			}
		}
		Bug a = new Bug();
		Location loc = new Location(5, 5);
		world.add(loc, a);
		Bug b = new Bug();
		Location loc1 = new Location(3, 5);
		world.add(loc1, b);
		b.setColor(Color.blue);
		b.turn();
		b.turn();
	}
}
