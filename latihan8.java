<script type="text/javascript">
  //If the time is less than 10, you will get a "Good
  morning" greeting.
  //Otherwise you will get a "Good day" greeting.
    var d = new Date();
    var time = d.getHours();
    if (time < 10)
      {
      document.write("Good morning!");
      }
    else
      {
        document.write("Good day!");
      }
</script>