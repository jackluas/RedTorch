package xyz.redtorch.web.service;

import java.util.List;
import java.util.Map;

public interface ZeusEngineWebService {
	void loadStrategy();

	List<Map<String, Object>> getStrategyInfos();
	
	void initStrategy(String strategyID);

	void sartStrategy(String strategyID);
	
	void stopStrategy(String strategyID);
	
	void initAllStrategy();

	void startAllStrategy();
	
	void stopAllStrategy();

	void reloadStrategy(String strategyID);
}
