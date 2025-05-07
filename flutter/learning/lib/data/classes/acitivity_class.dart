class Activity {
  final String activity;
  final String type;
  final String availability;
  final int participants;
  final String price;
  final String accessibility;
  final String duration;
  final String kidFriendly;
  final String link;
  final String key;

  const Activity({
    required this.activity,
    required this.type,
    required this.availability,
    required this.participants,
    required this.price,
    required this.accessibility,
    required this.duration,
    required this.kidFriendly,
    required this.link,
    required this.key,
  });
    factory Activity.fromJson(Map<String, dynamic> json) {
    return switch(json) {
      {
        'activity': var activity,
        'type': var type,
        'availability': var availability,
        'participants': var participants,
        'price': var price,
        'accessibility': var accessibility,
        'duration': var duration,
        'kidFriendly': var kidFriendly,
        'link': var link,
        'key': var key,
      } => Activity(
          activity: activity,
          type: type,
          availability: availability,
          participants: participants,
          price: price,
          accessibility: accessibility,
          duration: duration,
          kidFriendly: kidFriendly,
          link: link,
          key: key),
   };


     
    
  }

}