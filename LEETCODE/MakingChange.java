import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * You are given n types of coin denominations of values v(1) < v(2) < ... < v(n) (all integers). 
 * Assume v(1) = 1, so you can always make change for any amount of money C. Give an algorithm which 
 * makes change for an amount of money C with as few coins as possible.
 */

/**
 * @author Alice
 *
 */
public class MakingChange {
	HashMap<Integer, Integer> m_best; 
	HashMap<Integer, Integer> m_trace;
	HashSet<Integer> m_coins;
	

	/**
	 * Constructor
	 */
	public MakingChange(HashSet<Integer> coins) {
		m_best = new HashMap<Integer, Integer>();
		m_trace = new HashMap<Integer, Integer>();
		m_coins = coins;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer test = new Integer(4);
		HashSet<Integer> coins = new HashSet<Integer>();
		coins.add(new Integer(1));
		coins.add(new Integer(2));
		coins.add(new Integer(5));
		coins.add(new Integer(10));
		MakingChange changer = new MakingChange(coins);
		
		
		ArrayList<Integer> changes = changer.MakeChange(test);
		for (Integer change: changes)
		{
			System.out.println(change);
		}
	}
	
	/**
	 * @param value[IN]: The amount of money to be changed
	 * @return a list of changes
	 */
	public ArrayList<Integer> MakeChange(Integer money_amount)
	{
		assert( money_amount > 0 );
		assert( m_coins.size() >0 );
		
		// Set the bottom cases.
		for( Integer coin : m_coins )
		{
			m_best.put(coin, new Integer(1));
			m_trace.put(coin, new Integer(0));
		}
		
		// Build the best solution bottoms up
		for( Integer i =1; i < money_amount+1; ++i )
		{
			if( m_best.get(new Integer(i)) == null)
			{
				//Set initial min value as large as possible
				Integer tmp_min_change_num = money_amount;
				Integer tmp_min_pre_amount = null;
				Integer cur_amount = i;
				Integer pre_amount, pre_change_num;
			
				for( Integer coin: m_coins )
				{
					pre_amount = cur_amount - coin;
					if( pre_amount > 0)
					{
						pre_change_num = m_best.get(pre_amount);
						if( pre_change_num < tmp_min_change_num )
						{
							tmp_min_change_num = pre_change_num;
							tmp_min_pre_amount = pre_amount;
						}
					}
					else
						continue;
				}
				
				Integer min_change_num = tmp_min_change_num;
				Integer min_pre_amount = tmp_min_pre_amount;
			
				m_best.put(cur_amount, new Integer(1)+ min_change_num);
				m_trace.put(cur_amount, min_pre_amount);
			}
		}
			
		// Get all the changes from the trace
		Integer remaining = money_amount;
		ArrayList<Integer> changes = new ArrayList<Integer>();
		while(remaining > 0)
		{
			Integer change = new Integer(remaining - m_trace.get(remaining));
			remaining = m_trace.get(remaining);
			changes.add(change);
		}
		
		return changes;
	}
}
