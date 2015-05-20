/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.serverinventory.dao;

import com.swcguild.serverinventory.dto.Server;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author apprentice
 */
public class ServerDAOInMemImpl implements ServerDAO {

    private Map<Integer, Server> servers = new HashMap<>();
    private static int counter = 0;
    
    @Override
    public void addServer(Server server) {
        server.setId(counter++);
        servers.put(server.getId(), server);
//        counter++;
    }

    @Override
    public Server getServer(int id) {
        return servers.get(id);
    }

    @Override
    public void removeServer(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Server> getServerByManufacturer(String manufacturer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Server> getServersOlderThan(int ageInYears) {
        return servers.values().stream()
                .filter(myServer -> myServer.getServerAge() > ageInYears)
                .collect(Collectors.toList());
    
    }

    @Override
    public Map<String, List<Server>> getServersOlderThanGroupByMake(int ageInYears) {
        return servers.values().stream()
                .filter((Server myServer) -> {return myServer.getServerAge() > ageInYears;})
                .collect(Collectors.groupingBy(Server::getMake));
    
    }

    @Override
    public double getAverageServerAge() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Server> getAllServers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
