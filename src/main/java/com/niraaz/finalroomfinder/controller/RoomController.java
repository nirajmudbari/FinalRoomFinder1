package com.niraaz.finalroomfinder.controller;

import com.niraaz.finalroomfinder.entity.Room;
import com.niraaz.finalroomfinder.service.RoomService;
import com.niraaz.finalroomfinder.service.impl.RoomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/room")
public class RoomController {

    @Autowired
    RoomServiceImpl roomService;

    @RequestMapping(value = { "/", "/list"}, method = RequestMethod.GET)
    public ModelAndView list() {
        ModelAndView model = new ModelAndView("room/list");
        List<Room> roomList = roomService.getAllRooms();
        model.addObject("roomList", roomList);
        return model;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView add() {
        ModelAndView model = new ModelAndView("room/add");
        Room room = new Room();
        model.addObject("room", room);
        return model;
    }

    @RequestMapping(value = "/update/{id}",method = RequestMethod.GET)
    public ModelAndView update( @PathVariable("id") int id) {
        ModelAndView model = new ModelAndView( "room/update" );
        Room room = roomService.getRoomById( id );
        model.addObject( "room", room );
        return model;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save( @ModelAttribute("room") Room room ) {
        roomService.addRoom( room );
        return new ModelAndView( "redirect:/room/list" );
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView update(@ModelAttribute("room") Room room) {
        roomService.update( room );
        return new ModelAndView( "redirect:/room/list" );
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView delete( @PathVariable("id") int id ) {
        roomService.delete( id );
        return new ModelAndView( "redirect:/room/list" );
    }


}
