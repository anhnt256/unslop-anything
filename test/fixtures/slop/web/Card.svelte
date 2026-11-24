<script>
  let plan = "Pro";
  // const t = "Oops"
  const select = (plan) => console.log(plan);
</script>

<div class="card transition-all" on:click={() => select(plan)}>
  <h2>{plan}</h2>
  <img src="/card.png" />
</div>
